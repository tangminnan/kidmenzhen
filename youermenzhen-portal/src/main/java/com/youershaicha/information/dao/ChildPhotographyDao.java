package com.youershaicha.information.dao;


import java.util.List;
import java.util.Map;

import com.youershaicha.information.domain.ChildPhotographyDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 幼儿广域眼底照相检查表
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:27
 */
@Mapper
public interface ChildPhotographyDao {

	ChildPhotographyDO get(Long photographyId);
	
	List<ChildPhotographyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ChildPhotographyDO childPhotography);
	
	int update(ChildPhotographyDO childPhotography);
	
	int remove(Long photography_id);
	
	int batchRemove(Long[] photographyIds);
	ChildPhotographyDO getRecentChildPhotographyDO(Map<String,Object> map);
}
