<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<style>
    .error {
        color: red; 
        font-weight: bold;
    }
</style>


<meta charset="ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>
	<spring:form action="custreg" method="post" modelAttribute="customer">
Name: <spring:input path="name" placeholder="Enter name"/>
		<spring:errors path="name" cssClass="error" />
		<br>
Password:<spring:password path="password" />
		<spring:errors path="password" cssClass="error" />
		<br>
		Gender:
		Male: <spring:radiobutton path="gender" value="M"/> &nbsp; &nbsp;
		Female: <spring:radiobutton path="gender" value="F"/><br>
		<spring:errors path="gender" cssClass="error" />
		<br>
		
<%-- Hobbies:<spring:checkboxes items="${hobbies}" path="hobbies" /> 
Hobbies:
Cricket: <spring:checkbox path="hobbies" value="Circket"/>
Football: <spring:checkbox path="hobbies" value="Football"/>
Swimming: <spring:checkbox path="hobbies" value="Swimming"/>
		<spring:errors path="hobbies" cssClass="error" />
		<br>--%>
City:<spring:select path="locationlist" items="${locationlist}" />
		<spring:errors path="locationlist" cssClass="error" />
		<br>
		<spring:button id="register" name="register" type="submit">Register</spring:button>

	</spring:form>
</body>
</html>