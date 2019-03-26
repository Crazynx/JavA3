package src.main.eindopdr2.model;


import java.sql.*;

public class Database {

    private Connection connection;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_3_eindopdr_2", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPerson(Person person) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO persons " +
            "VALUES ('" + person.getFirstname() + "', '" + person.getLastname() + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getPersons() {
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM persons");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }


}
