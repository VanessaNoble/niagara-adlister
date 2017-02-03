<%--
  Created by IntelliJ IDEA.
  User: vanessamnoble
  Date: 2/1/17
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head><title>Hello world!</title></head>
<body>
<h1>Hello ${student.getName()}!</h1>
<h2>My age is ${student.getAge()}!</h2>
<c:choose>
    <c:when test="${!student.knowsLanguages()}">
        <p>You still have to learn some programming languages.</p>
    </c:when>
    <c:otherwise>
        <p>
            And I know the following languages
        </p>
        <ul>
            <c:forEach var="language" items="${student.getLanguages()}">
                <li>${language}</li>
            </c:forEach>
        </ul>
    </c:otherwise>
</c:choose>
</body>
</html>
