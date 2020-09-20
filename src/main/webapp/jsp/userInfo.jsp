<%@ page import="userBankListApp.models.User" %>
<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>UserInfo</title>
</head>
<body>
<ul>
    <%
        User user = (User) request.getAttribute("user");
        if (Objects.nonNull(user)) {
            out.print(user.getUserId() + " ");
            out.print(user.getName() + " ");
            out.println(user.getSurName());
            out.println(user.getAccount().toString());

        }
    %>
</ul>
</body>
</html>
