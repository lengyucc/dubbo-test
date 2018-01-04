package config.api;

import common.infc.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String say(String name) {
		return "Hello, " + name + "!!!!";
	}

}
