<%-- 
    Document   : inseriContato.jsp
    Created on : 16/09/2015, 08:48:40
    Author     : lab3aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inseri Contato</h1>
        <form name="inseriContato" action="validaContato.jsp" method="POST">
            Nome <input type="text" name="NOME" value="">  <br>
            Email <input type="text" name="EMAIL" value="">  <br>
            End: <input type="text" name="END" value="">  <br>
            <input type="submit" name="Enviar" value="Enviar">  <br>
        </form>
    </body>
</html>
