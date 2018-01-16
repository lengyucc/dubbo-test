package n.concurrent;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

import common.infc.DemoService;

public class Customer {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) { // 相当于启动50个消费者来调用服务者
			new Thread(new Runnable() {
				@Override
				public void run() {
					// 当前应用配置
					ApplicationConfig applicationConfig = new ApplicationConfig();
					applicationConfig.setName("demo-customer-" + c);
					// 连接注册中心
					RegistryConfig registryConfig = new RegistryConfig();
					registryConfig.setAddress("zookeeper://127.0.0.1:2181");
					// 引用远程服务
					ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<>();
					referenceConfig.setApplication(applicationConfig);
					referenceConfig.setRegistry(registryConfig);
					referenceConfig.setInterface(DemoService.class);
					// referenceConfig.setVersion("1.0.0");

					// 使用远程服务
					DemoService demoService = referenceConfig.get();

					for (int j = 0; j < 10; j++) {
						String answer = demoService.say("LiMingHui" + j);
						System.out.println("############# " + answer);
					}
				}
			}).start();
		}
	}

	static int c = 0;
}
