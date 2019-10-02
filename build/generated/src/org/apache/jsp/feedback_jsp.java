package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title>Scoop It Cream Parlor</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/ico\" href=\"assets/images/pages/scoop it logo copy.png\" />\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("        <!--Theme Responsive css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"admin.css\">\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <header role=\"banner\">\n");
      out.write("  <h1>Admin Panel</h1>\n");
      out.write("  <ul class=\"utilities\">\n");
      out.write("     <li class=\"users\"><a href=\"Admin.jsp\">Home</a></li>\n");
      out.write("    <li class=\"users\"><a href=\"#\">My Account</a></li>\n");
      out.write("    <li class=\"logout warn\"><a href=\"AdminLogin.jsp\">Log Out</a></li>\n");
      out.write("  </ul>\n");
      out.write("</header>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("             \n");
      out.write("            <nav role='navigation'>\n");
      out.write("  <ul class=\"main\">\n");
      out.write("     <li></i><a href=\"Users.jsp\">users</a></li>\n");
      out.write("    <li></i><a href=\"feedback.jsp\">feedback</a></li>\n");
      out.write("    <li></i><a href=\"ContactAdmin.jsp\">Contact Us</a></li>\n");
      out.write("    <li></i><a href=\"OrderFormAdmin.jsp\">Order Form</a></li>\n");
      out.write("    <li></i><a href=\"paymonthlyAdmin.jsp\">Subscribers</a></li>\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<main role=\"main\">\n");
      out.write("  <section class=\"panel important\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("</main>\n");
      out.write("      \n");
      out.write("        <div style=\"float: right\" id=\"page-wrapper\" >\n");
      out.write("                <div id=\"page-inner\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12 col-md-6\">\n");
      out.write("                         \n");
      out.write("                            <hr>\n");
      out.write("                            ");
      out.write("    \n");
      out.write("                            ");
 
                                Connection conn= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + 
                                 "database=Ice_Cream_Parlour;user=sa;password=0720304574");

                                Statement statement = conn.createStatement() ;
                                ResultSet resultset =  statement.executeQuery("select feedbackId, FirstName, Email, Subject, Message from feedback") ; 

                            
      out.write("\n");
      out.write("                            <br/>\n");
      out.write("                            <table class=\"table table-striped table-bordered table-hover\" style=\"width: 1000px; float: right;\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>feedbackId</th>\n");
      out.write("                                        <th>FirstName</th>\n");
      out.write("                                        <th>Email</th>\n");
      out.write("                                        <th>Subject</th>\n");
      out.write("                                        <th>Message</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.print( resultset.getString(1) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( resultset.getString(2) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( resultset.getString(3) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( resultset.getString(4) );
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( resultset.getString(5) );
      out.write("</td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                            </table>\n");
      out.write("\n");
      out.write("                        </div>                         \n");
      out.write("                                <br/>  \n");
      out.write("                        \n");
      out.write("                     </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>              \n");
      out.write("                     <!-- /. ROW  -->\n");
      out.write("                      <hr />\n");
      out.write("\n");
      out.write("                     <!-- /. ROW  -->           \n");
      out.write("                </div>\n");
      out.write("                 <!-- /. PAGE INNER  -->\n");
      out.write("            </div>\n");
      out.write("             <!-- /. PAGE WRAPPER  -->\n");
      out.write("            </div>\n");
      out.write("\n");
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
      out.write("\n");
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
