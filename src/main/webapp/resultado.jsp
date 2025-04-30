<%@ page import="br.dev.biah.games_29.domain.Imc" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%

    Imc imc = (Imc) request.getAttribute("imc");


%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Resultado do seu IMC</h1>

    <ul>
        <li>Nome: <%= imc.getNome()%></li>
        <%
            double peso = imc.getPeso();
        %>
        <li>Peso: <%= peso %></li>
        <li>Altura: <%= imc.getAltura()%></li>
        <li>IMC: <%= imc.getImc()%></li>
    </ul>
</body>
</html>
