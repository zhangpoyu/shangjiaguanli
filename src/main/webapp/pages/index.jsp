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
    <div class="welcome-slider">
        <div class="container-fluid">
            <div class="row">
                <div class="pogoSlider js-main-slider">
                    <div data-transition="shrinkReveal" data-duration="1000" style="background-image:url(resource/qianduan/images/slide-bg1.jpg);" class="pogoSlider-slide style-one">
                        <h2 class="slider-heading-main">Welcome
                            <span>Livekitchen Testy Food</span>
                        </h2><!--/.water-wrap-->
                        <div class="slider-container">
                            <div class="slider-main-content">
                                <div class="image-before">
                                    <div data-in="slideLeft" data-out="slideUp" data-duration="750" data-delay="600" class="heading pogoSlider-slide-element">
                                        <h2>American
                                            <span>Burger</span>
                                        </h2>
                                    </div>
                                    <div class="content">
                                        <div data-in="slideUp" data-out="slideDown" data-duration="750" data-delay="500" class="content-text pogoSlider-slide-element">Super Testy</div>
                                        <div data-in="slideRight" data-out="slideRight" data-duration="750" data-delay="500" class="content-text pogoSlider-slide-element">Professional</div>
                                    </div>
                                </div>
                                <div data-in="slideDown" data-out="slideUp" data-duration="750" data-delay="500" class="image-content pogoSlider-slide-element">
                                    <img src="resource/qianduan/images/slider/slider-01.png" alt="slider-burger">
                                </div>
                                <div class="image-after">
                                    <div data-in="slideRight" data-out="slideUp" data-duration="750" data-delay="600" class="heading pogoSlider-slide-element">
                                        <h2>Indian
                                            <span>Food</span>
                                        </h2>
                                    </div>
                                    <div class="content">
                                        <div data-in="slideRight" data-out="slideDown" data-duration="750" data-delay="500" class="content-text pogoSlider-slide-element">Creative</div>
                                        <div data-in="slideRight" data-out="slideDown" data-duration="750" data-delay="500" class="content-text pogoSlider-slide-element">Special Offer</div>
                                        <div data-in="slideRight" data-out="slideDown" data-duration="750" data-delay="500" class="content-text pogoSlider-slide-element">Fast</div>
                                    </div>
                                </div>
                            </div><!--/.image-content-->
                        </div><!--/.slider-container-->
                    </div>
                    <div data-transition="shrinkReveal" data-duration="1000" style="background-image:url(resource/qianduan/images/slide-bg1.jpg);" class="pogoSlider-slide style-two">
                        <h2 data-in="slideDown" data-out="slideUp" data-duration="750" data-delay="600" class="slider-heading-main pogoSlider-slide-element">Welcome
                            <span>Livekitchen Testy Food</span>
                        </h2><!--/.water-wrap-->
                        <div class="slider-container">
                            <div class="slider-main-content">
                                <div class="image-before">
                                    <div data-in="slideLeft" data-out="slideUp" data-duration="750" data-delay="600" class="heading pogoSlider-slide-element">
                                        <h2>Food</h2>
                                    </div>
                                </div>
                                <div data-in="slideDown" data-out="slideUp" data-duration="750" data-delay="500" class="image-content pogoSlider-slide-element">
                                    <img src="resource/qianduan/images/slider/slider-02.png" alt="slider-burger">
                                </div>
                                <div class="image-after">
                                    <div data-in="slideRight" data-out="slideUp" data-duration="750" data-delay="600" class="heading pogoSlider-slide-element">
                                        <h2>Indian Mixed Food</h2>
                                    </div>
                                    <div class="content">
                                        <div data-in="slideRight" data-out="slideDown" data-duration="750" data-delay="500" class="content-button pogoSlider-slide-element">
                                            <a class="btn btn-default">Special Offer</a>
                                        </div>
                                    </div>
                                </div>
                            </div><!--/.image-content-->
                        </div><!--/.slider-container-->
                    </div>
                </div><!-- .pogoSlider -->
            </div><!--/.row-->
        </div><!--/.container-fluid-->
    </div><!--/.welcome-slider-->

    <!--================= Booking With Chif ===================-->
    <section class="about-and-sp-menu bg-white-smoke">
        <div class="container">
            <div class="row">
                <div class="col-md-7 title">
                    <div class="section-align-title-area">
                        <div class="section-title-style-inner">
                            <h3 class="section-name">热门商品</h3>
                            <div class="special-tab-content">
                                <ul role="tablist" class="nav nav-tabs responsive">
                                    <li class="active">
                                        <a href="#burger-menu-1" role="tab" data-toggle="tab">Burger</a>
                                    </li>
                                    
                                </ul>
                                <div class="tab-content responsive">
                                    <!--Tab panes-->
                                    <div role="tabpanel" id="burger-menu-1" class="tab-pane fade in active">
                                    <c:if test="${ !empty suijishangping3}">
							<c:forEach items="${ suijishangping3}" var="item">
							
								<div class="menu-item-one tb">
                                            <div class="image-area tb-cell">
                                                <a href="shangpingxiangqing.action?id=${item.id}">
                                                    <img src="resource/uploads/${item.tupian }" style="width: 115px;height: 99px;" alt="menu-item">
                                                </a>
                                            </div>
                                            <div class="item-text tb-cell">
                                                <h5 class="menu-title">
                                                    <a href="shangpingxiangqing.action?id=${item.id}">${item.shangping }</a>
                                                    <span class="price-inner hidden-md hidden-lg">￥${item.jiage }</span>
                                                </h5>
                                                <p class="menu-description">${item.shangjia }</p>
                                            </div>
                                            <div class="item-price tb-cell hidden-xs hidden-sm">
                                                <div class="price-inner">￥${item.jiage }</div>
                                            </div>
                                        </div>
							</c:forEach>
				</c:if>
                                        
                                        
                                        
                                    </div>
                                    
                                </div>
                            </div><!--/.special-tab-content-->
                        </div><!--/.section-title-style-inner-->
                    </div><!--/.section-title-area-->
                </div><!--/.col-md-6-->

                <div class="col-md-5 gallery">
                    <div class="row">
                        <div class="col-md-12">
                            <h2 class="gallery-section-name">欢迎选购
                            </h2>
                        </div>
                    </div>
                    <div class="row padding-reset-section">
                    
                    	
                    	<c:if test="${ !empty rexiao4}">
							<c:forEach items="${ rexiao4}" var="item">
							
								<a href="shangpingxiangqing.action?id=${item.id}">
									<div class="col-md-6 col-sm-6 col-xs-6 padding-reset">
                            <div class="single-best-place">
                                <div class="best-place-thumb">
                                    <img src="resource/uploads/${item.tupian}" alt="img" class="box-radius" style="width: 203px;height: 175px;">
                                </div><!--/.best-place-thumb-->
                            </div><!--/.single-best-place-->
                        </div><!--/.col-md-3-->
								</a>
								
							</c:forEach>
				</c:if>
                    
                        
                        
                    </div><!--/.row-->
                </div><!--/.gallery-->
            </div><!--/.row-->
        </div><!--/.container-->
    </section><!--/.about-and-sp-menu-->

    <!--================= Our Delicious Menu ===================-->
    <section class="our-gallery-section bg-white-smoke">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="section-align-title-area">
                        <h2 class="section-align-title">新款推荐
                        </h2>
                        <p class="section-align-title-dec">为你推荐最新面世食品</p>
                        <p>更多没有新鲜的食品等着你的享用，因为你的赞美让我们拥有更强的动力，创造更美的食物。</p>
                        <a href="" class="btn btn-default">查看更多</a>
                    </div><!--/.section-align-title-area-->
                </div><!--/.col-md-6-->

                <div class="col-md-6">
                    <div class="row gallery-item-content">
                    	<c:if test="${zuixin5[0].id != null }">
                        <div class="col-sm-6 col-sx-6 padding-reset">
                            <a href="shangpingxiangqing.action?id=${zuixin5[0].id }">
                                <img alt="Cup Of Coffee" src="resource/uploads/${zuixin5[0].tupian }" style="width: 282px;height: 243px;">
                                <div class="overlay">
                                    <h3>${zuixin5[0].shangping }
                                        <span> ${zuixin5[0].leixing }</span>
                                    </h3>
                                </div>
                            </a>
                        </div>
                        </c:if>
                        <c:if test="${zuixin5[0].id != null }">
                        <div class="col-sm-6 col-sx-6 padding-reset">
                            <a href="shangpingxiangqing.action?id=${zuixin5[1].id }">
                                <img alt="Cup Of Coffee" src="resource/uploads/${zuixin5[1].tupian }" style="width: 282px;height: 117px;;">
                                <div class="overlay">
                                    <h3>${zuixin5[1].shangping }
                                        <span> ${zuixin5[1].leixing }</span>
                                    </h3>
                                </div>
                            </a>
                        </div>
                        </c:if>
                        <c:if test="${zuixin5[0].id != null }">
                        <div class="col-sm-6 col-sx-6 padding-reset">
                            <a href="shangpingxiangqing.action?id=${zuixin5[2].id }">
                                <img alt="Cup Of Coffee" src="resource/uploads/${zuixin5[2].tupian }" style="width: 282px;height: 167px;;">
                                <div class="overlay">
                                    <h3>${zuixin5[2].shangping }
                                        <span> ${zuixin5[2].leixing }</span>
                                    </h3>
                                </div>
                            </a>
                        </div>
                        </c:if>
                        <c:if test="${zuixin5[0].id != null }">
                        <div class="col-sm-6 col-sx-6 padding-reset">
                            <a href="shangpingxiangqing.action?id=${zuixin5[3].id }">
                                <img alt="Cup Of Coffee" src="resource/uploads/${zuixin5[3].tupian }" style="width: 282px;height: 367px;;">
                                <div class="overlay">
                                    <h3>${zuixin5[3].shangping }
                                        <span> ${zuixin5[3].leixing }</span>
                                    </h3>
                                </div>
                            </a>
                        </div>
                        </c:if>
                        <c:if test="${zuixin5[0].id != null }">
                        <div class="col-sm-6 col-sx-6 padding-reset">
                            <a href="shangpingxiangqing.action?id=${zuixin5[4].id }">
                                <img alt="Cup Of Coffee" src="resource/uploads/${zuixin5[4].tupian }" style="width: 282px;height: 212px;;">
                                <div class="overlay">
                                    <h3>${zuixin5[4].shangping }
                                        <span> ${zuixin5[4].leixing }</span>
                                    </h3>
                                </div>
                            </a>
                        </div>
                        </c:if>
                    </div>
                </div>
            </div><!--/.row-->
        </div><!--/.container-->
    </section><!--/.our-gallery-section-->

    <!--================= Our Experts Chefs ===================-->
    <section class="our-customer-section">
        <h2 class="water-wrap">Testmonials</h2>
        <!--/.water-wrap-->
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-full-width">
                    <div class="customer-section-title-area text-center">
                        <h2 class="section-title">
                            商家推荐</h2>
                    </div><!--/.customer-section-title-area-->
                </div><!--/.col-md-8-->
            </div><!--/.row-->
            <div class="row">
                <div class="col-md-12">
                    <div class="customer-reviews owl-carousel">
                        <!--Single Customer Review-->
                        
                        <c:if test="${ !empty suijishangjia3}">
							<c:forEach items="${ suijishangjia3}" var="item">
								<a href="sousuoshangping.action?shangjiaid=${item.id }">
								<div class="single-customer-review">
                            <div class="customer-header">
                                <img src="resource/qianduan/images/customer/customer-1.png" alt="customer" class="customer-thumb">
                                <h3 class="customer-name">${item.mingzi }</h3>
                            </div><!--/.customer-header-->
                            <div class="customer-info">
                                <p>${item.shangjiadizhi }</p>
                                <p>${item.lianxifangshi }</p>
                            </div><!--/.customer-info-->
                        </div></a>
							</c:forEach>
				</c:if>
                        
                        
                        <!--/.single-customer-review-->

                        
                    </div><!--/#customer-reviews-->
                </div><!--/.col-md-8-->
            </div><!--/.row-->
        </div><!--/.container-->
    </section><!--/.our-customer-section-->

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
                                <p>597820080@qq.com</p>
                                <p>597820080@qq.com</p>
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
</body>
</html>