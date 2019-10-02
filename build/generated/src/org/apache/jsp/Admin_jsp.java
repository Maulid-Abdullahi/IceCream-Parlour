package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title>Scoop It Cream Parlor</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"admin.css\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        \n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        \n");
      out.write("        <header role=\"banner\">\n");
      out.write("            <h1 <a href=\"Admin.jsp\">Admin Panel</a></h1>\n");
      out.write("  <ul class=\"utilities\">\n");
      out.write("      <li class=\"users\"><a href=\"Admin.jsp\">Home</a></li>\n");
      out.write("    <li class=\"users\"><a href=\"#\">My Account</a></li>\n");
      out.write("    <li class=\"logout warn\"><a href=\"AdminLogin.jsp\">Log Out</a></li>\n");
      out.write("  </ul>\n");
      out.write("</header>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav role='navigation'>\n");
      out.write("  <ul class=\"main\">\n");
      out.write("     <li></i><a href=\"Users.jsp\">users</a></li>\n");
      out.write("    <li></i><a href=\"feedback.jsp\">feedback</a></li>\n");
      out.write("    <li></i><a href=\"ContactAdmin.jsp\">Contact Us</a></li>\n");
      out.write("    <li></i><a href=\"OrderFormAdmin.jsp\">Order Form</a></li>\n");
      out.write("    <li></i><a href=\"paymonthlyAdmin.jsp\">Book Payment</a></li>\n");
      out.write("    <li></i><a href=\"subscribersadmin.jsp\">Subscribers</a></li>\n");
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
      out.write("\n");
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
