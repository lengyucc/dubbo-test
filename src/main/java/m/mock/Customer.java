package m.mock;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.infc.DemoService;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:m/mock/customer.xml");
		DemoService demoService = (DemoService) applicationContext.getBean("demoServiceRemote");
		// 当服务提供方全部挂掉后，客户端不抛出异常，而是调用mock实现
		String answer = demoService.say("");
		System.out.println("############# " + answer);
		applicationContext.close();
	}
}
