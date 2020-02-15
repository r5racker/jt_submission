<%-- 
    Document   : logout
    Created on : Jan 28, 2020, 2:19:48 PM
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
        <%
            if(!session.isNew()){
                session.removeAttribute("jusername");
            }
            response.sendRedirect("login.html");
        %>
        <h1>you are logout</h1>
    </body>
</html>
