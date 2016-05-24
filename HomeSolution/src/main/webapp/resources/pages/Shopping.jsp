<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping</title>
</head>
<body>
<form action="shoppingAction">
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
<h4>Where to Shop</h4>
<tr>
<td width="20%" colspan="1" align="left">
<s:text name="Country"/>
</td>
<td width="20%" colspan="1" align="left">
<s:text name="City"/>
</td>
<td width="20%" colspan="1" align="left">
<s:text name="Product Type"/>
</td>
<td width="20%" colspan="1" align="left">
<s:text name="Brand"/>
</td>
<td width="20%" colspan="1" align="left">
<s:text name="Others"/>
</td>
</tr>
<tr>
<td width="20%" colspan="1" align="left">
<s:select label="Country" name="country" list="{'India','Great Britain','United State','Japan'}"
			headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple"/>
</td>
<td width="20%" colspan="1" align="left">
<s:select label="City" name="city" list="{'Moradabad','Ghaziabad','Meerut','Lucknow'}"
			headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple"/>
</td>
<td width="20%" colspan="1" align="left">
<s:select label="Product Type" name="productType" list="{'Electronics','Gadzets','Home Applieance','Appreals','Food'}"
			headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple"/>
</td>
<td width="20%" colspan="1" align="left">
<s:select label="Brand" name="brand" list="{'LG','Samsung','Nokia','Sony'}"
			headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple"/>
</td>
<td width="20%" colspan="1" align="left">
<s:textfield id="others" theme="simple"/>
</td>
</tr>
<tr>
	<td align="center" width="100%" colspan="5">
	<s:submit value="Search" theme="simple" action="homeAction" />
	<s:submit value="Reset" theme="simple" />
	<s:submit value="Cancel" theme="simple" />
	</td>
</tr>
</table>
</form>
</body>
</html>