package com.youershaicha.information.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 幼儿基本检查表
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-05 09:32:58
 */
public class ChildBasicDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long basicId;
	//幼儿检查记录表 id
	private Long historyId;
	//外眼检查右眼 0 正常 1异常
	private Integer externalRighteyeExaminationType;
	//外眼右眼检查异常情况 YILEI 溢泪 FENBIWU 分泌物 MAOXIXUEGUANLIU 毛细血管瘤 JIEMOCHUXUE 结膜出血
   // HONGMOMAOXIXUEGUAN 虹膜毛细血管 JIAOMOBAIBAN 角膜白斑
	private String externalRighteyeExaminationIns;
	//外眼检查左眼 0 正常 1异常
	private Integer externalLefteyeExaminationType;
	//外眼左眼检查异常情况 YILEI 溢泪 FENBIWU 分泌物 MAOXIXUEGUANLIU 毛细血管瘤 JIEMOCHUXUE 结膜出血
   // HONGMOMAOXIXUEGUAN 虹膜毛细血管 JIAOMOBAIBAN 角膜白斑
	private String externalLefteyeExaminationIns;
	//红光反射右眼 0 正常 1异常
	private Integer redlightRighteyeReflexType;
	//红光反射右眼异常情况说明
	private String redlightRighteyeReflexIns;
	//红光反射左眼 0 正常 1异常
	private Integer redlightLefteyeReflexType;
	//红光反射左眼异常情况说明
	private String redlightLefteyeReflexIns;
	//视觉行为右眼 0 通过 1 未通过
	private Integer visualbehaviorRighteyeType;
	//视觉行为左眼 0 通过 1 未通过
	private Integer visualbehaviorLefteyeType;
	//右眼视力初筛 0 无  1正常 2不配合  3 选择性观看
	private Integer primaryScreenOfVisionRighteyeType;
	//左眼视力初筛 0 无  1正常 2不配合  3 选择性观看
	private Integer primaryScreenOfVisionLefrteyeType;
	//右眼选择性注视检测
	private String selectiveGazeDetectionRighteye;
	//左眼选择性注视检测
	private String selectiveGazeDetectionLefteye;
	//右眼眼位检查 0 正位  1 斜视 2 眼球震颤
	private Integer examinationOfPositionRighteyeType;
	//右眼眼位检查斜视类型 NEIXIE 内斜  WAIXIE 外斜 CHUIZHIXIE 垂直斜
	private String examinationOfStrabismusRighteyeType;
	//右眼内斜说明
	private String examinationOfStrabismusRighteyeInsn;
	//右眼外斜情况说明
	private String examinationOfStrabismusRighteyeInsw;
	//右眼垂直斜情况说明',
	private String examinationOfStrabismusRighteyeInsc;
	//左眼眼位检查 0 正位  1 斜视 2 眼球震颤
	private Integer examinationOfPositionLefteyeType;
	//左眼眼位检查斜视类型 NEIXIE 内斜  WAIXIE 外斜 CHUIZHIXIE 垂直斜
	private String examinationOfStrabismusLefteyeType;
	//左眼内斜视说明
	private String examinationOfStrabismusLefteyeInsn;
	// 左眼外协情况说明
	private String examinationOfStrabismusLefteyeInsw;
	// 左眼垂直斜情况
	private String examinationOfStrabismusLefteyeInsc;
	//右眼眼球运动 0 正常 1异常
	private Integer eyemovementRighteyeType;
	//右眼眼球运动异常情况说明
	private String eyemovementRighteyeIns;
	//左眼眼球运动 0 正常 1异常
	private Integer eyemovementLefteyeType;
	//左眼眼球运动异常情况说明
	private String eyemovementLefteyeIns;
	//检影检查 0 是 1否
	private Integer filmExaminationType;
	//右眼检查检查 S
	private String filmExaminationRighteyeS;
	//右眼检查检查 c
	private String filmExaminationRighteyeC;
	//右眼检查检查 a
	private String filmExaminationRighteyeA;
	//左眼检查检查 S
	private String filmExaminationLefteyeS;
	//左眼检查检查 c
	private String filmExaminationLefteyeC;
	//左眼检查检查 a
	private String filmExaminationLefteyeA;
	//裸眼视力检查类型  0 E字视标  1 图形视标
	private Integer nakedversionType;
	//右眼裸眼视力
	private String nakedversionRighteye;
	//左眼裸眼视力
	private String nakedversionLefteye;
	//戴镜视力检查类型  0 E字视标  1 图形视标
	private Integer glassesversionType;
	//右眼戴镜视力
	private String glassesversionRighteye;
	//左眼戴镜视力
	private String glassesversionLefteye;
	//右眼色觉检查 0 正常 1异常
	private Integer colorversionRighteyeType;
	//右眼色觉检查 异常情况说明
	private String colorversionRighteyeIns;
	//左眼色觉检查 0 正常 1异常
	private Integer colorversionLefteyeType;
	//左眼色觉检查 异常情况说明
	private String colorversionLefteyeIns;
	//右眼瞬目反射 0通过  1未通过
	private Integer blinkReflexRighteye;
	//左眼瞬目反射 0通过  1未通过
	private Integer blinkReflexLefteye;
	//右眼红球实验 0通过  1未通过
	private Integer redballRighteye;
	//左眼红球实验 0通过  1未通过
	private Integer redballLefteye;
	//右眼眼球追随运动 0 正常 1异常
	private Integer followRighteyeType;
	//右眼眼球追随运动 异常情况说明
	private String followRighteyeIns;
	//左眼眼球追随运动 0 正常 1异常
	private Integer followLefteyeType;
	//左眼眼球追随运动 异常情况说明
	private String followLefteyeIns;
	//检查者签字
	private String chector;
	//结论
	private String conclusion;
	//建议
	private String proposal;
	//检查年龄段 0=2-7天 1=3月  2=6月  3=8月 4=1周岁  5=1周岁半 6=2周岁 7=2周岁半 8=3岁到6岁
	private Integer age;
	//下次检查日期
	private Date lastCheckDate;
	//身份证号
	private String childIdcard;
	//幼儿基本信息表 id
	private Long childId;
	//本次检查日期
	private Date checkDate;
	//2-7岁右眼结论 0=眼球结构未见异常 1=眼前节未见异常  2=异常
	private Integer ocularArchitectureRighteyeConclusion;
	//2-7岁左眼结论 0=眼球结构未见异常 1=眼前节未见异常  2=异常
	private Integer ocularArchitectureLefteyeConclusion;
	//2-7天右眼异常原因
	private String	ocularArchitectureRighteye;
	//2-7岁左眼异常原因
	private String	ocularArchitectureLefteye;
	//右眼外眼检查其他
	private String waiyanrightjianchaqita;
	//左眼外眼检查 其他
	private String waiyanleftjianchaqita;
//最近一次的检查日期
	private String checkString;
	//下次检查时间
	private  String lastcheckString;

	public String getLastcheckString() {
		return lastcheckString;
	}

	public void setLastcheckString(String lastcheckString) {
		this.lastcheckString = lastcheckString;
	}

	/**
	 * 设置：主键
	 */
	public void setBasicId(Long basicId) {
		this.basicId = basicId;
	}
	/**
	 * 获取：主键
	 */
	public Long getBasicId() {
		return basicId;
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
	 * 设置：外眼检查右眼 0 正常 1异常
	 */
	public void setExternalRighteyeExaminationType(Integer externalRighteyeExaminationType) {
		this.externalRighteyeExaminationType = externalRighteyeExaminationType;
	}
	/**
	 * 获取：外眼检查右眼 0 正常 1异常
	 */
	public Integer getExternalRighteyeExaminationType() {
		return externalRighteyeExaminationType;
	}
	/**
	 * 设置：外眼右眼检查异常情况 YILEI 溢泪 FENBIWU 分泌物 MAOXIXUEGUANLIU 毛细血管瘤 JIEMOCHUXUE 结膜出血
   HONGMOMAOXIXUEGUAN 虹膜毛细血管 JIAOMOBAIBAN 角膜白斑 
	 */
	public void setExternalRighteyeExaminationIns(String externalRighteyeExaminationIns) {
		this.externalRighteyeExaminationIns = externalRighteyeExaminationIns;
	}
	/**
	 * 获取：外眼右眼检查异常情况 YILEI 溢泪 FENBIWU 分泌物 MAOXIXUEGUANLIU 毛细血管瘤 JIEMOCHUXUE 结膜出血
   HONGMOMAOXIXUEGUAN 虹膜毛细血管 JIAOMOBAIBAN 角膜白斑 
	 */
	public String getExternalRighteyeExaminationIns() {
		return externalRighteyeExaminationIns;
	}
	/**
	 * 设置：外眼检查左眼 0 正常 1异常
	 */
	public void setExternalLefteyeExaminationType(Integer externalLefteyeExaminationType) {
		this.externalLefteyeExaminationType = externalLefteyeExaminationType;
	}
	/**
	 * 获取：外眼检查左眼 0 正常 1异常
	 */
	public Integer getExternalLefteyeExaminationType() {
		return externalLefteyeExaminationType;
	}
	/**
	 * 设置：外眼左眼检查异常情况 YILEI 溢泪 FENBIWU 分泌物 MAOXIXUEGUANLIU 毛细血管瘤 JIEMOCHUXUE 结膜出血
   HONGMOMAOXIXUEGUAN 虹膜毛细血管 JIAOMOBAIBAN 角膜白斑 
	 */
	public void setExternalLefteyeExaminationIns(String externalLefteyeExaminationIns) {
		this.externalLefteyeExaminationIns = externalLefteyeExaminationIns;
	}
	/**
	 * 获取：外眼左眼检查异常情况 YILEI 溢泪 FENBIWU 分泌物 MAOXIXUEGUANLIU 毛细血管瘤 JIEMOCHUXUE 结膜出血
   HONGMOMAOXIXUEGUAN 虹膜毛细血管 JIAOMOBAIBAN 角膜白斑 
	 */
	public String getExternalLefteyeExaminationIns() {
		return externalLefteyeExaminationIns;
	}
	/**
	 * 设置：红光反射右眼 0 正常 1异常
	 */
	public void setRedlightRighteyeReflexType(Integer redlightRighteyeReflexType) {
		this.redlightRighteyeReflexType = redlightRighteyeReflexType;
	}
	/**
	 * 获取：红光反射右眼 0 正常 1异常
	 */
	public Integer getRedlightRighteyeReflexType() {
		return redlightRighteyeReflexType;
	}
	/**
	 * 设置：红光反射右眼异常情况说明
	 */
	public void setRedlightRighteyeReflexIns(String redlightRighteyeReflexIns) {
		this.redlightRighteyeReflexIns = redlightRighteyeReflexIns;
	}
	/**
	 * 获取：红光反射右眼异常情况说明
	 */
	public String getRedlightRighteyeReflexIns() {
		return redlightRighteyeReflexIns;
	}
	/**
	 * 设置：红光反射左眼 0 正常 1异常
	 */
	public void setRedlightLefteyeReflexType(Integer redlightLefteyeReflexType) {
		this.redlightLefteyeReflexType = redlightLefteyeReflexType;
	}
	/**
	 * 获取：红光反射左眼 0 正常 1异常
	 */
	public Integer getRedlightLefteyeReflexType() {
		return redlightLefteyeReflexType;
	}
	/**
	 * 设置：红光反射左眼异常情况说明
	 */
	public void setRedlightLefteyeReflexIns(String redlightLefteyeReflexIns) {
		this.redlightLefteyeReflexIns = redlightLefteyeReflexIns;
	}
	/**
	 * 获取：红光反射左眼异常情况说明
	 */
	public String getRedlightLefteyeReflexIns() {
		return redlightLefteyeReflexIns;
	}
	/**
	 * 设置：视觉行为右眼 0 通过 1 未通过
	 */
	public void setVisualbehaviorRighteyeType(Integer visualbehaviorRighteyeType) {
		this.visualbehaviorRighteyeType = visualbehaviorRighteyeType;
	}
	/**
	 * 获取：视觉行为右眼 0 通过 1 未通过
	 */
	public Integer getVisualbehaviorRighteyeType() {
		return visualbehaviorRighteyeType;
	}
	/**
	 * 设置：视觉行为左眼 0 通过 1 未通过
	 */
	public void setVisualbehaviorLefteyeType(Integer visualbehaviorLefteyeType) {
		this.visualbehaviorLefteyeType = visualbehaviorLefteyeType;
	}
	/**
	 * 获取：视觉行为左眼 0 通过 1 未通过
	 */
	public Integer getVisualbehaviorLefteyeType() {
		return visualbehaviorLefteyeType;
	}
	/**
	 * 设置：右眼视力初筛 0 无  1正常 2不配合  3 选择性观看
	 */
	public void setPrimaryScreenOfVisionRighteyeType(Integer primaryScreenOfVisionRighteyeType) {
		this.primaryScreenOfVisionRighteyeType = primaryScreenOfVisionRighteyeType;
	}
	/**
	 * 获取：右眼视力初筛 0 无  1正常 2不配合  3 选择性观看
	 */
	public Integer getPrimaryScreenOfVisionRighteyeType() {
		return primaryScreenOfVisionRighteyeType;
	}
	/**
	 * 设置：左眼视力初筛 0 无  1正常 2不配合  3 选择性观看
	 */
	public void setPrimaryScreenOfVisionLefrteyeType(Integer primaryScreenOfVisionLefrteyeType) {
		this.primaryScreenOfVisionLefrteyeType = primaryScreenOfVisionLefrteyeType;
	}
	/**
	 * 获取：左眼视力初筛 0 无  1正常 2不配合  3 选择性观看
	 */
	public Integer getPrimaryScreenOfVisionLefrteyeType() {
		return primaryScreenOfVisionLefrteyeType;
	}
	/**
	 * 设置：右眼选择性注视检测
	 */
	public void setSelectiveGazeDetectionRighteye(String selectiveGazeDetectionRighteye) {
		this.selectiveGazeDetectionRighteye = selectiveGazeDetectionRighteye;
	}
	/**
	 * 获取：右眼选择性注视检测
	 */
	public String getSelectiveGazeDetectionRighteye() {
		return selectiveGazeDetectionRighteye;
	}
	/**
	 * 设置：左眼选择性注视检测
	 */
	public void setSelectiveGazeDetectionLefteye(String selectiveGazeDetectionLefteye) {
		this.selectiveGazeDetectionLefteye = selectiveGazeDetectionLefteye;
	}
	/**
	 * 获取：左眼选择性注视检测
	 */
	public String getSelectiveGazeDetectionLefteye() {
		return selectiveGazeDetectionLefteye;
	}
	/**
	 * 设置：右眼眼位检查 0 正位  1 斜视 2 眼球震颤
	 */
	public void setExaminationOfPositionRighteyeType(Integer examinationOfPositionRighteyeType) {
		this.examinationOfPositionRighteyeType = examinationOfPositionRighteyeType;
	}
	/**
	 * 获取：右眼眼位检查 0 正位  1 斜视 2 眼球震颤
	 */
	public Integer getExaminationOfPositionRighteyeType() {
		return examinationOfPositionRighteyeType;
	}
	/**
	 * 设置：右眼眼位检查斜视类型 NEIXIE 内斜  WAIXIE 外斜 CHUIZHIXIE 垂直斜
	 */
	public void setExaminationOfStrabismusRighteyeType(String examinationOfStrabismusRighteyeType) {
		this.examinationOfStrabismusRighteyeType = examinationOfStrabismusRighteyeType;
	}
	/**
	 * 获取：右眼眼位检查斜视类型 NEIXIE 内斜  WAIXIE 外斜 CHUIZHIXIE 垂直斜
	 */
	public String getExaminationOfStrabismusRighteyeType() {
		return examinationOfStrabismusRighteyeType;
	}
	/**
	 * 设置：右眼眼位检查斜视说明
	 */
	public void setExaminationOfStrabismusRighteyeInsn(String examinationOfStrabismusRighteyeInsn) {
		this.examinationOfStrabismusRighteyeInsn = examinationOfStrabismusRighteyeInsn;
	}
	/**
	 * 获取：右眼眼位检查斜视说明
	 */
	public String getExaminationOfStrabismusRighteyeInsn() {
		return examinationOfStrabismusRighteyeInsn;
	}

	public String getExaminationOfStrabismusRighteyeInsw() {
		return examinationOfStrabismusRighteyeInsw;
	}

	public void setExaminationOfStrabismusRighteyeInsw(String examinationOfStrabismusRighteyeInsw) {
		this.examinationOfStrabismusRighteyeInsw = examinationOfStrabismusRighteyeInsw;
	}

	public String getExaminationOfStrabismusRighteyeInsc() {
		return examinationOfStrabismusRighteyeInsc;
	}

	public void setExaminationOfStrabismusRighteyeInsc(String examinationOfStrabismusRighteyeInsc) {
		this.examinationOfStrabismusRighteyeInsc = examinationOfStrabismusRighteyeInsc;
	}

	public String getExaminationOfStrabismusLefteyeInsn() {
		return examinationOfStrabismusLefteyeInsn;
	}

	public void setExaminationOfStrabismusLefteyeInsn(String examinationOfStrabismusLefteyeInsn) {
		this.examinationOfStrabismusLefteyeInsn = examinationOfStrabismusLefteyeInsn;
	}

	public String getExaminationOfStrabismusLefteyeInsw() {
		return examinationOfStrabismusLefteyeInsw;
	}

	public void setExaminationOfStrabismusLefteyeInsw(String examinationOfStrabismusLefteyeInsw) {
		this.examinationOfStrabismusLefteyeInsw = examinationOfStrabismusLefteyeInsw;
	}

	public String getExaminationOfStrabismusLefteyeInsc() {
		return examinationOfStrabismusLefteyeInsc;
	}

	public void setExaminationOfStrabismusLefteyeInsc(String examinationOfStrabismusLefteyeInsc) {
		this.examinationOfStrabismusLefteyeInsc = examinationOfStrabismusLefteyeInsc;
	}

	/**
	 * 设置：左眼眼位检查 0 正位  1 斜视 2 眼球震颤
	 */
	public void setExaminationOfPositionLefteyeType(Integer examinationOfPositionLefteyeType) {
		this.examinationOfPositionLefteyeType = examinationOfPositionLefteyeType;
	}
	/**
	 * 获取：左眼眼位检查 0 正位  1 斜视 2 眼球震颤
	 */
	public Integer getExaminationOfPositionLefteyeType() {
		return examinationOfPositionLefteyeType;
	}
	/**
	 * 设置：左眼眼位检查斜视类型 NEIXIE 内斜  WAIXIE 外斜 CHUIZHIXIE 垂直斜
	 */
	public void setExaminationOfStrabismusLefteyeType(String examinationOfStrabismusLefteyeType) {
		this.examinationOfStrabismusLefteyeType = examinationOfStrabismusLefteyeType;
	}
	/**
	 * 获取：左眼眼位检查斜视类型 NEIXIE 内斜  WAIXIE 外斜 CHUIZHIXIE 垂直斜
	 */
	public String getExaminationOfStrabismusLefteyeType() {
		return examinationOfStrabismusLefteyeType;
	}
	/**
	 * 设置：左眼眼位检查斜视说明
	 */
	public void setExaminationOfStrabismusLefteyeIns(String examinationOfStrabismusLefteyeIns) {
		this.examinationOfStrabismusLefteyeInsn = examinationOfStrabismusLefteyeIns;
	}
	/**
	 * 获取：左眼眼位检查斜视说明
	 */
	public String getExaminationOfStrabismusLefteyeIns() {
		return examinationOfStrabismusLefteyeInsn;
	}
	/**
	 * 设置：右眼眼球运动 0 正常 1异常
	 */
	public void setEyemovementRighteyeType(Integer eyemovementRighteyeType) {
		this.eyemovementRighteyeType = eyemovementRighteyeType;
	}
	/**
	 * 获取：右眼眼球运动 0 正常 1异常
	 */
	public Integer getEyemovementRighteyeType() {
		return eyemovementRighteyeType;
	}
	/**
	 * 设置：右眼眼球运动异常情况说明
	 */
	public void setEyemovementRighteyeIns(String eyemovementRighteyeIns) {
		this.eyemovementRighteyeIns = eyemovementRighteyeIns;
	}
	/**
	 * 获取：右眼眼球运动异常情况说明
	 */
	public String getEyemovementRighteyeIns() {
		return eyemovementRighteyeIns;
	}
	/**
	 * 设置：左眼眼球运动 0 正常 1异常
	 */
	public void setEyemovementLefteyeType(Integer eyemovementLefteyeType) {
		this.eyemovementLefteyeType = eyemovementLefteyeType;
	}
	/**
	 * 获取：左眼眼球运动 0 正常 1异常
	 */
	public Integer getEyemovementLefteyeType() {
		return eyemovementLefteyeType;
	}
	/**
	 * 设置：左眼眼球运动异常情况说明
	 */
	public void setEyemovementLefteyeIns(String eyemovementLefteyeIns) {
		this.eyemovementLefteyeIns = eyemovementLefteyeIns;
	}
	/**
	 * 获取：左眼眼球运动异常情况说明
	 */
	public String getEyemovementLefteyeIns() {
		return eyemovementLefteyeIns;
	}
	/**
	 * 设置：检影检查 0 是 1否
	 */
	public void setFilmExaminationType(Integer filmExaminationType) {
		this.filmExaminationType = filmExaminationType;
	}
	/**
	 * 获取：检影检查 0 是 1否
	 */
	public Integer getFilmExaminationType() {
		return filmExaminationType;
	}
	/**
	 * 设置：右眼检查检查 S
	 */
	public void setFilmExaminationRighteyeS(String filmExaminationRighteyeS) {
		this.filmExaminationRighteyeS = filmExaminationRighteyeS;
	}
	/**
	 * 获取：右眼检查检查 S
	 */
	public String getFilmExaminationRighteyeS() {
		return filmExaminationRighteyeS;
	}
	/**
	 * 设置：右眼检查检查 c
	 */
	public void setFilmExaminationRighteyeC(String filmExaminationRighteyeC) {
		this.filmExaminationRighteyeC = filmExaminationRighteyeC;
	}
	/**
	 * 获取：右眼检查检查 c
	 */
	public String getFilmExaminationRighteyeC() {
		return filmExaminationRighteyeC;
	}
	/**
	 * 设置：右眼检查检查 a
	 */
	public void setFilmExaminationRighteyeA(String filmExaminationRighteyeA) {
		this.filmExaminationRighteyeA = filmExaminationRighteyeA;
	}
	/**
	 * 获取：右眼检查检查 a
	 */
	public String getFilmExaminationRighteyeA() {
		return filmExaminationRighteyeA;
	}
	/**
	 * 设置：左眼检查检查 S
	 */
	public void setFilmExaminationLefteyeS(String filmExaminationLefteyeS) {
		this.filmExaminationLefteyeS = filmExaminationLefteyeS;
	}
	/**
	 * 获取：左眼检查检查 S
	 */
	public String getFilmExaminationLefteyeS() {
		return filmExaminationLefteyeS;
	}
	/**
	 * 设置：左眼检查检查 c
	 */
	public void setFilmExaminationLefteyeC(String filmExaminationLefteyeC) {
		this.filmExaminationLefteyeC = filmExaminationLefteyeC;
	}
	/**
	 * 获取：左眼检查检查 c
	 */
	public String getFilmExaminationLefteyeC() {
		return filmExaminationLefteyeC;
	}
	/**
	 * 设置：左眼检查检查 a
	 */
	public void setFilmExaminationLefteyeA(String filmExaminationLefteyeA) {
		this.filmExaminationLefteyeA = filmExaminationLefteyeA;
	}
	/**
	 * 获取：左眼检查检查 a
	 */
	public String getFilmExaminationLefteyeA() {
		return filmExaminationLefteyeA;
	}
	/**
	 * 设置：裸眼视力检查类型  0 E字视标  1 图形视标
	 */
	public void setNakedversionType(Integer nakedversionType) {
		this.nakedversionType = nakedversionType;
	}
	/**
	 * 获取：裸眼视力检查类型  0 E字视标  1 图形视标
	 */
	public Integer getNakedversionType() {
		return nakedversionType;
	}
	/**
	 * 设置：右眼裸眼视力
	 */
	public void setNakedversionRighteye(String nakedversionRighteye) {
		this.nakedversionRighteye = nakedversionRighteye;
	}
	/**
	 * 获取：右眼裸眼视力
	 */
	public String getNakedversionRighteye() {
		return nakedversionRighteye;
	}
	/**
	 * 设置：左眼裸眼视力
	 */
	public void setNakedversionLefteye(String nakedversionLefteye) {
		this.nakedversionLefteye = nakedversionLefteye;
	}
	/**
	 * 获取：左眼裸眼视力
	 */
	public String getNakedversionLefteye() {
		return nakedversionLefteye;
	}
	/**
	 * 设置：戴镜视力检查类型  0 E字视标  1 图形视标
	 */
	public void setGlassesversionType(Integer glassesversionType) {
		this.glassesversionType = glassesversionType;
	}
	/**
	 * 获取：戴镜视力检查类型  0 E字视标  1 图形视标
	 */
	public Integer getGlassesversionType() {
		return glassesversionType;
	}
	/**
	 * 设置：右眼戴镜视力
	 */
	public void setGlassesversionRighteye(String glassesversionRighteye) {
		this.glassesversionRighteye = glassesversionRighteye;
	}
	/**
	 * 获取：右眼戴镜视力
	 */
	public String getGlassesversionRighteye() {
		return glassesversionRighteye;
	}
	/**
	 * 设置：左眼戴镜视力
	 */
	public void setGlassesversionLefteye(String glassesversionLefteye) {
		this.glassesversionLefteye = glassesversionLefteye;
	}
	/**
	 * 获取：左眼戴镜视力
	 */
	public String getGlassesversionLefteye() {
		return glassesversionLefteye;
	}
	/**
	 * 设置：右眼色觉检查 0 正常 1异常
	 */
	public void setColorversionRighteyeType(Integer colorversionRighteyeType) {
		this.colorversionRighteyeType = colorversionRighteyeType;
	}
	/**
	 * 获取：右眼色觉检查 0 正常 1异常
	 */
	public Integer getColorversionRighteyeType() {
		return colorversionRighteyeType;
	}
	/**
	 * 设置：右眼色觉检查 异常情况说明
	 */
	public void setColorversionRighteyeIns(String colorversionRighteyeIns) {
		this.colorversionRighteyeIns = colorversionRighteyeIns;
	}
	/**
	 * 获取：右眼色觉检查 异常情况说明
	 */
	public String getColorversionRighteyeIns() {
		return colorversionRighteyeIns;
	}
	/**
	 * 设置：左眼色觉检查 0 正常 1异常
	 */
	public void setColorversionLefteyeType(Integer colorversionLefteyeType) {
		this.colorversionLefteyeType = colorversionLefteyeType;
	}
	/**
	 * 获取：左眼色觉检查 0 正常 1异常
	 */
	public Integer getColorversionLefteyeType() {
		return colorversionLefteyeType;
	}
	/**
	 * 设置：左眼色觉检查 异常情况说明
	 */
	public void setColorversionLefteyeIns(String colorversionLefteyeIns) {
		this.colorversionLefteyeIns = colorversionLefteyeIns;
	}
	/**
	 * 获取：左眼色觉检查 异常情况说明
	 */
	public String getColorversionLefteyeIns() {
		return colorversionLefteyeIns;
	}
	/**
	 * 设置：右眼瞬目反射 0通过  1未通过
	 */
	public void setBlinkReflexRighteye(Integer blinkReflexRighteye) {
		this.blinkReflexRighteye = blinkReflexRighteye;
	}
	/**
	 * 获取：右眼瞬目反射 0通过  1未通过
	 */
	public Integer getBlinkReflexRighteye() {
		return blinkReflexRighteye;
	}
	/**
	 * 设置：左眼瞬目反射 0通过  1未通过
	 */
	public void setBlinkReflexLefteye(Integer blinkReflexLefteye) {
		this.blinkReflexLefteye = blinkReflexLefteye;
	}
	/**
	 * 获取：左眼瞬目反射 0通过  1未通过
	 */
	public Integer getBlinkReflexLefteye() {
		return blinkReflexLefteye;
	}
	/**
	 * 设置：右眼红球实验 0通过  1未通过
	 */
	public void setRedballRighteye(Integer redballRighteye) {
		this.redballRighteye = redballRighteye;
	}
	/**
	 * 获取：右眼红球实验 0通过  1未通过
	 */
	public Integer getRedballRighteye() {
		return redballRighteye;
	}
	/**
	 * 设置：左眼红球实验 0通过  1未通过
	 */
	public void setRedballLefteye(Integer redballLefteye) {
		this.redballLefteye = redballLefteye;
	}
	/**
	 * 获取：左眼红球实验 0通过  1未通过
	 */
	public Integer getRedballLefteye() {
		return redballLefteye;
	}
	/**
	 * 设置：右眼眼球追随运动 0 正常 1异常
	 */
	public void setFollowRighteyeType(Integer followRighteyeType) {
		this.followRighteyeType = followRighteyeType;
	}
	/**
	 * 获取：右眼眼球追随运动 0 正常 1异常
	 */
	public Integer getFollowRighteyeType() {
		return followRighteyeType;
	}
	/**
	 * 设置：右眼眼球追随运动 异常情况说明
	 */
	public void setFollowRighteyeIns(String followRighteyeIns) {
		this.followRighteyeIns = followRighteyeIns;
	}
	/**
	 * 获取：右眼眼球追随运动 异常情况说明
	 */
	public String getFollowRighteyeIns() {
		return followRighteyeIns;
	}
	/**
	 * 设置：左眼眼球追随运动 0 正常 1异常
	 */
	public void setFollowLefteyeType(Integer followLefteyeType) {
		this.followLefteyeType = followLefteyeType;
	}
	/**
	 * 获取：左眼眼球追随运动 0 正常 1异常
	 */
	public Integer getFollowLefteyeType() {
		return followLefteyeType;
	}
	/**
	 * 设置：左眼眼球追随运动 异常情况说明
	 */
	public void setFollowLefteyeIns(String followLefteyeIns) {
		this.followLefteyeIns = followLefteyeIns;
	}
	/**
	 * 获取：左眼眼球追随运动 异常情况说明
	 */
	public String getFollowLefteyeIns() {
		return followLefteyeIns;
	}
	/**
	 * 设置：本次检查日期
	 */
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	/**
	 * 获取：本次检查日期
	 */
	public Date getCheckDate() {
		return checkDate;
	}
	/**
	 * 设置：检查者签字
	 */
	public void setChector(String chector) {
		this.chector = chector;
	}
	/**
	 * 获取：检查者签字
	 */
	public String getChector() {
		return chector;
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
	/**
	 * 设置：建议
	 */
	public void setProposal(String proposal) {
		this.proposal = proposal;
	}
	/**
	 * 获取：建议
	 */
	public String getProposal() {
		return proposal;
	}
	/**
	 * 设置：检查年龄段
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * 获取：检查年龄段
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * 设置：下次检查日期
	 */
	public void setLastCheckDate(Date lastCheckDate) {
		this.lastCheckDate = lastCheckDate;
	}
	/**
	 * 获取：下次检查日期
	 */
	public Date getLastCheckDate() {
		return lastCheckDate;
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

	public Integer getOcularArchitectureRighteyeConclusion() {
		return ocularArchitectureRighteyeConclusion;
	}

	public void setOcularArchitectureRighteyeConclusion(Integer ocularArchitectureRighteyeConclusion) {
		this.ocularArchitectureRighteyeConclusion = ocularArchitectureRighteyeConclusion;
	}

	public Integer getOcularArchitectureLefteyeConclusion() {
		return ocularArchitectureLefteyeConclusion;
	}

	public void setOcularArchitectureLefteyeConclusion(Integer ocularArchitectureLefteyeConclusion) {
		this.ocularArchitectureLefteyeConclusion = ocularArchitectureLefteyeConclusion;
	}

	public String getOcularArchitectureRighteye() {
		return ocularArchitectureRighteye;
	}

	public void setOcularArchitectureRighteye(String ocularArchitectureRighteye) {
		this.ocularArchitectureRighteye = ocularArchitectureRighteye;
	}

	public String getOcularArchitectureLefteye() {
		return ocularArchitectureLefteye;
	}

	public void setOcularArchitectureLefteye(String ocularArchitectureLefteye) {
		this.ocularArchitectureLefteye = ocularArchitectureLefteye;
	}

	public String getWaiyanrightjianchaqita() {
		return waiyanrightjianchaqita;
	}

	public void setWaiyanrightjianchaqita(String waiyanrightjianchaqita) {
		this.waiyanrightjianchaqita = waiyanrightjianchaqita;
	}

	public String getWaiyanleftjianchaqita() {
		return waiyanleftjianchaqita;
	}

	public void setWaiyanleftjianchaqita(String waiyanleftjianchaqita) {
		this.waiyanleftjianchaqita = waiyanleftjianchaqita;
	}

	public String getCheckString() {
		return checkString;
	}

	public void setCheckString(String checkString) {
		this.checkString = checkString;
	}
}
