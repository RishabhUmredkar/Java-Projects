<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jstl Page</title>
</head>
<body>

<h1>This is JSTL Function Example</h1>
<c:set var = "name" value="Happy Republic Day India"></c:set>
<c:out value="${name}"></c:out>


<h1>Length of name is <c:out value="${fn:length(name)}"></c:out></h1>
<c:out value="${fn:toLowerCase(name)}"></c:out>
<br>
<c:out value="${fn:toUpperCase(name)}"></c:out>
<br>
<c:out value = "${fn:contains(name,'India')}"></c:out>
</body>
</html>