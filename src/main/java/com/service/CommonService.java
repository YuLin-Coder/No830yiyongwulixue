package com.service;

import java.util.List;
import java.util.Map;

public interface CommonService {
	List<String> getOption(Map<String, Object> params);
	
	Map<String, Object> getFollowByOption(Map<String, Object> params);
	
	void sh(Map<String, Object> params);
	
	int remindCount(Map<String, Object> params);
	
	Map<String, Object> selectCal(Map<String, Object> params);

	List<Map<String, Object>> chartBoth(Map<String, Object> params);

	List<Map<String, Object>> chartOne(Map<String, Object> params);

	List<Map<String, Object>> selectGroup(Map<String, Object> params);
	
	List<Map<String, Object>> selectValue(Map<String, Object> params);

	/**
	 * 下面为新加的
	 */


	/**
	 * 新的级联字典表的  分组求和统计
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> newSelectGroupSum(Map<String, Object> params);

	/**
	 * 新的级联字典表的  分组求和统计
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> newSelectGroupCount(Map<String, Object> params);
	/**
	 * 当前表的日期分组求和
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> newSelectDateGroupSum(Map<String, Object> params);

	/**
	 * 查询字典表的分组统计总条数
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> newSelectDateGroupCount(Map<String, Object> params);
	/**
	 * 增加字段数字
	 * @param params
	 * @return
	 */
	int plusCloumNumber(Map<String, Object> params);
	/**
	 * 减少字段数字
	 * @param params
	 * @return
	 */
	int reduceCloumNumber(Map<String, Object> params);
	/**
	 * 修改字段数字
	 * @param params
	 * @return
	 */
	int updateCloumValue(Map<String, Object> params);

}
