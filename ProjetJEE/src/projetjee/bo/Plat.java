package projetjee.bo;

public class Plat 
{
	private int id;
	private String nom;
	private String ingredients;
	private String descriptif;
	private float prix;
	private String image;
	private int quantite = 1;
	private Restaurant restaurant;
	
	public Plat()
	{
		
	}
	
	public Plat(int id, String nom, String ingredients, String descriptif, float prix, String image, int quantite, Restaurant restaurant)
	{
		this.setId(id);
		this.setNom(nom);
		this.setIngredients(ingredients);
		this.setDescriptif(descriptif);
		this.setPrix(prix);
		this.setImage(image);
		this.quantite = quantite;
		this.setRestaurant(restaurant);
	}
	
	public Plat(String nom, String ingredients, String descriptif, float prix, String image, int quantite, Restaurant restaurant)
	{
		this.setNom(nom);
		this.setIngredients(ingredients);
		this.setDescriptif(descriptif);
		this.setPrix(prix);
		this.setImage(image);
		this.quantite = quantite;
		this.setRestaurant(restaurant);
	}
	
	public Plat(String nom, String ingredients, String descriptif, float prix, int quantite, Restaurant restaurant)
	{
		this.setNom(nom);
		this.setIngredients(ingredients);
		this.setDescriptif(descriptif);
		this.setPrix(prix);
		this.quantite = quantite;
		this.setRestaurant(restaurant);
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getNom() 
	{
		return nom;
	}

	public void setNom(String nom) 
	{
		this.nom = nom;
	}

	public String getIngredients() 
	{
		return ingredients;
	}

	public void setIngredients(String ingredients) 
	{
		this.ingredients = ingredients;
	}

	public String getDescriptif() 
	{
		return descriptif;
	}

	public void setDescriptif(String descriptif) 
	{
		this.descriptif = descriptif;
	}

	public float getPrix() 
	{
		return prix;
	}

	public void setPrix(float prix) 
	{
		this.prix = prix;
	}

	public String getImage() 
	{
		return image;
	}

	public void setImage(String image) 
	{
		this.image = image;
	}

	public int getQuantite() 
	{
		return quantite;
	}

	public void setQuantite(int quantite) 
	{
		this.quantite = quantite;
	}

	public Restaurant getRestaurant() 
	{
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) 
	{
		this.restaurant = restaurant;
	}
}
