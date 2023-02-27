<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/controler?acao=NovoAluno" var="linkNovoAluno" />

<c:import url="headEheader.jsp" />

<main>
	<div class="div-geral div-geral-cadastro">
		<h1 class="titulo-principal">Cadastro de aluno</h1>
		<form action="${linkNovoAluno}" method="post">
			<div class="div-nome-sobrenome">
				<label for="idNome">Nome</label> <input id="idNome" type="text"
					name="nome" required /> <label for="idSobrenome">Sobrenome</label>
				<input id="idSobrenome" type="text" name="sobrenome" required />
			</div>
			<div>
				<div class= "div-cadastro-input-geral">
					<label for="dataNascimento">Data de nascimento</label> <input
						id="dataNascimento" type="text" name="dataNascimento" required />
				</div>
				<div class= "div-cadastro-input-geral">
					<label for="idCurso">Curso</label> <input id="idCurso" type="text"
						name="curso" required />
				</div>
				<div class= "div-cadastro-input-geral">
					<label for="idCPF">CPF</label> <input id="idCPF" type="text"
						name="cpf" required />
				</div>
				<div class= "div-cadastro-input-geral">
					<label for="idCEP">CEP</label> <input id="idCEP" type="text"
						name="cep" required />
				</div>
				<div class= "div-cadastro-input-geral">
					<label for="idAno">Ano</label> <input id="idAno" type="number"
						name="ano" min="1" max="9" required />
				</div>
				<div class= "div-cadastro-input-geral">
					<input id="id-botao" type="submit" value="Cadastrar" />
				</div>
			</div>
		</form>
	</div>
</main>

<script src="./js/jquery-3.6.3.min.js"></script>
<script src="./js/jquery.mask.min.js"></script>
<script src="./js/mascaras.js"></script>
<script src="./js/validaData.js"></script>

<c:import url="footer.jsp" />