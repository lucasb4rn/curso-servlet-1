package br.com.lucas.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListEmpresasServlet
 */
@WebServlet("/listaEmpresas")
public class ListEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.print("<ul>");

		for (Empresa empresa : lista) {
			out.println("<li>" + empresa.getNome() + "</li>");
		}

		out.print("</ul>");

		out.println("</body> </html>");

	}

}