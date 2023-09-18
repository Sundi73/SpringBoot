<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>

<% String name = (String)request.getAttribute("name"); %>

<h1>The name is <%= name %></h1>
</body>
</html>