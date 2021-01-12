package com.youershaicha.information.service;


import com.youershaicha.information.domain.*;

import java.util.List;
import java.util.Map;

/**
 * 幼儿基本信息表
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2020-12-31 16:37:34
 */
public interface ChildService {
	
	ChildDO get(Long childId);
	
	List<ChildDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChildDO child);
	
	int update(ChildDO child);
	
	int remove(Long childId);
	
	int batchRemove(Long[] childIds);

    ChildDO getByChildIdcard(String childIdcard);

	int saveChildBasic(ChildBasicDO childBasicDO);

	ChildRefractionScreeningDO getRecentChildRefractionScreeningDO(Map<String,Object> paramsMap);

	ChildPhotographyDO getRecentChildPhotographyDO(Map<String,Object> map);

    ChildOptometryDO getRecentChildOptometryDO(Map<String,Object> map);

	List<ChildDiopterDO> getChildDiopterDOList(Integer tOptometryId);

	List<ChildCornealDO> getChildChildCornealDOList(Integer tOptometryId);

	ChildEyeaxisDO getChildEyeaxisDO(Map<String,Object> map);

    ChildBasicDO getRecentlyBasic(Map<String,Object> map);

	List<Integer> getAllCheckedAges(String childIdcard);
}
