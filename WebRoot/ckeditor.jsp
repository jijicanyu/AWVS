<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ckeditor Demo</title>
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
</head>
<body>
    <form>
         <textarea rows="30" cols="50" name="editor01">请输入.</textarea>
        <script type="text/javascript">CKEDITOR.replace('editor01');</script>
        </form>
</body>
</html>