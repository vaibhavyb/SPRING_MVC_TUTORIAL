<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Your Order name is :${order}<h3/>

<form action="final" method="post" modelattribute="person">
<label>Enter ua firstname: </label>
<input type="text" name="first_name"/>
<br><br>
<label>Enter ua lastname: </label>
<input type="text" name="last_name"/>
<br>
<input type="submit"/>
</form>



</body>
</html>