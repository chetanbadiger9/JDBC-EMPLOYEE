package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Infosys {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement= connection.createStatement();
			statement.execute("insert into infosysemp values(101 ,'tom',22,'male',98765432,'developer',500000)");
			statement.execute("insert into infosysemp values(102 ,'jerry',22,'female',576543211,'testing',480000)");
			statement.execute("insert into infosysemp values(103 ,'oggy',28,'female',971254321,'developer',4500000)");
			statement.execute("insert into infosysemp values(104 ,'jack',34,'male',93426572,'bpm',300000)");
			statement.execute("insert into infosysemp values(105 ,'bob',53,'male',123454637,'accounts',420000)");
			statement.execute("insert into infosysemp values(106 ,'sweety',66,'female',7654378,'data science',250000)");
			statement.execute("insert into infosysemp values(107 ,'olivia',24,'female',984763534,'voice process',350000)");
			statement.execute("insert into infosysemp values(108 ,'joey',22,'male',852762821,'manager',450000)");
			statement.execute("insert into infosysemp values(109 ,'marky',69,'female',2436182,'developer',600000)");
			statement.execute("insert into infosysemp values(110 ,'dee dee',72,'male',63647864,'hr',800000)");
			connection.close();
			System.out.println("data stored");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
