<%-- 
    Document   : Authentication
    Created on : Mar 23, 2019, 12:38:22 PM
    Author     : Abdullahi
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        String id= request.getParameter("v1");
        String fin= request.getParameter("v2");
        out.println(id);
        out.println(fin);
        %>
        <% 
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +
                "database=Ice_Cream_Parlour;user=sa;password=0720304574");
       
		PreparedStatement ps=con.prepareStatement("insert into feedback(FirstName,Email,Subject,Message) values(?,?,?,?)");
		ps.setString(1,id);
		ps.setString(2,fin);
                
		
		int i=ps.executeUpdate();
		if(i>0){
                    message="successfully sent";
                    request.setAttribute("message",message);
                    getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
        
        %>
    </body>
</html>
