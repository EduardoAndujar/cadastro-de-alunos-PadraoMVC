<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/controler?acao=Login" var="linkLogin" />

<c:import url="headEheader.jsp" />

<main>
	<div class="div-geral div-geral-login">
		<h1 class="titulo-principal">Entrar</h1>
		<form class="form-login" action="${linkLogin}" method="post">
				<label for="idLogin">Login</label>
				<input class="input-login-senha" id="idLogin" type="text" name="login" required /> 
				<label for="idSenha">Senha</label>
				<input class="input-login-senha" id="idSenha" type="password" name="senha" required />
				<c:if test="${aviso == true }"><p id="alerta-login">Usuário ou senha não são compatíveis</p></c:if>
			<div>
					<input id="id-botao" type="submit" value="Entrar" />
			</div>
		</form>
	</div>
</main>

<c:import url="footer.jsp" />