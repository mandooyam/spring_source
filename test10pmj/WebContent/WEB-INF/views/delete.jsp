<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="delete_pro" method="post" modelAttribute="delMemberBean">
id : <form:input path="id"/><br>
pwd : <form:password path="pwd"/><br>
<form:button>삭제</form:button>
</form:form>
</body>
</html>