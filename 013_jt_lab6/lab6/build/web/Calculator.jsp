<%-- 
    Document   : Calculator
    Created on : Jan 27, 2020, 8:58:21 AM
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
        <h1>Welcome to Calculator Web App</h1>
        <jsp:useBean id="cal1" class="calculator.MyCalculator">
            
        </jsp:useBean>
        
        <jsp:setProperty name="cal1" property="*"/>
        <br><h3>Result is:</h3>
        <jsp:getProperty name="cal1" property="result"/>
    </body>
</html>
