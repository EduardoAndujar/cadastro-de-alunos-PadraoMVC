<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="headEheader.jsp" />

<c:url value="/controler?acao=MostraAluno" var="linkMostraAluno" />
<c:url value="/controler?acao=RemoveAluno" var="linkRemoveAluno" />

	<main>
		<div class="div-geral div-geral-lista">
			<h1 class="titulo-principal">Lista de Alunos</h1>
			<table>
				<tr>
					<td style="font-weight: bold" class="id-celula">Id</td>
					<td style="font-weight: bold" class="nome-completo-celula">Nome completo</td>
					<td style="font-weight: bold" class="curso-celula">Curso</td>
					<td style="font-weight: bold" class="data-nascimento-celula">Data de nascimento</td>
					<td style="font-weight: bold" class="idade-celula">Idade</td>
					<td style="font-weight: bold" class="cpf-celula">CPF</td>
					<td style="font-weight: bold" class="cep-celula">CEP</td>
					<td style="font-weight: bold" class="ano-celula">Ano</td>
				</tr>
				<c:forEach items="${ listaAlunos }" var="aluno">
					<tr>
						<td class="id-celula">${ aluno.idAluno }</td>
						<td class="nome-completo-celula">${ aluno.nome } ${ aluno.sobreNome }</td>
						<td class="curso-celula">${ aluno.curso }</td>
						<td class="data-nascimento-celula">${ aluno.dataNascimento }</td>
						<td class="idade-celula">${ aluno.idade }</td>
						<td class="cpf-celula">${ aluno.cpf }</td>
						<td class="cep-celula">${ aluno.cep }</td>
						<td class="ano-celula">${ aluno.ano }</td>

						<td class="link"><a
							href="${linkMostraAluno}&id=${aluno.idAluno}"> &#9998;</a></td>
						<td class="link"><a
							href="${linkRemoveAluno}&id=${aluno.idAluno}">&#10060;</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</main>

<c:import url="footer.jsp" />