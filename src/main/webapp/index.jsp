<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/source/css/reset.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/source/css/login-student.css" />
</head>
<body style="background-image: url('source/images/bg.jpg');">
<div class="page">
    <div class="loginwarrp">
        <div class="logo">登录</div>
        <label  style="margin-top: 5px;color: #F00" >${message}</label>
        <div class="login_form">
            <form  id="Login" name="Login" method="post" onsubmit="" action="${pageContext.request.contextPath}/studentAction_login.action">
                <li class="login-item">
                    <span>用户名：</span>
                    <input type="text" name="username" class="login_input">
                </li>
                <li class="login-item">
                    <span>密　码：</span>
                    <input type="password" name="password" class="login_input">
                </li>
                <li class="login-item verify">
                    <span>验证码：</span>
                    <input type="text" name="checkcode" class="login_input verify_input">
                </li>
                <img id="image1" src="${pageContext.request.contextPath}/ImageChack" border="1" class="verifyimg" height="30px" width="120 px" onClick="getcode"/>
                <div class="clearfix"></div>

                <li class="login-sub">
                    <input type="submit" value="登录" />
                </li>
                <a href="${pageContext.request.contextPath}/studentAction_registerUI.action" style="margin-left: 360px">注册</a>
            </form>
        </div>
    </div>
    <h6 align="center">iCynara-1005</h6>
</div>
<script type="text/javascript">
    function getcode() {
        var randomnum = Math.random();
        var img = document.getElementById("image1");
        img.src = "/ImageChack?d=" + randomnum;
    }
</script>
</body>
</html>