package ustbatchno3.jdbc_projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Tablevalues {

	public static void main(String[] args) {
		
		    // Set up database connection parameters
		    String url = "jdbc:mysql://localhost:3306/anujaajay";
		    String username = "root";
		    String password = "pass@word1";

		    try {
		      // Create a connection to the database
		      Connection conn = DriverManager.getConnection(url, username, password);

		      // Create a statement object
		      Statement stmt = conn.createStatement();

		     
		      String sql="INSERT INTO employee (name, age, department) VALUES (?, ?, ?)";
		      PreparedStatement pstmt = conn.prepareStatement(sql);

		      
		      String[] names = {"Anuja Ajay", "Aysha Fathima", "Finla","Meera Javad","Swetha Sasi"};
		      int[] ages = {23,25, 28, 24,27};
		      String[] departments = {"Developer", "Marketing", "Sales","Engineering","Research"};

		      for (int i = 0; i < names.length; i++) {
		        pstmt.setString(1, names[i]);
		        pstmt.setInt(2, ages[i]);
		        pstmt.setString(3, departments[i]);
		        pstmt.executeUpdate();
		      }

		      // Close the prepared statement and connection objects
		      pstmt.close();
		      conn.close();

		      System.out.println("Data inserted successfully!");

		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		  }
}



		      
		      



		     