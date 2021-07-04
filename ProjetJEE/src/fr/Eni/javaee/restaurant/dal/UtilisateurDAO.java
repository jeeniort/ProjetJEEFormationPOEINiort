package fr.Eni.javaee.restaurant.dal;

import java.util.List;

import fr.Eni.javaee.restaurant.BusinessException;
import fr.Eni.javaee.restaurant.bo.Commentaire;
import fr.Eni.javaee.restaurant.bo.Utilisateur;

public interface UtilisateurDAO {

	public Utilisateur selectUtilisateurById(int idUtilisateur) throws BusinessException;

	public void insert(Utilisateur utilisateur) throws BusinessException;

	public List<Commentaire> getCommentairesByIdUtilisateur(int idCommentaire) throws BusinessException;

	public int getIdUtilisateurByMailPassword(String mail, String password) throws BusinessException;


}
