package l.stub;

import common.infc.DemoService;

public class DemoServiceStub implements DemoService {
	private DemoService demoService;

	public DemoServiceStub(DemoService demoService) {
		this.demoService = demoService;
	}

	@Override
	public String say(String name) {
		try {
			return demoService.say(name);
		} catch (Exception e) {
			System.err.println("调用远程方法出错了");
			return demoService.say("World");
		}
	}
}
