<%-- 
    Document   : tickerDisplayer
    Created on : Feb 4, 2020, 2:20:11 PM
    Author     : user1
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Amusement park tickets</h1>
        <br>
        
        <core:choose>
            <core:when test="${empty param.c_age}">

                <form action="" method="post">
                Name:<input type="text" name="c_name" id="c_name"><br>
                Age:<input type="text" name="c_age" id="c_age"><br>
                <input type="submit" >
                </form>
            </core:when>
        <core:otherwise>
            Name: ${param.c_name}
            Age: ${param.c_age} 
            Price:
            <core:choose>
                <core:when test="${param.c_age gt 62}">
                    100
                </core:when>
                <core:when test="${param.c_age lt 10}">
                    50
                </core:when>
                <core:otherwise>
                    300
                </core:otherwise>
            </core:choose>
            
        </core:otherwise>
        
        </core:choose>
        
    </body>
</html>
