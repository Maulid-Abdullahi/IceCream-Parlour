package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author Abdullahi
 */
public class delete extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      try {
            

            
            try {
                int Id;
                Id = Integer.parseInt(request.getParameter("Id"));
                response.sendRedirect("Admin.jsp");
                
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; database=Ice_Cream_Parlour;user=sa;password=0720304574");
             String sql = ("DELETE FROM users WHERE UserId =  '"+Id+"' ");
                
                PreparedStatement ps =conn.prepareStatement(sql);
                 ps.executeUpdate();
                PrintWriter out =response.getWriter();
                out.println("you have successfully deleted");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
                 ex.printStackTrace();
        }
    }
}