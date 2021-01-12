package com.youershaicha.information.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 眼轴长度
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:26
 */
public class ChildEyeaxisDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Integer tEyeaxisId;
	//右眼第一次检查结果
	private Double firstCheckOd;
	//左眼第一次检查结果
	private Double firstCheckOs;
	//右眼第二次检查结果
	private Double secondCheckOd;
	//左眼第二次检查结果
	private Double secondCheckOs;
	//状态0：正常1：禁止
	private Integer deleteFlag;
	//检查记录表id
	private Integer historyId;
	//检查年龄段 0=2-7天 1=3月  2=6月  3=8月 4=1周岁  5=1周岁半 6=2周岁 7=2周岁半 8=3岁到6岁
	private int age;
	//身份证号
	private String childIdcard;
	//幼儿基本信息表 id
	private Long childId;
	//本次检查日期
	private Date checkDate;


	/**
	 * 设置：id
	 */
	public void setTEyeaxisId(Integer tEyeaxisId) {
		this.tEyeaxisId = tEyeaxisId;
	}
	/**
	 * 获取：id
	 */
	public Integer getTEyeaxisId() {
		return tEyeaxisId;
	}
	/**
	 * 设置：右眼第一次检查结果
	 */
	public void setFirstCheckOd(Double firstCheckOd) {
		this.firstCheckOd = firstCheckOd;
	}
	/**
	 * 获取：右眼第一次检查结果
	 */
	public Double getFirstCheckOd() {
		return firstCheckOd;
	}
	/**
	 * 设置：左眼第一次检查结果
	 */
	public void setFirstCheckOs(Double firstCheckOs) {
		this.firstCheckOs = firstCheckOs;
	}
	/**
	 * 获取：左眼第一次检查结果
	 */
	public Double getFirstCheckOs() {
		return firstCheckOs;
	}
	/**
	 * 设置：右眼第二次检查结果
	 */
	public void setSecondCheckOd(Double secondCheckOd) {
		this.secondCheckOd = secondCheckOd;
	}
	/**
	 * 获取：右眼第二次检查结果
	 */
	public Double getSecondCheckOd() {
		return secondCheckOd;
	}
	/**
	 * 设置：左眼第二次检查结果
	 */
	public void setSecondCheckOs(Double secondCheckOs) {
		this.secondCheckOs = secondCheckOs;
	}
	/**
	 * 获取：左眼第二次检查结果
	 */
	public Double getSecondCheckOs() {
		return secondCheckOs;
	}
	/**
	 * 设置：状态0：正常1：禁止
	 */
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	/**
	 * 获取：状态0：正常1：禁止
	 */
	public Integer getDeleteFlag() {
		return deleteFlag;
	}
	/**
	 * 设置：检查记录表id
	 */
	public void setHistoryId(Integer historyId) {
		this.historyId = historyId;
	}
	/**
	 * 获取：检查记录表id
	 */
	public Integer getHistoryId() {
		return historyId;
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
