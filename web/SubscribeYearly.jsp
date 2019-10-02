<%-- 
    Document   : subscribe
    Created on : Mar 20, 2019, 10:26:45 PM
    Author     : Abdullahi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        <script src="assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
		
        <header id="home" class="navbar-fixed-top">
            <div class="header_top_menu clearfix">	
                <div class="container">
                    <div class="row">	
                        <div class="col-md-5 col-md-offset-3 col-sm-12 text-right">
                            <div class="call_us_text">
								<a href=""><i class="fa fa-clock-o"></i> Order Ice Cream </a>
								<a href=""><i class="fa fa-phone"></i>+254 720 304 574</a>
							</div>
                        </div>

                        <div class="col-md-4 col-sm-12">
                            <div class="head_top_social text-right">
                                <a href="https:www.facebook.com" target="blank"><i class="fa fa-facebook"></i></a>
                                <a href="https:www.google.com" target="blank"><i class="fa fa-google-plus"></i></a>
                                <a href="https:www.twitter.com" target="blank"><i class="fa fa-twitter"></i></a>
                                <a href="https:www.linkedin.com"target="blank"><i class="fa fa-linkedin"></i></a>
                                <a href="https:www.pinterest.com"target="blank"><i class="fa fa-pinterest-p"></i></a>
                                <a href="https:www.youtube.com"target="blank"><i class="fa fa-youtube"></i></a>
                                <a href="" target="blank"><i class="fa fa-phone"></i></a>
                                <a href=""target="blank"><i class="fa fa-camera"></i></a>
                            </div>	
                        </div>

                    </div>			
                </div>
            </div>

            <!-- End navbar-collapse-->

            <div class="main_menu_bg">
                <div class="container"> 
                    <div class="row">
                        <nav class="navbar navbar-default">
                            <div class="container-fluid">
                                <!-- Brand and toggle get grouped for better mobile display -->
                                <div class="navbar-header">
                                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                        <span class="sr-only">Toggle navigation</span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                    </button>
                                    <a class="navbar-brand our_logo" href="#"><img src="assets/images/pages/scoop it logo copy.png" alt="" /></a>
                                </div>

                                <!-- Collect the nav links, forms, and other content for toggling -->
                                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                                    <ul class="nav navbar-nav navbar-right">
                                        <li><a href="index.jsp">Home</a></li>
                                        <li><a href="OrderForm.jsp">Online order</a></li>
                                        <li><a href="AboutUs.jsp">About us</a></li>
                                        
                                        <li><a href="ContactUs.jsp">Contact us</a></li>
                                       
                                        
                                        <li><a href="index.jsp" class="booking">Sign out</a></li>
                                    </ul>
                                </div><!-- /.navbar-collapse -->
                            </div><!-- /.container-fluid -->
                        </nav>
                    </div>
                </div>
            </div>	
        </header> <!-- End Header Section -->

        <section id="slider" class="slider">
            <div class="slider_overlay">
                <div class="container">
                    <div class="row">
                        <div class="main_slider text-center">
                            <div class="col-md-12">
                                <div class="main_slider_content wow zoomIn" data-wow-duration="1s">
                                    <h1>Subscribe annually</h1>
                                    
                                </div>
                            </div>	
                        </div>

                    </div>
                </div>
            </div>
        </section>

        <section id="abouts" class="abouts">
            <div class="container">
                <div class="row">
                    <div class="abouts_content">
                        <div class="col-md-6">
                            
                        </div>
        <h1>Subscribe</h1>
        <form method="post" action="SubscribeAnnually">
            <b> <p>Email</p><input type="email" name="email">
            <p>Credit Card</p><input type="text" name="card">
            <p>Duration</p><select name="duration">
                <option value="yearly">annually</option>
            </select>
            <p>Payment</p><select name="payment">
                <option value="$150">$150</option>
            </select></b>
            <input type="submit" value="Subscribe">
            
        </form>
        </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
         <!--Footer-->
         <footer id="footer" class="footer" >
            <div class="container text-center">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="copyright wow zoomIn" data-wow-duration="3s">
			<p>Made with <i class="fa fa-heart"></i> by <a href="#">ScoopIt.Inc</a>2019. All Rights Reserved</p>
			</div>
                    </div>
                </div>
            </div>
        </footer>
		
	
    </body>
</html>

