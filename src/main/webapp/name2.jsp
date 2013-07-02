<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Enter name</title>
</head>
<body>
    HelloHello, ${param.enterName}
    <form>
        <label>
            Enter name: <input type="text" name="enterName"/>
        </label>
    </form>
</body>
</html>