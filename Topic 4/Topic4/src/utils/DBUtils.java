package utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by martin on 15/7/2018.
 */
public class DBUtils {

    public static ResultSet executeQuery(MySQLConnection mySQLConnection, String query){
        try {
            Statement statement = mySQLConnection.getConnection().createStatement();

            return statement.executeQuery(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
