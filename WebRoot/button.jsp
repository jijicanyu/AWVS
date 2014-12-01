<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>button</title>
    <link rel="stylesheet" type="text/css"  charset="UTF-8" href="js/ext/resources/css/ext-all.css"/>
    <script type="text/javascript" charset="UTF-8"  src="js/ext/adapter/ext/ext-base-debug.js"></script>
    <script type="text/javascript" charset="UTF-8"  src="js/ext/ext-all-debug.js"></script>
    <script type="text/javascript" src="button.js"></script> 
    <!-- 
    <script type="text/javascript">
    Ext.onReady(function(){
        //Ext.MessageBox.alert("提示信息","hello world");
        Ext.Msg.alert('Status', 'Changes saved successfully.');
     //alert(11);
    });
    </script>
     -->
  </head>
  
  <body>
    <div id="grid"></div>
  </body>
</html>
