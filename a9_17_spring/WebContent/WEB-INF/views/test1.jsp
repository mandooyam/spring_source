<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>test1</h1>
<form action="result" method="post">
	이름:<input type="text" name="user_name" value="${userDataBean.user_name }"/><br/>
	아이디:<input type="text" name="user_id" value="${userDataBean.user_id }"/><br/>
	비번:<input type="password" name="user_pw" value="${userDataBean.user_pw }"/><br/>
	우편번호:<input type="text" name="user_postcode" value="${userDataBean.user_postcode }"/><br/>
	주소:<input type="text" name="user_address" value="${userDataBean.user_address }"/><br/>
	<input type="submit" value="결과">
</form>
</body>
</html>