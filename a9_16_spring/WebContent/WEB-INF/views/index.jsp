<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>index2</h1>
<hr>
test1:<br>
<form action="test1" method="get">
id:<input type="text" name="id"><br>
name:<input type="text" name="name"><br>
hobby:<input type="checkbox" name="hobby" value="study">공부
<input type="checkbox" name="hobby" value="reading">독서
<input type="checkbox" name="hobby" value="music">음악<br>
<input type="submit" value="테스트1"><br>
</form>
<hr>
<a href="test2?id=222&name=hong&hobby=reading&hobby=music">test2</a>
<hr>
<a href="test4/100/200/300">test4</a>
<hr>
<a href="test5?id=222&name=333&hobby=300&hobby=400">test5</a>
<hr>
<a href="test6?id=222&name=444&hobby=300&hobby=400">test6</a>
<hr>
<a href="test7?id=222&name=lee&hobby=300">test7</a>
<hr>
<a href="test8?id=222&name=lee">test8</a>
<hr>
<form action="board/write" method="post">
이름:<input type="text" name="name"><br>
국어:<input type="text" name="kor"><br>
수학:<input type="text" name="mat"><br>
영어: <input type="text" name="eng"><br>
<input type="submit" value="계산"><br>
</form>

</body>
</html>