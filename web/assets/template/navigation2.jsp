<%-- 
    Document   : navigation2
    Created on : Sep 4, 2018, 1:03:26 PM
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
                <a class="navbar-brand" href="index.jsp" style="color: white">E-Greetings</a>
            </div>    
        </h4>
    </div>
      
    <div class="collapse navbar-collapse" id="myNavbar">
      
      <ul class="nav navbar-nav navbar-right">
        <li><a href="contactForm.jsp" style="color: white">Contact Us</a></li>
        <li><a href="registation.jsp" style="color: white"> Register</a></li>
        <li><a href="login.jsp" style="color: white"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
        
    </div>
      
  </div>
    
</nav>
    </body>
</html>
