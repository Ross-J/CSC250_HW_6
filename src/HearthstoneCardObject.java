
public class HearthstoneCardObject 
{
	private String name;
	private int cost;
	private int attack;
	private int defense;
	
	public HearthstoneCardObject(String name, int cost, int attack, int defense)
	{
		this.name = name;
		this.cost = cost;
		this.attack = attack;
		this.defense = defense;
	}
	
	void display()
	{
		System.out.format("Name: %s \nCost: %d \nAttack: %d \nDefense: %d \n", this.name, this.cost, this.attack, this.defense);
	}
}
