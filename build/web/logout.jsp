<%-- 
    Document   : logout
    Created on : Mar 18, 2019, 12:33:05 PM
    Author     : Abdullahi
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
 

 

<c:if test="${sessionScope!=['loginUser']}">
    <%session.invalidate();%>
    <c:redirect url="AdminLogin" />
</c:if>
 
<a href="logout.jsp">Logout 
    <c:out value="${sessionScope['AdminLogin.jsp']}" />
</a>
