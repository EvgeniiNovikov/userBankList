package userBankListApp.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;

public class DBConnection {

    String HOST;
    String LOGIN;
    String PASSWORD;
    Connection connection;

    public Connection getConnection () {
        Properties prop = new Properties();
        if (connection == null) {
            try {
                prop.load(new FileInputStream(
                        Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath() + "app.properties"));
                Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
                HOST = prop.getProperty("HOST");
                LOGIN = prop.getProperty("LOGIN");
                PASSWORD = prop.getProperty("PASSWORD");
                connection = DriverManager.getConnection(HOST, LOGIN, PASSWORD);
            } catch (SQLException | ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | IOException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }



}
