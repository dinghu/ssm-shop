<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <meta content="meta description" name="description">
    <title>Selena - Organic eCommerce Bootstrap 4 Template</title>

    <!--=== Favicon ===-->
    <link href="assets/img/favicon.ico" rel="shortcut icon" type="image/x-icon"/>

    <!--=== All Plugins CSS ===-->
    <link href="assets/css/plugins.css" rel="stylesheet">
    <!--=== All Vendor CSS ===-->
    <link href="assets/css/vendor.css" rel="stylesheet">
    <!--=== Main Style CSS ===-->
    <link href="assets/css/style.css" rel="stylesheet">

    <!-- Modernizer JS -->
    <script src="assets/js/modernizr-2.8.3.min.js"></script>

    <!--[if lt IE 9]>
    <script src="http://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

<!-- Start Header Area -->
<!-- 顶栏 -->
<jsp:include page="header.jsp"></jsp:include>
<!-- end Header Area -->

<!-- main wrapper start -->
<main>
    <!-- hero slider area start -->
    <section class="hero-slider-area" id="id_banner_area">
        <div class="hero-slider-active slider-arrow-style" id="id_banner"><!--只能支持3个 不知奥怎么做-->
            <div class="single-slider hero-bg hero-bg__1 d-flex align-items-center" id="id_banner_1">
                <%--<div class="container">--%>
                <%--<div class="row">--%>
                <%--<div class="col-12">--%>
                <%--<div class="content-inner">--%>
                <%--<div class="slider-content">--%>
                <%--<h1>tasty healthy<br>organi <br>we sell what's<br>good for you </h1>--%>
                <%--<p>We supply highly quality, premium organic products</p>--%>
                <%--<a class="btn" href="shop.html">shop now</a>--%>
                <%--</div>--%>
                <%--<div class="slider-img">--%>
                <%--<img alt="" src="assets/img/slider/slide_2.jpg">--%>
                <%--</div>--%>
                <%--</div>--%>
                <%--</div>--%>
                <%--</div>--%>
                <%--</div>--%>
            </div>
            <div class="single-slider hero-bg hero-bg__1 d-flex align-items-center" id="id_banner_2">
                <%--<div class="container">--%>
                <%--<div class="row">--%>
                <%--<div class="col-12">--%>
                <%--<div class="content-inner">--%>
                <%--<div class="slider-content">--%>
                <%--<h1>Great offers<br>on fruits <br>and vegetables </h1>--%>
                <%--<p>We supply highly quality, premium organic products</p>--%>
                <%--<a class="btn" href="shop.html">shop now</a>--%>
                <%--</div>--%>
                <%--<div class="slider-img">--%>
                <%--<img alt="" src="assets/img/slider/slide_1.jpg">--%>
                <%--</div>--%>
                <%--</div>--%>
                <%--</div>--%>
                <%--</div>--%>
                <%--</div>--%>
            </div>
        </div>
    </section>
    <!-- hero slider area start -->

    <!-- service features start -->
    <section class="service-features pt-30">
        <div class="container">
            <div class="service-features-inner theme-color">
                <div class="single-features-item">
                    <div class="features-icon">
                        <i class="ion-paper-airplane"></i>
                    </div>
                    <div class="features-content">
                        <h5>Free Shipping</h5>
                        <p>Free delivery on all orders over $99</p>
                    </div>
                </div>
                <div class="single-features-item">
                    <div class="features-icon">
                        <i class="ion-social-usd"></i>
                    </div>
                    <div class="features-content">
                        <h5>Free Shipping</h5>
                        <p>Free delivery on all orders over $99</p>
                    </div>
                </div>
                <div class="single-features-item">
                    <div class="features-icon">
                        <i class="ion-help-buoy"></i>
                    </div>
                    <div class="features-content">
                        <h5>Free Shipping</h5>
                        <p>Free delivery on all orders over $99</p>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- service features end -->

    <!-- popular category start -->
    <section class="popular-category bg-gray mt-minus pt-60 pb-60 pb-md-30 pb-sm-30">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="section-title text-center pt-62">
                        <h2>Popular Categories</h2>
                    </div>
                </div>
            </div>
            <div class="row" id="id-popular-category">
                <!--<div class="col-lg-3 col-md-6 col-sm-6">-->
                <!--<div class="category-single-item mb-md-30 mb-sm-30">-->
                <!--<div class="category-item-inner color1 text-center">-->
                <!--<div class="category-content">-->
                <!--<h3><a href="product-details.html">vegetables</a></h3>-->
                <!--<p>2 product</p>-->
                <!--</div>-->
                <!--<div class="category-thumb">-->
                <!--<a href="product-details.html">-->
                <!--<img src="assets/img/category/cat-1.png" alt="">-->
                <!--</a>-->
                <!--</div>-->
                <!--</div>-->
                <!--</div>-->
                <!--</div> &lt;!&ndash; end single item &ndash;&gt;-->
                <!--<div class="col-lg-3 col-md-6 col-sm-6">-->
                <!--<div class="category-single-item mb-md-30 mb-sm-30">-->
                <!--<div class="category-item-inner color2 text-center">-->
                <!--<div class="category-content">-->
                <!--<h3><a href="product-details.html">fruits</a></h3>-->
                <!--<p>2 product</p>-->
                <!--</div>-->
                <!--<div class="category-thumb">-->
                <!--<a href="product-details.html">-->
                <!--<img src="assets/img/category/cat-2.png" alt="">-->
                <!--</a>-->
                <!--</div>-->
                <!--</div>-->
                <!--</div>-->
                <!--</div> &lt;!&ndash; end single item &ndash;&gt;-->
                <!--<div class="col-lg-3 col-md-6 col-sm-6">-->
                <!--<div class="category-single-item mb-md-30 mb-sm-30">-->
                <!--<div class="category-item-inner color3 text-center">-->
                <!--<div class="category-content">-->
                <!--<h3><a href="product-details.html">juice</a></h3>-->
                <!--<p>2 product</p>-->
                <!--</div>-->
                <!--<div class="category-thumb">-->
                <!--<a href="product-details.html">-->
                <!--<img src="assets/img/category/cat-3.png" alt="">-->
                <!--</a>-->
                <!--</div>-->
                <!--</div>-->
                <!--</div>-->
                <!--</div> &lt;!&ndash; end single item &ndash;&gt;-->
                <!--<div class="col-lg-3 col-md-6 col-sm-6">-->
                <!--<div class="category-single-item mb-md-30 mb-sm-30">-->
                <!--<div class="category-item-inner color4 text-center">-->
                <!--<div class="category-content">-->
                <!--<h3><a href="product-details.html">meats</a></h3>-->
                <!--<p>2 product</p>-->
                <!--</div>-->
                <!--<div class="category-thumb">-->
                <!--<a href="product-details.html">-->
                <!--<img src="assets/img/category/cat-4.png" alt="">-->
                <!--</a>-->
                <!--</div>-->
                <!--</div>-->
                <!--</div>-->
                <!--</div> &lt;!&ndash; end single item &ndash;&gt;-->
            </div>
        </div>
    </section>
    <!-- popular category end -->

    <!-- product tab area start -->
    <section class="product-tab pt-60 pb-30">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="section-title text-center">
                        <h2>Our Products</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-12">
                    <!-- product tab menu start -->
                    <div class="product-tab-menu pb-30">
                        <ul class="nav justify-content-center" id="id_product_tab">
                            <!--<li>-->
                            <!--<a class="active" data-toggle="tab" href="#tab_one">mango</a>-->
                            <!--</li>-->
                            <!--<li>-->
                            <!--<a data-toggle="tab" href="#tab_two">vegetables</a>-->
                            <!--</li>-->
                            <!--<li>-->
                            <!--<a data-toggle="tab" href="#tab_three">fruits</a>-->
                            <!--</li>-->
                            <!--<li>-->
                            <!--<a data-toggle="tab" href="#tab_four">juice</a>-->
                            <!--</li>-->
                            <!--<li>-->
                            <!--<a data-toggle="tab" href="#tab_five">meats</a>-->
                            <!--</li>-->
                        </ul>
                    </div>
                    <!-- product tab menu end -->
                    <div class="tab-content" id="id-our-product">
                        <!--<div class="tab-pane fade active show" id="tab_one">-->
                        <!--<div class="product-tab-wrapper">-->
                        <!--<div class="row">-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-1.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimen food</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-2.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">organic food</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-3.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimentum fruits</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-4.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimen vegetables</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-5.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimen posuere</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-6.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Dignissim venenatis</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del>$140.00</del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-7.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Aliquam lobortis</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$80.00</span>-->
                        <!--<span class="old-price"><del>$90.00</del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-8.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimen food</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="tab-pane fade" id="tab_two">-->
                        <!--<div class="product-tab-wrapper">-->
                        <!--<div class="row">-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-5.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimen food</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-10.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">organic food</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-13.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimen fruits</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-15.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimen vegetables</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="tab-pane fade" id="tab_three">-->
                        <!--<div class="product-tab-wrapper">-->
                        <!--<div class="row">-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-6.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimen food</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-3.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">organic food</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-2.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimentum fruits</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-1.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimentum vegetables</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="tab-pane fade" id="tab_four">-->
                        <!--<div class="product-tab-wrapper">-->
                        <!--<div class="row">-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-7.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimentum food</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-8.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">organic food</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-9.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimentum fruits</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-6.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimentum vegetables</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="tab-pane fade" id="tab_five">-->
                        <!--<div class="product-tab-wrapper">-->
                        <!--<div class="row">-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-11.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimentum food</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-12.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">organic food</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-14.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimentum fruits</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="col-lg-3 col-md-4 col-sm-6">-->
                        <!--<div class="product-item mb-50">-->
                        <!--<div class="product-thumb">-->
                        <!--<a href="product-details.html">-->
                        <!--<img alt="" src="assets/img/product/product-16.jpg">-->
                        <!--</a>-->
                        <!--<div class="quick-view-link">-->
                        <!--<a data-target="#quick_view" data-toggle="modal" href="#"> <span-->
                        <!--data-toggle="tooltip" title="Quick view"><i-->
                        <!--class="ion-ios-eye-outline"></i></span> </a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--<div class="product-content text-center">-->
                        <!--<div class="ratings">-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--<span><i class="ion-android-star"></i></span>-->
                        <!--</div>-->
                        <!--<div class="product-name">-->
                        <!--<h4 class="h5">-->
                        <!--<a href="product-details.html">Condimentum vegetables</a>-->
                        <!--</h4>-->
                        <!--</div>-->
                        <!--<div class="price-box">-->
                        <!--<span class="regular-price">$110.00</span>-->
                        <!--<span class="old-price"><del></del></span>-->
                        <!--</div>-->
                        <!--<div class="product-action-link">-->
                        <!--<a data-toggle="tooltip" href="#" title="Wishlist"><i-->
                        <!--class="ion-android-favorite-outline"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Add to cart"><i-->
                        <!--class="ion-bag"></i></a>-->
                        <!--<a data-toggle="tooltip" href="#" title="Compare"><i-->
                        <!--class="ion-ios-shuffle"></i></a>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                        <!--</div>-->
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- product tab area end -->

    <!-- choose us and testimonial area start -->
    <section class="bg-gray pt-60 pb-60">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-12">
                    <div class="row">
                        <div class="col-12">
                            <div class="section-title text-center">
                                <h2>Why Choose Us</h2>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12">
                            <div class="choose-us-wrapper">
                                <div class="accordion" id="choose-us">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6 col-md-12 pt-md-60 pt-sm-60">
                    <div class="row">
                        <div class="col-12">
                            <div class="section-title text-center">
                                <h2>What People Say</h2>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12">
                            <div class="testimonial-wrapper">
                                <div class="testimonial-tab-menu">
                                    <ul class="nav" id="what_pepole_say">
                                        <li>
                                            <a data-toggle="tab" href="#testimonial_one">
                                                <img alt=""
                                                     class="testimonial-thumb"
                                                     src="assets/img/testimonial/team-member-1.jpg">
                                            </a>
                                        </li>
                                        <li>
                                            <a class="active" data-toggle="tab" href="#testimonial_two">
                                                <img alt=""
                                                     class="testimonial-thumb"
                                                     src="assets/img/testimonial/team-member-2.jpg">
                                            </a>
                                        </li>
                                        <li>
                                            <a data-toggle="tab" href="#testimonial_three">
                                                <img alt=""
                                                     class="testimonial-thumb"
                                                     src="assets/img/testimonial/team-member-3.jpg">
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                                <div class="testimonial-tab-wrapper">
                                    <div class="tab-content">
                                        <div class="tab-pane fade" id="testimonial_one">
                                            <div class="testimonial-content-inner">
                                                <p>“ Great theme, excellent support. We had a few small issues with
                                                    getting the dropdown menus to work and support fixed them and let us
                                                    know which files were changed so that we could replicate from dev to
                                                    production. Very happy both with the theme and the company. Highly
                                                    recommended. ”</p>
                                                <div class="ratings">
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                </div>
                                                <div class="designation">
                                                    Raju Ahammad / <span>developer of HT</span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="tab-pane fade active show" id="testimonial_two">
                                            <div class="testimonial-content-inner">
                                                <p>“ Great theme, excellent support. We had a few small issues with
                                                    getting the dropdown menus to work and support fixed them and let us
                                                    know which files were changed so that we could replicate from dev to
                                                    production. Very happy both with the theme and the company. Highly
                                                    recommended. ”</p>
                                                <div class="ratings">
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                </div>
                                                <div class="designation">
                                                    erik jhonson / <span>manager of HT</span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="tab-pane fade" id="testimonial_three">
                                            <div class="testimonial-content-inner">
                                                <p>“ Great theme, excellent support. We had a few small issues with
                                                    getting the dropdown menus to work and support fixed them and let us
                                                    know which files were changed so that we could replicate from dev to
                                                    production. Very happy both with the theme and the company. Highly
                                                    recommended. ”</p>
                                                <div class="ratings">
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                    <span><i class="ion-android-star"></i></span>
                                                </div>
                                                <div class="designation">
                                                    erik jhonson / <span>designer of HT</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- choose us and testimonial area start -->

    <!-- best sellers area start -->
    <section class="best-sellers pt-60 pb-60 pb-lg-30 pb-md-30 pb-sm-30">
        <div class="container">
            <div class="row">
                <div class="col-lg-8">
                    <div class="best-sellers-banner">
                        <img alt="" src="assets/img/banner/best-sellers.png">
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="best-sellers-content pt-md-60 pt-sm-60">
                        <div class="row">
                            <div class="col-12">
                                <div class="section-title section-title__2">
                                    <h2>best sellers</h2>
                                </div>
                            </div>
                        </div>
                        <div class="row product-carousel-active-3" data-row="3" id="id_best_seller">
                            <div class="col" id="id_best_seller1">
                                <div class="single-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img alt="" src="assets/img/product/product-1.jpg">
                                        </a>
                                        <div class="quick-view-link">
                                            <a data-target="#quick_view" data-toggle="modal" href="#"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-description">
                                        <div class="tag-cate">
                                            <a href="product-details.html">fruits</a>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$180.00</del></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col" id="id_best_seller2">
                                <%--<div class="single-item mb-30">--%>
                                <%--<div class="product-thumb">--%>
                                <%--<a href="product-details.html">--%>
                                <%--<img alt="" src="assets/img/product/product-7.jpg">--%>
                                <%--</a>--%>
                                <%--<div class="quick-view-link">--%>
                                <%--<a data-target="#quick_view" data-toggle="modal" href="#"> <span--%>
                                <%--data-toggle="tooltip" title="Quick view"><i--%>
                                <%--class="ion-ios-eye-outline"></i></span> </a>--%>
                                <%--</div>--%>
                                <%--</div>--%>
                                <%--<div class="product-description">--%>
                                <%--<div class="tag-cate">--%>
                                <%--<a href="product-details.html">juice</a>--%>
                                <%--</div>--%>
                                <%--<div class="product-name">--%>
                                <%--<h4 class="h5">--%>
                                <%--<a href="product-details.html">Tincidunt malesuada</a>--%>
                                <%--</h4>--%>
                                <%--</div>--%>
                                <%--<div class="price-box">--%>
                                <%--<span class="regular-price">$130.00</span>--%>
                                <%--<span class="old-price"><del>$140.00</del></span>--%>
                                <%--</div>--%>
                                <%--</div>--%>
                                <%--</div>--%>
                            </div>
                            <div class="col" id="id_best_seller3">
                                <%--<div class="single-item mb-30">--%>
                                <%--<div class="product-thumb">--%>
                                <%--<a href="product-details.html">--%>
                                <%--<img alt="" src="assets/img/product/product-3.jpg">--%>
                                <%--</a>--%>
                                <%--<div class="quick-view-link">--%>
                                <%--<a data-target="#quick_view" data-toggle="modal" href="#"> <span--%>
                                <%--data-toggle="tooltip" title="Quick view"><i--%>
                                <%--class="ion-ios-eye-outline"></i></span> </a>--%>
                                <%--</div>--%>
                                <%--</div>--%>
                                <%--<div class="product-description">--%>
                                <%--<div class="tag-cate">--%>
                                <%--<a href="product-details.html">fruits</a>--%>
                                <%--</div>--%>
                                <%--<div class="product-name">--%>
                                <%--<h4 class="h5">--%>
                                <%--<a href="product-details.html">100% organic food</a>--%>
                                <%--</h4>--%>
                                <%--</div>--%>
                                <%--<div class="price-box">--%>
                                <%--<span class="regular-price">$99.00</span>--%>
                                <%--<span class="old-price"><del></del></span>--%>
                                <%--</div>--%>
                                <%--</div>--%>
                                <%--</div>--%>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- best sellers area end -->

    <!-- banner statistic area start -->
    <div class="banner-statistics">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="img-container mb-sm-30">
                        <a href="product-details.html">
                            <img alt="banner-image" src="assets/img/banner/banner-1.jpg">
                        </a>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="img-container mb-sm-30">
                        <a href="product-details.html">
                            <img alt="banner-image" src="assets/img/banner/banner-2.jpg">
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- banner statistic area end -->

    <!-- latest news area start -->
    <section class="latest-news-area latest-news-area__style1 fix pt-60 pb-60 pt-sm-30">
        <div class="container-fluid p-0">
            <div class="row no-gutters">
                <div class="col-12">
                    <div class="section-title text-center">
                        <h2>from the blogs</h2>
                    </div>
                </div>
            </div> <!-- end section title -->
            <div class="row no-gutters">
                <div class="col-12">
                    <div class="blog-slider slick-padding">
                        <div class="blog-item">
                            <div class="single-blog-item bg-gray">
                                <div class="blog-img-container">
                                    <a class="blog-img-holder blog-img-holder__1" href="blog-details.html"></a>
                                </div>
                                <div class="post-info">
                                    <div class="post-date">
                                        <i class="ion-ios-calendar-outline"></i>
                                        <span>01 Jan 2019</span>
                                    </div>
                                    <h5 class="post-title"><a href="blog-details.html">post with audio format</a></h5>
                                    <p>Aliquam et metus pharetra, bibendum massa nec, fermentum odio. Nunc id leo
                                        ultrices, mollis ligula in, finibus tortor. Mauris eu dui ut lectus fermentum
                                        eleifend</p>
                                    <a class="read-more" href="blog-details.html">read more</a>
                                </div>
                            </div>
                        </div>
                        <div class="blog-item">
                            <div class="single-blog-item bg-gray">
                                <div class="blog-img-container">
                                    <a class="blog-img-holder blog-img-holder__2" href="blog-details.html"></a>
                                </div>
                                <div class="post-info">
                                    <div class="post-date">
                                        <i class="ion-ios-calendar-outline"></i>
                                        <span>01 Jan 2019</span>
                                    </div>
                                    <h5 class="post-title"><a href="blog-details.html">post with audio format</a></h5>
                                    <p>Aliquam et metus pharetra, bibendum massa nec, fermentum odio. Nunc id leo
                                        ultrices, mollis ligula in, finibus tortor. Mauris eu dui ut lectus fermentum
                                        eleifend</p>
                                    <a class="read-more" href="blog-details.html">read more</a>
                                </div>
                            </div>
                        </div>
                        <div class="blog-item">
                            <div class="single-blog-item bg-gray">
                                <div class="blog-img-container">
                                    <a class="blog-img-holder blog-img-holder__3" href="blog-details.html"></a>
                                </div>
                                <div class="post-info">
                                    <div class="post-date">
                                        <i class="ion-ios-calendar-outline"></i>
                                        <span>01 Jan 2019</span>
                                    </div>
                                    <h5 class="post-title"><a href="blog-details.html">post with audio format</a></h5>
                                    <p>Aliquam et metus pharetra, bibendum massa nec, fermentum odio. Nunc id leo
                                        ultrices, mollis ligula in, finibus tortor. Mauris eu dui ut lectus fermentum
                                        eleifend</p>
                                    <a class="read-more" href="blog-details.html">read more</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- latest news area end -->

    <!-- brand area start -->
    <div class="brand-area">
        <div class="container">
            <div class="brand-inner bdr-top pt-30 pb-30">
                <div class="brand-active slick-padding">
                    <div class="brand-item">
                        <a href="#">
                            <img alt="brand image" src="assets/img/brand/br1.png">
                        </a>
                    </div>
                    <div class="brand-item">
                        <a href="#">
                            <img alt="brand image" src="assets/img/brand/br2.png">
                        </a>
                    </div>
                    <div class="brand-item">
                        <a href="#">
                            <img alt="brand image" src="assets/img/brand/br3.png">
                        </a>
                    </div>
                    <div class="brand-item">
                        <a href="#">
                            <img alt="brand image" src="assets/img/brand/br4.png">
                        </a>
                    </div>
                    <div class="brand-item">
                        <a href="#">
                            <img alt="brand image" src="assets/img/brand/br5.png">
                        </a>
                    </div>
                    <div class="brand-item">
                        <a href="#">
                            <img alt="brand image" src="assets/img/brand/br6.png">
                        </a>
                    </div>
                    <div class="brand-item">
                        <a href="#">
                            <img alt="brand image" src="assets/img/brand/br3.png">
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- brand area end -->

</main>
<!-- main wrapper end -->

<!-- Quick view modal start -->
<div class="modal" id="quick_view">
    <div class="modal-dialog modal-lg modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <button class="close" data-dismiss="modal" type="button">&times;</button>
            </div>
            <div class="modal-body">
                <!-- product details inner end -->
                <div class="product-details-inner">
                    <div class="row">
                        <div class="col-lg-5 col-md-6">
                            <div class="product-large-slider mb-20 slider-arrow-style slider-arrow-style__style-2">
                                <div class="pro-large-img">
                                    <img alt="" src="assets/img/product/product-details-img1.jpg"/>
                                </div>
                                <div class="pro-large-img">
                                    <img alt="" src="assets/img/product/product-details-img2.jpg"/>
                                </div>
                                <div class="pro-large-img">
                                    <img alt="" src="assets/img/product/product-details-img3.jpg"/>
                                </div>
                                <div class="pro-large-img">
                                    <img alt="" src="assets/img/product/product-details-img4.jpg"/>
                                </div>
                            </div>
                            <div class="pro-nav slick-padding_2 slider-arrow-style slider-arrow-style__style-2">
                                <div class="pro-nav-thumb"><img alt=""
                                                                src="assets/img/product/product-details-img1.jpg"/>
                                </div>
                                <div class="pro-nav-thumb"><img alt=""
                                                                src="assets/img/product/product-details-img2.jpg"/>
                                </div>
                                <div class="pro-nav-thumb"><img alt=""
                                                                src="assets/img/product/product-details-img3.jpg"/>
                                </div>
                                <div class="pro-nav-thumb"><img alt=""
                                                                src="assets/img/product/product-details-img4.jpg"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-7 col-md-6">
                            <div class="product-details-des">
                                <div class="product-content-list">
                                    <div class="ratings">
                                        <span><i class="ion-android-star"></i></span>
                                        <span><i class="ion-android-star"></i></span>
                                        <span><i class="ion-android-star"></i></span>
                                        <span><i class="ion-android-star"></i></span>
                                        <span><i class="ion-android-star"></i></span>
                                    </div>
                                    <div class="product-name">
                                        <h4><a href="product-details.html">Organic vegetables</a></h4>
                                    </div>
                                    <div class="price-box">
                                        <span class="regular-price">$160.00</span>
                                        <span class="old-price"><del>$130.00</del></span>
                                    </div>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec
                                        est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare
                                        lectus quis justo gravida semper.</p>
                                    <div class="action-link mb-20">
                                        <a class="add-to-cart" data-toggle="tooltip" href="#" title="Add to cart">add to
                                            cart</a>
                                        <a data-toggle="tooltip" href="#" title="Wishlist"><i
                                                class="ion-android-favorite-outline"></i></a>
                                        <a data-toggle="tooltip" href="#" title="Compare"><i
                                                class="ion-ios-shuffle"></i></a>
                                    </div>
                                    <div class="quantity mb-20">
                                        <div class="pro-qty"><input type="text" value="1"></div>
                                    </div>
                                    <div class="availability mb-20">
                                        <h5>Availability:</h5>
                                        <span>10 in stock</span>
                                    </div>
                                    <div class="share-icon">
                                        <h5>share:</h5>
                                        <a href="#"><i class="fa fa-facebook"></i></a>
                                        <a href="#"><i class="fa fa-twitter"></i></a>
                                        <a href="#"><i class="fa fa-pinterest"></i></a>
                                        <a href="#"><i class="fa fa-google-plus"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- product details inner end -->
            </div>
        </div>
    </div>
</div>
<!-- Quick view modal end -->

<!--== Start Footer Area Wrapper ==-->
<footer class="footer-wrapper">

    <!-- footer main area start -->
    <div class="footer-main-area">
        <div class="container">
            <div class="footer-main-inner bdr-top pt-56 pb-60 pb-md-20 pb-sm-20">
                <div class="row">
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <div class="footer-widget-title">
                                <h4>contact info</h4>
                            </div>
                            <div class="footer-widget-body">
                                <ul class="location-wrap">
                                    <li>
                                        <h6 class="title">location:</h6>
                                        <p>110-114 W George St, City Centre,<br>Glasgow G2 1NF, USA</p>
                                    </li>
                                    <li>
                                        <h6 class="title">call us now:</h6>
                                        <p>+01-23456789<br>+01-23456789</p>
                                    </li>
                                    <li>
                                        <h6 class="title">email:</h6>
                                        <p><a href="#">info@yourdomain.com</a><br><a href="#">support@yourdomain.com</a>
                                        </p>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <div class="footer-widget-title">
                                <h4>new arrivals</h4>
                            </div>
                            <div class="footer-widget-body">
                                <ul class="category-list">
                                    <li>
                                        <div class="single-item single-item__footer-category">
                                            <div class="product-thumb">
                                                <a href="product-details.html">
                                                    <img alt="" src="assets/img/product/product-2.jpg">
                                                </a>
                                            </div>
                                            <div class="product-description">
                                                <div class="product-name">
                                                    <h4 class="h5">
                                                        <a href="product-details.html">natural berrie</a>
                                                    </h4>
                                                </div>
                                                <div class="price-box">
                                                    <span class="regular-price">$99.00</span>
                                                    <span class="old-price"><del></del></span>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="single-item single-item__footer-category">
                                            <div class="product-thumb">
                                                <a href="product-details.html">
                                                    <img alt="" src="assets/img/product/product-3.jpg">
                                                </a>
                                            </div>
                                            <div class="product-description">
                                                <div class="product-name">
                                                    <h4 class="h5">
                                                        <a href="product-details.html">organic juice</a>
                                                    </h4>
                                                </div>
                                                <div class="price-box">
                                                    <span class="regular-price">$99.00</span>
                                                    <span class="old-price"><del></del></span>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="single-item single-item__footer-category">
                                            <div class="product-thumb">
                                                <a href="product-details.html">
                                                    <img alt="" src="assets/img/product/product-4.jpg">
                                                </a>
                                            </div>
                                            <div class="product-description">
                                                <div class="product-name">
                                                    <h4 class="h5">
                                                        <a href="product-details.html">organic food</a>
                                                    </h4>
                                                </div>
                                                <div class="price-box">
                                                    <span class="regular-price">$99.00</span>
                                                    <span class="old-price"><del></del></span>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <div class="footer-widget-title">
                                <h4>top rated product</h4>
                            </div>
                            <div class="footer-widget-body">
                                <ul class="category-list">
                                    <li>
                                        <div class="single-item single-item__footer-category">
                                            <div class="product-thumb">
                                                <a href="product-details.html">
                                                    <img alt="" src="assets/img/product/product-12.jpg">
                                                </a>
                                            </div>
                                            <div class="product-description">
                                                <div class="product-name">
                                                    <h4 class="h5">
                                                        <a href="product-details.html">natural berrie</a>
                                                    </h4>
                                                </div>
                                                <div class="price-box">
                                                    <span class="regular-price">$99.00</span>
                                                    <span class="old-price"><del></del></span>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="single-item single-item__footer-category">
                                            <div class="product-thumb">
                                                <a href="product-details.html">
                                                    <img alt="" src="assets/img/product/product-13.jpg">
                                                </a>
                                            </div>
                                            <div class="product-description">
                                                <div class="product-name">
                                                    <h4 class="h5">
                                                        <a href="product-details.html">organic juice</a>
                                                    </h4>
                                                </div>
                                                <div class="price-box">
                                                    <span class="regular-price">$99.00</span>
                                                    <span class="old-price"><del></del></span>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="single-item single-item__footer-category">
                                            <div class="product-thumb">
                                                <a href="product-details.html">
                                                    <img alt="" src="assets/img/product/product-14.jpg">
                                                </a>
                                            </div>
                                            <div class="product-description">
                                                <div class="product-name">
                                                    <h4 class="h5">
                                                        <a href="product-details.html">organic food</a>
                                                    </h4>
                                                </div>
                                                <div class="price-box">
                                                    <span class="regular-price">$99.00</span>
                                                    <span class="old-price"><del></del></span>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-widget">
                            <div class="footer-widget-title">
                                <h4>newsletter</h4>
                            </div>
                            <div class="footer-widget-body">
                                <div class="newsletter-desc">
                                    <p>Subscribe to the Kavir mailing list to receive updates on new arrivals, special
                                        offers and other discount information.</p>
                                    <form id="mc-form">
                                        <input autocomplete="off" id="mc-email" placeholder="Your email address"
                                               type="email">
                                        <button id="mc-submit"><i class="ion-paper-airplane"></i>subscribe</button>
                                    </form>
                                    <!-- mailchimp-alerts Start -->
                                    <div class="mailchimp-alerts">
                                        <div class="mailchimp-submitting"></div><!-- mailchimp-submitting end -->
                                        <div class="mailchimp-success"></div><!-- mailchimp-success end -->
                                        <div class="mailchimp-error"></div><!-- mailchimp-error end -->
                                    </div>
                                    <!-- mailchimp-alerts end -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- footer main area end -->

    <!-- footer bottom area start -->
    <div class="footer-bootom bg-gray pt-20 pb-20">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="copyright-text text-center text-md-left">
                        <p>Copyright 2019 <a href="http://www.17sucai.com/">Selena</a>. All Rights Reserved</p>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="payment-method text-md-right text-center">
                        <img alt="" src="assets/img/payment.png">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- footer bottom area end -->

</footer>
<!--== End Footer Area Wrapper ==-->

<!-- Scroll to top start -->
<div class="scroll-top not-visible">
    <i class="fa fa-angle-up"></i>
</div>
<!-- Scroll to Top End -->

<!--=======================Javascript============================-->
<script src="assets/js/jquery-1.10.2.min.js" type="text/javascript"></script>
<!--=== All Vendor Js ===-->
<script src="assets/js/vendor.js"></script>
<!--=== index Js ===-->
<script src="assets/js/index.js"></script>
<!--=== All Plugins Js ===-->
<script src="assets/js/plugins.js"></script>
<!--=== Active Js ===-->
<script src="assets/js/active.js"></script>
</body>
</html>
