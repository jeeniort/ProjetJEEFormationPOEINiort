package fr.Eni.javaee.restaurant;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import fr.Eni.javaee.restaurant.bo.Plat;

@Path("/plats")
public class GestionPlats {
	private static List<Plat> listePlats;

	static {
		listePlats = new ArrayList<Plat>();

		final String[] listIngredient = { "tomates", "pomme", "viande", "oeuf" };
		listePlats.add(new Plat(1, 13, "Nom du plat", "La recette du vrai taboulé Libanais !", "moyen", "", 6,
				"tomates,pomme,viande,oeuf"));
		listePlats.add(new Plat(2, 13, "Nom du plat1", "La recette du vrai taboulé Libanais !", "moyen", "", 6,
				"tomates,pomme,viande,oeuf"));
		listePlats.add(new Plat(3, 13, "Nom du plat2", "La recette du vrai taboulé Libanais !", "moyen", "", 6,
				"tomates,pomme,viande,oeuf"));

	}

	@GET
	public String getPlats() {
		String retour = "";
		for (Plat plat : listePlats) {
			retour += plat.getNom() + "<br>";
		}
		return retour;
	}

	@GET
	@Path("/{id : \\d+}")
	public String getPrix(@PathParam("id") int id) {
		return "La couleur de l'id " + id + " est " + listePlats.get(id).getPrix();
	}
}
