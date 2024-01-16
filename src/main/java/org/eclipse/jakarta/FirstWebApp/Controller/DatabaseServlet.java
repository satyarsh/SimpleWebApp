package org.eclipse.jakarta.FirstWebApp.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.jakarta.FirstWebApp.Model.ConnectionProvider;

@WebServlet (name = "DatabaseServlet" , urlPatterns = "/Db")
public class DatabaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ConnectionProvider ConnProvider = new ConnectionProvider();
	 
    public DatabaseServlet() {
        super();
    }
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		
		ConnProvider.setDbUser(user);
		ConnProvider.setDbPass(password);
		
		response.getWriter().append(ConnProvider.getDbData());
		
		try {
			Connection connection = ConnectionProvider.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs;

            rs = statement.executeQuery("SELECT * FROM Users");
            
            while ( rs.next() ) {
                String FirstName = rs.getString("Firstname");
                String id = rs.getString("id");

                response.getWriter().append("\n");
        		response.getWriter().append("FirstName : " + 
                        FirstName + "\n" + "CustomerID : " + id);
            }
            	connection.close();
            	
				} catch (SQLException | ClassNotFoundException e) {
					e.printStackTrace();
		            System.err.println("Got an exception! ");
		            System.err.println(e.getMessage());
				}
		
		//DatabaseModel.builder().User(user).Password(password).build();
		//doGet(request, response);
		
	}
}
