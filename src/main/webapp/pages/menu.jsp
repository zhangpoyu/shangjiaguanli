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
	
	<c:if test="${sessionScope.shenfen == '管理员'}">
		<ul id="dc_accordion" class="sidebar-menu tree">
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-home"></i> <span>个人信息管理</span> 
							<span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="adminindex.action">个人信息管理</a>
								</li>
								</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-newspaper-o"></i> <span>管理员管理</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="tianjiaadmin.action">添加管理员</a>
								</li>
								<li>
									<a href="adminguanli.action">管理员管理</a>
								</li>
							</ul>
						</li>
						<!-- <li class="menu_sub">
							<a href="#"> <i class="fa fa-pie-chart"></i> <span>订单管理</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="tianjiadingdan.action">添加订单</a>
								</li>
								<li>
									<a href="dingdanguanli.action">订单管理</a>
								</li>
							</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-laptop"></i> <span>购物车管理</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="tianjiagouwuche.action">添加购物车</a>
								</li>
								<li>
									<a href="gouwucheguanli.action">购物车管理</a>
								</li>
							</ul>
						</li> -->
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-table"></i> <span>类型管理 </span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="tianjialeixing.action">添加类型</a>
								</li>
								<li>
									<a href="leixingguanli.action">类型管理</a>
								</li>
							</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-calendar"></i> <span>评价管理</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<!-- <li>
									<a href="tianjiapingjia.action">添加评价</a>
								</li> -->
								<li>
									<a href="pingjiaguanli.action">评价管理</a>
								</li>
							</ul>
						</li>
						
						<li class="menu_sub">
							<a href="#"> <i class="icon-grid"></i> <span>商家管理</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="tianjiashangjia.action">添加商家</a>
								</li>
								<li>
									<a href="shangjiaguanli.action">商家管理</a>
								</li>
							</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-bar-chart text-aqua"></i> <span>用户管理</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="tianjiayonghu.action">添加用户</a>
								</li>
								<li>
									<a href="yonghuguanli.action">用户管理</a>
								</li>
							</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-file text-aqua"></i> <span>退出系统</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="tuichuxitong.action">退出系统</a>
								</li>
							</ul>
						</li>
					</ul>
	</c:if>
	
	
	
	
	<c:if test="${sessionScope.shenfen == '用户'}">
		<ul id="dc_accordion" class="sidebar-menu tree">
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-home"></i> <span>个人信息管理</span> 
							<span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="yonghuindex.action">个人信息管理</a>
								</li>
								</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-pie-chart"></i> <span>订单管理</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<!-- <li>
									<a href="yonghutianjiadingdan.action">添加订单</a>
								</li> -->
								<li>
									<a href="yonghudingdanguanli.action">订单管理</a>
								</li>
							</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-laptop"></i> <span>购物车管理</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<!-- <li>
									<a href="tianjiagouwuche.action">添加购物车</a>
								</li> -->
								<li>
									<a href="yonghugouwucheguanli.action">购物车管理</a>
								</li>
							</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-calendar"></i> <span>评价管理</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<!-- <li>
									<a href="yonghutianjiapingjia.action">添加评价</a>
								</li> -->
								<li>
									<a href="yonghupingjiaguanli.action">评价管理</a>
								</li>
							</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-file text-aqua"></i> <span>退出系统</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="tuichuxitong.action">退出系统</a>
								</li>
							</ul>
						</li>
					</ul>
	</c:if>
	
	
	
	
	<c:if test="${sessionScope.shenfen == '商家'}">
		<ul id="dc_accordion" class="sidebar-menu tree">
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-home"></i> <span>个人信息管理</span> 
							<span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="shangjiaindex.action">个人信息管理</a>
								</li>
								</ul>
						</li>
						
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-laptop"></i><span>商品管理</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="shangjiatianjiashangping.action">添加商品</a>
								</li>
								<li>
									<a href="shangjiashangpingguanli.action">商品管理</a>
								</li>
							</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-pie-chart"></i> <span>订单查看</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<!-- <li>
									<a href="yonghutianjiadingdan.action">添加订单</a>
								</li> -->
								<li>
									<a href="dingdanchakan.action">订单查看</a>
								</li>
							</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-calendar"></i> <span>评价查看</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<!-- <li>
									<a href="yonghutianjiapingjia.action">添加评价</a>
								</li> -->
								<li>
									<a href="pingjiachakan.action">评价查看</a>
								</li>
							</ul>
						</li>
						<li class="menu_sub">
							<a href="#"> <i class="fa fa-file text-aqua"></i> <span>退出系统</span> <span class="arrow"></span> </a>
							<ul class="down_menu">
								<li>
									<a href="tuichuxitong.action">退出系统</a>
								</li>
							</ul>
						</li>
					</ul>
	</c:if>
	
</body>
</html>
