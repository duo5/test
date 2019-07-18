<%-- 
    Document   : slider
    Created on : Oct 29, 2018, 6:28:04 PM
    Author     : DuongHX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
   <link rel="stylesheet" href="cssOFsite.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="jsOFsite.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="slider">
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="item">
                        <img src="image/1.jpg" alt="battlefield1" style="width: 100%;">
                        <div class="carousel-caption">
                            <h3>957.000 VNĐ</h3>
                            <button type="button" class="btn btn-success">BUY NOW</button>
                        </div>
                    </div>

                    <div class="item">
                        <img src="image/2.jpg" alt="PUBG" style="width:100%;">
                        <div class="carousel-caption">
                            <h3>330.000 VNĐ</h3>
                            <button type="button" class="btn btn-success">BUY NOW</button>
                        </div>
                    </div>

                    <div class="item">
                        <img src="image/3.jpg" alt="CS:GO" style="width:100%">
                        <div class="carousel-caption">
                            <h3>160.000 VNĐ</h3>
                            <button type="button" class="btn btn-success">BUY NOW</button>
                        </div>
                    </div>
                </div>
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
    </body>
</html>
