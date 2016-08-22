package com.perou.wiki.controleurs;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Accueil
 */
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Accueil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*String id=request.getParameter("id");
		String mdp=request.getParameter("mdp");
		//int a = Integer.parseInt(request.getParameter("a"));
		//int b = Integer.parseInt(request.getParameter("b"));
		/*StringBuilder content = new StringBuilder();
		if (a > b) {
			content.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			response.setContentType("application/xml");
		} else
			content.append("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"fr\" lang=\"fr\">");
		content.append("<b>tptp</b>");
		//response.getWriter().append(content);
		  */
		/*request.setAttribute("resultat", a+b);
		request.getRequestDispatcher("pages/home.jsp").forward(request, response);*/

		/*if(id=="Chaker" && mdp="OMRI")
		request.setAttribute(id, id);
		request.setAttribute(mdp, mdp);
		request.getRequestDispatcher("pages/connexion.jsp").forward(request, response);*/
		request.getRequestDispatcher("pages/home.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String id=request.getParameter("id");
		String mdp=request.getParameter("mdp");
		if(id.equals("Chaker") && mdp.equals("OMRI")){
			request.setAttribute("id", id);
			this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
		}else{
			String message="Veuillez saisir votre mot de passe";
			request.setAttribute("message", message);
			request.getRequestDispatcher("pages/home.jsp").forward(request, response);
		}
		}

}
