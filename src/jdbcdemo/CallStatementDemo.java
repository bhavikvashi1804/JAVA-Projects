package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallStatementDemo {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student" , "Student@123");
			
			CallableStatement myCall = myConn.prepareCall("{call increase_salaries_for_department(?,?)}");
			
			
			String dept ="Engineering";
			Double increment = 10000.00;
			
			System.out.println("Salaries BEFORE\n");
			showSalaries(myConn, dept);
			
			myCall.setString(1, dept);
			myCall.setDouble(2, increment);
			
			// Call stored procedure
			System.out.println("\n\nCalling stored procedure.  increase_salaries_for_department('" + dept + "', " + increment + ")");
			myCall.execute();
			System.out.println("Finished calling stored procedure");
			
			// Show salaries AFTER
			System.out.println("\n\nSalaries AFTER\n");
			showSalaries(myConn, dept);
			
 		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			close(myConn, myStmt, null);
		}
		
	}
	
	private static void showSalaries(Connection myConn, String theDepartment) throws SQLException {
		PreparedStatement myStmt = null;
		ResultSet myRs = null;

		try {
			// Prepare statement
			myStmt = myConn
					.prepareStatement("select * from employees where department=?");

			myStmt.setString(1, theDepartment);
			
			// Execute SQL query
			myRs = myStmt.executeQuery();

			// Process result set
			while (myRs.next()) {
				String lastName = myRs.getString("last_name");
				String firstName = myRs.getString("first_name");
				double salary = myRs.getDouble("salary");
				String department = myRs.getString("department");
				
				System.out.printf("%s, %s, %s, %.2f\n", lastName, firstName, department, salary);
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			close(myStmt, myRs);
		}

	}
	
	private static void close(Connection myConn, Statement myStmt,
			ResultSet myRs) throws SQLException {
		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			myStmt.close();
		}

		if (myConn != null) {
			myConn.close();
		}
	}
	
	private static void close(Statement myStmt, ResultSet myRs)
			throws SQLException {

		close(null, myStmt, myRs);
	}

}
