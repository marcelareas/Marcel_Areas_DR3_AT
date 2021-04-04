<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>App AT</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<div class="jumbotron text-center">
    <h1>${user.nome}</h1>
    <p>${user.email}</p>
</div>

<div class="container">

    <main>
        <div class="bg-light p-5 rounded">
            <h3>Acesse o seu github!</h3>
            <p><a href="${user.git}" target="_blank">Github</a></p>

        </div>
    </main>
    <div class="row">
        <div class="col-sm-4">
            <h5>Novo Cliente</h5>
            <p><a href="/cliente">Cliente</a></p>
        </div>
        <div class="col-sm-4">
            <h5>Novo Livro</h5>
            <p><a href="/livro">Livro</a></p>
        </div>
    </div>
</div>
</body>
</html>