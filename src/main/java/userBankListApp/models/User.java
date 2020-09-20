package userBankListApp.models;

import java.util.Objects;

public class User {

    private int userId;
    private String name;
    private String surName;
    Account account;

    public User() {
    }

    public User(int userId, String name, String surName) {
        this.userId = userId;
        this.name = name;
        this.surName = surName;
    }

    public User(int userId, String name, String surName, Account account) {
        this.userId = userId;
        this.name = name;
        this.surName = surName;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId &&
                Objects.equals(name, user.name) &&
                Objects.equals(surName, user.surName) &&
                Objects.equals(account, user.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, surName, account);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", account=" + account +
                '}';
    }
}
