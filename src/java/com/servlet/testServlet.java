package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class testServlet
 */

public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final String DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //String that is used to hold  the Database Connection information
    //private static final String DB_CONNECTION = "jdbc:sqlserver://GABRIEL\\GABRIELSQL:1433;database=Airline_service";
    private static final String DB_CONNECTION = "jdbc:sqlserver:localhost:1433/database=Ice_Cream_Parlour";
    // String connectionUrl = "jdbc:sqlserver://SQLSVR:1433;databaseName=Airline_service";

    //String that is used to hold the Database user name
    private static final String DB_USER = "sa";
    //String that is used to hold the Database password
    private static final String DB_PASSWORD = "0720304574";
    public testServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //login User = (login)session.getAttribute("user");
        request.getSession(true); 
        request.getParameter("em") ;
        String email = (String)session.getAttribute("em");
        out.println(email);
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet rs = null;
        //int UserId = 0;
        try{
        	 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; database=Ice_Cream_Parlour;user=sa;password=0720304574");
             //String that contains the SQL Code to execute
             String selectTableSQL2 = "SELECT UserId FROM users WHERE Email = '"+email+"'";;
            //Updates the table using the data input by the user
            PreparedStatement ps =conn.prepareStatement(selectTableSQL2);
                 ps.executeUpdate();
            out.println("Records have been selected");

            
            //Updates the table using the data input by the user
            //stmt.executeUpdate(selectTableSQL);
            dbConnection.setAutoCommit(false);
           
            rs = statement.executeQuery(selectTableSQL2);
            rs.next();
            Integer UserId = rs.getInt("UserId");
            
            out.println(UserId);
        }
        
        catch (SQLException e2) {
            //response.sendRedirect("onewaytrip.jsp");
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(testServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        //out.println(UserId);
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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