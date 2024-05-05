<%-- 
    Document   : templogout
    Created on : Mar 12, 2024, 9:16:37 PM
    Author     : Vikas Raghuvanshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Temp Logout</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("webhome.jsp");
        %>
    </body>
</html>
