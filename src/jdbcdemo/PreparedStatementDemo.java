package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class PreparedStatementDemo {
	public static void main(String[] args){
		String dbURL = "jdbc:mysql://localhost:3306/demo";
		String user = "student";
		String pass = "Student@123";
		
		try {

			Connection myConn = DriverManager.getConnection(dbURL,user,pass);
			
			PreparedStatement myStmt = myConn.prepareStatement("select * from employees where salary > ? and department =?");
			myStmt.setString(2,"Legal");
			myStmt.setDouble(1, 80000);
			
			ResultSet rs = myStmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("last_name") + ", " + rs.getString("first_name"));
			}
			
			
			
		
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
