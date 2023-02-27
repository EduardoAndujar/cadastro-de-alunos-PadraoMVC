package br.com.eduardo.cadastro.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eduardo.cadastro.modelo.BancoDeDados;

public class NovoAluno implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("==> Classe: NovoAluno");
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String dataNascimento = request.getParameter("dataNascimento");
		String curso = request.getParameter("curso");
		String cpf = request.getParameter("cpf");
		String cep = request.getParameter("cep");
		String ano = request.getParameter("ano");
		
		BancoDeDados db = new BancoDeDados();
		db.adcionaAluno(nome, sobrenome, dataNascimento, cpf, cep, curso, ano);
		
		return "redirect:controler?acao=ListaAlunos";
	}

}
