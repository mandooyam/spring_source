<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>RequestScope</td>
			<td>SessionScope</td>
			<td>ApplicationScope</td>
		</tr>
		<tr>
			<td>test0, result0</td>
			<td><a href="test0">test0</a>, <a href="result0">result0</a></td>
			<td><a href="test0">test0</a>, <a href="result0">result0</a></td>
		</tr>
		<tr>
			<td><a href="test1">test1</a>, <a href="result">result</a></td>
			<td><a href="test1">test1</a>, <a href="result">result</a></td>
			<td><a href="test1">test1</a>, <a href="result">result</a></td>
		</tr>
		<tr>
			<td><a href="test2">test2</a></td>
			<td><a href="test2">test2</a></td>
			<td>test2</td>
		</tr>
		<tr>
			<td><a href="test3">test3</a></td>
			<td><a href="test3">test3</a></td>
			<td>test3</td>
		</tr>
		<tr>
			<td><a href="test4">test4</a></td>
			<td><a href="test4">test4</a></td>
			<td><a href="test4">test4</a></td>
		</tr>
		<tr>
			<td><a href="test5">test5</a></td>
			<td><a href="test5">test5</a></td>
			<td>test5</td>
		</tr>
		<tr>
			<td><a href="test6">test6</a></td>
			<td><a href="test6">test6</a></td>
			<td>test6</td>
		</tr>
		<tr>
			<td><a href="test7">test7</a></td>
			<td><a href="test7">test7</a></td>
			<td>test7</td>
		</tr>
		<tr>
			<td><a href="test8">test8</a></td>
			<td><a href="test8">test8</a></td>
			<td><a href="test8">test8</a></td>
		</tr>
		<tr>
			<td><a href="test9">test9</a></td>
			<td><a href="test9">test9</a></td>
			<td><a href="test9">test9</a></td>
		</tr>
	</table>
</body>
</html>