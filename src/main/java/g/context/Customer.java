package g.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;

import common.infc.DemoService;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:g/context/customer.xml");
		DemoService demoService = (DemoService) applicationContext.getBean("demoServiceRemote");

		for (int i = 0; i < 100; i++) {
			System.out.println(demoService.say("LiMingHui" + i));
			// 本端是否为消费端，这里会返回true
			boolean isConsumerSide = RpcContext.getContext().isConsumerSide();
			// 获取最后一次调用的提供方IP地址
			String serverIP = RpcContext.getContext().getRemoteHost();
			// 获取当前服务配置信息，所有配置信息都将转换为URL的参数
			String application = RpcContext.getContext().getUrl().getParameter("application");
			System.out.println("isConsumerSide:" + isConsumerSide);
			System.out.println("serverIP:" + serverIP);
			System.out.println("application:" + application);
			System.out.println();
		}

		applicationContext.close();
	}
}
