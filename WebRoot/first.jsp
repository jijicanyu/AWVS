<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>ext/resources/css/ext-all.css"></link>
	<script type="text/javascript" src="<%=basePath%>ext/adapter/ext/ext-base-debug.js"></script>
	<script type="text/javascript" src="<%=basePath%>ext/ext-all-debug.js"></script>
	<script type="text/javascript">
	   Ext.onReady(
	    function helloworld(){
	        Ext.MessageBox.alert("你好", "我们一起来学extjs吧");
		});
	</script> 
    <title>My JSP 'first.jsp' starting page</title>
  </head>
  <body>
  aaa
  </body>
</html>
