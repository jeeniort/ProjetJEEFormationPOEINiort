package fr.Eni.javaee.restaurant.bll;

import java.util.List;

import fr.Eni.javaee.restaurant.BusinessException;
import fr.Eni.javaee.restaurant.bo.Commentaire;
import fr.Eni.javaee.restaurant.bo.Plat;
import fr.Eni.javaee.restaurant.dal.DAOFactory;
import fr.Eni.javaee.restaurant.dal.PlatDAO;

public class PlatManager {

	private PlatDAO platDAO;
	private UtilisateurManager utilisateurManager = new UtilisateurManager();

	public PlatManager() {
		this.platDAO = DAOFactory.getPlatDAO();
	}

	public void insert(Plat plat) throws BusinessException {
		platDAO.insert(plat);

	}

	public Plat SelectPlatByIdPlat(int idPlat) throws BusinessException {
		Plat plat = null;
		plat = platDAO.getPlatById(idPlat);
		return plat;
	}

	public List<Commentaire> selectCommentaireByIdPlat(int idPlat) throws BusinessException {
		List<Commentaire> listeCommentaire = null;
		listeCommentaire = platDAO.getListeCommentaireByIdPlat(idPlat);
		for (Commentaire commentaire : listeCommentaire) {
			commentaire.setPlat(SelectPlatByIdPlat(idPlat));
			commentaire.setUtilisateur(utilisateurManager.selectUtilisateurByIdCommentaire(commentaire.getId()));
		}
		return listeCommentaire;
	}

}
