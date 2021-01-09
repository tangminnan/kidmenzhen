package com.youershaicha.information.dao;


import java.util.List;
import java.util.Map;

import com.youershaicha.information.domain.ChildDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 幼儿基本信息表
 * @author wjl
 * @email bushuo@163.com
 * @date 2020-12-31 16:37:34
 */
@Mapper
public interface ChildDao {

	ChildDO get(Long childId);
	
	List<ChildDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChildDO child);
	
	int update(ChildDO child);
	
	int remove(Long child_id);
	
	int batchRemove(Long[] childIds);

    ChildDO getByChildIdcard(String childIdcard);
}
