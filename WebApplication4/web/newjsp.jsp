<%-- 
    Document   : newjsp
    Created on : Sep 3, 2015, 8:07:00 AM
    Author     : Vishnu EK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function ui(){
            var u= document.forms["er"]["q"].value;//getElementById("q");
            alert(u);
        }
            </script>
        
        
        
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="qwerty" name="er">
            name : <input id="q"type="text" name="uname" value="" />  
            <input type="submit" onclick="ui()">
            </form>
        
        
        
    </body>
</html>
