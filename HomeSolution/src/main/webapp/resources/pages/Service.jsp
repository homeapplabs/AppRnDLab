<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Service</title>
</head>
<body>
<form action="serviceAcion">
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
<h4>Service</h4>

<tr>
<td width="20%" colspan="1">
<s:text name="Country" />
</td>
<td width="20%" colspan="1">
<s:select name="country" label="Country" list="{'India','Great Britain','United State','Japan','Germany'}" headerKey="0"
			headerValue="-Select-" emptyOption="false" theme="simple" />
</td>
<td width="15%" colspan="1" >
<s:text name="State/County"/>
</td>
<td width="15%" colspan="1">
<s:select name="stateCounty" list="{'Uttar Pradesh','Delhi','Punjab','Bihar'}" headerKey="0"
		    headerValue="-Select-" emptyOption="false" theme="simple" />
</td>
<td width="15%" colspan="1">
<s:text name="District/Town" />
</td>
<td width="15%" colspan="1">
<s:select name="districtarea" list="{'NCR','Noida'}" headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple" />
</td>
</tr>

<tr>            
<td width="15%" colspan="1" >
<s:text name="Service Type" />
</td>
<td width="15%" colspan="1">
<s:select name="serviceType" list="{'Automobile','Home Appliances'}" headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple" />
</td>
<td width="20%" colspan="1">
<s:text name="Due Date" />
</td>
<td width="20%" colspan="1">
<s:textfield name="serviceDueDate" size="10" maxlength="10" theme="simple" />
</td>
<td width="60%" colspan="6">
<s:checkbox name="remindMeServiceDueDate" theme="simple" />
<s:text name="Make me Remind" />
</td>
</tr>

<tr>
<td width="100%" colspan="6" align="center">
<s:submit name="addService" label="Submit" value="Submit" theme="simple"/>
<s:submit label="Cancel" value="Cancel" theme="simple"/>
</td>
</tr>
</table>
</form>
</body>
