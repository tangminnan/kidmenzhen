package com.youershaicha.information.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;


/**
 * 幼儿屈光筛查检查表
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:27
 */
public class ChildRefractionScreeningDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long screeningId;
	//幼儿检查记录表 id
	private Long historyId;
	//右眼球镜
	private String righteyeDiopterS;
	//右眼柱镜
	private String righteyeDiopterC;
	//右眼轴位
	private String righteyeDiopterA;
	//左眼球镜
	private String lefteyeDiopterS;
	//左眼柱镜
	private String lefteyeDiopterC;
	//左眼轴位
	private String lefteyeDiopterA;
	//右眼等效球镜
	private String righteyeDengxiaoqiujing;
	//左眼等效球镜
	private String lefteyeDengxiaoqiujing;
	//双眼瞳距
	private String ouPd;
	//左眼瞳距
	private String osPd;
	//右眼瞳距
	private String odPd;
	//右眼检查结果类型 0 正常 1可疑 2异常
	private Integer righteyeResultType;
	//右眼检查可疑、异常情况 YUANSHI 远视 JINSHI 近视 SANGUANG 散光
	private String righteyeResultIns;
	//左眼检查结果类型 0 正常 1可疑 2异常
	private Integer lefteyeResultType;
	//左眼检查可疑、异常情况 YUANSHI 远视 JINSHI 近视 SANGUANG 散光
	private String lefteyeResultIns;
	//检查年龄段 0=2-7天 1=3月  2=6月  3=8月 4=1周岁  5=1周岁半 6=2周岁 7=2周岁半 8=3岁到6岁
	private int age;
	//身份证号
	private String childIdcard;
	//幼儿基本信息表 id
	private Long childId;
	//本次检查日期
	private Date checkDate;

	/**
	 * 设置：主键
	 */
	public void setScreeningId(Long screeningId) {
		this.screeningId = screeningId;
	}
	/**
	 * 获取：主键
	 */
	public Long getScreeningId() {
		return screeningId;
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
	 * 设置：右眼球镜
	 */
	public void setRighteyeDiopterS(String righteyeDiopterS) {
		this.righteyeDiopterS = righteyeDiopterS;
	}
	/**
	 * 获取：右眼球镜
	 */
	public String getRighteyeDiopterS() {
		return righteyeDiopterS;
	}
	/**
	 * 设置：右眼柱镜
	 */
	public void setRighteyeDiopterC(String righteyeDiopterC) {
		this.righteyeDiopterC = righteyeDiopterC;
	}
	/**
	 * 获取：右眼柱镜
	 */
	public String getRighteyeDiopterC() {
		return righteyeDiopterC;
	}
	/**
	 * 设置：右眼轴位
	 */
	public void setRighteyeDiopterA(String righteyeDiopterA) {
		this.righteyeDiopterA = righteyeDiopterA;
	}
	/**
	 * 获取：右眼轴位
	 */
	public String getRighteyeDiopterA() {
		return righteyeDiopterA;
	}
	/**
	 * 设置：左眼球镜
	 */
	public void setLefteyeDiopterS(String lefteyeDiopterS) {
		this.lefteyeDiopterS = lefteyeDiopterS;
	}
	/**
	 * 获取：左眼球镜
	 */
	public String getLefteyeDiopterS() {
		return lefteyeDiopterS;
	}
	/**
	 * 设置：左眼柱镜
	 */
	public void setLefteyeDiopterC(String lefteyeDiopterC) {
		this.lefteyeDiopterC = lefteyeDiopterC;
	}
	/**
	 * 获取：左眼柱镜
	 */
	public String getLefteyeDiopterC() {
		return lefteyeDiopterC;
	}
	/**
	 * 设置：左眼轴位
	 */
	public void setLefteyeDiopterA(String lefteyeDiopterA) {
		this.lefteyeDiopterA = lefteyeDiopterA;
	}
	/**
	 * 获取：左眼轴位
	 */
	public String getLefteyeDiopterA() {
		return lefteyeDiopterA;
	}
	/**
	 * 设置：右眼等效球镜
	 */
	public void setRighteyeDengxiaoqiujing(String righteyeDengxiaoqiujing) {
		this.righteyeDengxiaoqiujing = righteyeDengxiaoqiujing;
	}
	/**
	 * 获取：右眼等效球镜
	 */
	public String getRighteyeDengxiaoqiujing() {
		return righteyeDengxiaoqiujing;
	}
	/**
	 * 设置：左眼等效球镜
	 */
	public void setLefteyeDengxiaoqiujing(String lefteyeDengxiaoqiujing) {
		this.lefteyeDengxiaoqiujing = lefteyeDengxiaoqiujing;
	}
	/**
	 * 获取：左眼等效球镜
	 */
	public String getLefteyeDengxiaoqiujing() {
		return lefteyeDengxiaoqiujing;
	}
	/**
	 * 设置：双眼瞳距
	 */
	public void setOuPd(String ouPd) {
		this.ouPd = ouPd;
	}
	/**
	 * 获取：双眼瞳距
	 */
	public String getOuPd() {
		return ouPd;
	}
	/**
	 * 设置：左眼瞳距
	 */
	public void setOsPd(String osPd) {
		this.osPd = osPd;
	}
	/**
	 * 获取：左眼瞳距
	 */
	public String getOsPd() {
		return osPd;
	}
	/**
	 * 设置：右眼瞳距
	 */
	public void setOdPd(String odPd) {
		this.odPd = odPd;
	}
	/**
	 * 获取：右眼瞳距
	 */
	public String getOdPd() {
		return odPd;
	}
	/**
	 * 设置：右眼检查结果类型 0 正常 1可疑 2异常
	 */
	public void setRighteyeResultType(Integer righteyeResultType) {
		this.righteyeResultType = righteyeResultType;
	}
	/**
	 * 获取：右眼检查结果类型 0 正常 1可疑 2异常
	 */
	public Integer getRighteyeResultType() {
		return righteyeResultType;
	}
	/**
	 * 设置：右眼检查可疑、异常情况 YUANSHI 远视 JINSHI 近视 SANGUANG 散光
	 */
	public void setRighteyeResultIns(String righteyeResultIns) {
		this.righteyeResultIns = righteyeResultIns;
	}
	/**
	 * 获取：右眼检查可疑、异常情况 YUANSHI 远视 JINSHI 近视 SANGUANG 散光
	 */
	public String getRighteyeResultIns() {
		return righteyeResultIns;
	}

	public Integer getLefteyeResultType() {
		return lefteyeResultType;
	}

	public void setLefteyeResultType(Integer lefteyeResultType) {
		this.lefteyeResultType = lefteyeResultType;
	}

	public String getLefteyeResultIns() {
		return lefteyeResultIns;
	}

	public void setLefteyeResultIns(String lefteyeResultIns) {
		this.lefteyeResultIns = lefteyeResultIns;
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

	public ChildRefractionScreeningDO(String righteyeDiopterS, String righteyeDiopterC, String righteyeDiopterA, String lefteyeDiopterS,
									  String lefteyeDiopterC, String lefteyeDiopterA, String righteyeDengxiaoqiujing, String lefteyeDengxiaoqiujing,
									  String ouPd, String osPd, String odPd, Integer righteyeResultType,
									  String righteyeResultIns, Integer lefteyeResultType, String lefteyeResultIns, int age, String childIdcard,  Date checkDate) {

		this.childIdcard = childIdcard;
		this.checkDate = checkDate;
		this.age = age;
		this.righteyeDiopterS = righteyeDiopterS;
		this.righteyeDiopterC = righteyeDiopterC;
		this.righteyeDiopterA = righteyeDiopterA;
		this.lefteyeDiopterS = lefteyeDiopterS;
		this.lefteyeDiopterC = lefteyeDiopterC;
		this.lefteyeDiopterA = lefteyeDiopterA;
		this.righteyeDengxiaoqiujing = righteyeDengxiaoqiujing;
		this.lefteyeDengxiaoqiujing = lefteyeDengxiaoqiujing;
		this.ouPd = ouPd;
		this.osPd = osPd;
		this.odPd = odPd;
		this.righteyeResultType = righteyeResultType;
		this.righteyeResultIns = righteyeResultIns;
		this.lefteyeResultType = lefteyeResultType;
		this.lefteyeResultIns = lefteyeResultIns;

	}

	public ChildRefractionScreeningDO() {
	}
}
