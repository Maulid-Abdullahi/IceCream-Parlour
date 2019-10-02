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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author p.kanyike
 */
public class feedback extends HttpServlet {

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String _name=request.getParameter("name");
                String _email=request.getParameter("email");
                String _subject=request.getParameter("subject");
		String _message=request.getParameter("message");
                String message;
		try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +
                "database=Ice_Cream_Parlour;user=sa;password=0720304574");
       
		PreparedStatement ps=con.prepareStatement("insert into feedback(FirstName,Email,Subject,Message) values(?,?,?,?)");
		ps.setString(1,_name);
		ps.setString(2,_email);
                ps.setString(3,_subject);
		ps.setString(4,_message);
		
		int i=ps.executeUpdate();
		if(i>0){
                    message="successfully sent";
                    request.setAttribute("message",message);
                    getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
                }
                else{
                    message="Feedback not sent";
                    request.setAttribute("message",message);
                }	
		}
                catch (Exception e2) 
                {
                    System.out.println(e2);
                }
    }}
    
   


