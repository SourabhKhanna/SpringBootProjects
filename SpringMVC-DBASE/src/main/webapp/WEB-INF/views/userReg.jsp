<%@ page  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registraion Details</title>
</head>
<body>
<h2> Employee Registration Done And your  details are shown below </h2>



<form action="registerUser" method="post">
<pre>
 Enter Employee Id: <input type="text" name="empid"/><br/>
 Enter Employee FirstName: <input type="text" name="firstName"/><br/>
 Enter Employee LastName: <input type="text" name="lastName"/><br/>
 
 <input type="submit" value="register"/>
</pre>
</form>
<br/>

${result}



</body>
</html>