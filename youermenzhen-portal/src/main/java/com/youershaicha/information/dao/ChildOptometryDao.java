package com.youershaicha.information.dao;


import java.util.List;
import java.util.Map;

import com.youershaicha.information.domain.ChildOptometryDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验光数据表
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:27
 */
@Mapper
public interface ChildOptometryDao {

	ChildOptometryDO get(Integer tOptometryId);
	
	List<ChildOptometryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChildOptometryDO childOptometry);
	
	int update(ChildOptometryDO childOptometry);
	
	int remove(Integer t_optometry_id);
	
	int batchRemove(Integer[] tOptometryIds);
	ChildOptometryDO getRecentChildOptometryDO(Map<String,Object> map);

}
