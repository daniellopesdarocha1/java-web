<%-- 
    Document   : listaContato.jsp
    Created on : 16/09/2015, 10:01:17
    Author     : lab3aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="br.com.fatec.jdbc.modelo.Contato" %>
<%@page import="br.com.fatec.jdbc.DAO.ContatoDAO" %>

<!DOCTYPE html>
<%
    ContatoDAO dao = new ContatoDAO();
    List<Contato> contatos = dao.getlista() ;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <% for (Contato contato : contatos) { %>
            Id: <%=contato.getId()%>
            Nome: <%=contato.getNome()%>
            Email: <%=contato.getEmail()%>
            Endereço: <%=contato.getEndereco()%>
            <br>
     <% } %>

    </body>
</html>
