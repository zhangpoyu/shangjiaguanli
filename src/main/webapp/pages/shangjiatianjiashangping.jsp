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
		<title>添加商品</title>
		<link rel="shortcut icon" type="image/x-icon" href="Vertical/favicon.ico">
		<!-- google font -->
		<link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet" type="text/css" />
		<link href="resource/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css">
		<link href="resource/assets/css/font-awesome.min.css" rel="stylesheet" type="text/css">
		<link href="resource/assets/css/ionicons.css" rel="stylesheet" type="text/css">
		<link href="resource/assets/css/simple-line-icons.css" rel="stylesheet" type="text/css">
		<link href="resource/assets/css/jquery.mCustomScrollbar.css" rel="stylesheet">
		<link href="resource/assets/css/style.css" rel="stylesheet">
		<link href="resource/assets/css/responsive.css" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper">
			<!-- header -->
			<header class="main-header">
				<div class="container_header">
					<div class="logo d-flex align-items-center">
						<a href="index.action"> <strong class="logo_icon"> 食品 </strong><span class="logo-default"> 食品商城后台管理 </span> </a>
						<div class="icon_menu full_menu">
							<a href="#" class="menu-toggler sidebar-toggler"></a>
						</div>
					</div>
					<div class="right_detail">
						<div class="row d-flex align-items-center min-h pos-md-r">
							<div class="col-xl-5 col-3 search_col ">
								<div class="top_function">
								</div>
							</div>
						</div>
					</div>
				</div>
			</header>
			<!-- header_End -->
			<!-- Content_right -->
			<div class="container_full">
				<div class="side_bar scroll_auto">
                    <c:import url="menu.jsp"></c:import>
                </div>
				<!--main contents start-->
				<main class="content_wrapper">
					<div class="container-fluid">
						<!-- state start-->
						<div class="row">
							<div class=" col-md-6">
								<div class="card card-shadow mb-4">
									<div class="card-header">
										<div class="card-title">
											添加商品
										</div>
									</div>
									<form method="post" action="shangjiatianjiashangpingact.action" enctype="multipart/form-data">
										<div class="card-body">
											<div class="form-group row">
												<label class="col-sm-3 col-form-label">商品名字</label>
												<div class="col-sm-9">
													<input name="shangping" type="text" class="form-control" placeholder=" ">
												</div>
											</div><div class="form-group row">
												<label class="col-sm-3 col-form-label">类型</label>
												<div class="col-sm-9">
                                                    <select id='leixing' onchange="leixingchange(this)"name="leixing" class="form-control"><c:if test="${ !empty leixingall}">
							<c:forEach items="${ leixingall}" var="item">
							
								<option value="${item.leixing }">${item.leixing }</option>
							</c:forEach>
				</c:if>
                                                	
                                                </select>
<script>
                                                	function leixingchange(select){
                                           $("#leixingid").val($("#leixingid option:eq("+select.selectedIndex+")").val());                                                	}
										function GetQueryString(name) { 
											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");
											     var r = window.location.search.substr(1).match(reg); 
											　　　if (r!=null) return (r[2]); 
											　　　return null; 
											} 
                                                                                           	
                                            var leixingid = GetQueryString("leixingid"); 
											if(leixingid!=null) { 
											　　$("#leixingid").val(leixingid);
												var sel=document.getElementById("leixingid"); 
												var leixingidselectedindex = sel.selectedIndex;
											   $("#leixing").val($("#leixing option:eq("+leixingidselectedindex+")").val());
											}                                                         </script>
												</div>
											</div><div class="form-group row" style="display: none;">
												<label class="col-sm-3 col-form-label">类型id</label>
												<div class="col-sm-9">
                                                    <select id='leixingid' onchange="leixingchange(this)"name="leixingid" class="form-control"><c:if test="${ !empty leixingall}">
							<c:forEach items="${ leixingall}" var="item">
							
								<option value="${item.id }">${item.id }</option>
							</c:forEach>
				</c:if>
                                                	
                                                </select>
<script>
                                                	function leixingchange(select){
                                           $("#leixingid").val($("#leixingid option:eq("+select.selectedIndex+")").val());                                                	}
										function GetQueryString(name) { 
											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");
											     var r = window.location.search.substr(1).match(reg); 
											　　　if (r!=null) return (r[2]); 
											　　　return null; 
											} 
                                                                                           	
                                            var leixingid = GetQueryString("leixingid"); 
											if(leixingid!=null) { 
											　　$("#leixingid").val(leixingid);
												var sel=document.getElementById("leixingid"); 
												var leixingidselectedindex = sel.selectedIndex;
											   $("#leixing").val($("#leixing option:eq("+leixingidselectedindex+")").val());
											}                                                         </script>
												</div>
											</div><div class="form-group row">
												<label class="col-sm-3 col-form-label">描述</label>
												<div class="col-sm-9">
													<input name="miaoshu" type="text" class="form-control" placeholder=" ">
												</div>
											</div><div class="form-group row">
												<label class="col-sm-3 col-form-label">价格</label>
												<div class="col-sm-9">
													<input name="jiage" type="number" class="form-control" placeholder=" ">
												</div>
											</div><div class="form-group row">
												<label class="col-sm-3 col-form-label">数量</label>
												<div class="col-sm-9">
													<input name="shuliang" type="number" class="form-control" placeholder=" ">
												</div>
											</div><div style='display:none;' class="form-group row">
												<label class="col-sm-3 col-form-label">商家</label>
												<div style='display:none;' class="col-sm-9">
													<input value="${sessionScope.userinfo.mingzi}" name="shangjia" type="text" class="form-control" placeholder=" ">
												</div>
											</div><div style='display:none;' class="form-group row">
												<label class="col-sm-3 col-form-label">商家id</label>
												<div style='display:none;' class="col-sm-9">
													<input value="${sessionScope.userinfo.id}" name="shangjiaid" type="text" class="form-control" placeholder=" ">
												</div>
											</div><div class="form-group row">
												<label class="col-sm-3 col-form-label">图片</label>
												<div class="col-sm-9">
													<input name="tupianfile" type="file" class="form-control" placeholder=" ">
												</div>
											</div><div class="form-group row">
												<label class="col-sm-3 col-form-label">简介</label>
												<div class="col-sm-9">
													<input name="jianjie" type="text" class="form-control" placeholder=" ">
												</div>
											</div><div class="form-group row" style="display: none;">
												<label class="col-sm-3 col-form-label">下单次数</label>
												<div class="col-sm-9">
													<input name="xdcs" type="text" value="0" class="form-control" placeholder=" ">
												</div>
											</div><div class="form-group row" style="display: none;">
												<label class="col-sm-3 col-form-label">浏览次数</label>
												<div class="col-sm-9">
													<input name="llcs" type="text" value="0" class="form-control" placeholder=" ">
												</div>
											</div>
										</div>
										<div class="card-footer p-4">
											<button type="submit" class="btn btn-success">
												添加
											</button>
										</div>
									</form>
								</div>
							</div>
						</div>
						<!-- state end-->
					</div>
				</main>
				<!--main contents end-->
			</div>
			<!-- Content_right_End -->
			<!-- Footer -->
			<!-- Footer_End -->
		</div>
		<script type="text/javascript" src="resource/assets/js/jquery.min.js"></script>
		<script type="text/javascript" src="resource/assets/js/popper.min.js"></script>
		<script type="text/javascript" src="resource/assets/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="resource/assets/js/jquery.mCustomScrollbar.concat.min.js"></script>
		<script type="text/javascript" src="resource/assets/js/jquery.dcjqaccordion.2.7.js"></script>
		<script src="resource/assets/js/custom.js" type="text/javascript"></script>
	</body>
	<script>
		if("${message}"){
			alert("${message}");
		}
	</script>
</html>
