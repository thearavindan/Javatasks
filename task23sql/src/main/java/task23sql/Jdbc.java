package task23sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Jdbc {

	public static void main(String[] args) {
		//creating connection
		String db_url = "jdbc:mysql://localhost:3306/task23";
		String user = "root";
		String pass = "root";
		
		//establishing connection and checking the connection is established or not
	try {
		Connection connection =	DriverManager.getConnection(db_url, user, pass);
		if(connection!=null) {
			System.out.println("connection established");
		}else {
			System.out.println("connection failed");
		}
		
		//creating the query statement
		 java.sql.Statement stmt= connection.createStatement();
		 
		 String createtable = "create table emptable(empcode int not null, \r\n"
		 		+ "ename varchar(20) not null,\r\n"
		 		+ "empage int not null,\r\n"
		 		+ "esalary int not null)";
		 String values = "insert into emptable(empcode, ename, empage, esalary) values \r\n"
		 		+ "(101,'Jenny',25,10000), \r\n"
		 		+ "(102,'Jacky',30,20000), \r\n"
		 		+ "(103,'joe',20,40000), \r\n"
		 		+ "(104,'john',40,80000),\r\n "
		 		+ "(105,'shammer',25,90000)";
		 
		 //executing the statement
		 stmt.executeUpdate(createtable);
		 stmt.executeUpdate(values);
		 
		 //Retrieving the values to print in console
		 String select = "select * from emptable";
		 
		 ResultSet rs = stmt.executeQuery(select);
		 
		 while(rs.next()) {
			 System.out.println(rs.getInt("empcode"));
			 System.out.println(rs.getString("ename"));
			 System.out.println(rs.getInt("empage"));
			 System.out.println(rs.getInt("esalary"));
			 
		 }
		 		
				                               
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
