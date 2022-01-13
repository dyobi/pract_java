<%--
  Created by IntelliJ IDEA.
  User: dyobi
  Date: 1/6/22
  Time: 5:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="sawon1" class="sawonpkg.Sawon"/>
<jsp:setProperty name="sawon1" property="*"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>출력</h2>
이름은
<jsp:getProperty name="sawon1" property="irum"/>
나이는
<jsp:getProperty name="sawon1" property="na2"/>
</body>
</html>
