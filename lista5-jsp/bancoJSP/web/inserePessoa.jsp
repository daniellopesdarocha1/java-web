<%-- 
    Document   : inserePessoa
    Created on : 20/09/2015, 15:57:25
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inserir Pessoa</h1>
        <form name="inserePessoa" action="validaPessoa.jsp" method="POST">
            Nome: <input type="text" name="NOME" value="">  <br/>
            Idade: <input type="text" name="IDADE" value="">  <br/>
            Sexo: <input type="text" name="SEXO" value="">  <br/>
            <!--Data Nasc: <input type="text" name="DATANASC" value="">  <br>-->
            <input type="submit" name="Enviar" value="Enviar">  <br/>
        </form>
    </body>
</html>