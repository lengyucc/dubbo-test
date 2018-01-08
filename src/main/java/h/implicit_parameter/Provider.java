package h.implicit_parameter;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:h/implicit_parameter/provider.xml");
		applicationContext.start();
		System.in.read();
		applicationContext.close();
	}
}
