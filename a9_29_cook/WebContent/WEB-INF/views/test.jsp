<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>test</h1>
<form action="login">
${name } 아이디<input type="text" name="id" value="${id }"/>
비번<input type="text" name="pw"/>
<input type="submit" value="Login"/><br/>
</form>
<a href="logout">Logout</a><br/>
<a href="load_cookie">load_cookie</a><br/>
</body>
</html>