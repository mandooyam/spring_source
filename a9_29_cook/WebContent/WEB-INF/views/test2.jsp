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
<h1>test2</h1>
db의 드라이버:<spring:message code="db.classname" /><br/>
db의 url:<spring:message code="db.url" /><br/>
db의 username:<spring:message code="db.username" /><br/>
db의 password:<spring:message code="db.password" /><br/>

아이디:<spring:message code="dataBean1.id" /><br/>
이름:<spring:message code="dataBean1.name" /><br/>
국어:<spring:message code="jumsu.kor" />, 영어:<spring:message code="jumsu.eng" /><br/>
</body>
</html>