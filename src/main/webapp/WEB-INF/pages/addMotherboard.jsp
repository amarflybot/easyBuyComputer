<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
	</head>
	<body>
		<h2>Add Employee Data</h2>
		<form:form method="POST" action="/MeraComputer/save.html">
	   		<table>
			    <tr>
			        <td><form:label path="name">MotherBoard Name:</form:label></td>
			        <td><form:input path="name" value="${motherboard.name}" readonly="false"/></td>
			    </tr>

			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table>
		</form:form>

	</body>
</html>