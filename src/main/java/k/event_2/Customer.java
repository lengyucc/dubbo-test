package k.event_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:k/event_2/customer.xml");
		IDemoService demoService = (IDemoService) applicationContext.getBean("demoService");
		NotifyImpl notify = (NotifyImpl) applicationContext.getBean("demoCallback");
		int requestId = 2;
		Person ret = demoService.get("小明", 12);
		System.out.println(ret);
		// for Test：只是用来说明callback正常被调用，业务具体实现自行决定.
		for (int i = 0; i < 10; i++) {
			if (!notify.ret.containsKey(requestId)) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				break;
			}
		}
		System.out.println(notify.ret.get(requestId).getId());

		applicationContext.close();
	}
}
