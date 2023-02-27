package br.com.eduardo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AutorizacaoFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void destroy() {
	}
	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		System.out.println("==> Filtro: AutorizacaoFilter");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		HttpSession session = request.getSession();
		String acao = request.getParameter("acao");
		
		Boolean NaoEstaLogado = session.getAttribute("usuarioLogado") == null;
		Boolean EUmaAcaoProtegida = acao.equals("FormLogin") || acao.equals("Login") ;
		
		if (NaoEstaLogado && !EUmaAcaoProtegida) {
			response.sendRedirect("controler?acao=FormLogin");
			return;
		}
		
		chain.doFilter(request, response);
		
	}

}
