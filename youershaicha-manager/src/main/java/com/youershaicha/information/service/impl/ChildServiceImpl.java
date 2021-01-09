package com.youershaicha.information.service.impl;

import com.youershaicha.information.dao.*;
import com.youershaicha.information.domain.*;
import com.youershaicha.information.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service
public class ChildServiceImpl implements ChildService {
	@Autowired
	private ChildDao childDao;
	@Autowired
	private ChildRefractionScreeningDao childRefractionScreeningDao;
	@Autowired
	private ChildPhotographyDao childPhotographyDao;
	@Autowired
	private ChildOptometryDao childOptometryDao;
	@Autowired
	private ChildDiopterDao childDiopterDao;
	@Autowired
	private ChildCornealDao childCornealDao;
	@Autowired
	private ChildEyeaxisDao childEyeaxisDao;
	@Autowired
	private ChildBasicDao childBasicDao;
	
	@Override
	public ChildDO get(Long childId){
		return childDao.get(childId);
	}
	
	@Override
	public List<ChildDO> list(Map<String, Object> map){
		return childDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return childDao.count(map);
	}
	
	@Override
	public int save(ChildDO child){
		return childDao.save(child);
	}
	
	@Override
	public int update(ChildDO child){
		return childDao.update(child);
	}
	
	@Override
	public int remove(Long childId){
		return childDao.remove(childId);
	}
	
	@Override
	public int batchRemove(Long[] childIds){
		return childDao.batchRemove(childIds);
	}

	@Override
	public ChildDO getByChildIdcard(String childIdcard) {
		return childDao.getByChildIdcard(childIdcard);
	}

	@Override
	public int saveChildBasic(ChildBasicDO childBasicDO) {
		return childBasicDao.save(childBasicDO);
	}

	@Override
	public ChildRefractionScreeningDO getRecentChildRefractionScreeningDO(Map<String,Object> paramsMap) {
		return childRefractionScreeningDao.getRecentChildRefractionScreeningDO(paramsMap);
	}

	@Override
	public ChildPhotographyDO getRecentChildPhotographyDO(Map<String,Object> map) {
		return childPhotographyDao.getRecentChildPhotographyDO(map);
	}

	@Override
	public ChildOptometryDO getRecentChildOptometryDO(Map<String,Object> map) {
		return childOptometryDao.getRecentChildOptometryDO(map);
	}

	@Override
	public List<ChildDiopterDO> getChildDiopterDOList(Integer tOptometryId) {
		return childDiopterDao.getChildDiopterDOList(tOptometryId);
	}

	@Override
	public List<ChildCornealDO> getChildChildCornealDOList(Integer tOptometryId) {
		return childCornealDao.getChildChildCornealDOList(tOptometryId);
	}

	@Override
	public ChildEyeaxisDO getChildEyeaxisDO(Map<String,Object> map) {
		return childEyeaxisDao.getChildEyeaxisDO(map);
	}

	@Override
	public ChildBasicDO getRecentlyBasic(Map<String,Object> map) {
		return childBasicDao.getRecentlyBasic(map);
	}

	@Override
	public List<Integer> getAllCheckedAges(String childIdcard) {
		return  childBasicDao.getAllCheckedAges(childIdcard);
	}

}
