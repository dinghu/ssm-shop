<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--shiro标签--%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<header class="header-area">
    <!-- header top start -->
    <div class="header-top">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-3">
                    <div class="logo">
                        <a href="index.jsp">
                            <img alt="Brand Logo" src="assets/img/logo/logo.png">
                        </a>
                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="header-settings-area">
                        <div class="header-top-left">
                            <nav>
                                <ul class="d-flex justify-content-center">
                                    <li>
                                        <div class="dropdown header-top-dropdown">
                                            <a aria-expanded="false" aria-haspopup="true" class="dropdown-toggle"
                                               data-toggle="dropdown" id="myaccount">
                                                my account
                                                <i class="fa fa-angle-down"></i>
                                            </a>
                                            <div aria-labelledby="myaccount" class="dropdown-menu" id="login-menu">

                                            </div>
                                        </div>
                                    </li>
                                    <%--<li>--%>
                                        <%--<div class="dropdown header-top-dropdown">--%>
                                            <%--<span>Language:</span>--%>
                                            <%--<a aria-expanded="false" aria-haspopup="true" class="dropdown-toggle"--%>
                                               <%--data-toggle="dropdown" id="language">--%>
                                                <%--English--%>
                                                <%--<i class="fa fa-angle-down"></i>--%>
                                            <%--</a>--%>
                                            <%--<div aria-labelledby="language" class="dropdown-menu">--%>
                                                <%--<a class="dropdown-item" href="#">English</a>--%>
                                                <%--<a class="dropdown-item" href="#">Français</a>--%>
                                                <%--<a class="dropdown-item" href="#">Germany</a>--%>
                                            <%--</div>--%>
                                        <%--</div>--%>
                                    <%--</li>--%>
                                </ul>
                            </nav>
                        </div>
                        <div class="header-top-right">
                            <div class="header-search-box">
                                <form>
                                    <input placeholder="Search Here" type="text">
                                    <button><i class="ion-ios-search-strong"></i></button>
                                </form>
                            </div>
                            <div class="mini-cart-wrap">
                                <button><i class="ion-bag"></i>
                                    <span class="notification">2</span>
                                </button>
                                <ul class="cart-list">
                                    <li>
                                        <div class="cart-img">
                                            <a href="product-details.html"><img alt=""
                                                                                src="assets/img/cart/cart-1.jpg"></a>
                                        </div>
                                        <div class="cart-info">
                                            <h4><a href="product-details.html">simple product</a></h4>
                                            <span class="cart-qty">Qty: 1</span>
                                            <span>$60.00</span>
                                        </div>
                                        <div class="del-icon">
                                            <i class="fa fa-times"></i>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="cart-img">
                                            <a href="product-details.html"><img alt=""
                                                                                src="assets/img/cart/cart-2.jpg"></a>
                                        </div>
                                        <div class="cart-info">
                                            <h4><a href="product-details.html">virtual product</a></h4>
                                            <span class="cart-qty">Qty: 2</span>
                                            <span>$100.00</span>
                                        </div>
                                        <div class="del-icon">
                                            <i class="fa fa-times"></i>
                                        </div>
                                    </li>
                                    <li class="mini-cart-price">
                                        <span class="subtotal">subtotal : </span>
                                        <span class="subtotal-price ml-auto">$110.00</span>
                                    </li>
                                    <li class="checkout-btn">
                                        <a href="#">View Cart</a>
                                    </li>
                                    <li class="checkout-btn">
                                        <a href="#">checkout</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- header top end -->

    <!-- main menu start -->
    <div class="main-menu-area sticky">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="main-menu">
                        <div class="sticky-logo">
                            <a href="index.jsp">
                                <img alt="brand logo" src="assets/img/logo/logo_sticky.png">
                            </a>
                        </div>
                        <!-- main menu navbar start -->
                        <nav id="mobile-menu">
                            <ul>
                                <li class="active"><a href="index.jsp">Home</a></li>
                                <li><a href="shop.jsp">Shop</a></li>
                                <li><a href="about-us.jsp">about us</a></li>
                                <li><a href="contact-us.jsp">Contact</a></li>
                            </ul>
                        </nav>
                        <!-- main menu navbar end -->
                    </div>
                </div>
                <div class="col-12 d-block d-lg-none">
                    <div class="mobile-menu"></div>
                </div>
            </div>
        </div>
    </div>
    <!-- main menu end -->

</header>

<script src="assets/js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script>
    $(function(){
        var username = localStorage.getItem("username");
        var loginmenu = $("#loginmenu");
        var loginoutmenu = $("#loginoutmenu");
        var myaccount = $("#myaccount");
        var loginmenu = $("#login-menu");
        //登陆信息
        if (username != null && username != "") {
            loginmenu.find("a").remove();
            loginmenu.append("  <a class=\"dropdown-item\" href=\"user/logout\">退出登陆</a>");
            myaccount.html("您好," + username + " <i class=\"fa fa-angle-down\"></i>");
        } else {
            loginmenu.find("a").remove();
            loginmenu.append("<a class=\"dropdown-item\" href=\"login.html\">登陆</a>");
            loginmenu.append("<a class=\"dropdown-item\" href=\"login.html\">注册</a>");
            myaccount.html("您好,请登陆" + +" <i class=\"fa fa-angle-down\"></i>");
        }
    });
</script>