<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>
<form action="registerAction">
<table width="100%" border="1">
<br/>
	<h4>Customer Registration</h4>
	<s:text name="Login Details" />
	<hr />
	<tr align="center">
		<s:textfield key="register.username" label="Username" name="username" />
		<s:password key="register.password" label="Enter Password"
			name="password" />
		<s:password key="register.password" label="Re-enter Password"
			name="repassword" />
	</tr>
	<tr>
		<td align="center" width="100%" colspan="2">
		<s:submit value="Submit" theme="simple" action="personalAction" />
		<s:submit value="Cancel" theme="simple" />
		</td>
	</tr>
</table>
</form>
</body>
</html>