<%-- 
    Document   : type-product
    Created on : Nov 4, 2018, 4:52:24 PM
    Author     : DuongHX
--%>

<%@page import="gui.PaggerControl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>SHOP GAME GIÁ RẺ</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/cssOFsite.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="js/jsOFsite.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <%
            int pageIndex = (Integer) request.getAttribute("pageIndex");
            int maxPage = (Integer) request.getAttribute("maxPage");
        %>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="col-md-12">
                <h3 class="tit1" align="center">${category.categoryName}<span><img src="https://cdn2.iconfinder.com/data/icons/Siena/32/label_new%20yellow.png"></span></h3>
                <div class="row">
                    <c:forEach items="${products}" var="p">
                    <div class="col-md-3 col-pad">

                        <div class="product1">
                            <img src="${p.productImage}">
                        </div>
                        <div class="product2">
                            <h4><a href="detail?id=${p.productID}">${p.productName}</a></h4>
                            <span class="new-price">${p.productPrice} $</span>
                        </div>
                        <div class="product3">
                            <center>
                                <h4><a href="detail?id=${p.productID}"><span style="padding-right: 10px;"><img src="https://cdn4.iconfinder.com/data/icons/ionicons/512/icon-ios7-cart-outline-32.png"></span>Add to cart</a></h4>
                            </center>
                        </div>
                    </div>
                </c:forEach>

            </div>
            <ul style="margin-left: 50px;" class="pagination">
                <%=PaggerControl.generate(pageIndex, maxPage, 2)%>
            </ul>

        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
