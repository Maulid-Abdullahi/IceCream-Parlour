<%-- 
    Document   : adminHeaderSidebar
    Created on : Aug 31, 2018, 11:45:56 AM
    Author     : g.kabogo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="adjust-nav">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <h4>
                        <div>
                            <a class="navbar-brand" href="admin.jsp" style="color: white">E-Greetings</a>
                        </div>    
                    </h4>
                </div>
                 <span class="logout-spn" >
                  <a href="logout.jsp" style="color:#fff;">LOGOUT</a>  

                </span>
            </div>
        </div>
        <!-- /. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <li >
                        <a href="admin.jsp" ><i class="fa fa-user "></i>Users</a>
                    </li>
                   

                    <li>
                        <a href="edit.jsp"><i class="fa fa-edit "></i>Edit</a>
                    </li>
                    <li class="">
                        <a href="feedback.jsp"><i class="fa fa-jetty "></i>Feedback</a>
                    </li>                 
                    <li class="">
                        <a href="upload.jsp"><i class="fa fa-upload "></i>Upload</a>
                    </li>                 
                </ul>
            </div>
        </nav>
    </body>
</html>
