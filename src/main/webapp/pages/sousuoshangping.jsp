<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!--================= Basic Page Needs ================-->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!--================= Specific Meta ===================-->
    <meta name="description" content="Softhopper is a modern theme marketplace template.">
    <meta name="keywords" content="HTML5, Template, Design, Development, Hotel, theme">

    <!--================= Page Title ======================-->
    <title>LiveKitchen | Restaurant Template</title>
    <!--================= Favicons ========================-->
    <link rel="shortcut icon" href="resource/qianduan/images/favicon.ico">
    <link rel="apple-touch-icon" href="resource/qianduan/images/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="resource/qianduan/images/apple-touch-icon_72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="resource/qianduan/images/apple-touch-icon_114x114.png">
    <link rel="apple-touch-icon" sizes="144x144" href="resource/qianduan/images/apple-touch-icon_144x144.png">

    <!--================= Custom Font =====================-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700%7cPlayfair+Display:400,700,900" rel="stylesheet">

    <!--====== Custom CSS for themes and color schemer =======-->
    <link href="resource/qianduan/css/plugins.css" rel="stylesheet">
    <link href="resource/qianduan/style.css" rel="stylesheet">
    <link href="resource/qianduan/colors/color-schemer.css" rel="stylesheet">

    <!--================= Modernize =======================-->
    <script src="resource/qianduan/js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
<!--================= Header ==========================-->
<header id="masthead" class="site-header">
    <!--Header Top-->

    <!--Header Bottom-->
    <div class="header-bottom">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="menu-wrapper clearfix">
                        <div class="navbar-header pull-left">
                            <div class="logo-block">
                                <a href="index.html" class="site-logo">
                                    <img src="resource/qianduan/images/logo.png" alt="sitelogo" class="logo">
                                </a><!--/.site-logo-->
                            </div>
                        </div><!--/.navbar-header-->

                        <div class="collapse navbar-collapse pull-right">
                            <div class="navigation hidden-sm hidden-xs">
                                <c:import url="qtmenu.jsp"></c:import>
                            </div><!--/.navigation-->

                            <!--Mobile Main Menu-->
                            <div class="mobile-menu-main hidden-md hidden-lg">
                                <div class="menucontent overlaybg"> </div>
                                <div class="menuexpandermain slideRight">
                                    <a id="navtoggole-main" class="animated-arrow slideLeft menuclose">
                                        <span></span>
                                    </a>
                                    <span id="menu-marker"></span>
                                </div><!--/.menuexpandermain-->

                                <div id="mobile-main-nav" class="main-navigation slideLeft">
                                    <div class="menu-wrapper">
                                        <div id="main-mobile-container" class="menu-content clearfix"></div>
                                    </div>
                                </div><!--/#mobile-main-nav-->
                            </div><!--/.mobile-menu-main-->
                        </div><!--/.navbar-collapse-->
                    </div><!--/.menu-wrapper-->
                </div><!--/.col-md-12-->
            </div><!--/.row-->
        </div><!--/.container-->
    </div><!--/.header-bottom-->
</header><!--/.site-header-->

<!--================= Wellcome Slider ===================-->
<!--================= Page Heading Area ===================-->
<div data-jarallax='{"speed": 0.3, "imgSrc": "images/menu/menu-bg-four.jpg" }' class="page-heading-area jarallax">
    <div class="container">
        <div class="row">
            <div class="col-md-12 text-center">
                <h2 class="page-heading">为您提供优质服务 </h2><!--/.page-heading-->
            </div><!--/.col-md-12-->
        </div><!--/.row-->
    </div><!--/.container-->
</div><!--/.page-heading-area-->

<div class="container">
	<div style="padding: 20px;">
						<form action="sousuoshangping.action" method="post">
							<div class="input-group col-lg-6 col-lg-offset-3">
  <input type="text" class="form-control" name="search" aria-label="...">
  <div class="input-group-btn">
    <button class="btn btn-success" style="height: 34px;line-height: 10px;">搜索</button>
  </div>
</div>
						</form>
					</div>
</div>


<!--================= Our Shop Section ===================-->
<section class="our-shop-section bg-white-smoke">
    <div class="container">
    <div class="menu-content-area">
    	<div class="row">
    		<span>价格</span>：<a class="btn btn-success" href="?orderstr=jiage asc">升序</a> <a class="btn btn-success" href="?orderstr=jiage desc">降序</a>
    		<span>销量</span>：<a class="btn btn-success" href="?orderstr=xdcs asc">升序</a> <a class="btn btn-success" href="?orderstr=xdcs desc">降序</a>
    	</div>
    </div>
        <div class="menu-content-area">
            <div class="row" id="allitems">
            
            	<c:if test="${ !empty shangpingall}">
							<c:forEach items="${ shangpingall}" var="item">
							
								<div class="col-md-3 col-sm-6 col-xs-6 oneitem">
                    <div class="menu-item-two">
                        <div class="image-area">
                            <a href="shangpingxiangqing.action?id=${item.id}">
                                <img src="resource/uploads/${item.tupian }" alt="menu-item" style="width: 265px;height: 193px;">
                            </a>
                        </div>
                        <div class="menu-content text-center">
                            <div class="item-price">
                                <div class="price-inner">￥${item.jiage }</div>
                            </div>
                            <h5 class="menu-title">
                                <a href="shangpingxiangqing.action?id=${item.id}">${item.shangping }</a>
                            </h5>
                        </div>
                    </div>
                </div>
							</c:forEach>
				</c:if>
            </div><!--/.row-->
			
			<div style="text-align: center;margin-bottom: 180px;" id="barcon"></div>
			
			
            <!-- <div class="row">
                <div class="col-md-12">
                    Paginations
                    <nav class="paginations">
                        <div class="post-pagination paging-navigation">
                            <ul class="nav-links">
                                <li class="nav-previous">
                                    disabled add when no pagination
                                    <a href="#"><i class="fa fa-angle-left"></i></a>
                                </li>
                                <li>
                                    <a href="#">01</a>
                                </li>
                                <li class="active">
                                    <a href="#">02</a>
                                </li>
                                <li>
                                    <a href="#">03</a>
                                </li>
                                <li>
                                    <a href="#">04</a>
                                </li>
                                <li>
                                    <a href="#">05</a>
                                </li>
                                <li>
                                    <a href="#">102</a>
                                </li>
                                <li class="nav-next">
                                    <a href="#"><i class="fa fa-angle-right"></i></a>
                                </li>
                            </ul>
                        </div>/.post-pagination
                    </nav>/.pagination
                </div>/.col-md-12
            </div>/.row -->
        </div>
    </div><!--/.container-->
</section><!--/.our-menu-section-->

<!--================= Site Footer Top ===================-->

<!--================= Blog Post Section ===================-->
<div id="footer-top-section" style="background-image:url('resource/qianduan/images/footer-pattern.jpg')">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-title-area text-center">
                    <h2 class="section-title">启用日期
                        <br>2019/4/10</h2>
                    <p class="section-title-dec">每天24小时为您提供服务</p>
                </div><!--/.section-title-area-->
            </div><!--/.col-md-12-->
        </div><!--/.row-->
        <div class="row">
            <div class="col-sm-6 col-md-3">
                <div class="widget-area footer-sidebar-top-1">
                    <aside class="widget clearfix widget_address">
                        <div class="widget-title-area">
                            <h4 class="widget-title">地址</h4>
                        </div><!--/.widget-title-area-->
                        <div class="widget-content">
                            <p>地址信息</p>
                        </div>
                    </aside><!--/.widget_address-->
                </div><!--/.footer-sidebar-top-1-->
            </div><!--/.col-md-3-->

            <div class="col-sm-6 col-md-3">
                <div class="widget-area footer-sidebar-top-2">
                    <aside class="widget clearfix widget_call_us">
                        <div class="widget-title-area">
                            <h4 class="widget-title">电话</h4>
                        </div><!--/.widget-title-area-->
                        <div class="widget-content">
                            <p>+电话</p>
                            <p>电话</p>
                        </div>
                    </aside><!--/.widget_call_us-->
                </div><!--/.footer-sidebar-top-2-->
            </div><!--/.col-md-3-->

            <div class="col-sm-6 col-md-3">
                <div class="widget-area footer-sidebar-top-3">
                    <aside class="widget clearfix widget_mail_us">
                        <div class="widget-title-area">
                            <h4 class="widget-title">邮箱</h4>
                        </div><!--/.widget-title-area-->
                        <div class="widget-content">
                            <p>2196316269@qq.com</p>
                            <p>2196316269@qq.com</p>
                        </div>
                    </aside><!--/.widget_mail_us-->
                </div><!--/.footer-sidebar-top-3-->
            </div><!--/.col-md-3-->
        </div><!--/.row-->
    </div><!--/.container-fluid-->
</div><!--/#footer-top-section-->

<!--********************* JS FILE DECLARATION *****************************  -->
<script src="resource/qianduan/js/vendor/jquery-1.12.4.min.js"></script><!--Jquery-->
<script src="resource/qianduan/js/vendor/jQuery-Migrate.min.js"></script><!--jQuery-Migrate-->
<script src="resource/qianduan/js/plugins.js"></script><!--plugins js-->
<script src="resource/qianduan/js/livekitchen.js"></script><!--live-kitchen-app-->
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
<script>

    function goPage(pno,psize){
        var itable = document.getElementById("allitems");
        console.log(itable);
        var num = $("#allitems .oneitem").length;//表格所有行数(所有记录数)
        console.log(num);
        var totalPage = 0;//总页数
        var pageSize = psize;//每页显示行数
        //总共分几页
        if(num/pageSize > parseInt(num/pageSize)){
            totalPage=parseInt(num/pageSize)+1;
        }else{
            totalPage=parseInt(num/pageSize);
        }
        var currentPage = pno;//当前页数
        var startRow = (currentPage - 1) * pageSize+1;//开始显示的行 31
        var endRow = currentPage * pageSize;//结束显示的行  40
        endRow = (endRow > num)? num : endRow;  //40
        console.log(endRow);
        //遍历显示数据实现分页
        for(var i=1;i<(num+1);i++){
            if(i>=startRow && i<=endRow){
                console.log($("#allitems .oneitem")[i-1]);
                $("#allitems .oneitem")[i-1].style.display = "block";
            }else{
                $("#allitems .oneitem")[i-1].style.display = "none";
            }
        }
        var tempStr = "共"+num+"条记录 分"+totalPage+"页 当前第"+currentPage+"页";
        if(currentPage>1){
            tempStr += "<a href=\"#\" onClick=\"goPage("+(1)+","+psize+")\">首页</a>";
            tempStr += "<a href=\"#\" onClick=\"goPage("+(currentPage-1)+","+psize+")\"><上一页</a>"
        }else{
            tempStr += "首页";
            tempStr += "<上一页";
        }
        if(currentPage<totalPage){
            tempStr += "<a href=\"#\" onClick=\"goPage("+(currentPage+1)+","+psize+")\">下一页></a>";
            tempStr += "<a href=\"#\" onClick=\"goPage("+(totalPage)+","+psize+")\">尾页</a>";
        }else{
            tempStr += "下一页>";
            tempStr += "尾页";
        }
        document.getElementById("barcon").innerHTML = tempStr;
    }


    goPage(1,10);

</script>
</body>
</html>