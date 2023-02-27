package br.com.eduardo.cadastro.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOut implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("==> Classe: LogOut");
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "redirect:controler?acao=FormLogin";
	}

}
