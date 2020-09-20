package userBankListApp.service;

import userBankListApp.dao.DBConnection;
import userBankListApp.models.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    Connection connection = new DBConnection().getConnection();


    //This is method who calls sum of all accounts
    @Override
    public int getAllSum() {
        int sum = 0;
        try {
            ResultSet resultSet = connection.createStatement().executeQuery("select SUM(account.account) from account");
            while (resultSet.next()) {
                resultSet.getInt(1);
                sum = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sum;
    }


    //This is method who calls List of all accounts
    @Override
    public List<Account> getAccountList() {
        List<Account> accountList = new ArrayList<>();
        try{
            ResultSet resultSet = connection.createStatement().executeQuery("select * from account");
            while (resultSet.next()) {
                Account account = new Account();
                account.setAccountId(resultSet.getInt("accountId"));
                account.setAccount(resultSet.getInt("account"));
                account.setUserId(resultSet.getInt("userId"));
                accountList.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountList;
    }
}
