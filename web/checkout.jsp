<%-- 
    Document   : checkout
    Created on : Nov 8, 2018, 10:03:30 AM
    Author     : DuongHX
--%>

<%@page import="model.UserModel"%>
<%@page import="java.util.Map"%>
<%@page import="model.ItemModel"%>
<%@page import="model.CartModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SHOP GAME GIÁ RẺ</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/cssOFsite.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="js/jsOFsite.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <%   CartModel cart = (CartModel) session.getAttribute("cart");
            if (cart.getListProduct().size() == 0) {
                response.sendRedirect("list");
            } else{
                UserModel u = (UserModel) session.getAttribute("user");
                if (u == null) {
                    response.sendRedirect("login.jsp");
                }
            }

        %>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
       
                <div class="col">
                    <h4>Cart<span style="padding-right: 10px;background-color: "><img src="https://cdn4.iconfinder.com/data/icons/Primo_Icons/PNG/48x48/shopping_cart.png"></span></h4>
                    <div class="col1">
                        <table >
                            <tr>
                                <th>Image</th>
                                <th>ProductName</th>
                                <th>Quantity</th>
                                <th>Price</th>
                            </tr>
                        <%for (Map.Entry<Integer, ItemModel> entry : cart.getListProduct().entrySet()) {%>
                        <tr>
                            <td><center><img src="<%=entry.getValue().getProduct().getProductImage()%>" style="margin-left: 5px;width: 100px;height: 90px;"></center></td>
                        <td><center><a href="#"><%=entry.getValue().getProduct().getProductName()%></a></center></td>
                        <td><center><%=entry.getValue().getQuantity()%></center></td>
                        <td><center>$<%=entry.getValue().getProduct().getProductPrice()%></center></td>
                        </tr>
                        <%}%>
                        <tr>
                            <td></td>
                            <td></td>
                            <td><center>Total price</center></td>
                        <td><center>$<%=cart.total()%></center></td>
                        </tr>
                    </table>
                    <h2 style="padding-bottom: 20px;">What do you want to do?</h2>
                    <p style="padding-bottom: 20px;">Choose if you want to use discount codes, gift cards, reward points or shipping cost estimates.</p>
                    <div class="sale">
                        <h5>Apply your discount code:<span style="margin-left: 20px;"><input style="width: 400px;height: 30px;" type="text" name="salecode"></span><span><button type="button" class="btn btn-warning">Use This Code</button></span></h5>
                       
                    </div>
                    <div class="ads">
                        <img style="width: 700px; height: 150px;" src="http://2.bp.blogspot.com/-we3XdK_iBp0/UH7aGfiaEqI/AAAAAAAAAAs/3lp9bAO8n5Y/s1600/banner+dia+oc.JPG">
                    </div>
                    <form action="checkout" method="POST">
                     Choose type to payment:
                        <select name="payment">
                            <option value="baokim">Bao Kim</option>
                            <option value="gate_card">Gate card</option>
                            <option value="paypal">Paypal</option>
                        </select>
                    <div class="v">
                        <button style="float: left;margin-left: 20px;margin-top: 20px;" type="button" class="btn btn-warning">Continnue</button>
                        <button style="margin-left: 650px;margin-top: 20px;margin-bottom: 10px;" type="submit" class="btn btn-warning">Payment</button>
                    </div>
                     </form>
                </div>
            </div>
     
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
