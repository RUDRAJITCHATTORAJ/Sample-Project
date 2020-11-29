<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Ticket Booking</title>
</head>
<body bgcolor="cyan">
<h1 align="center">Movie Ticket Booking</h1>
<form action="ticketbook" method="post">
<table>
<tr>
<td>Movie Name:</td><td><input type="text" name="mname" id="mname"></td>
</tr>
<tr>
<td>Choose Circle:</td>
<td><select name="circle" id="circle">
<option value="King">King</option>
<option value="Queen">Queen</option>
</select>
</td> 
</tr>
<tr>
<td>No. Of Tickets:</td><td><input type="text" name="noft" id="noft"></td>
</tr>
<tr><td>
<input type="submit" value="Calculate Cost"></td>
</tr>
</table>
</form>
</body>
</html>