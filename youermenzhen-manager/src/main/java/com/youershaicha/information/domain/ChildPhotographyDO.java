package com.youershaicha.information.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 幼儿广域眼底照相检查表
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:27
 */
public class ChildPhotographyDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long photographyId;
	//幼儿检查记录表 id
	private Long historyId;
	//右眼采集的照片
	private String picRighteye;
	//左眼采集的照片
	private String picLefteye;
	//结论
	private String conclusion;
	//检查年龄段 0=2-7天 1=3月  2=6月  3=8月 4=1周岁  5=1周岁半 6=2周岁 7=2周岁半 8=3岁到6岁
	private int age;
	//身份证号
	private String childIdcard;
	//幼儿基本信息表 id
	private Long childId;
	//本次检查日期
	private Date checkDate;
	//右眼照片
	private List<String> rightList = new ArrayList<String>();
	//左眼照片
	private List<String> leftList = new ArrayList<String>();


	public List<String> getRightList() {
		return rightList;
	}

	public void setRightList(List<String> rightList) {
		this.rightList = rightList;
	}

	public List<String> getLeftList() {
		return leftList;
	}

	public void setLeftList(List<String> leftList) {
		this.leftList = leftList;
	}

	/**
	 * 设置：主键
	 */
	public void setPhotographyId(Long photographyId) {
		this.photographyId = photographyId;
	}
	/**
	 * 获取：主键
	 */
	public Long getPhotographyId() {
		return photographyId;
	}
	/**
	 * 设置：幼儿检查记录表 id
	 */
	public void setHistoryId(Long historyId) {
		this.historyId = historyId;
	}
	/**
	 * 获取：幼儿检查记录表 id
	 */
	public Long getHistoryId() {
		return historyId;
	}
	/**
	 * 设置：右眼采集的照片
	 */
	public void setPicRighteye(String picRighteye) {
		this.picRighteye = picRighteye;
	}
	/**
	 * 获取：右眼采集的照片
	 */
	public String getPicRighteye() {
		return picRighteye;
	}
	/**
	 * 设置：左眼采集的照片
	 */
	public void setPicLefteye(String picLefteye) {
		this.picLefteye = picLefteye;
	}
	/**
	 * 获取：左眼采集的照片
	 */
	public String getPicLefteye() {
		return picLefteye;
	}
	/**
	 * 设置：结论
	 */
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	/**
	 * 获取：结论
	 */
	public String getConclusion() {
		return conclusion;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getChildIdcard() {
		return childIdcard;
	}

	public void setChildIdcard(String childIdcard) {
		this.childIdcard = childIdcard;
	}

	public Long getChildId() {
		return childId;
	}

	public void setChildId(Long childId) {
		this.childId = childId;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
}
