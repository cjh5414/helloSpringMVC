<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2017. 2. 17.
  Time: 오후 7:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:forEach var="offer" items="${offers}">
    <p><c:out value="${offer}">
        </c:out>
    </p>
    </c:forEach>

</body>
</html>
