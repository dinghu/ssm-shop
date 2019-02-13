<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<!DOCTYPE html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="meta description">
    <title>Selena - Organic eCommerce Bootstrap 4 Template</title>

    <!--=== Favicon ===-->
    <link rel="shortcut icon" href="assets/img/favicon.ico" type="image/x-icon"/>

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
    <!-- page main wrapper start -->
    <div class="shop-main-wrapper pt-60 pb-60">
        <div class="container">
            <div class="row">
                <!-- sidebar area start -->
                <div class="col-lg-3 order-2 order-lg-1">
                    <div class="sidebar-wrapper mt-md-60 mt-sm-60">
                        <!-- single sidebar start -->
                        <div class="sidebar-single">
                            <div class="sidebar-title">
                                <h3>categories</h3>
                            </div>
                            <div class="sidebar-body">
                                <ul class="sidebar-category">
                                    <li><a href="#">accessories</a>
                                        <ul class="children">
                                            <li><a href="#">skateboard</a></li>
                                            <li><a href="#">surfboard</a></li>
                                            <li><a href="#">accessories</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">fruits</a>
                                        <ul class="children">
                                            <li><a href="#">Samsome</a></li>
                                            <li><a href="#">GL Stylus</a></li>
                                            <li><a href="#">Uawei</a></li>
                                            <li><a href="#">Cherry Berry</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">juice</a>
                                        <ul class="children">
                                            <li><a href="#">Power Bank</a></li>
                                            <li><a href="#">Data Cable</a></li>
                                            <li><a href="#">Power Cable</a></li>
                                            <li><a href="#">Battery</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">meats</a>
                                        <ul class="children">
                                            <li><a href="#">Desktop Headphone</a></li>
                                            <li><a href="#">Mobile Headphone</a></li>
                                            <li><a href="#">Wireless Headphone</a></li>
                                            <li><a href="#">LED Headphone</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">vegetables</a>
                                        <ul class="children">
                                            <li><a href="#">Desktop Headphone</a></li>
                                            <li><a href="#">Mobile Headphone</a></li>
                                            <li><a href="#">Wireless Headphone</a></li>
                                            <li><a href="#">LED Headphone</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <!-- single sidebar end -->
                        <!-- single sidebar start -->
                        <div class="sidebar-single">
                            <div class="sidebar-title">
                                <h3>filter by price</h3>
                            </div>
                            <div class="sidebar-body">
                                <div class="price-range-wrap">
                                    <div class="price-range" data-min="20" data-max="400"></div>
                                    <div class="range-slider">
                                        <form action="#">
                                            <div class="price-input">
                                                <label for="amount">Price: </label>
                                                <input type="text" id="amount">
                                            </div>
                                            <button class="filter-btn">filter</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- single sidebar end -->
                        <!-- single sidebar start -->
                        <div class="sidebar-single">
                            <div class="sidebar-title">
                                <h3>color</h3>
                            </div>
                            <div class="sidebar-body">
                                <ul class="color-list">
                                    <li><a href="#">gold</a><span>(5)</span></li>
                                    <li><a href="#">green</a><span>(6)</span></li>
                                    <li><a href="#">blue</a><span>(2)</span></li>
                                    <li><a href="#">white</a><span>(1)</span></li>
                                    <li><a href="#">red</a><span>(4)</span></li>
                                </ul>
                            </div>
                        </div>
                        <!-- single sidebar end -->
                        <!-- single sidebar start -->
                        <div class="sidebar-single">
                            <div class="sidebar-title">
                                <h3>size</h3>
                            </div>
                            <div class="sidebar-body">
                                <ul class="size-list">
                                    <li><a href="#">L</a><span>(5)</span></li>
                                    <li><a href="#">M</a><span>(6)</span></li>
                                    <li><a href="#">S</a><span>(2)</span></li>
                                    <li><a href="#">XL</a><span>(1)</span></li>
                                </ul>
                            </div>
                        </div>
                        <!-- single sidebar end -->
                        <!-- single sidebar start -->
                        <div class="sidebar-single">
                            <div class="sidebar-banner">
                                <a href="#">
                                    <img src="assets/img/banner/banner_left.jpg" alt="">
                                </a>
                            </div>
                        </div>
                        <!-- single sidebar end -->
                    </div>
                </div>
                <!-- sidebar area end -->
                <!-- shop main wrapper start -->
                <div class="col-lg-9 order-1 order-lg-2">
                    <div class="shop-product-wrapper">
                        <!-- shop product top wrap start -->
                        <div class="shop-top-bar">
                            <div class="row">
                                <div class="col-xl-5 col-lg-4 col-md-3 order-2 order-md-1">
                                    <div class="top-bar-left">
                                        <div class="product-view-mode">
                                            <a class="active" href="#" data-target="grid-view"><i class="fa fa-th"></i></a>
                                            <a href="#" data-target="list-view"><i class="fa fa-list"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-7 col-lg-8 col-md-9 order-1 order-md-2">
                                    <div class="top-bar-right">
                                        <div class="product-short">
                                            <p>Sort By : </p>
                                            <select class="nice-select" name="sortby">
                                                <option value="trending">Relevance</option>
                                                <option value="sales">Name (A - Z)</option>
                                                <option value="sales">Name (Z - A)</option>
                                                <option value="rating">Price (Low &gt; High)</option>
                                                <option value="date">Rating (Lowest)</option>
                                                <option value="price-asc">Model (A - Z)</option>
                                                <option value="price-asc">Model (Z - A)</option>
                                            </select>
                                        </div>
                                        <div class="product-amount">
                                            <p>Showing 1–16 of 21 results</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- shop product top wrap start -->

                        <!-- product item list start -->
                        <div class="shop-product-wrap grid-view row">
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-1.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-1.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-2.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-2.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-3.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-3.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-4.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-4.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-5.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-5.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-6.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-6.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-7.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-7.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-8.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-8.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-9.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-9.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-10.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-10.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-11.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-11.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <!-- product grid item start -->
                                <div class="product-item mb-50">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-12.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content text-center">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4 class="h5">
                                                <a href="product-details.html">Condimentum food</a>
                                            </h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$110.00</span>
                                            <span class="old-price"><del></del></span>
                                        </div>
                                        <div class="product-action-link">
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Add to cart"><i
                                                    class="ion-bag"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product grid item end -->
                                <!-- product list item start -->
                                <div class="product-list-item mb-30">
                                    <div class="product-thumb">
                                        <a href="product-details.html">
                                            <img src="assets/img/product/product-12.jpg" alt="">
                                        </a>
                                        <div class="quick-view-link">
                                            <a href="#" data-toggle="modal" data-target="#quick_view"> <span
                                                    data-toggle="tooltip" title="Quick view"><i
                                                    class="ion-ios-eye-outline"></i></span> </a>
                                        </div>
                                    </div>
                                    <div class="product-content-list">
                                        <div class="ratings">
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                            <span><i class="ion-android-star"></i></span>
                                        </div>
                                        <div class="product-name">
                                            <h4><a href="product-details.html">Condimentum organic vegetables</a></h4>
                                        </div>
                                        <div class="price-box">
                                            <span class="regular-price">$160.00</span>
                                            <span class="old-price"><del>$130.00</del></span>
                                        </div>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere metus
                                            vitae arcu imperdiet, id aliquet ante scelerisque. Sed sit amet sem vitae
                                            urna fringilla tempus.</p>
                                        <div class="action-link">
                                            <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add
                                                to cart</a>
                                            <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                    class="ion-android-favorite-outline"></i></a>
                                            <a href="#" data-toggle="tooltip" title="Compare"><i
                                                    class="ion-ios-shuffle"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <!-- product list item start -->
                            </div>
                        </div>
                        <!-- product item list end -->

                        <!-- start pagination area -->
                        <div class="paginatoin-area text-center mt-30">
                            <ul class="pagination-box">
                                <li><a class="Previous" href="#"><i class="ion-ios-arrow-left"></i></a></li>
                                <li class="active"><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a class="Next" href="#"><i class="ion-ios-arrow-right"></i></a></li>
                            </ul>
                        </div>
                        <!-- end pagination area -->
                    </div>
                </div>
                <!-- shop main wrapper end -->
            </div>
        </div>
    </div>
    <!-- page main wrapper end -->
</main>
<!-- main wrapper end -->

<!-- Quick view modal start -->
<div class="modal" id="quick_view">
    <div class="modal-dialog modal-lg modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>
            <div class="modal-body">
                <!-- product details inner end -->
                <div class="product-details-inner">
                    <div class="row">
                        <div class="col-lg-5 col-md-6">
                            <div class="product-large-slider mb-20 slider-arrow-style slider-arrow-style__style-2">
                                <div class="pro-large-img">
                                    <img src="assets/img/product/product-details-img1.jpg" alt=""/>
                                </div>
                                <div class="pro-large-img">
                                    <img src="assets/img/product/product-details-img2.jpg" alt=""/>
                                </div>
                                <div class="pro-large-img">
                                    <img src="assets/img/product/product-details-img3.jpg" alt=""/>
                                </div>
                                <div class="pro-large-img">
                                    <img src="assets/img/product/product-details-img4.jpg" alt=""/>
                                </div>
                            </div>
                            <div class="pro-nav slick-padding_2 slider-arrow-style slider-arrow-style__style-2">
                                <div class="pro-nav-thumb"><img src="assets/img/product/product-details-img1.jpg"
                                                                alt=""/></div>
                                <div class="pro-nav-thumb"><img src="assets/img/product/product-details-img2.jpg"
                                                                alt=""/></div>
                                <div class="pro-nav-thumb"><img src="assets/img/product/product-details-img3.jpg"
                                                                alt=""/></div>
                                <div class="pro-nav-thumb"><img src="assets/img/product/product-details-img4.jpg"
                                                                alt=""/></div>
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
                                        <a href="#" data-toggle="tooltip" title="Add to cart" class="add-to-cart">add to
                                            cart</a>
                                        <a href="#" data-toggle="tooltip" title="Wishlist"><i
                                                class="ion-android-favorite-outline"></i></a>
                                        <a href="#" data-toggle="tooltip" title="Compare"><i
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
                                                    <img src="assets/img/product/product-2.jpg" alt="">
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
                                                    <img src="assets/img/product/product-3.jpg" alt="">
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
                                                    <img src="assets/img/product/product-4.jpg" alt="">
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
                                                    <img src="assets/img/product/product-12.jpg" alt="">
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
                                                    <img src="assets/img/product/product-13.jpg" alt="">
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
                                                    <img src="assets/img/product/product-14.jpg" alt="">
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
                                        <input type="email" id="mc-email" autocomplete="off"
                                               placeholder="Your email address">
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
                        <img src="assets/img/payment.png" alt="">
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
<!--=== All Vendor Js ===-->
<script src="assets/js/vendor.js"></script>
<!--=== All Plugins Js ===-->
<script src="assets/js/plugins.js"></script>
<!--=== Active Js ===-->
<script src="assets/js/active.js"></script>
</body>
</html>
