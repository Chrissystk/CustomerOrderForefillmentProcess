import java.sql.*;


public class product{
	
	public product(){}
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/products";
	static final String USER = "chrissystk@localhost";
	static final String PASSWORD = "projects";
		public void ReadDatabase(){
			Connection conn = null;
			Statement stmt = null;
			
	try {
		Class.forName("com.mysql.jdbcDriver");
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		
	}
	catch(SQLException | ClassNotFoundException sqle){
		sqle.printStackTrace();
	}		
	}
	
}