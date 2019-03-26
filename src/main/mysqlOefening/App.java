package src.main.mysqlOefening;

import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws SQLException {

        Database database = new Database();

        database.getConnection();
        database.setQuery("SELECT * FROM persons");
        ResultSet resultSet = database.getQuery();

        while(resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }

    }

}
