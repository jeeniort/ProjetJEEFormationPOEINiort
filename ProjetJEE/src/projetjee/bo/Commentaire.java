package projetjee.bo;

import java.sql.Date;

public class Commentaire 
{
	private int id;
	private String contenu;
	private int note;
	private Date date;
	private Plat plat;
	private User user;
	
	public Commentaire()
	{
		
	}

	public Commentaire(int id, String contenu, int note, Date date, Plat plat, User user)
	{
		this.setId(id);
		this.setContenu(contenu);
		this.setNote(note);
		this.setPlat(plat);
		this.setUser(user);
	}
	
	public Commentaire(String contenu, int note, Date date, Plat plat, User user)
	{
		this.setContenu(contenu);
		this.setNote(note);
		this.setPlat(plat);
		this.setUser(user);
	}
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getContenu() 
	{
		return contenu;
	}

	public void setContenu(String contenu) 
	{
		this.contenu = contenu;
	}

	public int getNote() 
	{
		return note;
	}

	public void setNote(int note) 
	{
		this.note = note;
	}

	public Date getDate() 
	{
		return date;
	}

	public void setDate(Date date) 
	{
		this.date = date;
	}

	public Plat getPlat() 
	{
		return plat;
	}

	public void setPlat(Plat plat) 
	{
		this.plat = plat;
	}

	public User getUser() 
	{
		return user;
	}

	public void setUser(User user) 
	{
		this.user = user;
	}
}
