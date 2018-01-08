package b.group_aggregation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DubboMergeService2Impl implements IDubboMergeService {

	public String[] groupArray() {
		return new String[] { "D2A", "D2B", "D2C", "D1C" };
	}

	public List<String> groupList() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("D2A张三");
		arrayList.add("D2B李四");
		return arrayList;
	}

	public Map<String, Object> groupMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("d2user1", "d2王二");
		map.put("d2user2", "d2麻子");
		map.put("d1user2", "d1麻子");
		return map;
	}

}