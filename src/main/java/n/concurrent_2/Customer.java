package n.concurrent_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.infc.DemoService;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:n/concurrent_2/customer.xml");
		final DemoService demoService = (DemoService) applicationContext.getBean("demoServiceRemote");
		for (int i = 0; i < 1; i++) {
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
					for (int j = 0; j < 1000; j++) {
						String answer = demoService.say("LiMingHui" + j);
						System.out.println("############# " + answer);
					}
//				}
//			}).start();
		}
		applicationContext.close();
	}
}
