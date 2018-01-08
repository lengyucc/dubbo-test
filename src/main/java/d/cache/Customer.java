package d.cache;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.infc.DemoService;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:d/cache/customer.xml");
		DemoService demoService = (DemoService) applicationContext.getBean("demoServiceRemote");
		for (int i = 0; i < 300; i++) {
			String answer = demoService.say("LiMingHui");
			System.out.println("############# " + answer);
		}
		applicationContext.close();
	}
}
