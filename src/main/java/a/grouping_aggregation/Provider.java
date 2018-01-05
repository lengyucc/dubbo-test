package a.grouping_aggregation;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:a/grouping_aggregation/provider.xml");
		applicationContext.start();
		System.in.read();
		applicationContext.close();
	}
}
