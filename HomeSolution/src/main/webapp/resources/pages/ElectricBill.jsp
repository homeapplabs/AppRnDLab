<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Electric Bill</title>
</head>
<body>
<form action="electricBillAction">
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
<h4>Electric Bill</h4>

<tr>
<td width="15%" colspan="1">
<s:text name="Country" />
</td>
<td width="15%" colspan="1" />
<s:select name="country" label="Country" list="{'India','Great Britain','United State','Japan','Germany'}" headerKey="0"
			headerValue="-Select-" emptyOption="false" theme="simple" />
</td>
<td width="15%" colspan="1">
<s:text name="State/County" />
</td>
<td width="15%" colspan="1">
<s:select name="stateCounty" list="{'Uttar Pradesh','Delhi','Punjab','Bihar'}" headerKey="0"
		headerValue="-Select-" emptyOption="false" theme="simple" />
</td>
<td width="18%" colspan='1' >
<s:text name="Supllier" />
</td>
<td width="18%" colspan='1'>
<s:select name="supllier" list="{'PVVNL','TATA','DEB'}" headerKey="0" headerValue="-Select-" 
            emptyOption="false" theme="simple" />
</td>
</tr>

<tr>
<td width="20%" colspan="1">
<s:text name="Connection Number" />
</td>
<td width="20%" colspan="1" >
<s:textfield name="eleConnNumber" size="5" maxlength="5" theme="simple" />
</td>

<td width=10% colspan="1">
<s:text name="Monthly Rental" />
</td>
<td width="10%" colspan="1">
<s:textfield name="electricMonthlyRental" size="4" maxlength="4" theme="simple" />
</td>
<td width=10% colspan="1">
<s:text name="Rate Per Unit" />
</td>
<td width="10%" colspan="1">
<s:textfield label="Rate Per Unit" id="electricRatePerUnit" size="3" maxlength="3" theme="simple" />
</td>
</tr>

<tr>
<td width="15%" colspan="1">
<s:text name="Previous Reading" />
</td>
<td width="15%" colspan="1">
<s:textfield name="electricPreviousReading" size="10" maxlength="10" theme="simple" />
</td>
<td width=15% colspan="1">
<s:text name="Current Reading"  />
</td>
<td width="15%" colspan="1">
<s:textfield name="electricCurrentReading" size="10" maxlength="10" theme="simple" />
</td>
<td width=10% colspan="1">
<s:text name="Total Amount" />
</td>
<td width="10%" colspan="1">
<s:textfield name="electricBillTotalAmount" size="5" maxlength="5" theme="simple" />
</td>
</tr>

<tr>
<td width=10% colspan="1">
<s:text name="Due Date" />
</td>
<td width="10%" colspan="1">
<s:textfield name="electricBillDueDate" size="10" maxlength="10" theme="simple" />
</td>
<td width="15%" colspan='1' >
<s:text name="Other" />
</td>
<td width="15%" colspan='1'>
<s:textfield name="otherElectricitySupplier" size="10" theme="simple" />
</td>
<td width="50%" colspan="6">
<s:checkbox name="remindMe" theme="simple" />
<s:text name="Make me Remind" />
</td>
</tr>

<tr>
<td width="100%" colspan="8" align="center">
<s:submit name="addElectric" label="Submit" value="Submit" theme="simple"/>
<s:submit label="Cancel" value="Cancel" theme="simple"/>
</td>
</tr>
</table>
</form>

</body>
</html>