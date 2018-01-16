package n.concurrent_2;

import common.infc.DemoService;

public class DemoServiceImpl implements DemoService {
	static int count = 0;

	@Override
	public String say(String name) {
		System.out.println("count: " + count);
		count++;
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count--;
		return "Hello, " + name + "!!!!";
	}

}
