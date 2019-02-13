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
    <!-- contact area start -->
    <div class="contact-area">
        <div class="container-fluid p-0">
            <div class="row no-gutters">
                <div class="col-lg-6">
                    <div class="contact-message pt-56 pb-60">
                        <h2>tell us your project</h2>
                        <form id="contact-form" action="assets/php/mail.php" method="post" class="contact-form">
                            <div class="row">
                                <div class="col-lg-6 col-md-6 col-sm-6">
                                    <input name="first_name" placeholder="Name *" type="text" required>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6">
                                    <input name="phone" placeholder="Phone *" type="text" required>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6">
                                    <input name="email_address" placeholder="Email *" type="text" required>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6">
                                    <input name="contact_subject" placeholder="Subject *" type="text">
                                </div>
                                <div class="col-12">
                                    <div class="contact2-textarea text-center">
                                        <textarea placeholder="Message *" name="message" class="form-control2"
                                                  required=""></textarea>
                                    </div>
                                    <div class="contact-btn">
                                        <button class="btn btn__bg btn__sqr" type="submit">Send Message</button>
                                    </div>
                                </div>
                                <div class="col-12 d-flex justify-content-center">
                                    <p class="form-messege"></p>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="contact-info bg-gray pt-56 pb-md-46 mb-sm-24">
                        <h2>contact us</h2>
                        <p>Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum
                            est notare quam littera gothica, quam nunc putamus parum claram anteposuerit litterarum
                            formas human.</p>
                        <ul>
                            <li><i class="fa fa-fax"></i> Address : No 40 Baria Sreet 133/2 NewYork City</li>
                            <li><i class="fa fa-phone"></i> info@yourdomain.com</li>
                            <li><i class="fa fa-envelope-o"></i> +88013245657</li>
                        </ul>
                        <div class="working-time">
                            <h3>Working hours</h3>
                            <p><span>Monday – Saturday:</span>08AM – 22PM</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- contact area end -->

    <!-- map area start -->
    <div class="map-area-wrapper">
        <div id="map_content" data-lat="23.763491" data-lng="90.431167" data-zoom="8" data-maptitle="HasTech"
             data-mapaddress="Floor# 4,           House# 5, Block# C </br> Banasree Main Rd, Dhaka">
        </div>
    </div>
    <!-- map area end -->
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
<!--=== All Vendor Js ===-->
<script src="assets/js/vendor.js"></script>
<!--=== All Plugins Js ===-->
<script src="assets/js/plugins.js"></script>
<!--=== Active Js ===-->
<script src="assets/js/active.js"></script>
</body>
</html>
