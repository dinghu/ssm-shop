$(function () {

    var populaCategoryDiv = $("#id-popular-category");
    var ourProductDiv = $("#id-our-product");
    var productTabbar = $("#id_product_tab");
    var chooseUsDiv = $("#choose-us");
    var bannerDiv = $("#id_banner");
    var bannerDiv1 = $("#id_banner_1");
    var bannerDiv2 = $("#id_banner_2");
    var bestSellerDiv = $("#id_best_seller");
    var bestSellerDiv1 = $("#id_best_seller1");
    var bestSellerDiv2 = $("#id_best_seller2");
    var bestSellerDiv3 = $("#id_best_seller3");


    //获取流行分类
    var getPopularcategories = function () {
        $.ajax({
            url: "shopCategory/getPopularCategory",
            type: "get",
            processData: false,
            contentType: false,
            success: function (response) {
                var rep = $.parseJSON(response);
                var popularCategories = rep.popularCategory;
                for (var i in  popularCategories) {
                    var picIndex = parseInt(i) + 1;
                    var chileElement = "<div class=\"col-lg-3 col-md-6 col-sm-6\">\n" +
                        "            <div class=\"category-single-item mb-md-30 mb-sm-30\">\n" +
                        "            <div class=\"category-item-inner color" +
                        picIndex +
                        " text-center\">\n" +
                        "            <div class=\"category-content\">\n" +
                        "            <h3><a href=\"product-details.html\">" +
                        popularCategories[i].name +
                        "</a></h3>\n" +
                        "        <p>" +
                        popularCategories[i].showIndex + " product" +
                        "</p>\n" +
                        "        </div>\n" +
                        "        <div class=\"category-thumb\">\n" +
                        "            <a href=\"product-details.html\">\n" +
                        "            <img src=\"assets/img/category/cat-" +
                        picIndex +
                        ".png\" alt=\"\">\n" +
                        "            </a>\n" +
                        "            </div>\n" +
                        "            </div>\n" +
                        "            </div>\n" +
                        "            </div>"
                    populaCategoryDiv.append(chileElement);
                }
            }
        });
    }

    //获取ourproduct栏目
    //获取流行分类
    var getOurProduct = function () {
        $.ajax({
            url: "shouye/getOurProducts",
            type: "get",
            processData: false,
            contentType: false,
            success: function (response) {
                var rep = $.parseJSON(response);
                var ourProducts = rep.ourProducts;
                var categoryNum = ourProducts.length;


                for (var i in  ourProducts) {
                    var category = ourProducts[i].category;
                    var products = ourProducts[i].products;
                    var id_tab_row = "tab_" + category.id + "_row";
                    var id_tab = "tab_" + category.id;
                    //添加tab title
                    var productTabbarHtml = "<li>\n" +
                        "                    <a data-toggle=\"tab\" href=\"#" + id_tab + "\">" + category.name + "</a>\n" +
                        "                    </li>";
                    productTabbar.append(productTabbarHtml);

                    //添加tab pane
                    var productTabPane = " <div class=\"tab-pane fade\" id=\"" + id_tab + "\">\n" + " " +
                        "                        <div class=\"product-tab-wrapper\">\n" +
                        "                        <div class=\"row\" id=\"" + id_tab_row + "\">\n" +
                        "                        </div>\n" +
                        "                        </div>\n" +
                        "                        </div>";
                    ourProductDiv.append(productTabPane);
                    for (var k in  products) {
                        var product = products[k];
                        var productRowItemHtml = "<div class=\"col-lg-3 col-md-4 col-sm-6\">\n" +
                            "                            <div class=\"product-item mb-50\">\n" +
                            "                            <div class=\"product-thumb\">\n" +
                            "                            <a href=\"product-details.html\">\n" +
                            "                            <img alt=\"\" src=\"" + product.primaryPicUrl + "\">\n" +
                            "                            </a>\n" +
                            "                            <div class=\"quick-view-link\">\n" +
                            "                            <a data-target=\"#quick_view\" data-toggle=\"modal\" href=\"#\"> <span\n" +
                            "                        data-toggle=\"tooltip\" title=\"Quick view\"><i\n" +
                            "                    class=\"ion-ios-eye-outline\"></i></span> </a>\n" +
                            "                        </div>\n" +
                            "                        </div>\n" +
                            "                        <div class=\"product-content text-center\">\n" +
                            "                            <div class=\"ratings\">\n" +
                            "                            <span><i class=\"ion-android-star\"></i></span>\n" +
                            "                        <span><i class=\"ion-android-star\"></i></span>\n" +
                            "                        <span><i class=\"ion-android-star\"></i></span>\n" +
                            "                        <span><i class=\"ion-android-star\"></i></span>\n" +
                            "                        <span><i class=\"ion-android-star\"></i></span>\n" +
                            "                        </div>\n" +
                            "                        <div class=\"product-name\" style='overflow: hidden'>\n" +
                            "                            <h4 class=\"h5\">\n" +
                            "                            <a href=\"product-details.html\">" + product.name + "</a>\n" +
                            "                        </h4>\n" +
                            "                        </div>\n" +
                            "                        <div class=\"price-box\">\n" +
                            "                            <span class=\"regular-price\"> " + "￥ " + product.retailPrice + "</span>\n" +
                            "                        <span class=\"old-price\"><del></del></span>\n" +
                            "                        </div>\n" +
                            "                        <div class=\"product-action-link\">\n" +
                            "                            <a data-toggle=\"tooltip\" href=\"#\" title=\"Wishlist\"><i\n" +
                            "                    class=\"ion-android-favorite-outline\"></i></a>\n" +
                            "                        <a data-toggle=\"tooltip\" href=\"#\" title=\"Add to cart\"><i\n" +
                            "                    class=\"ion-bag\"></i></a>\n" +
                            "                        <a data-toggle=\"tooltip\" href=\"#\" title=\"Compare\"><i\n" +
                            "                    class=\"ion-ios-shuffle\"></i></a>\n" +
                            "                        </div>\n" +
                            "                        </div>\n" +
                            "                        </div>\n" +
                            "                        </div>";
                        var ourProductRowDiv = $("#" + id_tab_row);
                        ourProductRowDiv.append(productRowItemHtml);
                    }

                }
                //默认选中第一个
                var firstli = $("#id_product_tab li:first a");
                firstli.click();
            }
        });
    }
    //获取首页
    var getAll = function () {
        $.ajax({
            url: "shouye/getAll",
            type: "get",
            processData: false,
            contentType: false,
            success: function (response) {
                var rep = $.parseJSON(response);
                var advantages = rep.advantages;
                var adviseList = rep.adviseList;
                var bannerList = rep.bannerList;
                var bestSellers = rep.bestSellers;

                //banner
                for (var i in  bannerList) {
                    var title = bannerList[i].name;
                    var content = bannerList[i].content;
                    var imageUrl = bannerList[i].imageUrl;

                    var bannerHtml = "                <div class=\"container\">\n" +
                        "                    <div class=\"row\">\n" +
                        "                        <div class=\"col-12\">\n" +
                        "                            <div class=\"content-inner\">\n" +
                        "                                <div class=\"slider-content\">\n" + "<h1>" + title + "</h1>\n" +
                        "                                    <p>" + content + "</p>\n" +
                        "                                    <a class=\"btn\" href=\"shop.html\">shop now</a>\n" +
                        "                                </div>\n" +
                        "                                <div class=\"slider-img\">\n" +
                        "                                    <img alt=\"\" src=\"" + imageUrl + "\">\n" +
                        "                                </div>\n" +
                        "                            </div>\n" +
                        "                        </div>\n" +
                        "                    </div>\n" +
                        "                </div>\n";
                    if (0 == i) {
                        bannerDiv1.append(bannerHtml);
                    }
                    if (1 == i) {
                        bannerDiv2.append(bannerHtml);
                    }
                }
                //我们的优势
                for (var i in  advantages) {
                    var title = advantages[i].title;
                    var content = advantages[i].content;
                    var id_card_header = "heading_" + advantages[i].id;
                    var id_card_collapse = "collapse_" + advantages[i].id;
                    var aria_expanded = i == 0 ? "true" : "false";
                    var card_body_show_style = i == 0 ? "collapse show" : "collapse";
                    var chooseUsItem = "<div class=\"card\">\n" +
                        "                                        <div class=\"card-header\" id=\"" + id_card_header + "\">\n" +
                        "                                            <h5 class=\"mb-0\">\n" +
                        "                                                <button aria-controls=\"" + id_card_collapse +
                        "\" aria-expanded=\"" + aria_expanded + "\"\n" + "                                                        class=\"accordio-heading\"\n" +
                        "                                                        data-target=\"#" + id_card_collapse +
                        "\" data-toggle=\"collapse\"\n" +
                        "                                                        type=\"button\">\n" +
                        "                                                    <i class=\"ion-ribbon-b\"></i>\n" +
                        "                                                    " + title +
                        "                                                </button>\n" + "                                            </h5>\n" + "                                        </div>\n" +
                        "\n" + "                                        <div aria-labelledby=\"" + id_card_header + "\" class=\"" + card_body_show_style +
                        "\" data-parent=\"#choose-us\"\n" +
                        "                                             id=\"" +
                        id_card_collapse +
                        "\">\n" +
                        "                                            <div class=\"card-body\">\n" +
                        content
                        +
                        "                                            </div>\n" +
                        "                                        </div>\n" +
                        "                                    </div>";
                    chooseUsDiv.append(chooseUsItem);
                }
                //大家说什么
                for (var i in  adviseList) {
                    var title = adviseList[i].title;
                    var content = adviseList[i].content;

                }
                //bestSellers
                for (var i in  bestSellers) {
                    var name = bestSellers[i].name;
                    var primaryPicUrl = bestSellers[i].primaryPicUrl;
                    var marketPrice = bestSellers[i].marketPrice;
                    var retailPrice = bestSellers[i].retailPrice;
                    var bestSellerItemHtml = '<div class="single-item mb-30">\n' +
                        '                                    <div class="product-thumb">\n' +
                        '                                        <a href="product-details.html">\n' +
                        '                                            <img alt="" src="' + primaryPicUrl + '">\n' +
                        '                                        </a>\n' +
                        '                                        <div class="quick-view-link">\n' +
                        '                                            <a data-target="#quick_view" data-toggle="modal" href="#"> <span\n' +
                        '                                                    data-toggle="tooltip" title="Quick view"><i\n' +
                        '                                                    class="ion-ios-eye-outline"></i></span> </a>\n' +
                        '                                        </div>\n' +
                        '                                    </div>\n' +
                        '                                    <div class="product-description">\n' +
                        '                                        <div class="tag-cate">\n' +
                        '                                            <a href="product-details.html">fruits</a>\n' +
                        '                                        </div>\n' +
                        '                                        <div class="product-name">\n' +
                        '                                            <h4 class="h5">\n' +
                        '                                                <a href="product-details.html">' + name + '</a>\n' +
                        '                                            </h4>\n' +
                        '                                        </div>\n' +
                        '                                        <div class="price-box">\n' +
                        '                                            <span class="regular-price">' + retailPrice + '</span>\n' +
                        '                                            <span class="old-price"><del>' + marketPrice + '</del></span>\n' +
                        '                                        </div>\n' +
                        '                                    </div>\n' +
                        '                                </div>';

                    if (0 == i) {
                        bestSellerDiv1.html(bestSellerItemHtml)
                    } else if (1 == i) {
                        bestSellerDiv2.append(bestSellerItemHtml)
                    } else if (2 == i) {
                        bestSellerDiv3.append(bestSellerItemHtml)
                    }
                }
            }
        });
    }

    getPopularcategories();

    getOurProduct();

    getAll();
});