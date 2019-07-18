<%-- 
   Document   : content
   Created on : Oct 23, 2018, 8:59:07 PM
   Author     : DuongHX
--%>

<%@page import="model.CartModel"%>
<%@page import="gui.PaggerControl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <%
            int pageIndex = (Integer) request.getAttribute("pageIndex");
            int maxPage = (Integer) request.getAttribute("maxPage");
            CartModel cart = (CartModel) session.getAttribute("cart");
            if (cart == null) {
                cart = new CartModel();
                session.setAttribute("cart", cart);
            }
        %>
    </head>
    <body>
        <main>
            <div class="slider">
                <div id="myCarousel" class="carousel slide" data-ride="carousel">

                    <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <c:forEach items="${random}" var="r" varStatus="loop">
                            <div <c:if test="${loop.index==0}">class="item active"</c:if>
                                                               <c:if test="${loop.index!=0}">class="item"</c:if>  
                                                                   >
                                                                   <img src="${r.productImage}" alt="${r.productName}" style="width: 100%;">
                                                               <div class="carousel-caption">
                                                                   <h3>${r.productPrice}$</h3>
                                                                   <a href="detail?id=${r.productID}"><button type="button"  class="btn btn-success">BUY NOW</button></a>
                                                               </div>
                            </div>
                        </c:forEach>

                        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
            </div>

            <div class="col-md-9">
                <h3 class="tit1" align="center">game mới cập nhật<span><img src="https://cdn2.iconfinder.com/data/icons/Siena/32/label_new%20yellow.png"></span></h3>
                <div class="row">
                    <c:forEach items="${products}" var="p">
                        <div class="col-md-3 col-sm-6 col-pad">

                            <div class="product1">
                                <img src="${p.productImage}">
                            </div>
                            <div class="product2">
                                <h4><a href="detail?id=${p.productID}">${p.productName}</a></h4>
                                <span class="new-price">${p.productPrice} $</span>
                            </div>
                            <div class="product3">
                                <center>
                                    <h4><a href="cart?param=add&&id=${p.productID}"><span style="padding-right: 10px;"><img src="https://cdn4.iconfinder.com/data/icons/ionicons/512/icon-ios7-cart-outline-32.png"></span>Add to cart</a></h4>
                                </center>
                            </div>
                        </div>
                    </c:forEach>

                </div>
                <ul style="margin-left: 50px;" class="pagination">
                    <%=PaggerControl.generate(pageIndex, maxPage, 2)%>
                </ul>

            </div>
            <div class="col-md-3">
                <h3 class="tit2" align="center">top 5 sản phẩm<span><img src="https://cdn1.iconfinder.com/data/icons/photo-stickers-words/128/word_7-32.png"></span></h3>
                        <c:forEach items="${top5}" var="t">
                    <div class="product-0">
                        <div class="product-1">
                            <a href="detail?id=${p.productID}"><img src="${t.productImage}"></a>
                            <h4><a href="detail?id=${p.productID}">${t.productName}</a></h4>
                            <span class="new-price">${t.productPrice}$</span>
                            <p><i>${t.productDescription}</i></p>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </main>
    </body>
</html>
