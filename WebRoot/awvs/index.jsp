<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>AWVS</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type="text/css" rel="stylesheet" href="/css/style.css" />
<script type='text/javascript' src='<%=basePath %>/dwr/interface/obtainRandom.js'></script>  
<script type="text/javascript" src='<%=basePath %>/dwr/interface/userLoginDwr.js'></script>
<script type="text/javascript" src='<%=basePath %>/dwr/engine.js'></script>
<script type="text/javascript" src='<%=basePath %>/dwr/util.js'></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery-1.10.2.js"></script>
<script language="javascript"  type="text/javascript">
//jQuery.noConflict();
function validateUsername(){
    	var username = $("#username").val();
    	userLoginDwr.validateUsername(username , function(usernameData) {
    		
    		if (usernameData.length > 0) {
    			$("#usernameError").html(usernameData);
                return false;
            }
		});
	}
	
	function validatePassword() {
		var password = $("#password").val();
		userLoginDwr.validatePassword(password, function(passwordData) {
			$("#passwordError").html(passwordData);
			if (passwordData.length > 0) {
				return false;
			}
		});
	}
	 function refresh(obj) {
	        obj.src = "imageServlet?"+Math.random();
    }
	 
	 $(document).ready(function(){
		    
		    $("#inputCode").css("background-color","#FFFFCC");
		    createIdentifyCode();
		    
		    $("#toGetRandom").click(function(){
		        createIdentifyCode();
		    });
		    $("#inputCode").focusout(function(){
		        var createCode = $("#inputCode").val();
		        var inputCode  = $("#code").html();
		        if(createCode == inputCode){
		            $("#msg").html("验证通过！");
		        }else{
		            $("#msg").html("验证码错误！");
		            createIdentifyCode();
		        }
		    });
		    
		    $("#inputCode").focus(function(){
		        
		        $("#inputCode").css("background-color","#FFFFCC");
		    });
		    $("#inputCode").blur(function(){
		        
		        $("#inputCode").css("background-color","#D6D6FF");
		    });
		});
		function createIdentifyCode(){
			
		    obtainRandom.getRandom(function(string){
		            $("#code").html(string);
		    });
		}
</script>
</head>
<body >
	<form action="userLogin.do" method="post">
	   <c:if test="">
	       ${}
	   </c:if>
		<table>
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="username"  id="username" maxlength="20" size="20" value="admin" onchange="return validateUsername();"><span id="usernameError"></span></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password"  id="password" maxlength="20" value="admin" size="20" onchange="return validatePassword();"><span id="passwordError"></span></td>
			</tr>
				<!-- <td>验证码:</td> -->
				<!-- <td><input type="text" name="verificatecode" maxlength="4"><img title="点击更换" onclick="javascript:refresh(this);" src="imageServlet"><br/></td> -->
	        <tr>  
	          <td>验证码：</td>  
	          <td><input type="text" id="inputCode"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>  
	          <td><span class="code_box" id="code"></span></td>  
	        </tr>  
	        <tr>  
	          <td>&nbsp;</td>  
	          <td><span class="text_cursor" id="toGetRandom">看不清&nbsp;&nbsp;换一个</span></td>  
	        </tr>  
	        <tr>  
	          <td>&nbsp;</td>  
	          <td><span id="msg" style="color:red;"></span></td>
	        </tr>
			
		</table>
		<input type="submit" value="sumit">
		<input type="reset" value="reset">
	</form>
</body>
</html>
