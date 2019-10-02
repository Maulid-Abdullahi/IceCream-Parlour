<%-- 
    Document   : Admin
    Created on : Mar 17, 2019, 11:41:37 AM
    Author     : Abdullahi
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Scoop It Cream Parlor</title>
        <link rel="stylesheet" href="admin.css">
        <meta name="description" content="">
        
        <link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        
        <header role="banner">
            <h1 <a href="Admin.jsp">Admin Panel</a></h1>
  <ul class="utilities">
      <li class="users"><a href="Admin.jsp">Home</a></li>
    <li class="users"><a href="#">My Account</a></li>
    <li class="logout warn"><a href="AdminLogin.jsp">Log Out</a></li>
  </ul>
</header>
    </head>
    <body>
        <nav role='navigation'>
  <ul class="main">
     <li></i><a href="Users.jsp">users</a></li>
    <li></i><a href="feedback.jsp">feedback</a></li>
    <li></i><a href="ContactAdmin.jsp">Contact Us</a></li>
    <li></i><a href="OrderFormAdmin.jsp">Order Form</a></li>
    <li></i><a href="paymonthlyAdmin.jsp">Book Payment</a></li>
    <li></i><a href="subscribersadmin.jsp">Subscribers</a></li>
  </ul>
</nav>

<main role="main">
  <section class="panel important">
    
    


</main>

    </body>
</html>
