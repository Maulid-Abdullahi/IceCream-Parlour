package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("     <meta charset=\"utf-8\">\n");
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
      out.write("               <!--Theme Responsive css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\" />\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div id=\"page-wrapper\" >\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("        <div class=\"col-lg-4\"></div>\n");
      out.write("        <form method=\"post\" action=\"update\">\n");
      out.write("        <div class=\"col-lg-5\">\n");
      out.write("            <br/>\n");
      out.write("        <br/>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <h4>Update User</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>User Id</label>\n");
      out.write("                    <input class=\"form-control\" name=\"userId\"/>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("             <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Email</label>\n");
      out.write("                    <input class=\"form-control\" name=\"email\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Username</label>\n");
      out.write("                    <input class=\"form-control\" name=\"username\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Password</label>\n");
      out.write("                    <input class=\"form-control\" name=\"password\"/>                    \n");
      out.write("                </div>\n");
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("         <button class=\"btn btn-primary\" type=\"submit\">Update</button><br/><br/><hr/>\n");
      out.write("        </form>\n");
      out.write("        <form method=\"post\" action=\"delete\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <h4>Delete User</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>User Id</label>\n");
      out.write("                    <input class=\"form-control\" name=\"Id\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>                        \n");
      out.write("        </div>\n");
      out.write("            <button class=\"btn btn-danger\" type=\"submit\">Delete</button>\n");
      out.write("        </form>\n");
      out.write("        <br/>\n");
      out.write("        <hr/>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"delete2\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div>\n");
      out.write("                <h4>Feedback Delete</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Feedback Id</label>\n");
      out.write("                    <input class=\"form-control\" name=\"Id\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>                        \n");
      out.write("        </div>\n");
      out.write("            <button class=\"btn btn-danger\" type=\"submit\">Delete</button>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <hr/>\n");
      out.write("        </form>\n");
      out.write("        ");
      out.write("\n");
      out.write("     \n");
      out.write("        <br/>\n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"col-lg-3\"></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write(" \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("      <!-- CUSTOM SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("    \n");
      out.write("   \n");
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
