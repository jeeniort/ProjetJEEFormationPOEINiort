package fr.Eni.javaee.restaurant.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.Eni.javaee.restaurant.BusinessException;
import fr.Eni.javaee.restaurant.bll.PlatManager;
import fr.Eni.javaee.restaurant.bo.Plat;

/**
 * Servlet implementation class ServletRedirigeAjoutPlats
 */
@WebServlet("/ServletRedirigeAjoutPlats")
public class ServletRedirigeAjoutPlats extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletRedirigeAjoutPlats() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/AjouterUnPlat.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PlatManager platmanager = new PlatManager();

		/* Récupération des champs du formulaire. */
		// (float prix, String nom, String presentation, String niveau, String cout, int
		// nbConvive, int nbcommande,String listIngredient, String imageURL)
		float prix = Float.parseFloat(request.getParameter("prix"));
		String nom = request.getParameter("nom");
		String presentation = request.getParameter("presentation");
		String niveau = request.getParameter("niveau");
		String cout = request.getParameter("cout");
		int nbConvive = Integer.parseInt(request.getParameter("nbconvive"));
		int nbcommande = 0;
		String listIngredient = request.getParameter("listIngredient");
		String imageURL = request.getParameter("imageURL");

		try {
			platmanager.insert(new Plat(prix,nom,presentation,niveau,cout,nbcommande,nbcommande,listIngredient,imageURL));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
