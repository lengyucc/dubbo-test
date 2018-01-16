package n.concurrent_2;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:n/concurrent_2/provider.xml");
		applicationContext.start();
		System.in.read();
		applicationContext.close();
	}
}
