package com.jspiders.jdbctask.sqloperation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class JdbcSqlOperations {
	private static Connection connection;
	private static Statement statement;
	private static Properties properties;
	private static FileReader fileReader;
	private static ResultSet resultSet;
	private static String filePathString = "D://WEJA1//jdbctask//resources//db_info.properties";
	private static Scanner sc = new Scanner(System.in);
	private static String query;
	public static JdbcSqlOperations jdbcSqlOperation = new JdbcSqlOperations();

	// common operations
	// according to user needs
	// create,delete,insert,update,drop,display records/table
	public void sqlOperations(int input) {

		try {
			fileReader = new FileReader(filePathString);
			properties = new Properties();
			properties.load(fileReader);

			Class.forName(properties.getProperty("driverPath"));
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			
			statement = connection.createStatement();

			switch (input) {
			case 1:
				System.out.println("Creating Table ....\nWrite Your Query Below (press 0 to go back):- ");
				jdbcSqlOperation.createTable();
				break;
			case 2:
				System.out.println("Inserting Records....\nWrite Your Query Below (press 0 to go back):- ");
				jdbcSqlOperation.insertRecords();
				break;
			case 3:
				System.out.println("Updating Records....\nWrite Your Query Below (press 0 to go back):- ");
				jdbcSqlOperation.updateRecords();
				break;
			case 4:
				System.out.println("Deleting Records....\nWrite Your Query Below (press 0 to go back):- ");
				jdbcSqlOperation.deleteRecords();
				break;
			case 5:
				System.out.println("Displaying Records....\nEnter Your Query Below (press 0 to go back)");
				jdbcSqlOperation.displayRecords();
				break;
			case 6:
				jdbcSqlOperation.displayTables();
				break;
			case 7:
				System.out.println("Dropping Table....\nEnter Your Query Below (press 0 to go back)");
				jdbcSqlOperation.dropTable();
				break;

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
				if (statement != null)
					statement.close();
				if (fileReader != null)
					fileReader.close();
				if (resultSet != null)
					resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// creating table if input 0 return to caller
	// if query has exception scan input again
	// printing (int)result
	public void createTable() {
		boolean loop = true;
		int result;
		while (loop) {
			try {
				query = sc.nextLine();
				if (query.equals("0")) {
					return;
				}
				result = statement.executeUpdate(query);
				System.out.println("Query Ok, " + result + " row(s) affected\n");
				break;
			} catch (SQLException e) {
				System.out.println("Enter Proper Query Below or (change table name/ '0' to go back)");
			}
		}

	}

	// inserting records in table if input 0 return to caller
	// if query has exception scan input again
	// printing (int)result
	public void insertRecords() {
		boolean loop = true;
		int result;
		while (loop) {
			query = sc.nextLine();
			if (query.equals("0")) {
				return;
			}
			try {
				result = statement.executeUpdate(query);
				System.out.println("Query Ok, " + result + " row(s) affected\n");
				break;
			} catch (SQLException e) {
				System.out.println("Enter Proper Query Below or '0' to go back");
			}
		}
	}

	// updating records in table if input 0 return to caller
	// if query has exception scan input again
	// printing (int)result
	public void updateRecords() {
		boolean loop = true;
		int result;
		while (loop) {
			query = sc.nextLine();
			if (query.equals("0")) {
				return;
			}
			try {
				result = statement.executeUpdate(query);
				System.out.println("Query Ok, " + result + " row(s) affected\n");
				break;
			} catch (SQLException e) {
				System.out.println("Enter Proper Query Below or '0' to go back");
			}
		}
	}

	// deleting records from table if input 0 return to caller
	// if query has exception scan input again
	// printing (int)result
	public void deleteRecords() {
		boolean loop = true;
		int result;
		while (loop) {
			query = sc.nextLine();
			if (query.equals("0")) {
				return;
			}
			try {
				result = statement.executeUpdate(query);
				System.out.println("Query Ok, " + result + " row(s) affected\n");
				break;
			} catch (SQLException e) {
				System.out.println("Enter Proper Query Below or '0' to go back");
			}
		}

	}

	// displaying records from table
	// no user input query needed
	// printing resultSet
	public void displayTables() {
		int i=1;
		try {
			resultSet = statement.executeQuery("show tables");
			System.out.println();
			System.out.println("|----------------------------------|\n" + "|            TABLE NAMES           |\n"
					+ "|----------------------------------|");
			while (resultSet.next()) {
				System.out.println(" "+i+". Table Name:- " + resultSet.getString(1));
				i++;
			}
			System.out.println("|----------------------------------|\n");
		} catch (SQLException e) {
			System.out.println("Enter Proper Query Below or '0' to go back");
		}

	}

	// droping table if input 0 return to caller
	// if query has exception scan input again
	// printing (int)result
	public void dropTable() {
		boolean loop = true;
		int result;
		while (loop) {
			query = sc.nextLine();
			if (query.equals("0")) {
				return;
			}
			try {
				result = statement.executeUpdate(query);
				System.out.println("Query Ok, " + result + " row(s) affected\n");
				break;
			} catch (SQLException e) {
				System.out.println("Enter Proper Query Below or '0' to go back");
			}
		}

	}

	// displaying records from table if input 0 return to caller
	// if query has exception scan input again
	// printing resultSet according to column numbers present in given table by using resultSetmetaData interface
	// by using getcolumnCount() method we can get column count as int value
	public void displayRecords() {
		boolean loop = true;
		while (loop) {
			query = sc.nextLine();
			if (query.equals("0")) {
				return;
			}
			System.out.println();
			try {
				resultSet = statement.executeQuery(query);
				ResultSetMetaData resultSetMetaData = (ResultSetMetaData) resultSet.getMetaData();
				int column = resultSetMetaData.getColumnCount();
				System.out.println("|----------------------------------|\n" + "|               TABLE              |\n"
						+ "|----------------------------------|");
				switch (column) {
				case 1:
					while (resultSet.next()) {
						System.out.println("| " + resultSet.getString(1));
					}
					break;
				case 2:
					while (resultSet.next()) {
						System.out.println("| " + resultSet.getString(1) + " | " + resultSet.getString(2));
					}
					break;
				case 3:

					while (resultSet.next()) {
						System.out.println("| " + resultSet.getString(1) + " | " + resultSet.getString(2) + " | "
								+ resultSet.getString(3));
					}
					break;
				case 4:
					while (resultSet.next()) {
						System.out.println("| " + resultSet.getString(1) + " | " + resultSet.getString(2) + " | "
								+ resultSet.getString(3) + " | " + resultSet.getString(4));
					}
					break;
				case 5:
					while (resultSet.next()) {
						System.out.println("| " + resultSet.getString(1) + " | " + resultSet.getString(2) + " | "
								+ resultSet.getString(3) + " | " + resultSet.getString(4) + " | "
								+ resultSet.getString(5));
					}
					break;
				}
				System.out.println("|----------------------------------|");
				break;
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Enter Proper Query Below");
			}
		}
	}

}
