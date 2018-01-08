package b.group_aggregation;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:b/group_aggregation/customer.xml");
		IDubboMergeService mergeService = (IDubboMergeService) applicationContext.getBean("mergeService");
		
		for (String string : mergeService.groupArray()) {
			System.out.println(string);
		}
		System.out.println();
		for (String string : mergeService.groupList()) {
			System.out.println(string);
		}
		System.out.println();
		for (Map.Entry<String, Object> entry : mergeService.groupMap().entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " " + value);
		}

		applicationContext.close();
	}
}
