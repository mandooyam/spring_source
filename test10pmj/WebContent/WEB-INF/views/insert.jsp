<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삽입화면</title>
</head>
<body>
<form:form action="insert_pro" method="post" modelAttribute="joinMemberBean">
code : <form:input path="code"/><br>
name : <form:input path="name"/><br>
id : <form:input path="id"/><br>
pwd : <form:password path="pwd"/><br>
age : <form:input path="age"/><br>
<form:button>삽입</form:button>
</form:form>
</body>
</html>