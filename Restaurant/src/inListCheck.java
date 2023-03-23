import java.util.ArrayList;

public class inListCheck {

	private ArrayList<String> itemList;
	
	//
	public static boolean checkIfItemExists(ArrayList<Item> itemList, Item itemToCheck) {
		for (Item item : itemList) {
			if (item.getName().equals(itemToCheck.getName())) 
			{
				return true;
			}
		}
		return false;
	}
	
//	public inListCheck() 
//	{
//		itemList = new ArrayList<String>();
//	}
//	
//	public boolean itemExists(String item) 
//	{
//		return itemList.contains(item);
//	}
	
	public void addItem(String item) 
	{
		itemList.add(item);
	}
}
