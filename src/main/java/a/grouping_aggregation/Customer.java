package a.grouping_aggregation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.infc.DemoService;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:a/grouping_aggregation/customer.xml");
		DemoService demoService = (DemoService) applicationContext.getBean("demoServiceRemote");
		for (int i = 0; i < 10000; i++) {
			String answer = demoService.say("LiMingHui" + i);
			System.out.println("############# " + answer);
		}
		applicationContext.close();
	}
}
