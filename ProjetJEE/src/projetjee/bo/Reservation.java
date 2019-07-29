package projetjee.bo;

public class Reservation 
{
	private int id;
	private String nomClient;
	private String telClient;
	private int nbPersonnes;
	private Table table;
	
	public Reservation()
	{
		
	}
	
	public Reservation(int id, String nomClient, String telClient, int nbPersonnes, Table table)
	{
		this.setId(id);
		this.setNomClient(nomClient);
		this.setTelClient(telClient);
		this.setNbPersonnes(nbPersonnes);
		this.setTable(table);
	}
	
	public Reservation(String nomClient, String telClient, int nbPersonnes, Table table)
	{
		this.setNomClient(nomClient);
		this.setTelClient(telClient);
		this.setNbPersonnes(nbPersonnes);
		this.setTable(table);
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getNomClient() 
	{
		return nomClient;
	}

	public void setNomClient(String nomClient) 
	{
		this.nomClient = nomClient;
	}

	public String getTelClient() 
	{
		return telClient;
	}

	public void setTelClient(String telClient) 
	{
		this.telClient = telClient;
	}

	public int getNbPersonnes() 
	{
		return nbPersonnes;
	}

	public void setNbPersonnes(int nbPersonnes) 
	{
		this.nbPersonnes = nbPersonnes;
	}

	public Table getTable() 
	{
		return table;
	}
	
	public void setTable(Table table) 
	{
		this.table = table;
	}
}
