<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <script src="http://api.map.baidu.com/components?ak=8TKXnfRzpGRF9z60uub6CYMs&v=1.0"></script>
    <style type="text/css">
        body, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;}
        #golist {display: none;}
        @media (max-device-width: 800px){#golist{display: block!important;}}
    </style>
  
  
  </head>
  
  <body>
    This is my JSP page. <br>
    <a id="golist" href="../demolist.htm">返回demo列表页</a>
  <lbs-map center="200.00,40.055878" style="height:100%"></lbs-map>
  </body>
</html>
