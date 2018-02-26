package jdbc;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("hiding") 
//@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Registration() {
    	//super();
    	System.out.println("hello 1");
        
    }
    
	
//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
		
		//System.out.println("hello 2");
	//}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
		
		System.out.println("hello 3");
		//doGet(request, response);
		try
		{
		String name=((ServletRequest) request).getParameter("user");
		
		String password= ((ServletRequest) request).getParameter("password");
		System.out.println("hello4");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("hello5");
		//create jdbc connection obj and load class
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","Oracle12c");
		//create statement object
		System.out.println("established");
		PreparedStatement ps=conn.prepareStatement(  
				"insert into register (Username, password)values(?,?)");  
		//print database table record
		ps.setString(1,name);
		ps.setString(2,password);
		System.out.println("executed ");
		ps.executeUpdate();
		PrintWriter out =((ServletResponse) response).getWriter();
		out.println("successfully registered");
		ps.close();
		//st.close();
		conn.close();
				
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
	}

}
