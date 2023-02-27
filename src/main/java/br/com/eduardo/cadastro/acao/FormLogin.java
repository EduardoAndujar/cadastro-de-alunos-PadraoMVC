package br.com.eduardo.cadastro.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormLogin implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("==> Classe: FormLogin");
		String aviso = request.getParameter("aviso");
		Boolean avisoBool = false;
		
		if (!(aviso == null) && aviso.equals("true")) {
			avisoBool = true;
		}
		
		request.setAttribute("aviso", avisoBool);
		
		return "forward:formLogin.jsp";
	}

}
