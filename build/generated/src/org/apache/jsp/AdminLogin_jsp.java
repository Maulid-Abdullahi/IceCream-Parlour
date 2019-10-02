package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("           <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title>Scoop It Cream Parlor</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <!--        <link rel=\"stylesheet\" href=\"assets/css/bootstrap-theme.min.css\">-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--For Plugins external css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate/animate.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/plugins.css\" />\n");
      out.write("\n");
      out.write("        <!--Theme custom css -->\n");
      out.write("   \n");
      out.write("\n");
      out.write("        <!--Theme Responsive css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\" />\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>     <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("        <!--Theme Responsive css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\" />\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("              <!--[if lt IE 8]>\n");
      out.write("            <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("\t\t\n");
      out.write("        <header id=\"home\" class=\"navbar-fixed-top\">\n");
      out.write("            <div class=\"header_top_menu clearfix\">\t\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\t\n");
      out.write("                        <div class=\"col-md-5 col-md-offset-3 col-sm-12 text-right\">\n");
      out.write("                            <div class=\"call_us_text\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><i class=\"fa fa-clock-o\"></i> Order Ice Cream </a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><i class=\"fa fa-phone\"></i>+254 720 304 574</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-4 col-sm-12\">\n");
      out.write("                            <div class=\"head_top_social text-right\">\n");
      out.write("                                <a href=\"https:www.facebook.com\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                <a href=\"https:www.google.com\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("                                <a href=\"https:www.twitter.com\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                <a href=\"https:www.linkedin.com\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                                <a href=\"https:www.pinterest.com\"><i class=\"fa fa-pinterest-p\"></i></a>\n");
      out.write("                                <a href=\"https:www.youtube.com\"><i class=\"fa fa-youtube\"></i></a>\n");
      out.write("                                <a href=\"\"><i class=\"fa fa-phone\"></i></a>\n");
      out.write("                                <a href=\"\"><i class=\"fa fa-camera\"></i></a>\n");
      out.write("                            </div>\t\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\t\t\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- End navbar-collapse-->\n");
      out.write("\n");
      out.write("            <div class=\"main_menu_bg\">\n");
      out.write("                <div class=\"container\"> \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <nav class=\"navbar navbar-default\">\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                                <div class=\"navbar-header\">\n");
      out.write("                                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                        <span class=\"icon-bar\"></span>\n");
      out.write("                                        <span class=\"icon-bar\"></span>\n");
      out.write("                                        <span class=\"icon-bar\"></span>\n");
      out.write("                                    </button>\n");
      out.write("                                    <a class=\"navbar-brand our_logo\" href=\"#\"><img src=\"assets/images/pages/scoop it logo copy.png\" alt=\"\" /></a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\n");
      out.write("                                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                        <li><a href=\"OrderForm.jsp\">Online order</a></li>\n");
      out.write("                                        <li><a href=\"AboutUs.jsp\">About us</a></li>\n");
      out.write("                                        \n");
      out.write("                                        <li><a href=\"ContactUs.jsp\">Contact us</a></li>\n");
      out.write("                                       \n");
      out.write("                                        \n");
      out.write("                                        <li><a href=\"#\" class=\"booking\">Sign in</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div><!-- /.navbar-collapse -->\n");
      out.write("                            </div><!-- /.container-fluid -->\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\t\n");
      out.write("        </header> <!-- End Header Section -->\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <section id=\"abouts\" class=\"abouts\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"abouts_content\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"single_abouts_text text-center wow slideInLeft\" data-wow-duration=\"1s\">\n");
      out.write("                                <img src=\"pages/hmpge.jpg\" alt=\"\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"single_abouts_text wow slideInRight\" data-wow-duration=\"1s\">\n");
      out.write("                                <form class=\"form-signin\" method=\"post\" action=\"admin\">         \n");
      out.write("              <h2 class=\"form-signin-heading\" >Admin</h2>\n");
      out.write("              <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\" required=\"required\" autofocus=\"\" />\n");
      out.write("              <br/>   \n");
      out.write("              \n");
      out.write("             \n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"required\"/>              \n");
      out.write("                <button style=\"color: black\" class=\"btn btn-lg btn-primary btn-block\" type=\"submit\"  value=\"login\">Login</button> \n");
      out.write("               </form>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Footer-->\n");
      out.write("        <footer id=\"footer\" class=\"footer\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <div class=\"copyright wow zoomIn\" data-wow-duration=\"3s\">\n");
      out.write("\t\t\t\t\t\t\t<p>Made with <i class=\"fa fa-heart\"></i> by <a href=\"#\">ScoopIt.Inc</a>2019. All Rights Reserved</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"scrollup\">\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/vendor/jquery-1.11.2.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/vendor/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery-easing/jquery.easing.1.3.js\"></script>\n");
      out.write("        <script src=\"assets/js/wow/wow.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/plugins.js\"></script>\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
