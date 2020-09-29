<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>test3</h1>
아이디:<spring:message code="dataBean1.id" /><br/>
이름:<spring:message code="dataBean1.name" /><br/>
기타:<spring:message code="dataBean1.temp" arguments="${args }"/><br/>
기타:<spring:message code="dataBean1.lo" /><br/>
국어:<spring:message code="jumsu.kor" />, 영어:<spring:message code="jumsu.eng" /><br/>
</body>
</html>