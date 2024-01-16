package org.eclipse.jakarta.FirstWebApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultBoundedRangeModel;

import org.eclipse.jakarta.FirstWebApp.Model.ConnectionProvider;
import org.eclipse.jakarta.FirstWebApp.Model.DatabaseModel;

public class Main {

	public static void main(String[] args) {
				
//		try {
//	Connection connection = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/TESTDB","root","root");
//			System.out.println("Connection.isValid(0) = " + connection.isValid(0));
//			
//			Connection connection = ConnectionProvider.getConnection();
//            Statement statement = connection.createStatement();
//            ResultSet rs;
//
//            rs = statement.executeQuery("SELECT * FROM Customers");
//            
//            System.out.println();
//            
//            while ( rs.next() ) {
//                String FirstName = rs.getString("first_name");
//                String CustomerID = rs.getString("id");
//                System.out.println("FirstName : " + 
//                FirstName + "\n" + "CustomerID : " + CustomerID);
//                System.out.println("----------------------");
//            }
//            
//            	System.out.println();
//            	connection.close();
//            	
//				} catch (SQLException e) {
//					e.printStackTrace();
//		            System.err.println("Got an exception! ");
//		            System.err.println(e.getMessage());
//				}
	}

}
