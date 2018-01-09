package i.async;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoServiceAImpl implements DemoServiceA {
	static final DateFormat DF = new SimpleDateFormat("HH:mm:ss:SSS");

	@Override
	public String say(String name) {
		System.out.println("A程序开始执行：" + DF.format(new Date(System.currentTimeMillis())));
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("A程序执行完毕：" + DF.format(new Date(System.currentTimeMillis())));
		return "A: Hello, " + name;
	}

}
