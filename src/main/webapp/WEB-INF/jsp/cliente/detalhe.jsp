<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <title>App AT</title>
</head>
<body>

<div class="container">
    <h2>Cadastro de Clientes</h2>
    <form action="/cliente/incluir" method="post">
        <div class="form-group">
            <label>Nome:</label> <input type="text" class="form-control" name="nome">
        </div>
        <div class="form-group">
            <label>CPF:</label> <input type="text" class="form-control" name="endereco">
        </div>
        <div class="form-group">
            <label>E-mail:</label> <input type="email" class="form-control" name="email">
        </div>
        <button type="submit" class="btn btn-block">Cadastrar</button>
    </form>
</div>
<br>
<div class="container">
    <h2>Listagem de Clientes</h2>
    <c:if test="${not empty lista}">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Nome</th>
                <th>CPF</th>
                <th>Email</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="c" items="${lista}">
                <tr>
                    <td>${c.nome}</td>
                    <td>${c.cpf}</td>
                    <td>${c.email}</td>
                    <td><a href="/cliente/${c.id}/excluir">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
    <c:if test="${not empty erro}">
        <div class="alert alert-danger">
            <strong>Erro!</strong> ${erro}
        </div>
    </c:if>
    <c:if test="${empty lista}">
        <br>
        <p>Nenhum cliente cadastrado.</p>
        <br>
    </c:if>

    <form action="/home" method="get">
        <button type="submit" class="btn btn-block">Home</button>
    </form>
</div>
</body>
</html>