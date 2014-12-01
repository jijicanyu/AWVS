package com.zlp.form;

import org.apache.struts.action.ActionForm;

public class ApplyUserForm extends ActionForm {
	/**
	 * 申请的用户工号
	 */
	private String applyUserID;
	/**
	 * 申请的用户
	 */
	private String applyUserName;
	/**
	 * 申请的用户邮箱
	 */
	private String applyUserMail;
	/**
	 * 申请的使用开始时间
	 */
	private String applyStartDate;
	/**
	 * 申请的使用结束时间
	 */
	private String applyEndDate;
	/**
	 * 申请的分配的机器为
	 */
	private String applyMachine;
	/**
	 * @return the applyUserID
	 */
	public String getApplyUserID() {
		return applyUserID;
	}
	/**
	 * @param applyUserID the applyUserID to set
	 */
	public void setApplyUserID(String applyUserID) {
		this.applyUserID = applyUserID;
	}
	/**
	 * @return the applyUserName
	 */
	public String getApplyUserName() {
		return applyUserName;
	}
	/**
	 * @param applyUserName the applyUserName to set
	 */
	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}
	/**
	 * @return the applyUserMail
	 */
	public String getApplyUserMail() {
		return applyUserMail;
	}
	/**
	 * @param applyUserMail the applyUserMail to set
	 */
	public void setApplyUserMail(String applyUserMail) {
		this.applyUserMail = applyUserMail;
	}
	/**
	 * @return the applyStartDate
	 */
	public String getApplyStartDate() {
		return applyStartDate;
	}
	/**
	 * @param applyStartDate the applyStartDate to set
	 */
	public void setApplyStartDate(String applyStartDate) {
		this.applyStartDate = applyStartDate;
	}
	/**
	 * @return the applyEndDate
	 */
	public String getApplyEndDate() {
		return applyEndDate;
	}
	/**
	 * @param applyEndDate the applyEndDate to set
	 */
	public void setApplyEndDate(String applyEndDate) {
		this.applyEndDate = applyEndDate;
	}
	/**
	 * @return the applyMachine
	 */
	public String getApplyMachine() {
		return applyMachine;
	}
	/**
	 * @param applyMachine the applyMachine to set
	 */
	public void setApplyMachine(String applyMachine) {
		this.applyMachine = applyMachine;
	}
	
	
}
