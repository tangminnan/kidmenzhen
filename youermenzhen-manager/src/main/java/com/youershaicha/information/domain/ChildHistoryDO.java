package com.youershaicha.information.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 幼儿检查历史记录表
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2021-01-04 11:21:26
 */
public class ChildHistoryDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long historyId;
	//幼儿基本信息表 id
	private Long childId;
	//身份证号
	private String childIdcard;
	//本次检查日期
	private Date checkDate;
	//检查者签字
	private String chector;
	//结论
	private String conclusion;
	//建议
	private String proposal;
	//下次复查时间
	private Date lastCheckDate;
	//检查年龄段
	private String age;


	/**
	 * 设置：主键
	 */
	public void setHistoryId(Long historyId) {
		this.historyId = historyId;
	}
	/**
	 * 获取：主键
	 */
	public Long getHistoryId() {
		return historyId;
	}
	/**
	 * 设置：幼儿基本信息表 id
	 */
	public void setChildId(Long childId) {
		this.childId = childId;
	}
	/**
	 * 获取：幼儿基本信息表 id
	 */
	public Long getChildId() {
		return childId;
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
	 * 设置：下次复查时间
	 */
	public void setLastCheckDate(Date lastCheckDate) {
		this.lastCheckDate = lastCheckDate;
	}
	/**
	 * 获取：下次复查时间
	 */
	public Date getLastCheckDate() {
		return lastCheckDate;
	}
	/**
	 * 设置：检查年龄段
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * 获取：检查年龄段
	 */
	public String getAge() {
		return age;
	}


}
