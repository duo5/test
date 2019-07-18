<%-- 
    Document   : information
    Created on : Nov 8, 2018, 2:09:51 PM
    Author     : DuongHX
--%>

<%@page import="model.UserModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       	<title>SHOP GAME GIÁ RẺ</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/cssOFsite.css">
        <link rel="stylesheet" href="css/cssLogin.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="jsOFsite.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <%
            UserModel u = (UserModel) session.getAttribute("user");
        %>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <main>
                <div class="container">
                    <div class="login-form">
                        <div class="main-div">
                            <div class="panel">
                                <h2>Full name: <%=u.getFullName()%></h2>
                            <h2>Email: <%=u.getEmail()%></h2>
                            <h2>User id: <%=u.getUserID()%></h2>
                            <h2>User password: <%=u.getPassword()%></h2>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </main>
    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
