<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EditorDemo</title>
<script type="text/javascript">
var m3={0:"",1:"评论内容",2:"技术内容",3:"点评内容"}  
  
function nowtab(m,n){  
  
 if(n!=0 && m3[0]=="")m3[0]=document.getElementById("main2").innerHTML;  
  
 document.getElementById("tip"+m).style.left=n*100+'px';  
  
 document.getElementById("main2").innerHTML=m3[n];  
  
} 
</script>
</head>
<body>
   <div id="tabs0">  
  
 <ul class="menu0" id="menu0">  
  
  <li onclick="setTab(0,0)" class="hover">新闻</li>  
  
  <li onclick="setTab(0,1)">评论</li>  
  
  <li onclick="setTab(0,2)">技术</li>  
  
  <li onclick="setTab(0,3)">点评</li>  
  
 </ul>  
  
 <div class="main" id="main0">  
  
  <ul class="block"><li>新闻列表</li></ul>  
  
  <ul><li>评论列表</li></ul>  
  
  <ul><li>技术列表</li></ul>  
  
  <ul><li>点评列表</li></ul>  
  
 </div>
</body>
</html>