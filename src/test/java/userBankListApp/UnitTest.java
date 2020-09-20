package userBankListApp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import userBankListApp.models.Account;
import userBankListApp.models.User;
import userBankListApp.service.UserService;
import userBankListApp.service.UserServiceImpl;

public class UnitTest {

    private UserService userService;

    @Before
    public void init() {
        this.userService = new UserServiceImpl();
    }

    @Test
    public void getUserByIdTest() {
        User user = userService.findUserById(1);
        Assert.assertNotNull(user);
    }

    @Test
    public void getRichestUser() {
        Assert.assertEquals(userService.getRichestUser(), new User(10, "Petr", "Petrov",
                new Account(10, 555000, 10)));
    }

}
