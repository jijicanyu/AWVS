<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>AWVS</title>
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
    <script type="text/JavaScript" language="javascript">
    </script>
  </head>
  <body>
    <form action="mailMakesuer.do" method="post">
    <h1 align="center">当前申请用户的信息</h1>
    <table align="center" border="0">
           <tr>
            <td>当前申请的用户工号为：
            </td>
            <td><input type="text" name ="applyUserID" maxlength="10">
            </td>
        </tr>
        <tr>
            <td>当前申请的用户为：
            </td>
            <td><input type="text" name ="applyUserName" maxlength="16">
            </td>
        </tr>
         <tr>
            <td>当前申请的用户邮箱为：
            </td>
            <td><input type="text" name ="applyUserMail" maxlength="20">
            </td>
        </tr>
        <tr>
            <td>申请时间为：
            </td>
            <td><input type ="text" name="applyStartDate" maxlength="8">  ~  <input type ="text" name="applyEndDate" maxlength="8">
            </td>
        </tr>
        <tr>
            <td>给该用户分配的机器为：
            </td>
            <td>
                <input type="checkbox" name="applyMachine" value="10.137.167.22"> 10.137.167.22
                <input type="checkbox" name="applyMachine" value="10.137.167.123"> 10.137.167.129
            </td>
        </tr>
        <tr><td><input type="submit" value="提交"></td><td><input type="reset" value="重置"></td></tr>
    </table>
    
    </form>
  </body>
</html>
