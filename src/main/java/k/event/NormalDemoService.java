package k.event;

class NormalDemoService implements IDemoService {
	public Person get(int id) {
		if(System.currentTimeMillis() % 2 == 0){
			throw new RuntimeException("测试异常");
		}
		return new Person(id, "charles`son", 4);
	}
}