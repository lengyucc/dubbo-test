package e.generic.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.service.GenericService;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:e/generic/impl/customer.xml");
		GenericService genericService = (GenericService) applicationContext.getBean("demoServiceRemote");
		for (int i = 0; i < 300; i++) {
			Object answer = genericService.$invoke("say", new String[]{"java.lang.String"}, new Object[]{"LiMingHui"});
			System.out.println("############# " + answer);
		}
		applicationContext.close();
	}
}
