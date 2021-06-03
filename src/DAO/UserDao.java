package DAO;

import model.User;
import java.util.UUID;
import java.sql.*;

public class UserDao {
    public int registerUser(User user) throws ClassNotFoundException {

        int result = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");


        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/dbusers","root","bWy2)i2jr<h>")) {
            String INSERT_USERS_SQL = "insert into user( userName, firstName, lastName, password) " +
                    " values(?,?,?,?);";


            PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL);
            preparedStatement.setString(1,user.getFirstname());
            preparedStatement.setString(2,user.getLastname());
            preparedStatement.setString(3,user.getUsername());
            preparedStatement.setString(4,user.getPassword());
            System.out.println(preparedStatement);
            result=preparedStatement.executeUpdate();

        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
}