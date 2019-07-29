package fr.Eni.javaee.restaurant.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import fr.Eni.javaee.restaurant.bo.Plat;

@Path("/plats")
public class GestionPlats {
	private static List<Plat> listePlats;



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
