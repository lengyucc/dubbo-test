package a.static_service;

import java.io.IOException;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.registry.Registry;
import com.alibaba.dubbo.registry.RegistryFactory;

public class Demo {
	public static void main(String[] args) throws IOException {
		// 当前应用配置
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("demo-provider");
		// 服务提供者协议配置
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setName("dubbo");
		protocolConfig.setPort(12345);
		protocolConfig.setThreads(200);
		
		RegistryFactory registryFactory = ExtensionLoader.getExtensionLoader(RegistryFactory.class)
				.getAdaptiveExtension();
		Registry registry = registryFactory.getRegistry(URL.valueOf("zookeeper://127.0.0.1:2181"));
		registry.register(URL.valueOf(
				"dubbo://127.0.0.1:12345/common.infc.DemoService?category=providers&dynamic=false&application=demo-provider"));
		
		System.in.read();
	}
}
