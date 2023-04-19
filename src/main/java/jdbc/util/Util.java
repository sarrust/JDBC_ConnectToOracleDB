package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    public static Connection getConnection() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle" ,
                    "system", "Rustamov1998");
            Statement statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Ошибка не удалось соединиться с Базой Данных!!!");
        }
        return connection;
    }
}
