package com.youershaicha.information.dao;


import java.util.List;
import java.util.Map;

import com.youershaicha.information.domain.ChildEyeaxisDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 眼轴长度
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:26
 */
@Mapper
public interface ChildEyeaxisDao {

	ChildEyeaxisDO get(Integer tEyeaxisId);
	
	List<ChildEyeaxisDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChildEyeaxisDO childEyeaxis);
	
	int update(ChildEyeaxisDO childEyeaxis);
	
	int remove(Integer t_eyeaxis_id);
	
	int batchRemove(Integer[] tEyeaxisIds);
	ChildEyeaxisDO getChildEyeaxisDO(Map<String,Object> map);
}
