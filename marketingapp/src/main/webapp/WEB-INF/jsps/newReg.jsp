<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>New Reg</h2>
	<form action="saveReg">
	<table>
	<tr>
	<td>First Name</td>
	<td><input type="text" name="firstName"></td>
	</tr>
	<tr>
	<td>Last Name</td>
	<td><input type="text" name="lastName"></td>
	</tr>
	<tr>
	<td>Email</td>
	<td><input type="text" name="email"></td>
	</tr>
	<tr>
	<td>Mobile</td>
	<td><input type="text" name="mobile"></td>
	</tr>
	<tr>
	<td><input type="submit" value="save"></td>
	</tr>
	</table>
	</form>
	
	${msg}
	
	
</body>
</html>