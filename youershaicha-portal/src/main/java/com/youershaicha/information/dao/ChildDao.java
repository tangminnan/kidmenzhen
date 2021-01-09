package com.youershaicha.information.dao;


import com.youershaicha.information.domain.ChildDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 幼儿基本信息表
 * @author wjl
 * @email bushuo@163.com
 * @date 2020-12-31 16:37:34
 */
@Mapper
public interface ChildDao {

	ChildDO get(Long childId);


	int save(ChildDO child);
	
	int update(ChildDO child);
	ChildDO getByChildIdcard(String childIdcard);
}
