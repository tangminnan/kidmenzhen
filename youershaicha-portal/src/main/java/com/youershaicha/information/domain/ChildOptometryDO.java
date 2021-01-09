package com.youershaicha.information.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 验光数据表
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:27
 */
public class ChildOptometryDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Integer tOptometryId;
	//检查记录表id
	private Integer historyId;
	//第一次验光VD
	private Double firstCheckVd;
	//第一次检查右眼ps
	private Double firstCheckRps;
	//第一次检查左眼ps
	private Double firstCheckLps;
	//第一次检查右眼cs
	private Double firstCheckRcs;
	//第一次检查左眼cs
	private Double firstCheckLcs;
	//第一次定脑验光日期
	private Date checkDate;
	//第二次验光VD
	private Double secondCheckVd;
	//第一次检查右眼ps
	private Double secondCheckRps;
	//第一次检查左眼ps
	private Double secondCheckLps;
	//第一次检查右眼cs
	private Double secondCheckRcs;
	//第一次检查左眼cs
	private Double secondCheckLcs;
	//状态0：正常1：禁止
	private Integer deleteFlag;
	//第一次验光PD
	private Double firstCheckPd;
	//第二次验光PD
	private Double secondCheckPd;
	//检查年龄段 0=2-7天 1=3月  2=6月  3=8月 4=1周岁  5=1周岁半 6=2周岁 7=2周岁半 8=3岁到6岁
	private int age;
	//身份证号
	private String childIdcard;
	//幼儿基本信息表 id
	private Long childId;

	/**
	 * 设置：id
	 */
	public void setTOptometryId(Integer tOptometryId) {
		this.tOptometryId = tOptometryId;
	}
	/**
	 * 获取：id
	 */
	public Integer getTOptometryId() {
		return tOptometryId;
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
	/**
	 * 设置：第一次验光VD
	 */
	public void setFirstCheckVd(Double firstCheckVd) {
		this.firstCheckVd = firstCheckVd;
	}
	/**
	 * 获取：第一次验光VD
	 */
	public Double getFirstCheckVd() {
		return firstCheckVd;
	}
	/**
	 * 设置：第一次检查右眼ps
	 */
	public void setFirstCheckRps(Double firstCheckRps) {
		this.firstCheckRps = firstCheckRps;
	}
	/**
	 * 获取：第一次检查右眼ps
	 */
	public Double getFirstCheckRps() {
		return firstCheckRps;
	}
	/**
	 * 设置：第一次检查左眼ps
	 */
	public void setFirstCheckLps(Double firstCheckLps) {
		this.firstCheckLps = firstCheckLps;
	}
	/**
	 * 获取：第一次检查左眼ps
	 */
	public Double getFirstCheckLps() {
		return firstCheckLps;
	}
	/**
	 * 设置：第一次检查右眼cs
	 */
	public void setFirstCheckRcs(Double firstCheckRcs) {
		this.firstCheckRcs = firstCheckRcs;
	}
	/**
	 * 获取：第一次检查右眼cs
	 */
	public Double getFirstCheckRcs() {
		return firstCheckRcs;
	}
	/**
	 * 设置：第一次检查左眼cs
	 */
	public void setFirstCheckLcs(Double firstCheckLcs) {
		this.firstCheckLcs = firstCheckLcs;
	}
	/**
	 * 获取：第一次检查左眼cs
	 */
	public Double getFirstCheckLcs() {
		return firstCheckLcs;
	}
	/**
	 * 设置：第一次定脑验光日期
	 */
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	/**
	 * 获取：第一次定脑验光日期
	 */
	public Date getCheckDate() {
		return checkDate;
	}
	/**
	 * 设置：第二次验光VD
	 */
	public void setSecondCheckVd(Double secondCheckVd) {
		this.secondCheckVd = secondCheckVd;
	}
	/**
	 * 获取：第二次验光VD
	 */
	public Double getSecondCheckVd() {
		return secondCheckVd;
	}
	/**
	 * 设置：第一次检查右眼ps
	 */
	public void setSecondCheckRps(Double secondCheckRps) {
		this.secondCheckRps = secondCheckRps;
	}
	/**
	 * 获取：第一次检查右眼ps
	 */
	public Double getSecondCheckRps() {
		return secondCheckRps;
	}
	/**
	 * 设置：第一次检查左眼ps
	 */
	public void setSecondCheckLps(Double secondCheckLps) {
		this.secondCheckLps = secondCheckLps;
	}
	/**
	 * 获取：第一次检查左眼ps
	 */
	public Double getSecondCheckLps() {
		return secondCheckLps;
	}
	/**
	 * 设置：第一次检查右眼cs
	 */
	public void setSecondCheckRcs(Double secondCheckRcs) {
		this.secondCheckRcs = secondCheckRcs;
	}
	/**
	 * 获取：第一次检查右眼cs
	 */
	public Double getSecondCheckRcs() {
		return secondCheckRcs;
	}
	/**
	 * 设置：第一次检查左眼cs
	 */
	public void setSecondCheckLcs(Double secondCheckLcs) {
		this.secondCheckLcs = secondCheckLcs;
	}
	/**
	 * 获取：第一次检查左眼cs
	 */
	public Double getSecondCheckLcs() {
		return secondCheckLcs;
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
	 * 设置：第一次验光PD
	 */
	public void setFirstCheckPd(Double firstCheckPd) {
		this.firstCheckPd = firstCheckPd;
	}
	/**
	 * 获取：第一次验光PD
	 */
	public Double getFirstCheckPd() {
		return firstCheckPd;
	}
	/**
	 * 设置：第二次验光PD
	 */
	public void setSecondCheckPd(Double secondCheckPd) {
		this.secondCheckPd = secondCheckPd;
	}
	/**
	 * 获取：第二次验光PD
	 */
	public Double getSecondCheckPd() {
		return secondCheckPd;
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

	public ChildOptometryDO(String childIdcard,Integer age,Double firstCheckVd, Double firstCheckPd,
							 Double secondCheckPd, Double firstCheckRps, Double firstCheckLps, Double firstCheckRcs,
							 Double firstCheckLcs, Date checkDate, Double secondCheckVd, Double secondCheckRps, Double secondCheckLps,
							 Double secondCheckRcs, Double secondCheckLcs, Integer deleteFlag) {
		super();
		this.childIdcard=childIdcard;
		this.age=age;
		this.firstCheckVd = firstCheckVd;
		this.firstCheckPd = firstCheckPd;
		this.secondCheckPd = secondCheckPd;
		this.firstCheckRps = firstCheckRps;
		this.firstCheckLps = firstCheckLps;
		this.firstCheckRcs = firstCheckRcs;
		this.firstCheckLcs = firstCheckLcs;
		this.checkDate = checkDate;
		this.secondCheckVd = secondCheckVd;
		this.secondCheckRps = secondCheckRps;
		this.secondCheckLps = secondCheckLps;
		this.secondCheckRcs = secondCheckRcs;
		this.secondCheckLcs = secondCheckLcs;
		this.deleteFlag = deleteFlag;
	}

	public ChildOptometryDO() {
	}
}
