package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDemo {
	public static void main(String[] args){
		String dbURL = "jdbc:mysql://localhost:3306/demo";
		String user = "student";
		String pass = "Student@123";
		
		try {

			Connection myConn = DriverManager.getConnection(dbURL,user,pass);
			
			Statement stmt = myConn.createStatement();
			
			
			String query = "delete from employees "+
			"where last_name='Vashi' and first_name='Bhavik' ";
			int rowsAffected = stmt.executeUpdate(query);
			
			System.out.println("No of rows affected "+ rowsAffected);
		
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}


}
