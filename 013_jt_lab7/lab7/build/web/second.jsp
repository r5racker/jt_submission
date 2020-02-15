<%-- 
    Document   : first
    Created on : Jan 28, 2020, 2:02:07 PM
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%if(session.getAttribute("jusername")!=null){%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>second.JSP Page</title>
    </head>
    <body>
        <h1>Welcome to second.jsp</h1><br>
        <a href="logout.jsp">logout</a>
    </body>
</html>
<%
}
else{
%>
<h1>please login First</h1>
<%@include file="login.html" %>
<%
}
%>