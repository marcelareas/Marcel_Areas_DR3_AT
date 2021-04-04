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
<div class="container" style="padding-top: 60px; width: 50% !important;">
    <form action="/usuario/login" method="post">
        <div class="form-group">
            <label>E-mail</label> <input type="email" class="form-control" placeholder="E-mail" name="email">
        </div>

        <div class="form-group">
            <label>Senha</label> <input type="password" class="form-control" placeholder="Senha" name="senha">
        </div>
        <c:if test="${not empty erro}">
            <div class="alert alert-dark">
                <strong>Login Incorreto</strong> ${erro}
            </div>
        </c:if>
        <div class="btn-group">
            <button type="submit" class="btn btn-primary">Login</button>
        </div>
        <div class="btn-group">
            <a href="/usuario" class="btn btn-default" role="button">Criar Conta</a>
        </div>
    </form>
</div>
</body>
</html>