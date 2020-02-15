<%-- 
    Document   : get_feedback
    Created on : Dec 31, 2019, 2:07:45 PM
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Success!</h1>
        <%!int count=0;%>
        <%="you have visited this page "+ ++count +" times"%>
        <table>
            
             <tr><td>Name:</td> <td><%=request.getParameter("sname")%></td> </tr>
             <tr><td>Email: </td><td><%=request.getParameter("semail")%></td></tr>
             <tr><td>Subject: </td><td><%=request.getParameter("ssubject")%></td></tr>
             <tr><td>Message: </td><td><%=request.getParameter("smessage")%></td></tr>
            <%-- 
                <%@include file="java.util.Enumeration" %>
        
             <%!Enumeration<String> details;%>
             <% details =request.getAttributeNames(); %>
            --%>
        </table>
        <%="Feedback received"%>
    </body>
</html>
