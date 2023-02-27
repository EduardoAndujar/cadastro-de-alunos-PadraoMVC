package br.com.eduardo.cadastro.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.eduardo.cadastro.modelo.BancoDeDados;
import br.com.eduardo.cadastro.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==> Classe: Login");
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		BancoDeDados db = new BancoDeDados();
		Usuario usuario = db.existeUsuario(login, senha);
		
		if (!(usuario == null)) {
			HttpSession session = request.getSession();
			session.setAttribute("usuarioLogado", usuario);
			return "redirect:controler?acao=Home";
		} else {
			return "redirect:controler?acao=FormLogin&aviso=true";
		}
	}

}
