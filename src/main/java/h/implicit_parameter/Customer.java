package h.implicit_parameter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;

import common.infc.DemoService;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:h/implicit_parameter/customer.xml");
		DemoService demoService = (DemoService) applicationContext.getBean("demoServiceRemote");

		for (int i = 0; i < 100; i++) {
			long time = System.currentTimeMillis();
			System.out.println(time);
			RpcContext.getContext().setAttachment("time", String.valueOf(time));
			System.out.println(demoService.say("LiMingHui" + time));
			System.out.println();
		}

		applicationContext.close();
	}
}
