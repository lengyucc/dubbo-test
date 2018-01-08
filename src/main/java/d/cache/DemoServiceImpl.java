package d.cache;

import common.infc.DemoService;

public class DemoServiceImpl implements DemoService {
	static int count = 0;

	@Override
	public String say(String name) {
		System.out.println(count++ + " DemoServiceImpl.say():name=" + name);
		return "Hello, " + name + "!!!!";
	}

}
