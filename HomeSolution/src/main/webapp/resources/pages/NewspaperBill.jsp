<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Newspaper Bill</title>
</head>
<body>
<form action="newpaperBillAction">
<table width="100%" border="1">
<h4>Newspaper Bill</h4>
<tr>
<td width="30%" colspan="1">
<s:text name="newspaper.country" />
</td>
<td width="30%" colspan="1">
<s:text name="newspaper.name" />
</td>
<td width="20%" colspan="1">
<s:text name="newspaper.month" />
</td>
<td width="10%" colspan="1">
<s:text name="newspaper.amount" />
</td>
<td width="10%" colspan="1"></td>
</tr>

<tr>
<td width="30%" colspan="1">
<s:select name="country" list="{'India','Great Britain','United State','Japan'}"
			headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple"/>
</td>
<td width="30%" colspan="1">
<s:select name="newspaper" list="{'Times of India','The Hindu','Hindustan Times','Poineer','The Economy Times'}"
			headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple"/>
</td>
<td width="20%" colspan="1">
<s:select name="month" list="{'January','February','March','April','May','June','July','August','September','October','November','December'}"
			headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple"/>
</td>
<td width="10%" colspan="1">
<s:textfield name="newspaperAmount"maxLength="3" size="3" theme="simple"/>
</td>
<td width="10%" colspan="1">
<!--<s:submit name="addNewspaper" key="" label="Add" value="Add" theme="simple"/>-->
<s:submit name="btnAddNewspaper" key="newspaper.add"  theme="simple"/>
</td>
</tr>
</table>
<table border="1" width="100">
<tr>
	<td width="30%" colspan="1">
	<s:text name="newspaper.country" />
	</td>
	<td width="30%" colspan="1">
	<s:text name="newspaper.name" />
	</td>
	<td width="20%" colspan="1">
	<s:text name="newspaper.month" />
	</td>
	<td width="10%" colspan="1">
	<s:text name="newspaper.amount" />
	</td>
	<td width="10%" colspan="1"></td>
</tr>
	<s:iterator value="newpaperList" status="userStatus">
		<tr>
			<td width="30%"><s:property value="country" /></td>
			<td width="30%"><s:property value="newspaper" /></td>
			<td width="20%"><s:property value="month" /></td>
			<td width="10%"><s:property value="newspaperAmount"/></td>
			<td width="10%"><s:submit name="btnDeleteNewspaper" key="newspaper.delete" /></td>
		</tr>
	</s:iterator>
</table>
<table width="100%" border="1">
<tr>
<td width="30%" align="center" colspan="5">
<s:submit name="submitNewspaperBill" key="newspaper.submit" theme="simple"/>
<s:submit name="cancel" key="newspaper.cancel" theme="simple"/>
</td>
</tr>
</table>
</form>
</body>
</html>