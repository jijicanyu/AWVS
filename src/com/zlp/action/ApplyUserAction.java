package com.zlp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.zlp.form.ApplyUserForm;
import com.zlp.utils.MailRevicer;

public class ApplyUserAction extends Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ApplyUserForm applyUserForm = (ApplyUserForm)form;
		// 添加邮件发送处理
		System.out.println(applyUserForm.getApplyUserMail());
		
		MailRevicer mailRevicer = new MailRevicer();
		mailRevicer.mailSend(applyUserForm.getApplyUserMail());
		
		
		
		return mapping.findForward("success");
	}
		
}
