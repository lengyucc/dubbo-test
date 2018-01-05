package a.grouping_aggregation;

import common.infc.DemoService;

public class DemoAServiceImpl implements DemoService {

	@Override
	public String say(String name) {
		return "[A] Hello, " + name + "!!!!";
	}

}
