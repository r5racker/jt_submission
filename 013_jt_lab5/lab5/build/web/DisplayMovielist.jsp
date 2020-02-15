<%-- 
    Document   : DisplayMovielist
    Created on : Jan 21, 2020, 3:08:34 PM
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
        <h1>Hello World!</h1>
        <%@page import="MVC.Movie" %>
        <%@page import="java.util.ArrayList" %>
        <%=request.getParameter("sGener")%>
        <%ArrayList<Movie> matched=(ArrayList<Movie>)request.getAttribute("myMovies");%>
        <table>
            <%for(int i=0;i<matched.size();i++){%>
            <tr>
                <jsp:useBean id="movie" class="Movie" scope="page"/>
                <td>
                    <jsp:setProperty name="movie" property="mName" value="<%=(String)matched.get(i).getmName()%>"/>
                    <jsp:getProperty name="movie" property="mName"/>
                     
                </td>
            </tr>
        </table>
    </body>
</html>
