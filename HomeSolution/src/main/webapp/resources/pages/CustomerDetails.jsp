<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
<form action="registerAction">
<table width="100%" border="1">
	<h4>Registration Continued ...</h4>
	<tr><s:text name="Personal Details" /></tr>
	<hr />
	<tr>
		<s:textfield key="register.custName" label="Name" name="custName" />
		<s:textfield key="register.custLastName" label="Last Name" name="custLastName" />
	</tr>
	<tr>
		<s:textfield key="register.custDOB" label="Birth Date" name="custDOB" />
		<s:radio name="gender" label="Gender" list="{'Male','Female'}" />
	</tr>
	<tr>
		<s:select label="Gender" name="gender" list="{'Male','Female'}"
			headerKey="{'M','F'}" headerValue="-Select-" emptyOption="Male" />
	</tr>
	<br/>
	<hr />
	<tr>
		<s:textfield key="addressline1" label="Address Line1" name="custAddr1" />
		<s:textfield key="addressline2" label="Address Line2" name="custAddr2" />
	</tr>
	<tr>
	<s:select label="Country" name="country" list="{'India','Great Britian','United State','Japan'}"
			headerKey="{'IN','GB','US','JP'}" headerValue="-Select-" emptyOption="false" />
	</tr>
	<tr>
	<s:select label="State" name="state" list="{'Uttar Pradesh','Delhi','Punjab','Bihar'}"
			headerKey="{'UP','DL','PB','BH'}" headerValue="-Select-" emptyOption="false" />
	</tr>
<tr>
	<s:select label="Distic" name="distic" list="{'Moradabad','Ghaziabad','Meerut','Lucknow'}"
			headerKey="{'MB','GH','MR','LC'}" headerValue="-Select-" emptyOption="false" />
	</tr>
	<tr>
	<s:textfield key="town" label="Town" name="town" />
	</tr>
	<tr>
	<s:textfield key="Postcode" label="Postcode" name="postcode" />
	</tr>
	<tr>
	<s:textfield key="phone" label="Phone" name="phone" />
	</tr>
	<tr>
	<s:textfield key="fax" label="Fax" name="fax" />
	</tr>
	<tr>
	<s:textfield key="mobile" label="Mobile" name="mobile" />
	</tr>
	<tr>
	<s:textfield key="email" label="Email" name="email" />
	</tr>
	<tr>
	<s:textfield name="veriCodeSum"  size="3" maxlength="3"/>
	</tr>
	<tr>
		<td align="center" width="100%" colspan="2">
		<s:submit value="Submit" theme="simple" />
		<s:submit value="Cancel" theme="simple" />
		</td>
	</tr>
</table>
</form>
</body>
</html>