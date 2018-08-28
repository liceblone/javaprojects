<%-- 
    Document   : booklist
    Created on : Aug 28, 2018, 1:37:24 AM
    Author     : 19016267_local
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>booklist
        </h1>
        
        <c:forEach items="${list}" var="contact" varStatus="book">
		<tr>
                        <td>"${book.name}"     </td>
                        <td>"${book.author}"    </td>
                </tr>
	</c:forEach>
    </body>
</html>
