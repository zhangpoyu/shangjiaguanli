<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>注册</title>

<link rel="stylesheet" type="text/css" href="resource/login/css/style.css">

<script type="text/javascript" src="resource/login/js/jquery.min.js"></script>
<script type="text/javascript" src="resource/login/js/vector.js"></script>

</head>
<body>

<div id="container">
	<div id="output">
		<div class="containerT">
			<h1>用户注册</h1>
			<form class="form" action="registact.action" method="post" id="entry_form">
				<input type="text" name="username" placeholder="用户名" id="entry_name" value="admin">
				<input type="password" name="password" placeholder="密码" id="entry_password">
				<input type="password" name="repassword" placeholder="确认密码" id="entry_password">
				<select name="shenfen"><option>用户</option><option>商家</option></select>
				<button type="submit" id="entry_btn">注册</button>
				<div id="prompt" class="prompt"></div>
			</form>
			<div class="info">已有账号？点击<a href="login.action">登录账号</a></div>
		</div>
	</div>
</div>

<script type="text/javascript">
    $(function(){
        Victor("container", "output");   //登陆背景函数
        $("#entry_name").focus();
        $(document).keydown(function(event){
            if(event.keyCode==13){
                $("#entry_btn").click();
            }
        });
    });
</script>

</body>
<script>
		if("${message}"){
			alert("${message}");
		}
	</script>
</html>