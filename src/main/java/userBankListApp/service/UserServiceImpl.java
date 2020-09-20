package userBankListApp.service;

import userBankListApp.dao.DBConnection;
import userBankListApp.models.Account;
import userBankListApp.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserServiceImpl implements UserService {

    Connection connection = new DBConnection().getConnection();

    //THis is method who finds user by his id
    @Override
    public User findUserById(int id) {
        User user = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from user where userId = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String surName = resultSet.getString("surName");
                user = new User(id, name, surName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }


    //This is method who finds the richest user in database
    @Override
    public User getRichestUser() {
        User user = null;
        Account account;
        try {
            ResultSet resultSet = connection.createStatement()
                    .executeQuery("select * from account, user where account.account = (select max(account.account) from account) and account.userId = user.userId;");
            if (resultSet.next()) {
                int id = resultSet.getInt("userId");
                String name = resultSet.getString("name");
                String surName = resultSet.getString("surName");
                user = new User(id, name, surName);
                int accId = resultSet.getInt("accountId");
                int acc = resultSet.getInt("account");
                int accUserId = resultSet.getInt("userId");
                account = new Account(accId, acc, accUserId);
                user.setAccount(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
