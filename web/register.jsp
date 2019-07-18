<%-- 
    Document   : register
    Created on : Oct 27, 2018, 3:19:31 PM
    Author     : DuongHX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/cssRegister.css">
        <link rel="stylesheet" href="css/cssOFsite.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <main>
                <div class="container">
                    <div class="row main">
                        <div class="panel-heading">
                            <div class="panel-title text-center">
                                <h1 class="title">Company Name</h1>
                                <h1 class="title" style="color: red;">${error}</h1>
                                <hr />
                            </div>
                        </div> 
                        <div class="main-login main-center">
                            <form class="form-horizontal" method="POST" action="register">

                                <div class="form-group">
                                    <label for="name" class="cols-sm-2 control-label">Your Name</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                            <span><input type="text" class="form-control" name="name" id="name"  placeholder="Enter your Name"/></span>
                                        </div>
                                        <span id="user-result-name"></span>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="email" class="cols-sm-2 control-label">Your Email</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                            <input type="text" class="form-control" name="email" id="email"  placeholder="Enter your Email"/>
                                        
                                        </div>
                                        <span id="user-result-email"></span>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="username" class="cols-sm-2 control-label">Username</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-user" aria-hidden="true"></i></span>
                                            <input type="text" class="form-control" name="username" id="username"  placeholder="Enter your Username"/>
                                           
                                        </div>
                                        <span id="user-result-username"></span>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="password" class="cols-sm-2 control-label">Password</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock" aria-hidden="true"></i></span>
                                            <input type="password" class="form-control" name="password" id="password"  placeholder="Enter your Password"/>
                                        </div>
                                        <span id="user-result-password"></span>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock" aria-hidden="true"></i></span>
                                            <input type="password" class="form-control" name="confirm" id="confirm"  placeholder="Confirm your Password"/>
                                           
                                        </div>
                                        <span id="user-result-confirm"></span>
                                    </div>
                                </div>
                                <div class="form-group ">
                                    <button type="submit" class="btn btn-primary btn-lg btn-block login-button">Register</button>
                                </div>
                                <div class="login-register">
                                    <a href="login.jsp">Login</a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </main>
        <jsp:include page="footer.jsp"></jsp:include>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                var x_timer;
                $("#name").keyup(function (e) {
                    clearTimeout(x_timer);
                    var full_name = $(this).val();
                    x_timer = setTimeout(function () {
                        check_fullname_ajax(full_name);
                    }, 1000);
                });

                $("#email").keyup(function (e) {
                    clearTimeout(x_timer);
                    var email = $(this).val();
                    x_timer = setTimeout(function () {
                        check_email_ajax(email);
                    }, 1000);
                });
                
                  $("#username").keyup(function (e) {
                    clearTimeout(x_timer);
                    var username = $(this).val();
                    x_timer = setTimeout(function () {
                        check_username_ajax(username);
                    }, 1000);
                });
                
                $("#password").keyup(function (e) {
                    clearTimeout(x_timer);
                    var password = $(this).val();
                    x_timer = setTimeout(function () {
                        check_password_ajax(password);
                    }, 1000);
                });
                
                function check_fullname_ajax(fullname) {
                    $("#user-result-name").html('<img src="img/ajax-loader.gif"/>');
                    $.post('checkFullName', {'fullname': fullname}, function (data) {
                        $("#user-result-name").html(data);
                    });
                }
                    function check_email_ajax(email) {
                    $("#user-result-email").html('<img src="img/ajax-loader.gif"/>');
                    $.post('checkEmailController', {'email': email}, function (data) {
                        $("#user-result-email").html(data);
                    });
                }
                function check_username_ajax(username) {
                    $("#user-result-username").html('<img src="img/ajax-loader.gif"/>');
                    $.post('checkUserName', {'user': username}, function (data) {
                        $("#user-result-username").html(data);
                    });
                }
                function check_password_ajax(password) {
                    $("#user-result-password").html('<img src="img/ajax-loader.gif"/>');
                    $.post('checkpassword', {'Password': password}, function (data) {
                        $("#user-result-password").html(data);
                    });
                }
            });
            
        </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
