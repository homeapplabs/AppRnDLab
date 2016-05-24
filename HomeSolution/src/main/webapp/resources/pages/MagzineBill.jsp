<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Magzine Bill</title>
</head>
<body>
<form action="magzineBillAction">
<!--<table width="100%" border="0">
<tr>
<td width="17%" colspan="1"><a href="homeAction">Home</a></td>
<td width="17%" colspan="1"><a href="billsAction">Bills</a></td>
<td width="18%" colspan="1"><a href="paymentAction">Payments</a></td>
<td width="17%" colspan="1"><a href="shoppingListAction">Shopping</a></td>
<td width="17%" colspan="1"><a href="contactAction">Contact Us</a></td>
<td width="17%" colspan="1"><a href="aboutUsAction">About Us</a></td>
</tr>
</table>-->
<table width="100%" border="1">
<h4>Magzine Bill</h4>
<tr>
	<td width="30%" colspan="1">
	<s:text name="Country" />
	</td>
  <td width="30%" colspan="1">
  <s:text name="Magzine" />
  </td>
  <td width="20%" colspan="1">
  <s:text name="Month" />
  </td>
  <td width="20%" colspan="1">
  <s:text name="Cost" />
  </td>
  <td width="10%" colspan="1"></td>
</tr>
<tr>
<td width="30%" colspan="1">
<s:select name="country" list="{'India','Great Britain','United State','Japan'}"
			headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple"/>
</td>
<td width="30%" colspan="1">
<s:select name="magzine" list="{'Times of India','Economics Times','Women Era','Poineer','The Economy Times'}"
			headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple"/>
</td>
<td width="20%" colspan="1">
<s:select name="month" list="{'January','February','March','April','May','June','July','August','September','October','November','December'}"
			headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple"/>
</td>
<td width="10%" colspan="1">
<s:textfield name="magzineAmount"maxLength="3" size="3" theme="simple"/>
</td>
<td width="10%" colspan="1">
<s:submit name="addMagzine" label="Add" value="Add" theme="simple"/>
</td>
</tr>
</table>

<table border="1" width="100">
<tr>
	<td width="30%" colspan="1">
	<s:text name="Country" />
	</td>
	<td width="30%" colspan="1">
	<s:text name="Magzine" />
	</td>
	<td width="20%" colspan="1">
	<s:text name="Month" />
	</td>
	<td width="10%" colspan="1">
	<s:text name="Cost" />
	</td>
	<td width="10%" colspan="1"></td>
</tr>
	<s:iterator value="magzineList" status="userStatus">
		<tr>
			<td width="30%"><s:property value="country" /></td>
			<td width="30%"><s:property value="magzine" /></td>
			<td width="20%"><s:property value="month" /></td>
			<td width="10%"><s:property value="magzineAmount"/></td>
			<td width="10%"><s:submit name="deleteMagzine" value="Delete"/></td>
		</tr>
	</s:iterator>
</table>
<table width="100%" border="1">
<tr>
<td width="30%"></td>
<td width="30%" align="right">
<s:submit name="submitMagzineBill" value="Submit" theme="simple"/>
<s:submit name="cancel" value="Cancel" theme="simple"/>
</td>
<td width="20%" ></td>
<td width="10%"></td>
<td width="10%"></td>
</tr>
</table>

</form>
</body>
</html>