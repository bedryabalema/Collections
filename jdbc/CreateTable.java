package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
		Statement st = con.createStatement();
		//we are pass DDL
		String sql = "create table emp(empno int(5) primary key, ename varchar(25), sal float(10,2)";
		try {
			st.executeQuery(sql);
			System.out.println("Database table created");
			
		}catch(Exception e) {
			System.out.println("could not create the table "+e.toString());
			
		}
		st.close();
		con.close();

	}

}
