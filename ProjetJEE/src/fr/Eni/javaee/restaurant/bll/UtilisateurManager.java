package fr.Eni.javaee.restaurant.bll;

import fr.Eni.javaee.restaurant.BusinessException;
import fr.Eni.javaee.restaurant.bo.Utilisateur;
import fr.Eni.javaee.restaurant.dal.DAOFactory;
import fr.Eni.javaee.restaurant.dal.UtilisateurDAO;

public class UtilisateurManager {
	private UtilisateurDAO utilisateurDAO;

	public UtilisateurManager() {

		this.utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}

	public void insert(Utilisateur utilisateur) throws BusinessException {
		utilisateurDAO.insert(utilisateur);
	}

	public Utilisateur selectUtilisateurByIdUtilisateur(int idUtilisateur) throws BusinessException {
		return utilisateurDAO.selectUtilisateurById(idUtilisateur);
	}

	public Utilisateur selectUtilisateurByIdCommentaire(int idCommentaire) {
		return utilisateurDAO.selectUtilisateurByIdCommentaire(idCommentaire);
	}
}
