package b.group_aggregation;

import java.util.List;
import java.util.Map;

public interface IDubboMergeService {

	/**
	 * 测试分组聚合
	 * 
	 * @return
	 */
	public String[] groupArray();

	/**
	 * 测试分组聚合
	 * 
	 * @return
	 */
	public List<String> groupList();

	/**
	 * 测试分组聚合
	 * 
	 * @return
	 */
	public Map<String, Object> groupMap();
}