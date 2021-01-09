package com.youershaicha.information.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 曲光度详情
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:26
 */
public class ChildDiopterDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Integer tDiopterId;
	//
	private Integer tOptometryId;
	//检查记录表id
	private Integer historyId;
	//右眼球镜（近、远视度数）
	private Double diopterS;
	//右眼柱镜（散光度数）
	private Double diopterC;
	//右眼轴位（散光轴位）
	private Double diopterA;
	//可信度
	private Integer believe;
	//SCA多次普通顺序 1 2  3...
	private Integer num;
	//保存的数据类型 PU_TONG=多次批量检查SCA AVG =SCA的平均值 L_DATA=夜间视力检查
	private String type;
	//L=左眼、R=右眼
	private String ifrl;
	//两周内的第几次检查  FIRST_CHECK=第一次检查   SECOND_CHECK=第二次检查
	private String firstSecond;
	//
	private Double dengxiaoqiujing;
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
	public void setTDiopterId(Integer tDiopterId) {
		this.tDiopterId = tDiopterId;
	}
	/**
	 * 获取：id
	 */
	public Integer getTDiopterId() {
		return tDiopterId;
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
	 * 设置：右眼球镜（近、远视度数）
	 */
	public void setDiopterS(Double diopterS) {
		this.diopterS = diopterS;
	}
	/**
	 * 获取：右眼球镜（近、远视度数）
	 */
	public Double getDiopterS() {
		return diopterS;
	}
	/**
	 * 设置：右眼柱镜（散光度数）
	 */
	public void setDiopterC(Double diopterC) {
		this.diopterC = diopterC;
	}
	/**
	 * 获取：右眼柱镜（散光度数）
	 */
	public Double getDiopterC() {
		return diopterC;
	}
	/**
	 * 设置：右眼轴位（散光轴位）
	 */
	public void setDiopterA(Double diopterA) {
		this.diopterA = diopterA;
	}
	/**
	 * 获取：右眼轴位（散光轴位）
	 */
	public Double getDiopterA() {
		return diopterA;
	}
	/**
	 * 设置：可信度
	 */
	public void setBelieve(Integer believe) {
		this.believe = believe;
	}
	/**
	 * 获取：可信度
	 */
	public Integer getBelieve() {
		return believe;
	}
	/**
	 * 设置：SCA多次普通顺序 1 2  3...
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * 获取：SCA多次普通顺序 1 2  3...
	 */
	public Integer getNum() {
		return num;
	}
	/**
	 * 设置：保存的数据类型 
PU_TONG=多次批量检查SCA
AVG =SCA的平均值
L_DATA=夜间视力检查
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：保存的数据类型 
PU_TONG=多次批量检查SCA
AVG =SCA的平均值
L_DATA=夜间视力检查
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
	 * 设置：两周内的第几次检查  FIRST_CHECK=第一次检查   SECOND_CHECK=第二次检查
	 */
	public void setFirstSecond(String firstSecond) {
		this.firstSecond = firstSecond;
	}
	/**
	 * 获取：两周内的第几次检查  FIRST_CHECK=第一次检查   SECOND_CHECK=第二次检查
	 */
	public String getFirstSecond() {
		return firstSecond;
	}
	/**
	 * 设置：
	 */
	public void setDengxiaoqiujing(Double dengxiaoqiujing) {
		this.dengxiaoqiujing = dengxiaoqiujing;
	}
	/**
	 * 获取：
	 */
	public Double getDengxiaoqiujing() {
		return dengxiaoqiujing;
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

	public ChildDiopterDO() {
	}
}
