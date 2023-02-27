package br.com.eduardo.cadastro.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eduardo.cadastro.modelo.Aluno;
import br.com.eduardo.cadastro.modelo.BancoDeDados;

public class ListaAlunos implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("==> Classe: ListaAlunos");
		
		BancoDeDados db = new BancoDeDados();
		List<Aluno> lista = db.getAlunos();
		
		request.setAttribute("listaAlunos", lista);
		return "forward:listaAlunos.jsp";
	}

}
