<%-- 
    Document   : validaContato.jsp
    Created on : 16/09/2015, 08:49:00
    Author     : lab3aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.fatec.jdbc.modelo.Contato" %>
<%@page import="br.com.fatec.jdbc.DAO.ContatoDAO" %>

<!DOCTYPE html>

<%
    String nome = request.getParameter("NOME");
    String email = request.getParameter("EMAIL");
    String endereco = request.getParameter("END");
    Contato c1 = new Contato();
    c1.setNome(nome);
    c1.setEmail(email);
    c1.setEndereco(endereco);
    ContatoDAO dao = new ContatoDAO();
    dao.adiciona(c1);
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nome : <%=nome%></h1> <br>
        <h1>Email : <%=email%></h1> <br>
        <h1>End : <%=endereco%></h1> <br>
    </body>
</html>
</form>
