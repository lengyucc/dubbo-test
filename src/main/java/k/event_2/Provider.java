package k.event_2;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:k/event_2/provider.xml");
		applicationContext.start();
		System.in.read();
		applicationContext.close();
	}
}
