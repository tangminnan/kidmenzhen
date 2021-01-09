package com.youershaicha.information.dao;


import com.youershaicha.information.domain.ChildDiopterDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 曲光度详情
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:26
 */
@Mapper
public interface ChildDiopterDao {

	ChildDiopterDO get(Integer tDiopterId);
	
	List<ChildDiopterDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChildDiopterDO childDiopter);
	
	int update(ChildDiopterDO childDiopter);
	
	int remove(Integer t_diopter_id);
	
	int batchRemove(Integer[] tDiopterIds);

    List<ChildDiopterDO> getChildDiopterDOList(Integer tOptometryId);
}
