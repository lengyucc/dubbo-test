package a.grouping_aggregation;

import common.infc.DemoService;

public class DemoBServiceImpl implements DemoService {

	@Override
	public String say(String name) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "[B] Hello, " + name + "!!!!";
	}

}
