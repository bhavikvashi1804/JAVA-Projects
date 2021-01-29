package jdbcdemo;

import java.sql.*;

public class JDBCInsertDemo {

	public static void main(String[] args){
		String dbURL = "jdbc:mysql://localhost:3306/demo";
		String user = "student";
		String pass = "Student@123";
		
		try {

			Connection myConn = DriverManager.getConnection(dbURL,user,pass);
			
			Statement stmt = myConn.createStatement();
			
			
			String query = "insert into employees "+"(last_name,first_name,email,department,salary) values"+
			"('Vashi','Bhavik','bhavik@gmail.com','HR',33000.00)";
			int rowsAffected = stmt.executeUpdate(query);
			
			System.out.println("No of rows affected"+ rowsAffected);
		
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	
}
