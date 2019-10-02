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
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abdullahi
 */
public class SubscribeMonthly extends HttpServlet {

     //String that is used to hold the driver information
    private static final String DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //String that is used to hold  the Database Connection information
    private static final String DB_CONNECTION = "jdbc:sqlserver:localhost:1433/database=Ice_Cream_Parlour";
    //String that is used to hold the Database user name
    private static final String DB_USER = "sa";
    //String that is used to hold the Database password
    private static final String DB_PASSWORD = "0720304574";

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection dbConnection = null;
        Statement statement = null;
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        
        String email = request.getParameter("email");
        String card = request.getParameter("card");
        String duration = request.getParameter("duration");
        String payment = request.getParameter("payment");
        
        
        
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; database=Ice_Cream_Parlour;user=sa;password=0720304574");
            //String that contains the SQL Code to execute
            String selectTableSQL = "UPDATE users SET card = '"+card+"',duration = '"+duration+"', Payment= '"+payment+"' WHERE Email = '"+email+"'";
            //Updates the table using the data input by the user
            PreparedStatement ps =conn.prepareStatement(selectTableSQL);
                 ps.executeUpdate();
            out.println("Records have been updated");
            
        }
        catch (SQLException e2) {
            System.out.println(e2.getMessage());
        } 
         catch (Exception e1){}
         response.sendRedirect("Customer1.jsp");
    }

   private static Connection getDBConnection() {

        Connection dbConnection = null;
        //Used to define the driver type
        try {
            Class.forName(DB_DRIVER);
        } 
        //Displays an exception if the class is not found
        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        //Used to log into ssms
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return dbConnection;
        } 
        
        //Used to display an SQLException
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return dbConnection;

    }


}