package com.youershaicha.information.dao;


import java.util.List;
import java.util.Map;

import com.youershaicha.information.domain.ChildHistoryDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 幼儿检查历史记录表
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:26
 */
@Mapper
public interface ChildHistoryDao {

	ChildHistoryDO get(Long historyId);
	
	List<ChildHistoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChildHistoryDO childHistory);
	
	int update(ChildHistoryDO childHistory);
	
	int remove(Long history_id);
	
	int batchRemove(Long[] historyIds);
}
