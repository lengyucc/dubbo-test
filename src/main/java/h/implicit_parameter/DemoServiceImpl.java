package h.implicit_parameter;

import com.alibaba.dubbo.rpc.RpcContext;

import common.infc.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String say(String name) {
		// 在服务提供方端获取隐式参数
		String time = RpcContext.getContext().getAttachment("time");
		System.out.println(name + ":" + time);
		return "Hello, " + name + "!!!!";
	}

}
