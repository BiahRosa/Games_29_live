<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1><%= "Hello World!" %></h1>

    <form action="imc" method="post">
        <input type="text" placeholder="Digite o seu nome" name="nome"><br>
        <input type="number" placeholder="Digite o seu peso" name="peso" step="1"><br>
        <input type="number" placeholder="Digite o seu altura" name="altura" step="0.01"><br><br>
        <input type="submit" value="Calcular meu IMC">
    </form>

</body>
</html>