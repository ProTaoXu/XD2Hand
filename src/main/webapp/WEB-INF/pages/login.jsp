<%--
  Created by IntelliJ IDEA.
  User: xd
  Date: 2016/9/16
  Time: 8:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form action="userManage/login" method="post">
      用户id：<br/>
      <form:input path="user.name" id="user-name-label" name="userName" /><br/>
      密码：<br/>
      <form:input path="user.passwd" id="user-password-label" name="userPasswd" />
      <input type="submit" value="登陆" name="Submit"/>
    </form>
    <button onclick="window.location.href=''" value="注册">注册</button>
</body>
</html>
