<%-- 
    Document   : footer
    Created on : Sep 4, 2018, 12:45:42 PM
    Author     : aidee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar 
    {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav 
    {
      padding-top: 5px;
      padding-left: 5px;
      padding-right: 5px;
      padding-bottom: 5px;
      background-color: lightgray;
      height: 100%;
    }
    sidenav
    {
        padding-left: 50px;
        margin: 20px;
    }
    
    /* Set black background color, white text and some padding */
    footer 
    {
      background-color: #112B45;
      color: white;
      padding: 15px;
    }
    
    h2
    {
        padding-left: 20px;
        margin-left: 50%;
        font-size: 180%;
    }
    
    h4
    {
        font-size-adjust: 15;
    }
    
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 1080px) 
    {
      .sidenav 
      {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
    <body>
        <br/>
        <br/>
        <br/>
        <footer class="container-fluid text-center">
            <p> &copy; | All Rights Reserved | Designed by Group 2 | 2018</p>
        </footer>
    </body>
</html>
