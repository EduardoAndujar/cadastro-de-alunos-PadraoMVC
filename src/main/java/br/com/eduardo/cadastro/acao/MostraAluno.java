package br.com.eduardo.cadastro.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eduardo.cadastro.modelo.Aluno;
import br.com.eduardo.cadastro.modelo.BancoDeDados;

public class MostraAluno implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("==> Classe: MostraAluno");
		
		String idAluno = request.getParameter("id");
		
		BancoDeDados db = new BancoDeDados();
				
		Aluno aluno = db.getAlunoByID(idAluno);
		
		request.setAttribute("aluno", aluno);
		
		return "forward:mostraAluno.jsp";
	}

}
