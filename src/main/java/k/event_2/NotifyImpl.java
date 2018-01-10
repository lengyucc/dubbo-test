package k.event_2;

import java.util.HashMap;
import java.util.Map;

class NotifyImpl implements Notify {
	public Map<Integer, Person> ret = new HashMap<Integer, Person>();

	public void onreturn(Person msg, String name,int classId) {
		System.out.println("onreturn:" + msg);
		ret.put(msg.getId(), msg);
	}

}