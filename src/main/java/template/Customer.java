package template;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.infc.DemoService;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:template/customer.xml");
		DemoService demoService = (DemoService) applicationContext.getBean("demoServiceRemote");
		String answer = demoService.say("");
		System.out.println("############# " + answer);
		applicationContext.close();
	}
}