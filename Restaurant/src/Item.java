
public class Item{
	//Fields
	private double price;
	private String name;
	private int quantity;
	
	//Constructor
	public Item(String name, double price, int quantity)
	{
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}
	
	//Methods
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	//calls the string representation of an item object
	@Override
	public String toString() 
	{
		return name  + "(Quantity: " + getQuantity() + ", Price: £" + getPrice() + ")";
	}
	
}
