<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="headEheader.jsp" />

<main>
	<h1 class="titulo-principal">Projeto</h1>
	<div class="texto-main">
		<p>Projeto que visa a simulação de um sistema de cadastro de
			alunos em geral com login para permissão. O objetivo foi apenas
			praticar os conceitos do padrão MVC em Java, no qual foi utilizado um
			servlet como controlador e foi aplicado dois Filters para a validação
			do login e monitoramento da requisição HTTP. Ademais, simulou-se um
			banco de dados na classe 'BancoDeDados' da própria aplicação, ou
			seja, é reinicializada sempre que o programa for reiniciado. Para a
			execução da aplicação foi utilizado o container Apache Tomcat de
			versão 9.0.69. Para o gerenciamento das dependências foi utilizado o
			Apache Maven.</p>
		<br />
		<p>Para a página, foram utilizados as linguagens de marcação HTML
			e CSS, bem como a linguagem de programação JavaScript para fazer a
			validação de alguns dados de entrada e a ferramenta JQuery para as
			máscaras de nome, sobrenome, data, cpf e cep no forms de cadastro.
			Vale ressaltar que para a utilização da biblioteca JSTL (Java
			Standard Tag Library) as páginas Web são da extensão '.jsp' (Java
			Server Pages).</p>
	</div>
</main>

<c:import url="footer.jsp" />