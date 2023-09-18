<%@page import="springweb.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>   
       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% String email = (String) request.getAttribute("email");
	String username = (String) request.getAttribute("username");
	String password = (String) request.getAttribute("password");
	
	User user = (User)request.getAttribute("user");
%>


<h1>Sign Up Successfull !!</h1>
<h3>Welcome <%=user.getUsername() %> </h3>
<h3><%=user.getEmail()  %> </h3>
<h3><%=user.getPassword() %></h3>
</body>
</html>