package i.async;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;

public class Customer {
	static final DateFormat DF = new SimpleDateFormat("HH:mm:ss:SSS");

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:i/async/customer.xml");
		DemoServiceA demoServiceA = (DemoServiceA) applicationContext.getBean("demoServiceA");
		DemoServiceB demoServiceB = (DemoServiceB) applicationContext.getBean("demoServiceB");

		// 此调用会立即返回null
		demoServiceA.say("LiMingHui");
		// 拿到调用的Future引用，当结果返回后，会被通知和设置到此Future
		Future<String> futureA = RpcContext.getContext().getFuture();
		demoServiceB.say("LiMingHui");
		Future<String> futureB = RpcContext.getContext().getFuture();
		System.out.println("主程序调用完毕：" + DF.format(new Date(System.currentTimeMillis())));
		// 此时A.say()和B.say()的请求同时在执行，客户端不需要启动多线程来支持并行，而是借助NIO的非阻塞完成

		// 如果A.say()已返回，直接拿到返回值，否则线程wait住，等待foo返回后，线程会被notify唤醒
		System.out.println(futureA.get());
		System.out.println(futureB.get());
		System.out.println("结果返回：" + DF.format(new Date(System.currentTimeMillis())));

		applicationContext.close();
	}
}
