<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Registration Page </title>
</head>
<body>
	
	<form:form action="processForm" modelAttribute="student">
	
		FirstName: <form:input path="firstName"/>
		<br><br>
		LastName: <form:input path="lastName" />
		<br><br>
		Country: 
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		
		</form:select>
		<br><br>
		
		Favorite Language: 
		<form:radiobuttons path="favLang" items="${student.languageOptions}" />
		
		<br><br>
		<input type="submit" value="SUBMIT" />
		
	</form:form>


</body>
</html>