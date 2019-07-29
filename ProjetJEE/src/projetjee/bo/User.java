package projetjee.bo;

public class User 
{
	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String mdp;
	private String role = "user";
	
	public User()
	{
		
	}

	public User(int id, String nom, String prenom, String mail, String mdp, String role)
	{
		this.setId(id);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setMail(mail);
		this.setMdp(mdp);
		this.role = role;
	}
	
	public User(String nom, String prenom, String mail, String mdp, String role)
	{
		this.setId(id);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setMail(mail);
		this.setMdp(mdp);
		this.role = role;
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

	public String getPrenom() 
	{
		return prenom;
	}

	public void setPrenom(String prenom) 
	{
		this.prenom = prenom;
	}

	public String getMail() 
	{
		return mail;
	}

	public void setMail(String mail) 
	{
		this.mail = mail;
	}

	public String getMdp() 
	{
		return mdp;
	}

	public void setMdp(String mdp) 
	{
		this.mdp = mdp;
	}

	public String getRole() 
	{
		return role;
	}

	public void setRole(String role) 
	{
		this.role = role;
	}
}
