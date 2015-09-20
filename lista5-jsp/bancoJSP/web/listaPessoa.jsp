<%-- 
    Document   : listaPessoa
    Created on : 20/09/2015, 16:23:54
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="br.com.fatec.jdbc.modelo.Pessoa" %>
<%@page import="br.com.fatec.jdbc.DAO.PessoaDAO" %>

<!DOCTYPE html>
<%
    PessoaDAO dao = new PessoaDAO();
    List<Pessoa> pessoa = dao.getlista() ;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <% for (Pessoa pessoas : pessoa) { %>
            IdPessoa: <%=pessoas.getIdPessoa()%>
            Nome: <%=pessoas.getNome()%>
            Idade: <%=pessoas.getIdade()%>
            Sexo: <%=pessoas.getSexo()%>
            <br/>
     <% } %>
     
    </body>
</html>
