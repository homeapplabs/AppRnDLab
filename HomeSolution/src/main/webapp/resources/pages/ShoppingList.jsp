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
<form action="shoppingListAction">
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
<h4>Shopping List</h4>
<tr>
<td width="45%" colspan="1">
<s:select label="Product Type" name="productType" list="{'Electronics','Gadzets','Home Applieance','Appreals','Food'}"
			headerKey="0" headerValue="-Select-" emptyOption="false" theme="simple"/>
</td>
<td width="10%" colspan="1"></td>
<td width="45%" colspan="1"><s:text name="Selected Items"/></td>
</tr>
<tr>
<td width="45%" colspan="1"><s:textarea id="products" readonly="true" onselect=""  theme="simple"/></td>
<td width="10%" align="center">
<s:submit name="addItem" value="Add Item >>"  theme="simple" />
<s:submit name="removeItem" value="<< Remove" theme="simple" />
</td>
<td width="45%"><s:textarea id="selectedItems" theme="simple"  /></td>
</tr>
<tr>
<td width="100%" colspan="3" align="right">
<s:submit value="Print List" theme="simple" />
</td>
</tr>
<tr>
<td width="100%" colspan="3" align="right">
<a href="shoppingAction">Where to Shop</a>
</td>
</tr>
</table>

</form>
</body>
</html>