<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Log in</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="LoginVerifierServlet" method="post">
            <table>
                <tr><td>User name</td><td><input type="text" name="username"></td></tr>
                <tr><td>Password</td><td><input type="password" name="password"></td></tr>
                <tr><td><input type="submit" ></td></tr>
            </table>
        </form>
    </body>
</html>
