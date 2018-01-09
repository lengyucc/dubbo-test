package j.callback;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:j/callback/customer.xml");
		CallbackService callbackService = (CallbackService) applicationContext.getBean("callbackService");

		callbackService.addListener("http://10.20.160.198/wiki/display/dubbo/foo.bar", new CallbackListener() {
			public void changed(String msg) {
				System.out.println("callback1:" + msg);
			}
		});

		applicationContext.close();
	}
}
