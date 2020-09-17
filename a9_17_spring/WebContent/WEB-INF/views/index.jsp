<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>index</h1>
<a href="test1?data1=hong&data2=gildong">test1(get방식)</a><br>
test1:<br>
<form action="test1" method="post">
 data1:<input type="text" name="data1" /><br/>
 data2:<input type="text" name="data2" /><br/>
 <input type="submit" value="테스트1" /><br/>
</form>
<hr/>
test2:<br>
<form action="test2" method="post">
 data1:<input type="text" name="data1" /><br/>
 data2:<input type="text" name="data2" /><br/>
 <input type="submit" value="테스트2" /><br/>
</form>
<hr/>
test3:<br>
<a href="test3?id=hong&name=gildong">test3</a><br>
</body>
</html>