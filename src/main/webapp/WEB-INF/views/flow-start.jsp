<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Flow Started</title>
</head>
<body>
    <div>
        ${flowExecutionUrl}
        Flow Started
        <a href="${flowExecutionUrl}&_eventId=continue">Finish</a>
    </div>
    <form>
        <input type="hidden" name="execution" value="${flowExecutionKey}" />
        <input type="submit" name="_eventId_sdfsdfdf" value="Finished" />

    </form>

</body>
</html>