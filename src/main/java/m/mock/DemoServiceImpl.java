package m.mock;

import com.alibaba.dubbo.rpc.RpcException;

import common.infc.DemoService;

public class DemoServiceImpl implements DemoService {
	static int count = 0;

	@Override
	public String say(String name) {
		if (name == null || "".equals(name.trim())) {
			throw new RuntimeException("姓名不能为空");
		}
		return "Hello, " + name + "!!!!";
	}

}
