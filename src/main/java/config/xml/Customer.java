package config.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.infc.DemoService;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:config/xml/customer.xml");
		DemoService demoService = (DemoService) applicationContext.getBean("demoServiceRemote");
		String answer = demoService.say("LiMingHui");
		System.out.println("############# " + answer);
		applicationContext.close();
	}
}
