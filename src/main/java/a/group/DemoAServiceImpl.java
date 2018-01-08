package a.group;

import common.infc.DemoService;

public class DemoAServiceImpl implements DemoService {

	@Override
	public String say(String name) {
		return "[A] Hello, " + name + "!!!!";
	}

}
