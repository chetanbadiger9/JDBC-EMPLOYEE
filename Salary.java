package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Salary {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement= connection.createStatement();
			ResultSet resultset=statement.executeQuery("select * from infosysemp where sal>50000");
			while(resultset.next())
			{
				System.out.println("employee id "+resultset.getInt(1));
				System.out.println("employee name "+resultset.getString(2));
				System.out.println("employee age "+resultset.getInt(3));
				System.out.println("employee gender "+resultset.getString(4));
				System.out.println("employee phno "+resultset.getInt(5));
				System.out.println("employee designation "+resultset.getString(6));
				System.out.println("employee sal "+resultset.getInt(7));
				System.out.println("--------------------------------------");
			}
			
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
