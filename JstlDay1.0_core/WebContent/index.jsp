<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 
<c:import var = "data" url = "https://www.google.com"/>
<c:out value ="${data}"/>
 -->
 
 
<h1>This is JSTL Example</h1>
<!-- 1. Out tag -->
<!-- 2. Set Tag -->
      
<c:set var="i" value = "23" scope = "application"></c:set>
<h1>	<c:out value ="${i}"></c:out>	</h1>




<hr>
<h1>	<c:out value ="${i}">This is not working</c:out>	</h1>

<!-- 4. If test condition : true => print... -->

<c:if test="${i==23}">
<h1>Yes I is 23 and Condition is true</h1>
<p>This is paragraph in jstl </p>
<h1>	<c:out value ="${i}"></c:out>	</h1>

</c:if>



<!-- .5 Choose , when, otherwise, : java switch -->

<c:choose>
	<c:when test="${i>0}">
		<h1>This is my case 1</h1>	
		<h1>Number is positive</h1>
	</c:when>
	<c:when test="${i<0}">
		<h1>This is my case 2</h1>
		<h1>This is Negative Number</h1>
	</c:when>
	<c:otherwise>
		<h1>Default Case</h1>
	</c:otherwise>
</c:choose>


<!-- 6. ForEach tag : for repeating and traversing -->

<c:forEach var ="j" begin ="1" end = "10">
	<h1>Value of J is	<c:out value="${j*2}"></c:out></h1>
</c:forEach>


<!-- 7. Redirect : send it to the new url -->

<h1>hii</h1>

  
  <c:set var="url" value="0" scope="application"/>  
  <c:if test="${url<1}">  
     <c:redirect url="http://javatpoint.com"/>  
  </c:if>  
  <c:if test="${url>1}">  
     <c:redirect url="http://facebook.com"/>  
  </c:if>  






<c:url var = "myurl" value ="https://www.google.com/search">
	<c:param name="q" value = "Hi this is param tag"></c:param>
</c:url>
<c:out value="${myurl}"></c:out>

<c:redirect url="${myurl}"></c:redirect>



<!-- 3. Remove tag --> 
<!--	<c:remove var="i"></c:remove> -->
<!--  <h1>	<c:out value="${i}">This is default value</c:out>	</h1>	-->

</body>
</html>