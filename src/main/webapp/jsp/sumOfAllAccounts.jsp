
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>SumOfAllAccounts</title>
</head>
<body>
<ul>
<%
    int sum = (int) request.getAttribute("sum");
    out.println("The sum of all Accounts is " + sum);
%>
</ul>
</body>
</html>
