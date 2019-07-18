<%-- 
    Document   : header
    Created on : Oct 23, 2018, 8:45:29 PM
    Author     : DuongHX
--%>

<%@page import="model.ItemModel"%>
<%@page import="java.util.Map"%>
<%@page import="model.CartModel"%>
<%@page import="model.UserModel"%>
<%@page import="dal.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <%
        CategoryDAO c=new CategoryDAO();
        UserModel u=null;
        if(session.getAttribute("user")!=null){
            u=(UserModel)session.getAttribute("user");
        }
        CartModel cart = (CartModel) session.getAttribute("cart");
            if (cart == null) {
                cart = new CartModel();
                session.setAttribute("cart", cart);
            }
        %>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="site.html" id="kt1">HDH<span style="color: #42a5f5;">.</span></a>
                    </div>
                    <div id="d">
                        <ul class="nav navbar-nav" id="kt">
                            <li class=""><a href="list">Home</a></li>

                            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#" >Category <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <%for(int i=0;i<c.getListCategory().size();i++){%>
                                    <li><a href="type?id=<%=c.getListCategory().get(i).getCategoryID()%>"><%=c.getListCategory().get(i).getCategoryName()%></a></li>
                                    <%}%>
                                </ul>
                            </li>

                            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Account<span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <% if(u==null){%>
                                    <li><a href="login.jsp">Login</a></li>
                                    <%}%>
                                    <%if(u!=null){%>
                                    <li><a href="information.jsp">Information</a></li>
                                    <%}%>
                                    <% if(u==null){%>
                                    <li><a href="register.jsp">Register</a></li>
                                    <%}%>
                                    <li><a href="#">Cart</a></li>
                                    <%if(u!=null){%>
                                    <li><a href="logout">Logout</a></li>
                                    <%}%>
                                </ul>
                            </li>
                            <li><a href="site3.html">About Us</a></li>
                            <li><a href="#">Contact Us</a></li>
                            <li class="dropdown" style="margin-left: 50px;"><a class="dropdown-toggle" data-toggle="dropdown" href="#" ><img src="image/10.png"><span style="color: red;position: relative;bottom: 7px;background: #42a5f5;padding: 2px 8px;border-radius: 50%;"><%=cart.countItem() %></span></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <div class="menu2">
                                            <%for(Map.Entry<Integer,ItemModel> entry:cart.getListProduct().entrySet()){%>
                                            <div class="cart">
                                                <img style="height: 70px;width: 100px;" src="<%=entry.getValue().getProduct().getProductImage() %>" alt="">
                                                <div style="width: 350px;">
                                                    <h4 style="padding-top: 10px"><a href="detail?id=<%=entry.getValue().getProduct().getProductID() %>"><%=entry.getValue().getProduct().getProductName() %></a></h4>
                                                    <p class="new-price">$<%=entry.getValue().getProduct().getProductPrice()%> <span><a href="cart?param=remove&&id=<%=entry.getValue().getProduct().getProductID() %>"><i class="glyphicon glyphicon-remove"></i></a></span></p>
                                                    <p class="new-price">Quantity:<%=entry.getValue().getQuantity()%><span>Total price:$<%=entry.getValue().getQuantity()*entry.getValue().getProduct().getProductPrice()%></span></p>
                                                </div>
                                               
                                            </div>
                                            <%}%>
                                            <%if(cart.total()>0){%>
                                            <p>Total:<%=cart.total() %></p>
                                            <%}%>
                                            <a href="checkout.jsp"><button style="margin-top: 20px;margin-left: 100px;" type="button" class="btn btn-info">Check</button></a>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                            <% if(u!=null){%>
                            <li><a href="#">Login as: <%=u.getFullName()%></a></li>
                            <%}%>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
</html>
