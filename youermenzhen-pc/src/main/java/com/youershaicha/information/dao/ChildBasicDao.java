package com.youershaicha.information.dao;

import com.youershaicha.information.domain.ChildBasicDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 幼儿基本检查表
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-05 09:32:58
 */
@Mapper
public interface ChildBasicDao {

	ChildBasicDO get(Long basicId);
	int save(ChildBasicDO childBasic);
	int update(ChildBasicDO childBasic);

    ChildBasicDO getRecentlyBasic(Map<String,Object> map);

	List<Integer> getAllCheckedAges(String childIdcard);
}
