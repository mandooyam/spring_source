<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>input_data2</h1>
	<form:form action="input_pro2" modelAttribute="dataBean1" method="post">
	id <form:input path="id" type="text" /> <br/>
	<form:errors path="id"/><br/>
	name : <form:input path="name" type="text" /><br/>
	<form:errors path="name"/><br/>
	kor : <form:input path="kor" type="text" /><br/>
	<form:errors path="kor"/><br/>
	eng : <form:input path="eng" type="text" /><br/>
	<form:errors path="eng"/><br/>
	level : <form:checkbox path="level" value="middle"/>중학생
	<form:checkbox path="level" value="high"/>고등학생
	<form:checkbox path="level" value="big"/>대학생 <br/>
	<form:errors path="level"/><br/>
	mail : <form:input path="email" type="text" /><br/>
	<form:errors path="email"/><br/>
	<button type='submit'>확인</button>
	</form:form>
</body>
</html>