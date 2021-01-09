package com.youershaicha.information.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 角膜曲率详情
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:26
 */
public class ChildCornealDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Integer tCornealId;
	//
	private Integer tOptometryId;
	//检查记录表id
	private Integer historyId;
	//右眼曲率
	private Double cornealMm;
	//右眼屈光度
	private Double cornealD;
	//右眼角膜柱镜轴向
	private Integer cornealDeg;
	//R1=最大曲率值  R2=最小曲率值  AVG=平均取滤纸 CYL=曲率差值
	private String type;
	//L=左眼、R=右眼
	private String ifrl;
	//first_second
	private String firstSecond;
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
	public void setTCornealId(Integer tCornealId) {
		this.tCornealId = tCornealId;
	}
	/**
	 * 获取：id
	 */
	public Integer getTCornealId() {
		return tCornealId;
	}
	/**
	 * 设置：
	 */
	public void setTOptometryId(Integer tOptometryId) {
		this.tOptometryId = tOptometryId;
	}
	/**
	 * 获取：
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
	 * 设置：右眼曲率
	 */
	public void setCornealMm(Double cornealMm) {
		this.cornealMm = cornealMm;
	}
	/**
	 * 获取：右眼曲率
	 */
	public Double getCornealMm() {
		return cornealMm;
	}
	/**
	 * 设置：右眼屈光度
	 */
	public void setCornealD(Double cornealD) {
		this.cornealD = cornealD;
	}
	/**
	 * 获取：右眼屈光度
	 */
	public Double getCornealD() {
		return cornealD;
	}
	/**
	 * 设置：右眼角膜柱镜轴向
	 */
	public void setCornealDeg(Integer cornealDeg) {
		this.cornealDeg = cornealDeg;
	}
	/**
	 * 获取：右眼角膜柱镜轴向
	 */
	public Integer getCornealDeg() {
		return cornealDeg;
	}
	/**
	 * 设置：R1=最大曲率值  R2=最小曲率值  AVG=平均取滤纸 CYL=曲率差值
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：R1=最大曲率值  R2=最小曲率值  AVG=平均取滤纸 CYL=曲率差值
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：L=左眼、R=右眼
	 */
	public void setIfrl(String ifrl) {
		this.ifrl = ifrl;
	}
	/**
	 * 获取：L=左眼、R=右眼
	 */
	public String getIfrl() {
		return ifrl;
	}
	/**
	 * 设置：first_second
	 */
	public void setFirstSecond(String firstSecond) {
		this.firstSecond = firstSecond;
	}
	/**
	 * 获取：first_second
	 */
	public String getFirstSecond() {
		return firstSecond;
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

	public ChildCornealDO(String childIdcard,Integer age,Date checkDate, Integer tOptometryId, Double cornealMm, Double cornealD, Integer cornealDeg, String type,
						   String ifrl, String firstSecond) {
		super();
		this.childIdcard=childIdcard;
		this.age=age;
		this.checkDate=checkDate;
		this.tOptometryId = tOptometryId;
		this.cornealMm = cornealMm;
		this.cornealD = cornealD;
		this.cornealDeg = cornealDeg;
		this.type = type;
		this.ifrl = ifrl;
		this.firstSecond = firstSecond;
	}

	public ChildCornealDO() {
	}
}
