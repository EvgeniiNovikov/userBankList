package userBankListApp.service;

import userBankListApp.models.User;

public interface UserService {
    User findUserById(int id);
    User getRichestUser();
}
