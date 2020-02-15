<%-- 
    Document   : DayWord
    Created on : Feb 4, 2020, 2:52:57 PM
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="/WEB-INF/tlds/word_of_day_tag_lib" prefix="wd"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Word of the Day</h1>
        <core:choose>
            <core:when test="${empty param.ibox}">
                please Select a Day
                <form action="" method="post">
                <select name="dayOfWeek" id="dayOfWeek">
                    <option id="all" name="all" value="allDays">All Days</option>
                    <option id="mon" name="mon" value="Monday">Monday</option>
                    <option id="tue" name="tue" value="Tuesday">Tuesday</option>
                    <option id="wed" name="wed" value="Wednesday">Wednesday</option>
                    <option id="thu" name="thu" value="Thursday">Thursday</option>
                    <option id="fri" name="fri" value="Friday">Friday</option>
                    <option id="sat" name="sat" value="Saturday">Saturday</option>
                    <option id="sun" name="sun" value="Sunday">Sunday</option>
                </select>
                    <br>
                    <input type="submit">
                </form>
            </core:when>
            <core:otherwise>
                <core:choose>
                    <core:when test="${param.dayOfWeek !='allDays'}">
                        word for ${param.dayOfWeek} is ${wd:wordOfTheDay(param.wordOfDay)}
                    </core:when>
                </core:choose>
            </core:otherwise>
        </core:choose>
    </body>
</html>
