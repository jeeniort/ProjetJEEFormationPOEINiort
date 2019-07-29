package projetjee.bo;

public class Restaurant 
{
	private int id;
	private String nom;
	private String adresse;
	private String photo;
	
	public Restaurant()
	{
		
	}
	
	public Restaurant (int id, String nom, String adresse, String photo)
	{
		this.setId(id);
		this.setNom(nom);
		this.setAdresse(adresse);
		this.setPhoto(photo);
	}
	
	public Restaurant (String nom, String adresse, String photo)
	{
		this.setNom(nom);
		this.setAdresse(adresse);
		this.setPhoto(photo);
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

	public String getAdresse() 
	{
		return adresse;
	}

	public void setAdresse(String adresse) 
	{
		this.adresse = adresse;
	}

	public String getPhoto() 
	{
		return photo;
	}

	public void setPhoto(String photo) 
	{
		this.photo = photo;
	}
}
