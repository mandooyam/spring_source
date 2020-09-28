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
<h1>test1</h1>
<form:form modelAttribute="dataBean" action="result">
	<form:hidden path="uid"/>
	name: <form:input path="name"/><br/>
	password: <form:password path="pwd" showPassword="true"/><br/>
	intro: <form:textarea path="intro"/><br/>
	job: <form:select path="job">
		<form:option value="student">학생</form:option>
		<form:option value="it">기술자</form:option>
		<form:option value="teacher">교사</form:option>
	</form:select> <br/>
	<hr/>
	job1: <form:select path="job1">
		<form:options items="${job_list1 }" />
	</form:select><br/>
	<hr/>
	job2: <form:select path="job2">
		<form:options items="${job_list2 }" />
	</form:select>
	<hr/>
	job3: <form:select path="job3">
		<form:options items="${job_list3 }" itemLabel="key" itemValue="value"/>
	</form:select> <br/>
	<hr/>
	hobby: <form:checkbox path="hobby1" value="game"/>게임
		<form:checkbox path="hobby1" value="study"/>스터디
		<form:checkbox path="hobby1" value="sleep"/>낮잠 <br/>
	<hr/>
	hobby1: <form:checkboxes items="${job_list1 }" path="job1"/><br/>
	<hr/>
	hobby2: <form:checkboxes items="${job_list2 }" path="job2"/><br/>
	<hr/>
	hobby3: <form:checkboxes items="${job_list3 }" path="job3" itemLabel="key" itemValue="value"/><br/>
	<hr/>
	gender: <form:radiobutton path="gender1" value="male"/>남자
		<form:radiobutton path="gender1" value="female"/>여자<br/>
	<hr/>
	gender1: <form:radiobuttons path="job1" items="${job_list1 }"/><br/>
	<hr/>
	gender2: <form:radiobuttons path="job2" items="${job_list2 }"/><br/>
	<hr/>
	gender3: <form:radiobuttons path="job3" items="${job_list3 }" itemLabel="key"
	itemValue="value"/><br/>
	<form:button disabled="true">확인</form:button>
</form:form>
</body>
</html>