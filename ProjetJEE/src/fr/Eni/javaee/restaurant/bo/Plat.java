package fr.Eni.javaee.restaurant.bo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Plat")
public class Plat implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private float prix;
	private String nom;
	private String presentation;
	private String niveau;
	private String cout;
	private int nbConvive;
	private String listIngredient;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getCout() {
		return cout;
	}

	public void setCout(String cout) {
		this.cout = cout;
	}

	public int getNbConvive() {
		return nbConvive;
	}

	public void setNbConvive(int nbConvive) {
		this.nbConvive = nbConvive;
	}

	public String getListIngredient() {
		return listIngredient;
	}

	public void setListIngredient(String listIngredient) {
		this.listIngredient = listIngredient;
	}

	public float getPrix() {
		return prix;
	}

	public Plat() {
		super();
	}

	public Plat(float prix, String nom, String presentation, String niveau, String cout, int nbConvive,
			String listIngredient) {
		super();
		this.prix = prix;
		this.nom = nom;
		this.presentation = presentation;
		this.niveau = niveau;
		this.cout = cout;
		this.nbConvive = nbConvive;
		this.listIngredient = listIngredient;
	}

	public Plat(int id, float prix, String nom, String presentation, String niveau, String cout, int nbConvive,
			String listIngredient) {
		super();
		this.id = id;
		this.prix = prix;
		this.nom = nom;
		this.presentation = presentation;
		this.niveau = niveau;
		this.cout = cout;
		this.nbConvive = nbConvive;
		this.listIngredient = listIngredient;
	}

}