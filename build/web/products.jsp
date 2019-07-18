<%-- 
    Document   : products
    Created on : Oct 29, 2018, 9:52:43 PM
    Author     : DuongHX
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/newcss.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <main>
                <!-- SINGLE PRODUCT -->
                <div>
                    <div class="section">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-7 col-sm-6">
                                
                                    <div class="single-product">
                                        <img src="${product.productImage}" alt="">
                                    </div>
                                </div>
                                <div class="col-md-5 col-sm-6">
                                    <div class="single-product">
                                        <h4>${product.productName}</h4>
                                        <h5>$ ${product.productPrice}</h5>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odit aperiam tempora ullam aliquid
                                            optio quae maiores necessitatibus, obcaecati ad, minima rem eos eius eum, dolores vel animi
                                            dolorum, saepe? Ullam.</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Maxime impedit nulla in obcaecati
                                            quam, quae nostrum aut error, ratione delectus</p>
                                        <button type="button" class="btn button"><i class="fa fa-shopping-cart"></i>ADD TO CART</button>
                                    </div>
                                </div>
                            </div>
                            <div class="sp-content">
                                <h5>DESCRIPTION</h5>
                                <div class="sp-desc">
                                    <span>${product.productPrice}</span>
                                    <p>${product.productDescription}</p>
                                </div>

                            </div>
                      
                    </div>
                </div>
                <!-- END SINGLE PRODUCT -->
            </div>
        </main>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
