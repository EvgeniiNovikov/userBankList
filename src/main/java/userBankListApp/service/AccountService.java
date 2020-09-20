package userBankListApp.service;

import userBankListApp.models.Account;

import java.util.List;

public interface AccountService {
    int getAllSum();
    List<Account> getAccountList();
}
