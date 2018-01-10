package k.event_2;

class NormalDemoService implements IDemoService {
	public Person get(String name, int classId) {
		return new Person((int) (System.nanoTime() / 1000), name, classId);
	}
}