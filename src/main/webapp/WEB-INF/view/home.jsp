<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="headEheader.jsp" />

<main>
	<h1 class="titulo-principal">Projeto</h1>
	<div class="texto-main">
		<p>Projeto que visa a simula��o de um sistema de cadastro de
			alunos em geral com login para permiss�o. O objetivo foi apenas
			praticar os conceitos do padr�o MVC em Java, no qual foi utilizado um
			servlet como controlador e foi aplicado dois Filters para a valida��o
			do login e monitoramento da requisi��o HTTP. Ademais, simulou-se um
			banco de dados na classe 'BancoDeDados' da pr�pria aplica��o, ou
			seja, � reinicializada sempre que o programa for reiniciado. Para a
			execu��o da aplica��o foi utilizado o container Apache Tomcat de
			vers�o 9.0.69. Para o gerenciamento das depend�ncias foi utilizado o
			Apache Maven.</p>
		<br />
		<p>Para a p�gina, foram utilizados as linguagens de marca��o HTML
			e CSS, bem como a linguagem de programa��o JavaScript para fazer a
			valida��o de alguns dados de entrada e a ferramenta JQuery para as
			m�scaras de nome, sobrenome, data, cpf e cep no forms de cadastro.
			Vale ressaltar que para a utiliza��o da biblioteca JSTL (Java
			Standard Tag Library) as p�ginas Web s�o da extens�o '.jsp' (Java
			Server Pages).</p>
	</div>
</main>

<c:import url="footer.jsp" />