package m.mock;

import common.infc.DemoService;

public class DemoServiceMock implements DemoService {

	@Override
	public String say(String name) {
		System.out.println("??????????????????");
		return "Hello, World!";
	}
}
