<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='spring' uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>input_data1</h1>
	<form action='input_pro1' method='post'>
		id <input type='text' name='id' /> <br />
		<spring:hasBindErrors name="dataBean1">
			<c:if test="${errors.hasFieldErrors('id') }">
						${errors.getFieldError('id').defaultMessage }<br />
			</c:if>
		</spring:hasBindErrors>
		<br /> name : <input type='text' name='name' /><br />
		<spring:hasBindErrors name="dataBean1">
			<c:if test="${errors.hasFieldErrors('name') }">
						${errors.getFieldError('name').defaultMessage }<br />
			</c:if>
		</spring:hasBindErrors>
		<br /> kor : <input type='text' name='kor' /><br />
		<spring:hasBindErrors name="dataBean1">
			<c:if test="${errors.hasFieldErrors('kor') }">
						${errors.getFieldError('kor').defaultMessage }<br />
			</c:if>
		</spring:hasBindErrors>
		<br /> eng : <input type='text' name='eng' /><br />
		<spring:hasBindErrors name="dataBean1">
			<c:if test="${errors.hasFieldErrors('eng') }">
						${errors.getFieldError('eng').defaultMessage }<br />
			</c:if>
		</spring:hasBindErrors>
		<br /> level : <input type="checkbox" name="level" value="middle" />중학생
		<input type="checkbox" name="level" value="high" />고등학생 <input
			type="checkbox" name="level" value="big" />대학생 <br />
		<spring:hasBindErrors name="dataBean1">
			<c:if test="${errors.hasFieldErrors('level') }">
						${errors.getFieldError('level').defaultMessage }<br />
			</c:if>
		</spring:hasBindErrors>
		email : <input type='text' name='email' /><br />
		<spring:hasBindErrors name="dataBean1">
			<c:if test="${errors.hasFieldErrors('email') }">
						${errors.getFieldError('email').defaultMessage }<br />
			</c:if>
		</spring:hasBindErrors>
		<br />
		<button type='submit'>확인</button>
	</form>
</body>
</html>