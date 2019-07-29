package fr.Eni.javaee.restaurant.dal;

import fr.Eni.javaee.restaurant.BusinessException;
import fr.Eni.javaee.restaurant.bo.Utilisateur;

public interface UtilisateurDAO {

	public Utilisateur selectUtilisateurById(int idUtilisateur) throws BusinessException;

	public void insert(Utilisateur utilisateur);

	public Utilisateur selectUtilisateurByIdCommentaire(int idCommentaire);


}
