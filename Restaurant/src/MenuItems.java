import java.util.ArrayList;

public class MenuItems {
	
		private ArrayList<Item> menu = new ArrayList<Item>();
		
		//constructor
		
		//methods
		public void itemMenu() 
		{
			//adds 1-12 items into menu list
			menu.add(new Item("Chicken and Rice", 3.45, 0));
			menu.add(new Item("Beef wellington", 27.99, 0));
			menu.add(new Item("Grilled cheese sandwich", 2.99, 0));
			menu.add(new Item("Caesar salad", 3.45, 0));
			menu.add(new Item("Macaroni and cheese", 4.50, 0));
			menu.add(new Item("Omelette", 3.99, 0));
			menu.add(new Item("Pulled pork wrap", 3.99, 0));
			menu.add(new Item("Vegetable stir-fry", 2.99, 0));
			menu.add(new Item("French wine", 19.45, 0));
			menu.add(new Item("Chocolate cake", 3.45, 0));
			menu.add(new Item("Blueberry muffin", 2.99, 0));
			menu.add(new Item("Tiramisu", 3.45, 0));
		}
		public void addItem(Item item)
		{
			menu.add(item);
		}
		
		public void checkBasket() 
		{
			//for-each loop
			for (Item item : menu) {
				System.out.println(item.getName()
						+ "(Quantity: "
						+ item.getQuantity()
						+ ", Price: £"
						+ item.getPrice()
						+ ")"
						);
			}
		}
		
		public double getTotalPrice() 
		{
			double totalPrice = 0;
			for (Item item : menu) 
			{
				totalPrice += item.getPrice();
			}
			return totalPrice;
		}
		
		public int getTotalQuantity() 
		{
			int totalQuantity = 0;
			for (Item item : menu) {
				totalQuantity += item.getQuantity();
			}
			return totalQuantity;
		}
		
		Item item1 = new Item("Chicken and Rice", 3.45, 0);
		Item item2 = new Item("Beef wellington", 27.99, 0);
		Item item3 = new Item("Grilled cheese sandwich", 2.99, 0);
		Item item4 = new Item("Caesar salad", 3.45, 0);
		Item item5 = new Item("Macaroni and cheese", 4.50, 0);
		Item item6 = new Item("Omelette", 3.99, 0);
		Item item7 = new Item("Pulled pork wrap", 3.99, 0);
		Item item8 = new Item("Vegetable stir-fry", 2.99, 0);
		Item item9 = new Item("French wine", 19.45, 0);
		Item item10 = new Item("Chocolate cake", 3.45, 0);
		Item item11 = new Item("Blueberry muffin", 2.99, 0);
		Item item12 = new Item("Tiramisu", 3.45, 0);
		
		
}
