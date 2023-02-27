package br.com.eduardo.cadastro.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eduardo.cadastro.modelo.BancoDeDados;

public class AlteraAluno implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("==> Classe: AlteraAluno");
		
		String idAluno = request.getParameter("id");
		String novoNome = request.getParameter("nome");
		String novoSobrenome = request.getParameter("sobrenome");
		String novoCurso = request.getParameter("curso");
		String novoCep = request.getParameter("cep");
		String novoAno = request.getParameter("ano");
		
		BancoDeDados db = new BancoDeDados();
		db.alteraAluno(idAluno, novoNome, novoSobrenome, novoCurso, novoCep, novoAno);
		
		return "redirect:controler?acao=ListaAlunos";
	}

}
