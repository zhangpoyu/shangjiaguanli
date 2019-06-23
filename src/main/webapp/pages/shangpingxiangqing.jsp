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

    <!--================= Page Heading Area ===================-->
    <div data-jarallax='{"speed": 0.3, "imgSrc": "images/menu/menu-bg-four.jpg" }' class="page-heading-area jarallax">
        <div class="container">
            <div class="row">
                <div class="col-md-12 text-center">
                    <h2 class="page-heading">商品详情</h2><!--/.page-heading-->
                </div><!--/.col-md-12-->
            </div><!--/.row-->
        </div><!--/.container-->
    </div><!--/.page-heading-area-->

    <!--================= Blog Single Page Area ===================-->
    <div class="blog-single-page-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <article class="post single-post box-radius">
                        <div class="entry-header">
                            <h2 class="entry-title">${shangping.shangping }</h2><!--/.entry-title-->
                            <div class="entry-meta">
                                <div class="entry-date"><strong>分类</strong>
                                    <span>${shangping.leixing }</span>
                                </div><!--/.entry-date-->
                                <div class="entry-cat"><strong>价格</strong>
                                    <span>${shangping.jiage }</span>
                                </div><!--/.entry-cat-->
                                <div class="entry-tag"><strong>当前数量</strong>
                                    <span class="tag">
                                        <span>${shangping.shuliang }</span>
                                    </span>
                                </div><!--/.entry-tag-->
                                <div class="entry-author pull-right">
                                    <div class="author-name text-right pull-left"><strong>商家</strong>
                                        <span>${shangping.shangjia }</span>
                                    </div>
                                </div>
                            </div><!--/.entry-meta-->
                            <figure class="post-thumb">
                                <img src="resource/uploads/${shangping.tupian }" style="width: 1020px;height: 613px;" alt="thumb">
                            </figure><!--/.post-thumb-->
                        </div><!--/.entry-header-->

                        <div class="entry-content">
                            <p>${shangping.miaoshu }</p>
                        </div><!--/.entry-content-->
                        <c:if test="${sessionScope.shenfen == '用户'}">
                        	<button class="btn" onclick="javascript:window.location.href='yonghutianjiadingdan.action?shangpingid=${shangping.id }&shanghuid=${shangping.shangjiaid }&jiage=${shangping.jiage }'">下单</button>
                        	<button class="btn" onclick="javascript:window.location.href='yonghutianjiagouwuche.action?shangpingid=${shangping.id }&shanghuid=${shangping.shangjiaid }&jiage=${shangping.jiage }'">添加购物车</button>
                        </c:if>
                        <c:if test="${sessionScope.shenfen != '用户'}">
                        	下单请登录用户账号
                        </c:if>
                    </article><!--/.single-post-->
                </div><!--/.col-md-12-->
            </div><!--/.row-->

            <div class="row">
                <div class="col-md-12">
                    <!-- Comment-Area-->
                    <div id="comments" class="comments-area box-radius">
                        <div class="row">
                            <div class="col-md-12">
                                <h3 class="comments-title">评价</h3><!--/.comments-title-->
                            </div><!--/.col-md-12-->
                        </div><!--/.row-->
                        <div class="row">
                            <div class="col-md-12">
                                <ol class="comment-list">
                                	
                                <c:if test="${ !empty pingjiaall}">
							<c:forEach items="${ pingjiaall}" var="item">
							
								<li class="comment">
                                        <div class="comment-body">
                                            <div class="comment-meta">
                                                <div class="comment-author vcard">
                                                    <div class="author-img">
                                                        <img alt="" src="resource/qianduan/images/author/comment-one.jpg" class="avatar photo">
                                                    </div>
                                                </div><!--/.comment-author-->
                                                <div class="comment-metadata"><b class="author">${item.yonghu }</b>
                                                    <span class="date">${item.pingjia }</span>
                                                </div><!--/.comment-metadata-->
                                            </div><!--/.comment-meta-->
                                            <div class="comment-details">
                                                <div class="comment-content">
                                                    <p>${item.neirong }</p>
                                                </div><!--/.comment-content-->
                                            </div><!-- /.comment-details-->
                                        </div><!--/.comment-body-->
                                        
                                    </li><!--/.comment-body-->
							</c:forEach>
				</c:if>
                                    
                                </ol><!--/.comment-list-->
                            </div><!--/.col-md-12-->
                        </div><!--/.row-->
                    </div><!--/.comments-area-->
                </div><!--/.col-md-12-->
            </div><!--/.row-->

            
        </div><!--/.container-->
    </div><!--/.blog-single-page-area-->

    <!--================= Site Footer Top ===================-->
    <div id="footer-top-section" style="background-image:url('resource/qianduan/images/footer-pattern.jpg')">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="section-title-area text-center">
                        <h2 class="section-title">We Are Available
                            <br>For You 24/7</h2>
                        <p class="section-title-dec">Our online support service is always 24 Hours</p>
                    </div><!--/.section-title-area-->
                </div><!--/.col-md-12-->
            </div><!--/.row-->
            <div class="row">
                <div class="col-sm-6 col-md-3">
                    <div class="widget-area footer-sidebar-top-1">
                        <aside class="widget clearfix widget_address">
                            <div class="widget-title-area">
                                <h4 class="widget-title">address</h4>
                            </div><!--/.widget-title-area-->
                            <div class="widget-content">
                                <p>112/B - Road Number 08/A Dhanmondi, Dhaka, Bangladesh</p>
                            </div>
                        </aside><!--/.widget_address-->
                    </div><!--/.footer-sidebar-top-1-->
                </div><!--/.col-md-3-->

                <div class="col-sm-6 col-md-3">
                    <div class="widget-area footer-sidebar-top-2">
                        <aside class="widget clearfix widget_call_us">
                            <div class="widget-title-area">
                                <h4 class="widget-title">call</h4>
                            </div><!--/.widget-title-area-->
                            <div class="widget-content">
                                <p>+88 0215469875</p>
                                <p>666 35874692050</p>
                            </div>
                        </aside><!--/.widget_call_us-->
                    </div><!--/.footer-sidebar-top-2-->
                </div><!--/.col-md-3-->

                <div class="col-sm-6 col-md-3">
                    <div class="widget-area footer-sidebar-top-3">
                        <aside class="widget clearfix widget_mail_us">
                            <div class="widget-title-area">
                                <h4 class="widget-title">mail</h4>
                            </div><!--/.widget-title-area-->
                            <div class="widget-content">
                                <p>yourmail@gmail.com</p>
                                <p>Hotelrmail@gmail.com</p>
                            </div>
                        </aside><!--/.widget_mail_us-->
                    </div><!--/.footer-sidebar-top-3-->
                </div><!--/.col-md-3-->

                <div class="col-sm-6 col-md-3">
                    <div class="widget-area footer-sidebar-top-4">
                        <aside class="widget clearfix widget_social_media">
                            <div class="widget-title-area">
                                <h4 class="widget-title">social Account</h4>
                            </div><!--/.widget-title-area-->
                            <div class="widget-social">
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-google-plus"></i></a>
                                <a href="#"><i class="fa fa-instagram"></i></a>
                            </div><!--/.widget-social-->
                        </aside> <!--/.widget_social_media-->
                    </div><!--/.footer-sidebar-top-4-->
                </div><!--/.col-md-3-->
            </div><!--/.row-->
        </div><!--/.container-fluid-->
    </div><!--/#footer-top-section-->


    <!--********************* JS FILE DECLARATION *****************************  -->
    <script src="resource/qianduan/js/vendor/jquery-1.12.4.min.js"></script><!--Jquery-->
    <script src="resource/qianduan/js/vendor/jQuery-Migrate.min.js"></script><!--jQuery-Migrate-->
    <script src="resource/qianduan/js/plugins.js"></script><!--plugins js-->
    <script src="resource/qianduan/js/livekitchen.js"></script><!--live-kitchen-app-->
    <script>
			if("${message}"){
				alert("${message}");
			}
	</script>
</body>
</html>