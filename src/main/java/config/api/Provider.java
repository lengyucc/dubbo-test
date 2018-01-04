package config.api;

import java.io.IOException;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import common.infc.DemoService;

public class Provider {
	public static void main(String[] args) throws IOException {
		// 服务实现
		DemoService demoService = new DemoServiceImpl();
		// 当前应用配置
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("demo-provider");
		// 连接注册中心
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress("zookeeper://127.0.0.1:2181");
		// 服务提供者协议配置
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setName("dubbo");
		protocolConfig.setPort(12345);
		protocolConfig.setThreads(200);
		// 服务提供者暴露服务配置
		ServiceConfig<DemoService> serviceConfig = new ServiceConfig<>();
		serviceConfig.setApplication(applicationConfig);
		serviceConfig.setRegistry(registryConfig);
		serviceConfig.setProtocol(protocolConfig);
		serviceConfig.setInterface(DemoService.class);
		serviceConfig.setRef(demoService);
		serviceConfig.setVersion("1.0.0");
		// 暴露及注册服务
		serviceConfig.export();
		System.in.read();
	}
}
