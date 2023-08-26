package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class HandelDataBase {
	@Test
	public void getdata() throws SQLException
	{
		String uri="jdbc:mysql://localhost:3306/test";
		String un="root";
		String pwd="root";
		Connection connection = DriverManager.getConnection(uri, un, pwd);
			Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from data");
		while(result.next())
		{
		String us = result.getString(1);
		String pass = result.getString(2);
		System.out.println(us+" "+pass);
		
		}
			
		
		
		
		
	}

}
