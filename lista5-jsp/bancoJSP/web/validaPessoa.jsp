<%-- 
    Document   : validaPessoa
    Created on : 20/09/2015, 16:02:50
    Author     : Daniel
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.fatec.jdbc.modelo.Pessoa" %>
<%@page import="br.com.fatec.jdbc.DAO.PessoaDAO" %>

<!DOCTYPE html>

<%
    String nome = request.getParameter("NOME");
    int idade = Integer.parseInt(request.getParameter("IDADE"));
    String sexo = request.getParameter("SEXO");
    //Date dataNasc = request.getParameter("DATANASC");
    
    Pessoa p1 = new Pessoa();
    p1.setNome(nome);
    p1.setIdade(idade);
    p1.setSexo(sexo);
    //p1.setDataNasc(dataNasc);
    
    PessoaDAO dao = new PessoaDAO();
    dao.adiciona(p1);
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nome : <%=nome%></h1> <br/>
        <h1>Idade : <%=idade%></h1> <br/>
        <h1>Sexo : <%=sexo%></h1> <br/>
    </body>
</html>