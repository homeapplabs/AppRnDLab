<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:insertAttribute name="title" ignore="true" />
</title>
</head>

<body>
<table border="1" cellpadding="2" cellspacing="3" align="center" width="100%">
   <tr>
        <td height="5%" colspan="3"><tiles:insertAttribute name="header" /></td>
   </tr>
   <tr>
        <td height="10%" colspan="3"><tiles:insertAttribute name="banner" /></td>
   </tr>
   <tr>
        <td height="5%" colspan="3"><tiles:insertAttribute name="menu" /></td>
   </tr>
   <tr>
   		<td width="10%"><tiles:insertAttribute name="leftMargin" /></td>
        <td width="80%"><tiles:insertAttribute name="body" /></td>
        <td width="10%"><tiles:insertAttribute name="rightMargin" /></td>
   </tr>
   <tr>
        <td height="5%" width="100%" colspan="3"><tiles:insertAttribute name="footer" /></td>
   </tr>
</table>
</body>
</html>