package com.youershaicha.information.dao;


import com.youershaicha.information.domain.ChildCornealDO;
import com.youershaicha.information.domain.ChildEyeaxisDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 角膜曲率详情
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:26
 */
@Mapper
public interface ChildCornealDao {

	ChildCornealDO get(Integer tCornealId);
	
	List<ChildCornealDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChildCornealDO childCorneal);
	
	int update(ChildCornealDO childCorneal);
	
	int remove(Integer t_corneal_id);
	
	int batchRemove(Integer[] tCornealIds);

    List<ChildCornealDO> getChildChildCornealDOList(Integer tOptometryId);
}
