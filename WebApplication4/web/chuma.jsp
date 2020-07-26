<%-- 
    Document   : chuma
    Created on : Sep 8, 2015, 8:44:59 AM
    Author     : Vishnu EK
--%>

<%@page import="java.util.*"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            
            Date n = new Date(); 
           
          SimpleFormat y = new SimpleFormat("dd-mm-yyyy");          
            
        %>
        
        <input type="text" value=<%=n%>/>
    </body>
</html>
