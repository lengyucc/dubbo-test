package c.validation;

public class ValidationServiceImpl implements ValidationService {
	@Override
	public void update(ValidationParameter parameter) {
		System.out.println("Provider.main(...).new ValidationService() {...}.update()");

	}

	@Override
	public void save(ValidationParameter parameter) {
		System.out.println("Provider.main(...).new ValidationService() {...}.save()");
	}
}
