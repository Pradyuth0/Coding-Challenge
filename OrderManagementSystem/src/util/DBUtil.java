package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	    private static final String url = "jdbc:mysql://localhost:3306/OrderManagementSystem";
	    private static final String user = "root";
	    private static final String password = "8500680057";
	    private static Connection connection;

	    
public static Connection getDBConn() throws ClassNotFoundException{
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	System.out.println("driver is loaded");
	        	connection = DriverManager.getConnection(url, user, password);
	        	return connection;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
}

	


