<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<style>
    h1 {
        color: blue;
        font-size: 24px;
    }
    a {
        color: #248524;
        text-decoration: none;
    }

    button[type="submit"] {
        background-color: #a453ff;
        color: white;
        border: none;
        padding: 10px;
        border-radius: 5px;
        cursor: pointer;
    }
</style>
<br>
<form method="Get" action="${pageContext.request.contextPath}/NewServlet">
    <button type="submit">Probar Cabeceras HTTP Request</button>
</form><br>
<form method="Get" action="${pageContext.request.contextPath}/productos.html">
    <button type="submit">Probar Cabeceras HTTP Response</button>
</form><br>
<form method="Get" action="${pageContext.request.contextPath}/HoraServlet">
    <button type="submit">Probar Actualizar a cada momento</button>
</form><br>
<a href="Login.jsp">Login</a></br>
<a href="Product.jsp">Producto id</a>
</body>
</html>