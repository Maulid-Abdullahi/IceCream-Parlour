<%-- 
    Document   : Users
    Created on : Mar 16, 2019, 10:57:38 PM
    Author     : Abdullahi
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%Class.forName("org.apache.derby.jdbc.ClientDriver");%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Scoop It Cream Parlor</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">
        <link rel="icon" type="image/ico" href="assets/images/pages/scoop it logo copy.png" />
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <!--        <link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">-->


        <!--For Plugins external css-->
        <link rel="stylesheet" href="assets/css/animate/animate.css" />
        <link rel="stylesheet" href="assets/css/plugins.css" />

        <!--Theme custom css -->
        <link rel="stylesheet" href="assets/css/style.css">

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="assets/css/responsive.css" />
        <link rel="stylesheet" href="admin.css">

        <script src="assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
        
        <header role="banner">
  <h1>Admin Panel</h1>
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
      
        <div style="float: right" id="page-wrapper" >
                <div id="page-inner">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="row">
                        <div class="col-lg-12 col-md-6">
                         
                            <hr>
                            <%--retrieves all registered users--%>    
                            <% 
                                Connection conn= DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true;" + 
                                 "user=app;password=app");

                                Statement statement = conn.createStatement() ;
                                ResultSet resultset =  statement.executeQuery("select CarId, firstname, lastname, email, phone, cars, startdate, returndate from CarBooking") ; 

                            %>
                            <table class="table table-striped table-bordered table-hover" style="width: 1000px; float: right;">
                                <thead>
                                    <tr>
                                        <th>carId</th>
                                        <th>firstname</th>
                                        <th>lastname</th>
                                        <th>email</th>
                                        <th>phone</th>
                                        <th>cars</th>
                                        <th>startdate</th>
                                        <th>returndate</th>
                                    </tr>
                                </thead>
                                <% while(resultset.next()){ %>
                                <tbody>
                                    <tr>
                                        <td><%= resultset.getString(1) %></td>
                                        <td><%= resultset.getString(2) %></td>
                                        <td><%= resultset.getString(3) %></td>
                                        <td><%= resultset.getString(4) %></td>
                                        <td><%= resultset.getString(5) %></td>
                                        <td><%= resultset.getString(6) %></td>
                                        <td><%= resultset.getString(7) %></td>
                                        <td><%= resultset.getString(8) %></td>
                                        <td><a class="btn btn-danger" href="edit.jsp">Delete</a></td>
                                        <td><a class="btn btn-primary" href="edit.jsp">Update</a></td>
                                        <td><a class="btn btn-info" href="edit.jsp">Add</a></td>

                                    </tr>
                                </tbody>
                                <% } %>
                            </table>

                        </div>                         
                                <br/>  
                        
                     </div>
                        </div>
                    </div>              
                     <!-- /. ROW  -->
                      <hr />

                     <!-- /. ROW  -->           
                </div>
                 <!-- /. PAGE INNER  -->
            </div>
             <!-- /. PAGE WRAPPER  -->
            </div>

		
		<div class="scrollup">
			<a href="#"><i class="fa fa-chevron-up"></i></a>
		</div>		


        <script src="assets/js/vendor/jquery-1.11.2.min.js"></script>
        <script src="assets/js/vendor/bootstrap.min.js"></script>

        <script src="assets/js/jquery-easing/jquery.easing.1.3.js"></script>
        <script src="assets/js/wow/wow.min.js"></script>
        <script src="assets/js/plugins.js"></script>
        <script src="assets/js/main.js"></script>
    </body>
</html>
