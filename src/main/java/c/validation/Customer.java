package c.validation;

import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcException;

public class Customer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:c/validation/customer.xml");
		ValidationService validationService = (ValidationService) applicationContext.getBean("validationService");
		try {
			validationService.update(new ValidationParameter("zhangsan", null, 20, new Date(), new Date()));
		} catch (RpcException e) {
			ConstraintViolationException ve = (ConstraintViolationException) e.getCause(); // 里面嵌了一个ConstraintViolationException
			Set<ConstraintViolation<?>> violations = ve.getConstraintViolations(); // 可以拿到一个验证错误详细信息的集合
			System.out.println(violations);
		}
		applicationContext.close();
	}
}
