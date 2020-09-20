package userBankListApp.controller;

import userBankListApp.models.User;
import userBankListApp.service.AccountService;
import userBankListApp.service.AccountServiceImpl;
import userBankListApp.service.UserService;
import userBankListApp.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class UserController extends HttpServlet {

    UserService userService = new UserServiceImpl();
    AccountService accountService = new AccountServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();
        switch (action) {
            case "/getById" :
                User user = userService.getRichestUser();
                req.setAttribute("user", user);
                getServletContext().getRequestDispatcher("/jsp/userInfo.jsp").forward(req, resp);
                break;
            case "/getAllSum" :
                int sum = accountService.getAllSum();
                req.setAttribute("sum", sum);
                getServletContext().getRequestDispatcher("/jsp/sumOfAllAccounts.jsp").forward(req, resp);
                break;
        }

    }
}
