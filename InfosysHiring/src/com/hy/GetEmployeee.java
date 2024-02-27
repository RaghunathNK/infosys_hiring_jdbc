package com.hy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetEmployeee {
public static void main(String[] args) {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from hiring1");
		while(resultSet.next())
		{	
			System.out.println("the hiring1 id is "+resultSet.getInt(1));
			System.out.println("the hiring1 name is "+resultSet.getString(2));
			System.out.println("the hiring1 age is "+resultSet.getInt(3));
			System.out.println("the hiring1 name is "+resultSet.getString(4));
			System.out.println("----------------------------------");
		}
	} 
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
