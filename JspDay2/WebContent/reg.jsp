<%@page import="model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id = Integer.parseInt(request.getParameter("Sid"));
String name = request.getParameter("Sname");
String address = request.getParameter("Saddress");
Student s = new Student(id, name, address);
%>
<%-- -- 
<%=id %>
<%=name %>
<%=address %>
<br>
-->
--%>
<%=s %>
<br>
<a href="profile.jsp">profile</a>
</body>
</html>