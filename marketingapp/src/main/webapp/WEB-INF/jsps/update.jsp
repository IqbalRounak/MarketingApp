<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Update Reg</h2>
	<form action="saveUpdatedLead">
	<table>
	<tr>
	<td><input type="hidden" name="id" value="${lead.id}"></td>
	</tr>
	<tr>
	<td>First Name</td>
	<td><input type="text" name="firstName" value="${lead.firstName}"></td>
	</tr>
	<tr>
	<td>Last Name</td>
	<td><input type="text" name="lastName" value="${lead.lastName}"></td>
	</tr>
	<tr>
	<td>Email</td>
	<td><input type="text" name="email" value="${lead.email}"></td>
	</tr>
	<tr>
	<td>Mobile</td>
	<td><input type="text" name="mobile" value="${lead.mobile}"></td>
	</tr>
	<tr>
	<td><input type="submit" value="update"></td>
	</tr>
	</table>
	</form>
</body>
</html>