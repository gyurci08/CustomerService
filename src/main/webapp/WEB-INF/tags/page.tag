<%@ tag dynamic-attributes="params" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <title>${params.get("title")}</title>
    <style><%@include file="/WEB-INF/css/nav.css"%></style>
</head>
<body>
<div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/">Home</a></li>
            <li><a href="${pageContext.request.contextPath}/list">List</a></li>
        </ul>
    </nav>
</div>
<div>
    <jsp:doBody/>
</div>
</body>
</html>