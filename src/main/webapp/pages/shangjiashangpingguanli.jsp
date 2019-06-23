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
		<title>商品管理</title>
		<link rel="shortcut icon" type="image/x-icon" href="Vertical/favicon.ico">
		<!-- google font -->
		<link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet" type="text/css" />
		<link href="resource/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css">
		<link href="resource/assets/css/font-awesome.min.css" rel="stylesheet" type="text/css">
		<link href="resource/assets/css/ionicons.css" rel="stylesheet" type="text/css">
		<link href="resource/assets/css/simple-line-icons.css" rel="stylesheet" type="text/css">
		<link href="resource/assets/css/jquery.mCustomScrollbar.css" rel="stylesheet">
		<!--bs4 data table-->
		<link href="resource/assets/css/dataTables.bootstrap4.min.css" rel="stylesheet">
		<link href="resource/assets/css/style.css" rel="stylesheet">
		<link href="resource/assets/css/responsive.css" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper">
			<!-- header -->
			<header class="main-header">
				<div class="container_header">
					<div class="logo d-flex align-items-center">
						<a href="index.action"> <strong class="logo_icon"> 食品 </strong> <span class="logo-default"> 食品商城后台管理 </span> </a>
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
							<div class="col-xl-7 col-9 d-flex justify-content-end">
								<div class="right_bar_top d-flex align-items-center">
									<!-- notification_Start -->
									<!-- notification_End -->
									<!-- DropDown_Inbox -->
									<!--DropDown_Inbox_End -->
									<!-- Dropdown_User -->
									<div class="dropdown dropdown-user">
									</div>
									<!-- Dropdown_User_End -->
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
					<!--page title end-->
					<div class="container-fluid">
						<!-- state start-->
						<div class="row">
							<div class=" col-sm-12">
								<div class="card card-shadow mb-4">
									<div class="card-header">
										<div class="card-title">
											商品管理
										</div>
									</div>
									<div class="card-body">
										<table id="bs4-table" class="table table-bordered table-striped" cellspacing="0" width="100%">
											<thead><th>商品名字
                    </th><th>类型
                    </th><th>价格
                    </th><th>数量
                    </th><th>商家
                    </th><th>商家id
                    </th><th>图片
                    </th><th>简介
                    </th><th>下单次数
                    </th><th>浏览次数
                    </th><th>操作</th></thead>
											<tbody>
                    
                    
                    <c:if test="${ !empty shangpingall}">
							<c:forEach items="${ shangpingall}" var="item">
							
								<tr><td>                        ${item.shangping }
                      </td><td>                        ${item.leixing }
                      </td><td>                        ${item.jiage }
                      </td><td>                        ${item.shuliang }
                      </td><td>                        ${item.shangjia }
                      </td><td>                        ${item.shangjiaid }
                      </td><td>                        <img src="resource/uploads/${item.tupian }" style="width:100px;height:100px;">
                      </td><td>                        ${item.jianjie }
                      </td><td>                        ${item.xdcs }
                      </td><td>                        ${item.llcs }
                      </td><td>
                          <a class="table-actions" href="shangjiaxiugaishangping.action?id=${item.id}">修改</a> <a class="table-actions" href="shangjiashanchushangping.action?id=${item.id}">删除</a>
                      </td>                    </tr>
							</c:forEach>
				</c:if>
                  </tbody>
										</table>
									</div>
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
		<!--datatables-->
		<script src="resource/assets/js/jquery.dataTables.min.js"></script>
		<script src="resource/assets/js/dataTables.bootstrap4.min.js"></script>
		<script type="text/javascript" src="resource/assets/js/jquery.dcjqaccordion.2.7.js"></script>
		<script src="resource/assets/js/custom.js" type="text/javascript"></script>
		<script>
			$(document).ready(function() {
				$('#bs4-table').DataTable();
			});
		</script>
		<script>
			if("${message}"){
				alert("${message}");
			}
		</script>
	</body>
</html>
