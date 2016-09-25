<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: xd
  Date: 2016/9/21
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
  <form action="register" method="post">
    姓名：<form:input path="user.name"/><br/>
    密码: <form:password path="user.passwd"/>
    <input type="submit" value="注册">
  </form>
</body>
</html>
