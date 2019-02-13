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
    <!-- breadcrumb area start -->
    <div class="breadcrumb-area">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="breadcrumb-wrap text-center">
                        <nav aria-label="breadcrumb">
                            <h2>shop</h2>
                            <ul class="breadcrumb">
                                <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                                <li class="breadcrumb-item active" aria-current="page">login-register</li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- breadcrumb area end -->

    <!-- login register wrapper start -->
    <div class="login-register-wrapper pt-60 pb-60">
        <div class="container">
            <div class="member-area-from-wrap">
                <div class="row">
                    <!-- Login Content Start -->
                    <div class="col-lg-6">
                        <div class="login-reg-form-wrap  pr-lg-50">
                            <h2>登录</h2>
                            <form id="loginForm">
                                <div class="single-input-item">
                                    <input type="text" name="username" id="loginInputUsername" placeholder="账号/手机号"
                                           required/>
                                </div>
                                <div class="single-input-item">
                                    <input type="password" name="password" id="loginInputPassword" placeholder="请输入密码"
                                           required/>
                                </div>
                                <div class="single-input-item">
                                    <div class="login-reg-form-meta d-flex align-items-center justify-content-between">
                                        <div class="remember-meta">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="rememberMe">
                                                <label class="custom-control-label" for="rememberMe">Remember Me</label>
                                            </div>
                                        </div>
                                        <a href="#" class="forget-pwd">Forget Password?</a>
                                    </div>
                                </div>

                                <span id="login-error" style="margin-top: 10px"></span>
                            </form>

                            <div class="single-input-item">
                                <button class="btn btn__bg btn__sqr" id="loginButton">Login</button>
                            </div>
                        </div>
                    </div>
                    <!-- Login Content End -->

                    <!-- Register Content Start -->
                    <div class="col-lg-6">
                        <div class="login-reg-form-wrap mt-md-60 mt-sm-60">
                            <h2>注册</h2>
                            <form id="registerForm">
                                <div class="single-input-item">
                                    <input type="text" name="username" placeholder="帐户名" id="registerInputUsername"
                                           required/>
                                </div>
                                <div class="single-input-item">
                                    <input type="phone" name="phone" placeholder="请输入手机号" id="registerInputPhone"
                                           required/>
                                </div>
                                <div class="row">
                                    <div class="col-lg-6">
                                        <div class="single-input-item">
                                            <input type="password" name="password" placeholder="请输入密码"
                                                   id="registerInputPassword" required/>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="single-input-item">
                                            <input type="password" placeholder="请再次输入密码"
                                                   id="registerInputPasswordConfirm" required/>
                                        </div>
                                    </div>
                                </div>
                                <div class="single-input-item">
                                    <div class="login-reg-form-meta">
                                        <div class="remember-meta">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="subnewsletter">
                                                <label class="custom-control-label" for="subnewsletter">Subscribe Our
                                                    Newsletter</label>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <span id="regi-error" style="margin-top: 10px"></span>
                            </form>
                            <div class="single-input-item">
                                <button class="btn btn__bg btn__sqr" id="registerButton">注册</button>
                            </div>
                        </div>
                    </div>
                    <!-- Register Content End -->
                </div>
            </div>
        </div>
    </div>
    <!-- login register wrapper end -->
</main>
<!-- main wrapper end -->

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
<script type="text/javascript" src="assets/js/jquery-1.10.2.min.js"></script>
<script>

    $(function () {
        /* 注册处理 */
        var registerButton = $("#registerButton");
        var registerForm = $("#registerForm");
        var registerInputUsername = $("#registerInputUsername");
        var registerInputPhone = $("#registerInputPhone");
        var registerInputPassword = $("#registerInputPassword");
        var registerInputPasswordConfirm = $("#registerInputPasswordConfirm");
        // /*	注册校验*/
        // registerInputUsername.blur(function () {
        //     var value = $(this).val();
        //     if (value.length() < 1 || value.length() > 10) {
        //         $("#regi-username-error").text("用户名长度须在1-10个字符");
        //     } else {
        //         $("#regi-username-error").text("");
        //     }
        // });
        // registerInputPassword.blur(function () {
        //     var value = $(this).val();
        //     if (!/[a-zA-Z0-9]{6,10}/.test(value)) {
        //         $("#regi-password-error").text("密码长度须在6-20个字符");
        //     } else {
        //         $("#regi-password-error").text("");
        //     }
        // });

        /* 注册处理 */
        registerButton.on("click", function () {
            var form = new FormData();
            form.append("username", registerInputUsername.val());
            form.append("phone", registerInputPhone.val());
            form.append("password", registerInputPassword.val());
            $.ajax({
                url: "user/regist",
                type: "post",
                data: form,
                processData: false,
                contentType: false,
                success: function (response) {
                    var rep = $.parseJSON(response);
                    if (rep.code == 0) {
                        registerInputUsername.val("");
                        registerInputPhone.val("");
                        registerInputPassword.val("");
                        registerInputPasswordConfirm.val("");
                        $("#regi-error").text("");
                    } else {
                        $("#regi-error").text("注册失败");
                    }
                }
            });
        });


        /* 登录 */
        var loginButton = $("#loginButton");
        var loginForm = $("#loginForm");
        var loginInputUsername = $("#loginInputUsername");
        var loginInputPassword = $("#loginInputPassword");

        /* 登录处理 */
        loginButton.on("click", function () {
            var form = new FormData();
            form.append("username", loginInputUsername.val());
            form.append("password", loginInputPassword.val());
            $.ajax({
                url: "user/login",
                type: "post",
                data: form,
                processData: false,
                contentType: false,
                error: function (e) {
                    var ret = JSON.parse(e.responseText); //可以将json字符串转换成json对象
                    $("#login-password-error").text(ret.error);
                },
                success: function (response) {
                    var rep = $.parseJSON(response);
                    if (rep.code == 0) {
                        localStorage.setItem("userId", rep.user.id);
                        localStorage.setItem("username", rep.user.username);
                        localStorage.setItem("avatar", rep.user.avatar);
                        // localStorage.setItem("simpleDesc", response.data.userInfo.simpleDesc);
                        $("#login-error").text("");
                        window.location.href = "index.jsp";
                    } else {
                        $("#login-error").text(rep.message);
                    }
                }
            });
        });
    });

</script>

<!--=== All Vendor Js ===-->
<script src="assets/js/vendor.js"></script>
<!--=== All Plugins Js ===-->
<script src="assets/js/plugins.js"></script>
<!--=== Active Js ===-->
<script src="assets/js/active.js"></script>
</body>
</html>
