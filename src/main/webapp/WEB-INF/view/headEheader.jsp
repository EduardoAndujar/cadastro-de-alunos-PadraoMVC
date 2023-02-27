<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.eduardo.cadastro.modelo.Aluno"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/controler?acao=Home" var="linkHome" />
<c:url value="/controler?acao=FormCadastro" var="linkFormsCadastro" />
<c:url value="/controler?acao=ListaAlunos" var="linkListaAlunos" />
<c:url value="/controler?acao=LogOut" var="linkLogOut" />

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<link type="text/css" rel="stylesheet"
	href="<c:url value="./css/reset.css"/>" />
<link type="text/css" rel="stylesheet"
	href="<c:url value="./css/style.css"/>" />

<title>Cadastro de materiais</title>
</head>
<body>
	<header>
		<a id="logo-nav" href="${linkHome}"> <img
			src="./img/minhaLogo.png" alt="whatever" />
		</a>
		<nav>
			<a href="${linkFormsCadastro}"> Cadastrar aluno</a>
			<a href="${linkListaAlunos}"> Alunos cadastrados</a>
			<a href="${linkLogOut}"> Log Out</a>
		</nav>
	</header>