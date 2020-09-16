<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>index3</h1>
<hr>
<a href="test1">test1이동--이동</a><br>
<a href="test2?data1=100&data2=200">test2이동--파라메타전달</a><br>
<a href="test3">test3이동-- request객체활용<br>
<a href="test4">test4이동-- model객체활용</a><br>
<a href="test5">test5이동-- ModelAndView객체활용</a><br>
<hr>
<form action="test4" method="get">
이름:<input type="text" name="name"><br>
국어:<input type="text" name="kor"><br>
수학:<input type="text" name="mat"><br>
영어: <input type="text" name="eng"><br>
<input type="submit" value="계산"><br>
</form>

</body>
</html>