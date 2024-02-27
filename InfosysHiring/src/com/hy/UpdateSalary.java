package com.hy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSalary {
public static void main(String[] args) {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
		Statement statement=connection.createStatement();
		statement.execute("update hiring1 set name='raghu' where experience>20");
		connection.close();
		System.out.println("data saved");
	} 
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
