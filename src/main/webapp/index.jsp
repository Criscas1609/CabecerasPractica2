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
<a href="hello-servlet">Hello Servlet</a>
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
<a href="Login.jsp">Login</a>
<br>
<a href="Product.jsp">Producto id</a>
</body>
</html>