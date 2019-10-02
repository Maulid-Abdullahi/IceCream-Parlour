<%-- 
    Document   : birth
    Created on : Sep 3, 2018, 2:32:13 PM
    Author     : g.kabogo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
     <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Scoop It Cream Parlor</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <!--        <link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">-->


        <!--For Plugins external css-->
        <link rel="stylesheet" href="assets/css/animate/animate.css" />
        <link rel="stylesheet" href="assets/css/plugins.css" />

        <!--Theme custom css -->
   

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="assets/css/responsive.css" />

               <!--Theme Responsive css-->
        <link rel="stylesheet" href="assets/css/responsive.css" />

        <script src="assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
</head>
    <body>
        
        <div id="page-wrapper" >
            <div id="page-inner">
        <div class="col-lg-4"></div>
        <form method="post" action="update">
        <div class="col-lg-5">
            <br/>
        <br/>
        <div class="row">
            <%--updating user--%>
            <div>
                <h4>Update User</h4>
            </div>
            <div class="col-lg-6 col-md-6">
                <div class="form-group">
                    <label>User Id</label>
                    <input class="form-control" name="userId"/>
                </div>
            </div> 
        </div>
             <div class="row">
            <div class="col-lg-6 col-md-6">
                <div class="form-group">
                    <label>Email</label>
                    <input class="form-control" name="email"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6 col-md-6">
                <div class="form-group">
                    <label>Username</label>
                    <input class="form-control" name="username"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6 col-md-6">
                <div class="form-group">
                    <label>Password</label>
                    <input class="form-control" name="password"/>                    
                </div>
            </div>            
        </div>
         <button class="btn btn-primary" type="submit">Update</button><br/><br/><hr/>
        </form>
        <form method="post" action="delete">
        <div class="row">
            <%--form for deleting user--%>
            <div>
                <h4>Delete User</h4>
            </div>
            <div class="col-lg-6 col-md-6">
                
                <div class="form-group">
                    <label>User Id</label>
                    <input class="form-control" name="Id"/>
                </div>
            </div>                        
        </div>
            <button class="btn btn-danger" type="submit">Delete</button>
        </form>
        <br/>
        <hr/>
        <%--form for deleting from feedback--%>
        <form method="post" action="delete2">
        <div class="row">
            <div>
                <h4>Feedback Delete</h4>
            </div>
            <div class="col-lg-6 col-md-6">
                
                <div class="form-group">
                    <label>Feedback Id</label>
                    <input class="form-control" name="Id"/>
                </div>
            </div>                        
        </div>
            <button class="btn btn-danger" type="submit">Delete</button>
        <br/>
        <br/>
        <hr/>
        </form>
        <%--form for deleting image--%>
     
        <br/>
        
</div>

        
        <div class="col-lg-3"></div>
        
        
 
            </div>
            </div>
        <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
   
    </body>
</html>
