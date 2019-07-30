package fr.Eni.javaee.restaurant.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.Eni.javaee.restaurant.BusinessException;
import fr.Eni.javaee.restaurant.bll.UtilisateurManager;
import fr.Eni.javaee.restaurant.bo.Utilisateur;

/**
 * Servlet implementation class ServletConnexion
 */
@WebServlet("/ServletdeConnexion")
public class ServletdeConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int tentative=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletdeConnexion() {
        super();
        
    }
    
    @Override
    public void init() throws ServletException {
    	tentative=0;
    	super.init();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String mail = null;
	String mot_de_passe = null;
	
	UtilisateurManager utilisateurmanager = new UtilisateurManager();
	
	if (utilisateurmanager.getUtilisateur(mail, mot_de_passe) == -1)
	{
//		int i=0;
		String error = null;
		// il ya erreur
		error = "il y a une erreur";		
		request.setAttribute("error", error);
		tentative++;
		if(tentative==3) {
			tentative=0;
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/inscription.jsp");
			rd.forward(request, response);
		}

		//erreur
	}else
	{
		int idUtilisateur = 0;
		//ok
		try {
			Utilisateur utilisateur = new Utilisateur(utilisateurmanager.selectUtilisateurByIdUtilisateur(idUtilisateur));
		} catch (BusinessException e) {
			
			e.printStackTrace();
		}
	}
		 
			
			
		
	
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/connexion.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
