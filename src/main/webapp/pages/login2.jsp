<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
	
    <link rel="stylesheet" href="resource/login/css/style.css">
	
    <script src="resource/login/js/form.js"></script>
	
</head>
<body>

    <div class="form" style="position:relative">
		
		<!--注册表单-->
        <div class="form_register" style="position:absolute">  
            <form action="registact.action" method="post">
                <h1>注册表单</h1>
                <div class="form_item">
                    <label for="username">用户名：</label>
                    <input type="text" name="username" id="username" placeholder="请输入用户名" required >
                </div>
                <div class="form_item">
                    <label for="password">密码：</label>
                    <input type="password" name="password" id="password" placeholder="请输入密码名" required>
                </div>
                <div class="form_item">
                    <label for="email">确认密码：</label>
                    <input type="password" name="repassword" id="password" placeholder="请确认密码" required>
                </div>
                <div class="form_item">
                    <label for="email">身份：</label>
                    <select name="shenfen"><option>用户</option><option>商家</option></select>
                </div>
                <div class="form_item">
                    <input type="submit" value="注册">
                </div>
            </form>
            <div class="info">已有账号？点击<span class="switch login_Btn">登录</span></div>
        </div>
		
		<!--登录表单-->
        <div class="form_login" style="height:0;">
			
			<form action="loginact.action" method="post">
				<h1>登录表单</h1>
				<div class="form_item">
					<label for="username">用户名：</label>
					<input type="text" name="username" id="username" placeholder="请输入用户名" required>
				</div>
				<div class="form_item">
					<label for="password">密码：</label>
					<input type="password" name="password" id="password" placeholder="请输入密码名" required>
				</div>
				<div class="form_item">
                    <label for="email">身份：</label>
                    <select name="shenfen"><option>管理员</option><option>用户</option><option>商家</option></select>
                </div>
				<div class="form_item">
					<input type="submit" value="登录">
				</div>
			</form>
			<div class="info">没有账号？点击<span class="switch register_Btn">注册账号</span></div>
			
         </div>
        
    </div>
</body>
<script>
		if("${message}"){
			alert("${message}");
		}
	</script>
</html>