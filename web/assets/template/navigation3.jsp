<%-- 
    Document   : navigation
    Created on : Sep 4, 2018, 12:53:36 PM
    Author     : aidee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
         <h4>
            <div>
                <a class="navbar-brand" href="grid_1.jsp" style="color: white">E-Greetings</a>
            </div>    
        </h4>
  
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      
      <div class="collapse navbar-collapse" id="myNavbar">
      
      <ul class="nav navbar-nav navbar-right">
        <li><a href="contactForm_1.jsp" style="color: white">Contact Us</a></li>
        <li><a href="logout.jsp" style="color: white"> Logout</a></li>
      </ul>
        
    </div>
    </div>
  </div>
    <h4>
    <div class="row">
        <div class="col-lg-4"></div>
        <div class="collapse navbar-collapse text-white" id="myNavbar">
          <ul class="nav navbar-nav">
            <li><a href="grid_1.jsp" style="color: white">Birthday</a></li>
            <li><a href="wedding_grid_1.jsp" style="color: white">Wedding</a></li>
            <li><a href="newyear_grid_1.jsp" style="color: white">New Years</a></li>
            <li><a href="festivals_grid_1.jsp" style="color: white">Festival</a></li>
            <li><a href="others_grid_1.jsp" style="color: white">Others</a></li>
          </ul>
        </div>
        <div class="col-lg-4"></div>
    </div>
    </h4>
</nav>
    </body>
</html>
