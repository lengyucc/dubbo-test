package config.api;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

import common.infc.DemoService;

public class Customer2 {
	public static void main(String[] args) {
		// 当前应用配置
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("demo-customer2");
		// 连接注册中心
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress("zookeeper://127.0.0.1:2181");
		// 引用远程服务
		ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<>();
		referenceConfig.setApplication(applicationConfig);
		referenceConfig.setRegistry(registryConfig);
		referenceConfig.setInterface(DemoService.class);
		referenceConfig.setVersion("1.0.0");
		
		// 使用远程服务
		DemoService demoService = referenceConfig.get();
		
		int idx = 0;
		while(true){
			String answer = demoService.say("LiMingHui2." + idx++);
			System.out.println(">>>>>>> " + answer);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
