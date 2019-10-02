/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abdullahi
 */
public class admin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
                String _email=request.getParameter("email");
		String pwd=request.getParameter("password");
                String message;
		try{
                    if(_email!=null){
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +
                        "database=Ice_Cream_Parlour;user=sa;password=0720304574");

                        Statement stmt = con.createStatement();
                     
                        String Query = "select * from admin where Email = '"+_email+"' and Password = '"+pwd+"'";

                            ResultSet rs = stmt.executeQuery(Query);
                            if(rs.next())
                            {
                                response.sendRedirect("index.jsp");
                            }
                            else
                            {
                                out.println("Login Failed..Please try again");
                            }
                    }
		
		}
                catch(Exception ex)
                {
                    out.println("Exception :"+ex.getMessage());
                }
    }
}