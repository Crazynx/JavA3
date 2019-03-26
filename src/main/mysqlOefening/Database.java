package src.main.mysqlOefening;

import java.sql.*;

public class Database {

    private Statement statement;
    private Connection connection = null;
    private String query;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void setQuery(String sql) {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        query = sql;
    }

    public ResultSet getQuery() {
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    // TODO: Close Connection, Statement and ResultSet

}
