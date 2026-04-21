package com.thanhldt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        String username = "root";
		String password = "12345678";
        String databaseName = "school_management";
		String url = "jdbc:mysql://localhost:3306/";
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url + databaseName, username, password);
			System.out.println("Database connection established.");
			
            // String id = "S04";
			// String name = "E";
			// int age = 29;
			// String sql = String.format("INSERT INTO students (student_id, student_name, age) VALUES ('%s', '%s', %d)", id, name, age);
            // System.out.println("SQL: " + sql);

			// Statement statement = connection.createStatement();
			// statement.executeUpdate(sql);
			// statement.close();

            // String id = "S02";
			// String name = "X";
			// int age = 10;
			// String sql = String.format("UPDATE students SET student_name = '%s', age = %d WHERE student_id = '%s'", name, age, id);
			// System.out.println("SQL: " + sql);

            // Statement statement = connection.createStatement();
			// statement.executeUpdate(sql);
			// statement.close();

            // String id = "S02";
			// String sql = String.format("DELETE FROM students WHERE student_id = '%s'", id);
            // System.out.println("SQL: " + sql);

			// Statement statement = connection.createStatement();
			// statement.executeUpdate(sql);
			// statement.close();

            // String sql = "SELECT * FROM students";
            // System.out.println("SQL: " + sql);

			// Statement statement = connection.createStatement();
			// ResultSet rs = statement.executeQuery(sql);
			// while(rs.next()) {
			// 	System.out.println(rs.getString("student_id") + ", " + rs.getString("student_name") + ", " + rs.getInt("age"));
			// }

			// statement.close();
			// rs.close();

            // String id = "S10";
			// String sql = String.format("SELECT * FROM students WHERE student_id = '%s'", id);
            // System.out.println("SQL: " + sql);

			// Statement statement = connection.createStatement();
			// ResultSet rs = statement.executeQuery(sql);
			// if(rs.next()) {
			// 	System.out.println(rs.getString("student_id") + ", " + rs.getString("student_name") + ", " + rs.getInt("age"));
			// }

			// statement.close();
			// rs.close();

            // String sql = "INSERT INTO students (student_id, student_name, age) VALUES (?, ?, ?)";

			// PreparedStatement statement = connection.prepareStatement(sql);
			// statement.setString(1, "S04");
			// statement.setString(2, "E");
			// statement.setInt(3, 29);
            // System.out.println("SQL: " + statement);

			// statement.executeUpdate();
			// statement.close();

            // String sql = "UPDATE students SET student_name = ?, age = ? WHERE student_id = ?";

			// PreparedStatement statement = connection.prepareStatement(sql);
			// statement.setString(1, "X");
			// statement.setInt(2, 10);
			// statement.setString(3, "S02");
            // System.out.println("SQL: " + statement);

			// statement.executeUpdate();
			// statement.close();

            // String sql = "DELETE FROM students WHERE student_id = ?";

			// PreparedStatement statement = connection.prepareStatement(sql);
			// statement.setString(1, "S02");
            // System.out.println("SQL: " + statement);

			// statement.executeUpdate();
			// statement.close();

            // String sql = "SELECT * FROM students";

			// PreparedStatement statement = connection.prepareStatement(sql);
            // System.out.println("SQL: " + statement);
			// ResultSet rs = statement.executeQuery();
			// while(rs.next()) {
			// 	System.out.println(rs.getString("student_id") + ", " + rs.getString("student_name") + ", " + rs.getInt("age"));
			// }

			// statement.close();
			// rs.close();

            String sql = "SELECT * FROM students WHERE student_id = ?";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "S01");
            System.out.println("SQL: " + statement);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("student_id") + ", " + rs.getString("student_name") + ", " + rs.getInt("age"));
			}
            
			statement.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(connection != null) {
			try {
				connection.close();
				System.out.println("Database connection closed.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

    }

}