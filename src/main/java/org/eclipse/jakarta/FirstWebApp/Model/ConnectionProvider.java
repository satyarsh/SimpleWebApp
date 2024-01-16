package org.eclipse.jakarta.FirstWebApp.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider{
	
//	static DatabaseModel DbModel = new DatabaseModel();
//	
//	static String DbUser = DbModel.getUser();
//	static String DbPass = DbModel.getPassword();
//	
	private static String DbUser;
	private static String DbPass;
	
	
	/* Just experimenting Not for use */
	private static String DbInfo = String.format("jdbc:mariadb://127.0.0.1:3306/%s", getDbData());
	
	
	public void setDbUser(String DbUser) {
		this.DbUser = DbUser;
	}
	
	public void setDbPass(String DbPass) {
		this.DbPass = DbPass;
	}
	
	public static String getDbUser() {
		return DbUser;
	}
	
	public static String getDbPass() {
		return DbPass;
	}
	
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
    		Class.forName("org.mariadb.jdbc.Driver");
    		return DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/TESTDB",
            		DbUser,
            		DbPass);
    }

    public static String getDbData() {
    	return getDbUser() + "\n" + getDbPass();
    }
    
}
