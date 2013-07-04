<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Enter name</title>
</head>
<body>

<c:forEach items="${items}" var="aaaa">
     dsad
         ${aaaa}
         x;ljdfsjdfshdhfjas
</c:forEach>

    Hello ${param.enterName}  atributas ${enterName}
    <form>
        <label>
            Enter name: <input type="text" name="enterName"/>
        </label>
    </form>
</body>
</html>