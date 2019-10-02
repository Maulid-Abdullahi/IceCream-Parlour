package com.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;


public class login extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            String username = request.getParameter("txtusername");
            String password = request.getParameter("txtpassword");
            
            try
            {
                if(username!=null)
                {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                    Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +
                "database=Ice_Cream_Parlour;user=sa;password=0720304574");
                    Statement stmt = conn.createStatement();
                    String Query = "select * from users where Username = '"+username+"' and Password = '"+password+"'";                  
                    ResultSet rs = stmt.executeQuery(Query);
                    if(rs.next())
                    {
                        HttpSession session = request.getSession(true);
                        Object us = username;
                        session.setAttribute("us", us);
                        String Query2 = "select UserId from users where Username = '"+us+"'";
                        rs = stmt.executeQuery(Query2);
                        rs.next();
                        String role = rs.getString("UserId");
                        if(role.equals("Admin"))
                        {
                            response.sendRedirect("Admin.jsp");
                        }
                        
                        response.sendRedirect("subscription.jsp");
                        //out.println(userId);
                        
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
         RequestDispatcher req = request.getRequestDispatcher("index.jsp");
        req.include(request, response);
    }
        
    }