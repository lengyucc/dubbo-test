package f.echo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.service.EchoService;

import common.infc.DemoService;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:f/echo/customer.xml");
		DemoService demoService = (DemoService) applicationContext.getBean("demoServiceRemote");
		EchoService echoService = (EchoService) demoService; // 强制转型为EchoService
		System.out.println(echoService.$echo("OK"));

		applicationContext.close();
	}
}
