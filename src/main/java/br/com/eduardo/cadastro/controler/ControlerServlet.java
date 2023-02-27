package br.com.eduardo.cadastro.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eduardo.cadastro.acao.Acao;

@WebServlet("/controler")
public class ControlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==> Servlet: ControlerServlet");
		
		String parametroAcao = request.getParameter("acao");
		String classeDaAcao = "br.com.eduardo.cadastro.acao." + parametroAcao;
		String stringAcao = null;
		
		try {
			Class classe = Class.forName(classeDaAcao);
			Acao acao = (Acao) classe.newInstance();
			stringAcao = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] tipoEAcao = stringAcao.split(":");
		
		if (tipoEAcao[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEAcao[1]);
			rd.forward(request, response);
		}else if (tipoEAcao[0].equals("redirect")) {
			response.sendRedirect(tipoEAcao[1]);
		}
	}

}
