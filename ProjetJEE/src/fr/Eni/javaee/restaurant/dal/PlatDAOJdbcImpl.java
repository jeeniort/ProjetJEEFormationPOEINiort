package fr.Eni.javaee.restaurant.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fr.Eni.javaee.restaurant.BusinessException;
import fr.Eni.javaee.restaurant.bo.Commentaire;
import fr.Eni.javaee.restaurant.bo.Plat;
import fr.Eni.javaee.restaurant.bo.Utilisateur;

public class PlatDAOJdbcImpl implements PlatDAO {
	// Requete SQL pour la méthod Insert
	private static final String reqSql_Insert = "INSERT INTO plat(prix,nom,presentation,niveau,cout,nbConvive,listIngredient,imageURL) VALUES(?,?,?,?,?,?,?,?)";
	// Requete SQL pour la méthod reqSql_getListeCommentaireByIdPlat
	private static final String reqSql_getListeCommentaireByIdPlat = "SELECT id_Aliment,libelle FROM aliment where id_aliment "
			+ "in (select idaliment from repas_aliment where id_repas =?";
	// Requete SQL pour la méthod SelectALL
	private static final String reqSql_selectAll = "SELECT id,prix,nom,presentation,niveau,cout,nbConvive,listIngredient,imageURL FROM plat order by id";
	// Requete SQL pour la méthod reqSql_getPlatByIdPlat
	private static final String reqSql_getPlatByIdPlat = "SELECT id,prix,nom,presentation,niveau,cout,nbConvive,listIngredient,imageURL FROM plat where id=?";

	@Override
	public void insert(Plat plat) throws BusinessException {
		if (plat == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_NULL);
			throw businessException;
		}

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(reqSql_Insert, PreparedStatement.RETURN_GENERATED_KEYS);

			pstmt.setFloat(1, plat.getPrix());
			pstmt.setString(2, plat.getNom());
			pstmt.setString(3, plat.getPresentation());
			pstmt.setString(4, plat.getNiveau());
			pstmt.setString(5, plat.getCout());
			pstmt.setInt(6, plat.getNbConvive());
			pstmt.setString(7, plat.getListIngredient());
			pstmt.setString(8, plat.getImageURL());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				plat.setId(rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			if (e.getMessage().contains("CK_AVIS_note")) {
				businessException.ajouterErreur(CodesResultatDAL.INSERT_AVIS_NOTE_ECHEC);
			} else {
				businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_ECHEC);
			}
			throw businessException;
		}

	}

	@Override
	public List<Plat> selectAll() throws BusinessException {
		List<Plat> listePlats = new ArrayList<Plat>();

		listePlats.add(new Plat(1, 10, "Crepe", "Cuite sur la Kampouz de Bécassine", "facile", "bon marché", 12,
				"3 oeufs&&250g de farine&&Vanille&&Sel&&6dl de lait&&Extrai de vanille", "crepes.jpg"));
		listePlats.add(new Plat(2, 10, "Crepe", "Cuite sur la Kampouz de Bécassine", "facile", "bon marché", 12,
				"3 oeufs&&250g de farine&&Vanille&&Sel&&6dl de lait&&Extrai de vanille", "crepes.jpg"));
		listePlats.add(new Plat(3, 10, "Crepe", "Cuite sur la Kampouz de Bécassine", "facile", "bon marché", 12,
				"3 oeufs&&250g de farine&&Vanille&&Sel&&6dl de lait&&Extrai de vanille", "crepes.jpg"));
		listePlats.add(new Plat(4, 10, "Crepe", "Cuite sur la Kampouz de Bécassine", "facile", "bon marché", 12,
				"3 oeufs&&250g de farine&&Vanille&&Sel&&6dl de lait&&Extrai de vanille", "crepes.jpg"));

		/*
		 * try (Connection cnx = ConnectionProvider.getConnection()) { PreparedStatement
		 * pstmt = cnx.prepareStatement(reqSql_selectAll); ResultSet rs =
		 * pstmt.executeQuery();
		 * 
		 * while (rs.next()) { listePlats.add(new Plat(rs.getInt(1), rs.getFloat(2),
		 * rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
		 * rs.getInt(7), rs.getString(8), rs.getString(9))); } } catch (Exception e) {
		 * e.printStackTrace(); BusinessException businessException = new
		 * BusinessException(); if (e.getMessage().contains("CK_AVIS_note")) {
		 * businessException.ajouterErreur(CodesResultatDAL.INSERT_AVIS_NOTE_ECHEC); }
		 * else { businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_ECHEC);
		 * } throw businessException; }
		 */
		return listePlats;
	}

	@Override
	public List<Commentaire> getListeCommentaireByIdPlat(int idPlat) throws BusinessException {
		List<Commentaire> listeCommentaires = new ArrayList<Commentaire>();
		Utilisateur utilisateur = new Utilisateur();
		Plat plat = new Plat();
		if (idPlat == 4)
			listeCommentaires.add(new Commentaire(1, 5, "C'etait bien", utilisateur, plat, LocalDateTime.now()));

		/*
		 * try (Connection cnx = ConnectionProvider.getConnection()) { PreparedStatement
		 * pstmt = cnx.prepareStatement(reqSql_getListeCommentaireByIdPlat); ResultSet
		 * rs = pstmt.executeQuery();
		 * 
		 * while (rs.next()) { listeCommentaires.add(new Commentaire(rs.getInt(1),
		 * rs.getInt(2), rs.getString(3), rs.getTimestamp(6).toLocalDateTime())); } }
		 * catch (Exception e) { e.printStackTrace(); BusinessException
		 * businessException = new BusinessException(); if
		 * (e.getMessage().contains("CK_AVIS_note")) {
		 * businessException.ajouterErreur(CodesResultatDAL.INSERT_AVIS_NOTE_ECHEC); }
		 * else { businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_ECHEC);
		 * } throw businessException; }
		 */
		return listeCommentaires;
	}

	@Override
	public Plat getPlatById(int idPlat) throws BusinessException {
		Plat plat = new Plat();
		if (idPlat == 4) {
			plat = new Plat(4, 10, "Crepe de test", "Cuite sur la Kampouz de Bécassine", "facile", "bon marché", 12,
					"3 oeufs&&250g de farine&&Vanille&&Sel&&6dl de lait&&Extrai de vanille", "crepes.jpg");
		}

		/*
		 * 
		 * try (Connection cnx = ConnectionProvider.getConnection()) { PreparedStatement
		 * pstmt = cnx.prepareStatement(reqSql_getPlatByIdPlat); ResultSet rs =
		 * pstmt.executeQuery();
		 * 
		 * if (rs.next()) { plat = new Plat(rs.getInt(1), rs.getFloat(2),
		 * rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
		 * rs.getInt(7), rs.getString(8), rs.getString(9));
		 * System.out.println(rs.getInt(1)); } } catch (Exception e) {
		 * e.printStackTrace(); BusinessException businessException = new
		 * BusinessException(); if (e.getMessage().contains("CK_AVIS_note")) {
		 * businessException.ajouterErreur(CodesResultatDAL.INSERT_AVIS_NOTE_ECHEC); }
		 * else { businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_ECHEC);
		 * } throw businessException; }
		 */
		System.out.println("Retour BDD " + plat.toString());
		return plat;
	}

}
