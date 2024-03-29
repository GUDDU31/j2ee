package com.jspiders.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectDemo2 {

	public static void main(String[] args) {

		// 1 step
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2 step
			Connection connection;

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja1", "root", "GKmysql@1996");

			// 3 step
			Statement statement;
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student");

			// 4 step
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " || " + resultSet.getString(2) + " || "
						+ resultSet.getString(3) + " || " + resultSet.getLong(4) + " || ");
			}

			// 5 step
			connection.close();
			statement.close();
			resultSet.close();
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
