<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TV Re-charge</title>
</head>
<body>
<form action="tvRechargeAction">
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
<h4>TV Recharge</h4>

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
<s:select name="districtarea" list="{'NCR','Noida'}" headerKey="0" headerValue="-Select-" 
                              emptyOption="false" theme="simple" />
</td>
</tr>

<tr>            
<td width="20%" colspan="1">
<s:text name="Service Provider" />
</td>
<td width="20%" colspan="1" >
<s:select name="serviceprovider" list="{'Tata Sky','Airtel','Dish TV'}" headerKey="0" headerValue="-Select-" 
                                emptyOption="false" theme="simple" />
</td>
<td width="20%" colspan="1">
<s:text name="Total Amount" />
</td>
<td width="20%" colspan="1" >
<s:textfield name="tvRechargeAmount" size="10" maxlength="10" theme="simple" />
</td>
<td width="20%" colspan="1">
<s:text name="Due Date" />
</td>
<td width="20%" colspan="1">
<s:textfield name="tvRechargeDueDate" size="10" maxlength="10" theme="simple" />
</td>
</tr>
<tr>
<td width="15%" colspan="1">
<s:text name="Account Number" />
</td>
<td width="15%" colspan="1" >
<s:textfield name="accountNumber" size="5" maxlength="5" theme="simple" />
</td>
<td width="15%" colspan='1' >
<s:text name="Other" />
</td>
<td width="15%" colspan='1'>
<s:textfield name="otherOperator" size="10" theme="simple" />
</td>
<td width="40%" colspan="6">
<s:checkbox name="remindMeTVRechargeDueDate" theme="simple" />
<s:text name="Make me Remind" />
</td>
</tr>

<tr>
<td width="100%" colspan="6" align="center">
<s:submit name="addTVRecharge" label="Submit" value="Submit" theme="simple"/>
<s:submit label="Cancel" value="Cancel" theme="simple"/>
</td>
</tr>
</table>
</form>
</body>
