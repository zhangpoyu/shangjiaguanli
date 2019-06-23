<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="resource/images/favicon.ico">

    <title></title>
  
	<!-- Bootstrap 4.0-->
	<link rel="stylesheet" href="resource/assets/vendor_components/bootstrap/dist/css/bootstrap.min.css">
	
	<!-- Bootstrap extend-->
	<link rel="stylesheet" href="resource/main/css/bootstrap-extend.css">

	<!-- Theme style -->
	<link rel="stylesheet" href="resource/main/css/master_style.css">

	<!-- Ekan Admin skins -->
	<link rel="stylesheet" href="resource/main/css/skins/_all-skins.css">

	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->

</head>
<body class="hold-transition skin-info dark-sidebar light sidebar-mini">
	<ul class="nav navbar-nav mainmenu">
                                        <li>
                                            <a href="index.action">首页</a>
                                        </li>
                                        <li>
                                            <a href="sousuoshangping.action">食品</a>
                                        </li>
                                        <li>
                                            <a href="sousuoshangjia.action">商家</a>
                                        </li>
                                        <li>
                                            <a href="cainixihuan.action">猜你喜欢</a>
                                        </li>
                                        <c:if test="${sessionScope.shenfen == '管理员'}">
                                        <li>
                                            <a href="adminindex.action">个人中心</a>
                                        </li>
                                        </c:if>
                                        <c:if test="${sessionScope.shenfen == '用户'}">
                                        <li>
                                            <a href="yonghuindex.action">个人中心</a>
                                        </li>
                                        </c:if>
                                        <c:if test="${sessionScope.shenfen != '管理员' && sessionScope.shenfen != '用户'}">
                                        <li>
                                            <a href="login.action">登录</a>
                                        </li>
                                        </c:if>
                                    </ul><!--/.mainmenu-->
	
</body>
</html>
