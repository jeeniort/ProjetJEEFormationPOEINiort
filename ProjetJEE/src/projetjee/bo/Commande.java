package projetjee.bo;

import java.util.ArrayList;
import java.util.List;

public class Commande 
{
	private int id;
	private List<Plat> listePlats;
	private Table table;
	
	public Commande()
	{
		
	}
	
	public Commande(int id, List<Plat> listePlats, Table table)
	{
		this.setId(id);
		this.listePlats = new ArrayList<Plat>();
		this.table = table;
	}
	
	public Commande(List<Plat> listePlats, Table table)
	{
		this.listePlats = new ArrayList<Plat>();
		this.table = table;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public List<Plat> getListePlats() 
	{
		return listePlats;
	}

	public Table getTable() 
	{
		return table;
	}
}
