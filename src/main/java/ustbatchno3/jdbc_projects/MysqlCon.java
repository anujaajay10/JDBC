package ustbatchno3.jdbc_projects;
import java.sql.*;  

class MysqlCon{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/anuja","root","pass@word1");  
//here anuja is database name, root is username and pass@word1
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from persons");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  