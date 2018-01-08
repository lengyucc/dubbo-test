package e.generic.impl;

import com.alibaba.dubbo.rpc.service.GenericException;
import com.alibaba.dubbo.rpc.service.GenericService;

public class MyGenericService implements GenericService {

	public Object $invoke(String methodName, String[] parameterTypes, Object[] args) throws GenericException {
		if ("say".equals(methodName)) {
			return "Welcome " + args[0];
		}
		throw new RuntimeException("不存在的方法" + methodName);
	}
}