package common.infc;

public class DemoServiceImpl implements DemoService {

	@Override
	public String say(String name) {
		return "Hello, " + name + "!!!!";
	}

}
