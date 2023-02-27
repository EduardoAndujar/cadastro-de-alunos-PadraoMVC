<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkServletEntrada"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	<c:import url="logout-parcial.jsp" />

	Usuario Logado: ${ usuarioLogado.login }	
	<br>
	<br>
	<c:if test="${not empty empresa}">
		<p>Empresa ${empresa} cadastrada com sucesso!</p>
	</c:if>
	<br/>
	Lista de empresas: <br/>
	<ul>
		<c:forEach items="${listaEmpresas}" var="empresa">
			<li>${empresa.nome } || <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/> ||
			<a href="${linkServletEntrada}?acao=MostraEmpresa&id=${empresa.id}">edita</a> 
			<a href="${linkServletEntrada}?acao=RemoveEmpresa&id=${empresa.id}">remove</a></li> 
		</c:forEach>
	</ul>
</body>
</html>