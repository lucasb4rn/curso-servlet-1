<!DOCTYPE html>

<% 
String nomeEmpresa = (String) request.getAttribute("empresa");
System.out.println(nomeEmpresa);
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Empresa <%= nomeEmpresa %> cadastrada com sucesso!!

</body>
</html>