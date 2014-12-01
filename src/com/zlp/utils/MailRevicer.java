/**
 * 
 */
package com.zlp.utils;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author zhangliping
 *
 */
public class MailRevicer {

	
		public void mailSend(String mailAdress) throws MessagingException, IOException{
			
//			System.out.println(getClass().getResource("/"));
//			IniReader IniReader = new IniReader(getClass().getResource("/").getPath() + "config.ini");
//			System.out.println(IniReader.getValue("mail", "mail.host"));
			
			Properties props = new Properties();
			/**
			 * 设置传输的协议
			 */
			props.setProperty("mail.transport.protocol", "smtp");
			
			/**
			 * 设置发送邮件的主机，一般不同的邮箱有不一样的主机，可以在邮箱帮助中找到
			 */
			props.setProperty("mail.host", "smtp.163.com");
			
			props.setProperty("mail.smtp.auth", "true");
			
			// 创建session
			Session session = Session.getDefaultInstance(props, new Authenticator(){
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("jxzlp123", "zlp19890921");
				}
			});
			// 打开邮件的调试功能，可以看到发送的进度，默认为true
			session.setDebug(true);
			// 创建message对象，通过这个对象创建邮件发送的信息
			Message msg = new MimeMessage(session);
			// 设置邮件的标题
			msg.setSubject("这是封测试邮件");
			
			// 知道您在使用 MimeMessage，而且消息是纯文本格式，您就可以用 setText() 方法
			//msg.setText("你好，我是为了测试邮件用的");
			// 因为 Message 实现 Part 接口（且 MimeMessage 实现 MimePart ）。设置内容的基本机制是 setContent() 方法，同时使用参数，分别代表内容和 mime 类型
			msg.setContent("<h1 style='color:red'>nihao</h1>", "text/html;charset=utf-8");
			/**
			 * 设置邮件的发送地址
			 */
			msg.setFrom(new InternetAddress("jxzlp123@163.com"));
			
			msg.setRecipients(RecipientType.TO, InternetAddress.parse(mailAdress));
			
			msg.setRecipients(RecipientType.CC, InternetAddress.parse("744742026@qq.com"));
			
			Transport transport = session.getTransport("smtp");
			
			transport.send(msg);
		//	transport.connect("jxzlp123", "zlp19890921");
		//	transport.sendMessage(msg, new InternetAddress[]{new InternetAddress("497296670@qq.com")});
		}
	
}
