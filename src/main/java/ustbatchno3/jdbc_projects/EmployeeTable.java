package ustbatchno3.jdbc_projects;

import java.sql.*;

public class EmployeeTable {
  public static void main(String[] args) {
	// Set up database connection parameters
	    String url = "jdbc:mysql://localhost:3306/mydb";
	    String username = "root";
	    String password = "mypassword";

	    try {
	      // Create a connection to the database
	      Connection conn = DriverManager.getConnection(url, username, password);

	      // Create a statement object
	      Statement stmt = conn.createStatement();

	      // Execute the CREATE TABLE statement
	      String sql = "CREATE TABLE employee ("
	                 + "id INT NOT NULL AUTO_INCREMENT,"
	                 + "name VARCHAR(255),"
	                 + "age INT,"
	                 + "department VARCHAR(255),"
	                 + "PRIMARY KEY (id)"
	                 + ")";
	      stmt.executeUpdate(sql);

	      // Close the statement and connection objects
	      stmt.close();
	      conn.close();
	      
	      System.out.println("Employee table created successfully!");

	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
	}
   


      
      
