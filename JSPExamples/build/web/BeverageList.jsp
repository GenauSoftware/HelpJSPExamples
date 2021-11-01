

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <th>Name</th>
                <th>Milliliters Remaining</th>
                <th>Color</th>                
            </tr>
            <tr>
                <td>${coffee.name}</td>
                <td>${coffee.millilitersRemaining}</td>
                <td>${coffee.color}</td>                
            </tr>
        </table>
        
    </body>
</html>
