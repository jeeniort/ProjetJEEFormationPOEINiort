package projetjee.bo;

public class Table 
{
	private int id;
	private int num;
	private String etat;
	
	public Table()
	{
		
	}
	
	public Table(int id, int num, String etat)
	{
		this.setId(id);
		this.setNum(num);
		this.setEtat(etat);
	}
	
	public Table(int num, String etat)
	{
		this.setNum(num);
		this.setEtat(etat);
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getNum() 
	{
		return num;
	}

	public void setNum(int num) 
	{
		this.num = num;
	}

	public String getEtat() 
	{
		return etat;
	}

	public void setEtat(String etat) 
	{
		this.etat = etat;
	}
}
