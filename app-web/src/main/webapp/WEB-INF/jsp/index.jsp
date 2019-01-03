<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>测试！！！</title>
</head>
<body>
    测试！！maven分模块的SSM项目!!!!shide
    ${test}
    <c:forEach items="${list}" var="book">
        <p>${book.book_year}</p>
    </c:forEach>
</body>
</html>
