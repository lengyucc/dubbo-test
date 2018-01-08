package g.context;

import com.alibaba.dubbo.rpc.RpcContext;

import common.infc.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String say(String name) {
		// 本端是否为提供端，这里会返回true
		boolean isProviderSide = RpcContext.getContext().isProviderSide();
		// 获取调用方IP地址
		String clientIP = RpcContext.getContext().getRemoteHost();
		// 获取当前服务配置信息，所有配置信息都将转换为URL的参数
		String application = RpcContext.getContext().getUrl().getParameter("application");
		System.out.println("isProviderSide:" + isProviderSide);
		System.out.println("clientIP:" + clientIP);
		System.out.println("application:" + application);
		System.out.println();
		return "Hello, " + name + "!!!!";
	}

}
