<%-- 
    Document   : wordCounter
    Created on : Feb 4, 2020, 1:44:39 PM
    Author     : user1
--%>

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
        <form action="" method="post">
        <h1>Enter The String</h1><br>
        <input type="text" name="ibox" id="ibox" value="${param.ibox}">
        <input type="submit">
        </form>
        <core:choose>
            <core:when test="${empty param.ibox}">
                please give input
            </core:when>
            <core:otherwise>
                <core:forTokens items="${fn:toUpperCase(param.ibox)}" delims=" " var="word" varStatus="counter">
            
                ${word}<br>
                <core:if test="${counter.last==true}">
                    count is ${counter.count}
                </core:if>
                    </core:forTokens>
            </core:otherwise>
        </core:choose>
    </body>
</html>
