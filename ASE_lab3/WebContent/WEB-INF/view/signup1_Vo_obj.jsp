<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- This jsp file shows the signup page -->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<f:form action="signin1.htm" method="post" modelAttribute="x">
Signup <br>
fn <f:input path="fn"></f:input><br>
ln <f:input path="ln"></f:input><br>
us <f:input path="us"></f:input><br>
pw <f:input path="pw"></f:input><br>
	<input type="submit" value="submit"></input>
</f:form>
</body>
</html>