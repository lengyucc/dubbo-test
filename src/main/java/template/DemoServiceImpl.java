package template;

import common.infc.DemoService;

public class DemoServiceImpl implements DemoService {
	static int count = 0;

	@Override
	public String say(String name) {
		return "Hello, " + name + "!!!!";
	}

}
