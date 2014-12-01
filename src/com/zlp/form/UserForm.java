package com.zlp.form;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String validatecode;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the validatecode
	 */
	public String getValidatecode() {
		return validatecode;
	}

	/**
	 * @param validatecode the validatecode to set
	 */
	public void setValidatecode(String validatecode) {
		this.validatecode = validatecode;
	}
}
