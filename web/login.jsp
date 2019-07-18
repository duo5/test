<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>SHOP GAME GIÁ RẺ</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/cssOFsite.css">
   <link rel="stylesheet" href="css/cssLogin.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="jsOFsite.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
 
  </style>
</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
  <main>
  <div class="container">
    <div class="login-form">
    <div class="main-div">
        <div class="panel">
       <h2>Login</h2>
       <p>Please enter your email and password</p>
       <p style="color: red">${error}</p>
       </div>
        <form action="login" method="POST">
    
            <div class="form-group">
    
    
                <input name="name" type="text" class="form-control" id="inputEmail" placeholder="User Name">
    
            </div>
    
            <div class="form-group">
    
                <input name="password" type="password" class="form-control" id="inputPassword" placeholder="Password">
    
            </div>
            <div class="forgot">
            <a href="reset.html">Forgot password?</a>
    </div>
            <button type="submit" class="btn btn-primary">Login</button>
    
        </form>
        </div>
    </div>
  </div>
</div>
  </main>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>