package br.com.eduardo.cadastro.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eduardo.cadastro.modelo.BancoDeDados;

public class RemoveAluno implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("==> Classe: RemoveAluno");
		
		String idAluno = request.getParameter("id");
		
		BancoDeDados bd = new BancoDeDados();
		bd.removeAluno(idAluno);
		
		return "redirect:controler?acao=ListaAlunos";
	}
	
}
