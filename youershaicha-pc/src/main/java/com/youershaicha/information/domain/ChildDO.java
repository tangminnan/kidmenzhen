package com.youershaicha.information.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 幼儿基本信息表
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2020-12-31 16:37:34
 */
public class ChildDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long childId;
	//孩子姓名
	private String childName;
	//出生日期
	private Date childBirthday;
	//身份证号
	private String childIdcard;
	//性别  0男  1女
	private Integer childGender;
	//ZAOCHAN 早产儿 DITIZHONG 低体重儿 DANTAI 单胎 SHUANGTAI 双胎  DUOTAI 多胎
	private String childType;
	//母亲姓名
	private String motherName;
	//母亲身份证号
	private String motherIdcard;
	//母亲眼疾病家族史 0 无  1 有
	private Integer motherEyeHis;
	// 母亲眼疾病家族史 JINSHI 近视  YUANSHI 远视  RUOSHI 弱视
	private String motherEyeIns;
	//父亲眼疾病家族史 0 无  1 有
	private Integer fatherEyeHis;
	//父亲眼疾病家族史 JINSHI 近视  YUANSHI 远视  RUOSHI 弱视
	private String fatherEyeIns;
	//家庭住址
	private String childAddress;
	//特殊药史 0 无  1 有
	private Integer childMedicineHis;
	//特殊药史
	private String childMedicineIns;
	//电话
	private String childPhone;
	//SHUNCHAN 顺产 PAOFUCHAN 剖腹产 TAITOUXIYIN 胎头吸引
	private String childDelivery;
	//住院号
	private String childHistoryN;
	//孕周
	private Integer childGestationalweek;
	//出生时体重 KG
	private Double childWeight;
	//窒息史 0 无  1 有
	private Integer childSuffocation;
	//吸氧史 0 无  1 有
	private Integer childOxygen;
	//特殊情况
	private String childSpec;
	//父亲姓名
	private String fatherName;
	//最近一次的检查信息
	private String checkString;
	/**
	 * 设置：主键
	 */
	public void setChildId(Long childId) {
		this.childId = childId;
	}
	/**
	 * 获取：主键
	 */
	public Long getChildId() {
		return childId;
	}
	/**
	 * 设置：孩子姓名
	 */
	public void setChildName(String childName) {
		this.childName = childName;
	}
	/**
	 * 获取：孩子姓名
	 */
	public String getChildName() {
		return childName;
	}
	/**
	 * 设置：出生日期
	 */
	public void setChildBirthday(Date childBirthday) {
		this.childBirthday = childBirthday;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getChildBirthday() {
		return childBirthday;
	}
	/**
	 * 设置：身份证号
	 */
	public void setChildIdcard(String childIdcard) {
		this.childIdcard = childIdcard;
	}
	/**
	 * 获取：身份证号
	 */
	public String getChildIdcard() {
		return childIdcard;
	}
	/**
	 * 设置：性别  0男  1女
	 */
	public void setChildGender(Integer childGender) {
		this.childGender = childGender;
	}
	/**
	 * 获取：性别  0男  1女
	 */
	public Integer getChildGender() {
		return childGender;
	}
	/**
	 * 设置：ZAOCHAN 早产儿 DITIZHONG 低体重儿 DANTAI 单胎
   SHUANGTAI 双胎  DUOTAI 多胎
	 */
	public void setChildType(String childType) {
		this.childType = childType;
	}
	/**
	 * 获取：ZAOCHAN 早产儿 DITIZHONG 低体重儿 DANTAI 单胎
   SHUANGTAI 双胎  DUOTAI 多胎
	 */
	public String getChildType() {
		return childType;
	}
	/**
	 * 设置：母亲姓名
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	/**
	 * 获取：母亲姓名
	 */
	public String getMotherName() {
		return motherName;
	}
	/**
	 * 设置：母亲身份证号
	 */
	public void setMotherIdcard(String motherIdcard) {
		this.motherIdcard = motherIdcard;
	}
	/**
	 * 获取：母亲身份证号
	 */
	public String getMotherIdcard() {
		return motherIdcard;
	}
	/**
	 * 设置：母亲眼疾病家族史 0 无  1 有
	 */
	public void setMotherEyeHis(Integer motherEyeHis) {
		this.motherEyeHis = motherEyeHis;
	}
	/**
	 * 获取：母亲眼疾病家族史 0 无  1 有
	 */
	public Integer getMotherEyeHis() {
		return motherEyeHis;
	}
	/**
	 * 设置： 母亲眼疾病家族史 JINSHI 近视  YUANSHI 远视  RUOSHI 弱视
	 */
	public void setMotherEyeIns(String motherEyeIns) {
		this.motherEyeIns = motherEyeIns;
	}
	/**
	 * 获取： 母亲眼疾病家族史 JINSHI 近视  YUANSHI 远视  RUOSHI 弱视
	 */
	public String getMotherEyeIns() {
		return motherEyeIns;
	}
	/**
	 * 设置：父亲眼疾病家族史 0 无  1 有
	 */
	public void setFatherEyeHis(Integer fatherEyeHis) {
		this.fatherEyeHis = fatherEyeHis;
	}
	/**
	 * 获取：父亲眼疾病家族史 0 无  1 有
	 */
	public Integer getFatherEyeHis() {
		return fatherEyeHis;
	}
	/**
	 * 设置：父亲眼疾病家族史 JINSHI 近视  YUANSHI 远视  RUOSHI 弱视
	 */
	public void setFatherEyeIns(String fatherEyeIns) {
		this.fatherEyeIns = fatherEyeIns;
	}
	/**
	 * 获取：父亲眼疾病家族史 JINSHI 近视  YUANSHI 远视  RUOSHI 弱视
	 */
	public String getFatherEyeIns() {
		return fatherEyeIns;
	}
	/**
	 * 设置：家庭住址
	 */
	public void setChildAddress(String childAddress) {
		this.childAddress = childAddress;
	}
	/**
	 * 获取：家庭住址
	 */
	public String getChildAddress() {
		return childAddress;
	}
	/**
	 * 设置：特殊药史 0 无  1 有
	 */
	public void setChildMedicineHis(Integer childMedicineHis) {
		this.childMedicineHis = childMedicineHis;
	}
	/**
	 * 获取：特殊药史 0 无  1 有
	 */
	public Integer getChildMedicineHis() {
		return childMedicineHis;
	}
	/**
	 * 设置：特殊药史
	 */
	public void setChildMedicineIns(String childMedicineIns) {
		this.childMedicineIns = childMedicineIns;
	}
	/**
	 * 获取：特殊药史
	 */
	public String getChildMedicineIns() {
		return childMedicineIns;
	}
	/**
	 * 设置：电话
	 */
	public void setChildPhone(String childPhone) {
		this.childPhone = childPhone;
	}
	/**
	 * 获取：电话
	 */
	public String getChildPhone() {
		return childPhone;
	}
	/**
	 * 设置：SHUNCHAN 顺产 PAOFUCHAN 剖腹产 TAITOUXIYIN 胎头吸引
	 */
	public void setChildDelivery(String childDelivery) {
		this.childDelivery = childDelivery;
	}
	/**
	 * 获取：SHUNCHAN 顺产 PAOFUCHAN 剖腹产 TAITOUXIYIN 胎头吸引
	 */
	public String getChildDelivery() {
		return childDelivery;
	}
	/**
	 * 设置：住院号
	 */
	public void setChildHistoryN(String childHistoryN) {
		this.childHistoryN = childHistoryN;
	}
	/**
	 * 获取：住院号
	 */
	public String getChildHistoryN() {
		return childHistoryN;
	}
	/**
	 * 设置：孕周
	 */
	public void setChildGestationalweek(Integer childGestationalweek) {
		this.childGestationalweek = childGestationalweek;
	}
	/**
	 * 获取：孕周
	 */
	public Integer getChildGestationalweek() {
		return childGestationalweek;
	}
	/**
	 * 设置：出生时体重 KG
	 */
	public void setChildWeight(Double childWeight) {
		this.childWeight = childWeight;
	}
	/**
	 * 获取：出生时体重 KG
	 */
	public Double getChildWeight() {
		return childWeight;
	}
	/**
	 * 设置：窒息史 0 无  1 有
	 */
	public void setChildSuffocation(Integer childSuffocation) {
		this.childSuffocation = childSuffocation;
	}
	/**
	 * 获取：窒息史 0 无  1 有
	 */
	public Integer getChildSuffocation() {
		return childSuffocation;
	}
	/**
	 * 设置：吸氧史 0 无  1 有
	 */
	public void setChildOxygen(Integer childOxygen) {
		this.childOxygen = childOxygen;
	}
	/**
	 * 获取：吸氧史 0 无  1 有
	 */
	public Integer getChildOxygen() {
		return childOxygen;
	}
	/**
	 * 设置：特殊情况
	 */
	public void setChildSpec(String childSpec) {
		this.childSpec = childSpec;
	}
	/**
	 * 获取：特殊情况
	 */
	public String getChildSpec() {
		return childSpec;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getCheckString() {
		return checkString;
	}

	public void setCheckString(String checkString) {
		this.checkString = checkString;
	}

	@Override
	public String toString() {
		return "ChildDO{" +
				"childId=" + childId +
				", childName='" + childName + '\'' +
				", childBirthday=" + childBirthday +
				", childIdcard='" + childIdcard + '\'' +
				", childGender=" + childGender +
				", childType='" + childType + '\'' +
				", motherName='" + motherName + '\'' +
				", motherIdcard=" + motherIdcard +
				", motherEyeHis=" + motherEyeHis +
				", motherEyeIns='" + motherEyeIns + '\'' +
				", fatherEyeHis=" + fatherEyeHis +
				", fatherEyeIns='" + fatherEyeIns + '\'' +
				", childAddress='" + childAddress + '\'' +
				", childMedicineHis=" + childMedicineHis +
				", childMedicineIns='" + childMedicineIns + '\'' +
				", childPhone='" + childPhone + '\'' +
				", childDelivery='" + childDelivery + '\'' +
				", childHistoryN='" + childHistoryN + '\'' +
				", childGestationalweek=" + childGestationalweek +
				", childWeight=" + childWeight +
				", childSuffocation=" + childSuffocation +
				", childOxygen=" + childOxygen +
				", childSpec='" + childSpec + '\'' +
				", fatherName='" + fatherName + '\'' +
				'}';
	}
}
