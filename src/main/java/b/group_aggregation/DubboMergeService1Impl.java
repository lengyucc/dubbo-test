package b.group_aggregation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DubboMergeService1Impl implements IDubboMergeService {

	public String[] groupArray() {
		return new String[] { "D1A", "D1B", "D1C" };
	}

	public List<String> groupList() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("D1A张三");
		arrayList.add("D1B李四");
		arrayList.add("D2B李四");
		return arrayList;
	}

	public Map<String, Object> groupMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("d1user1", "d1王二");
		map.put("d1user2", "d1麻子");
		return map;
	}

}