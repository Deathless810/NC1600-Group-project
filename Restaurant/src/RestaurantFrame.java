import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.text.*;

public class RestaurantFrame extends JFrame{
    public static void main(String[] args) {
    	
    	ArrayList<Item> itemList = new ArrayList<Item>();
    	//GUI start
        //title
    	JFrame frame = new JFrame("Restaurant");

        //(x, y, length, width), and spinner for each item
    	JLabel label = new JLabel("Menu Items:");
    	label.setBounds(20, 20, 100, 20);
    	frame.add(label);
    	
        //chickenEverything ↓
    	JLabel chickenLabel = new JLabel("Chicken and rice  $3.45");
    	chickenLabel.setBounds(20, 50, 140, 20);
    	frame.add(chickenLabel);
    	JSpinner chickenSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	chickenSpinner.setBounds(200, 50, 50, 20);
    	frame.add(chickenSpinner);
    	
    	JLabel wellingtonLabel = new JLabel("Beef wellington  $27.99");
    	wellingtonLabel.setBounds(20, 100, 140, 20);
    	frame.add(wellingtonLabel);
    	JSpinner wellingtonSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	wellingtonSpinner.setBounds(200, 100, 50, 20);
    	frame.add(wellingtonSpinner);
    	
    	JLabel sandwichLabel = new JLabel("Grilled cheese sandwich  $2.99");
    	sandwichLabel.setBounds(20, 150, 200, 20);
    	frame.add(sandwichLabel);
    	JSpinner sandwichSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	sandwichSpinner.setBounds(200, 150, 50, 20);
    	frame.add(sandwichSpinner);
    	
    	JLabel saladLabel = new JLabel("Caesar salad  $3.45");
    	saladLabel.setBounds(20, 200, 140, 20);
    	frame.add(saladLabel);
    	JSpinner saladSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	saladSpinner.setBounds(200, 200, 50, 20);
    	frame.add(saladSpinner);
    	
    	JLabel macaroniLabel = new JLabel("Macaroni and cheese  $4.50");
    	macaroniLabel.setBounds(20, 250, 200, 20);
    	frame.add(macaroniLabel);
    	JSpinner macaroniSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	macaroniSpinner.setBounds(200, 250, 50, 20);
    	frame.add(macaroniSpinner);
    	
    	JLabel omeletteLabel = new JLabel("Omelette  $3.99");
    	omeletteLabel.setBounds(20, 300, 200, 20);
    	frame.add(omeletteLabel);
    	JSpinner omeletteSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	omeletteSpinner.setBounds(200, 300, 50, 20);
    	frame.add(omeletteSpinner);
    	
    	JLabel wrapLabel = new JLabel("Pulled pork wrap  $3.99");
    	wrapLabel.setBounds(20, 350, 200, 20);
    	frame.add(wrapLabel);
    	JSpinner wrapSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	wrapSpinner.setBounds(200, 350, 50, 20);
    	frame.add(wrapSpinner);
    	
    	JLabel vegeLabel = new JLabel("Vegetable stir-fry  $2.99");
    	vegeLabel.setBounds(300, 50, 200, 20);
    	frame.add(vegeLabel);
    	JSpinner vegeSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	vegeSpinner.setBounds(450, 50, 50, 20);
    	frame.add(vegeSpinner);
    	
    	JLabel wineLabel = new JLabel("French wine  $19.45");
    	wineLabel.setBounds(300, 100, 200, 20);
    	frame.add(wineLabel);
    	JSpinner wineSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	wineSpinner.setBounds(450, 100, 50, 20);
    	frame.add(wineSpinner);
    	
    	JLabel cakeLabel = new JLabel("Chocolate cake  $3.45");
    	cakeLabel.setBounds(300, 150, 200, 20);
    	frame.add(cakeLabel);
    	JSpinner cakeSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	cakeSpinner.setBounds(450, 150, 50, 20);
    	frame.add(cakeSpinner);
    	
    	JLabel muffinLabel = new JLabel("Blueberry muffin  $2.99");
    	muffinLabel.setBounds(300, 200, 200, 20);
    	frame.add(muffinLabel);
    	JSpinner muffinSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	muffinSpinner.setBounds(450, 200, 50, 20);
    	frame.add(muffinSpinner);
    	
    	JLabel tiramisuLabel = new JLabel("Tiramisu  $3.45");
    	tiramisuLabel.setBounds(300, 250, 200, 20);
    	frame.add(tiramisuLabel);
    	JSpinner tiramisuSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
    	tiramisuSpinner.setBounds(450, 250, 50, 20);
    	frame.add(tiramisuSpinner);
    	//GUI end
    	
    	
//        //Add buttons(x, y, wide, width)
//    	//Add items to the basket method
//    	JButton addButton = new JButton("Add to basket");
//    	addButton.setBounds(400, 400, 130, 25);
//    	frame.add(addButton);
//    	
//    	addButton.addActionListener(new ActionListener() 
//    	{
//    		public void actionPerformed(ActionEvent e) 
//    		{
//    			//basket menu spinner count relate to basket frame
//    			DefaultListModel<String> listModel = new DefaultListModel<>();
//    			if ((int)chickenSpinner.getValue() > 0) {
//    				int quantity = (int)chickenSpinner.getValue();
//    				double price = quantity * 3.45;
//    					DecimalFormat number_format = new DecimalFormat("#.###");
//    					String formated_chicken = number_format.format(price);
//    				Item chickenItem = new Item("Chicken and rice", Double.parseDouble(formated_chicken), quantity);
//    				itemList.add(chickenItem);
//    			}
//    			for (Item item : itemList) {
//    				String itemString = item.getName() + " (quantity: " + item.getQuantity() + ", price: £" + item.getPrice() + ")";
//    				listModel.addElement(itemString);
//				}
//    			BasketFrameTest basketFrame = new BasketFrameTest(listModel);
//    		}
//    	});
//    	end of "add to basket"
    	
    	
    	//"Basket" button to open another frame for basket
    	//relate this to basket system and spinner
    	JButton basketButton = new JButton("Basket");
    	basketButton.setBounds(470, 20, 100, 25);
    	frame.add(basketButton);
    	
    	//check spinner for value
    	basketButton.addActionListener(new ActionListener() 
    	{
    		private int totalItems = 0;
    		public void actionPerformed(ActionEvent e) 
    		{
        		DefaultListModel<String> listModel = new DefaultListModel<>();
        		double totalPrice = 0.0;
        		
        		//add item into list
    			if ((int)chickenSpinner.getValue() > 0)
    			{
    				int chicken_quantity = (int)chickenSpinner.getValue();
    				double chicken_price = chicken_quantity * 3.45;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_chicken = number_format.format(chicken_price);
    				Item chickenItem = new Item("Chicken and rice", Double.parseDouble(formated_chicken), chicken_quantity);
    				
    				//check if the total items being added by chicken quantity surpass limit
    				if (totalItems + chicken_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				
    				itemList.add(chickenItem);
    				totalItems += chicken_quantity;
    				
    			}
    			if ((int)wellingtonSpinner.getValue() > 0) 
    			{
    				int wellington_quantity = (int)wellingtonSpinner.getValue();
    				double wellington_price = wellington_quantity * 27.99;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_wellington = number_format.format(wellington_price);
    				Item wellingtonItem = new Item("Beef wellington", Double.parseDouble(formated_wellington), wellington_quantity);
    				if (totalItems + wellington_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				itemList.add(wellingtonItem);
    				totalItems += wellington_quantity;
    			}
    			
    			if ((int)sandwichSpinner.getValue() > 0) 
    			{
    				int sandwich_quantity = (int)sandwichSpinner.getValue();
    				double sandwich_price = sandwich_quantity * 2.99;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_sandwich = number_format.format(sandwich_price);
    				Item sandwichItem = new Item("Grilled cheese sandwich", Double.parseDouble(formated_sandwich), sandwich_quantity);
    				if (totalItems + sandwich_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				itemList.add(sandwichItem);
    				totalItems += sandwich_quantity;
				}
    			
    			if ((int)macaroniSpinner.getValue() > 0) 
    			{
    				int macaroni_quantity = (int)macaroniSpinner.getValue();
    				double macaroni_price = macaroni_quantity * 4.50;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_macaroni = number_format.format(macaroni_price);
    				Item macaroniItem = new Item("Macaroni and cheese", Double.parseDouble(formated_macaroni), macaroni_quantity);
    				if (totalItems + macaroni_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				itemList.add(macaroniItem);
    				totalItems += macaroni_quantity;
				}
    			
    			if ((int)saladSpinner.getValue() > 0) 
    			{
    				int salad_quantity = (int)saladSpinner.getValue();
    				double salad_price = salad_quantity * 3.45;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_salad = number_format.format(salad_price);
    				Item saladItem = new Item("Caesar salad", Double.parseDouble(formated_salad), salad_quantity);
    				if (totalItems + salad_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				itemList.add(saladItem);
    				totalItems += salad_quantity;
				}
    			
    			if ((int)omeletteSpinner.getValue() > 0) 
    			{
    				int omelette_quantity = (int)omeletteSpinner.getValue();
    				double omelette_price = omelette_quantity * 3.99;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_omelette = number_format.format(omelette_price);
    				Item omeletteItem = new Item("Omelette", Double.parseDouble(formated_omelette), omelette_quantity);
    				if (totalItems + omelette_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				itemList.add(omeletteItem);
    				totalItems += omelette_quantity;
				}
    			
    			if ((int)wrapSpinner.getValue() > 0) 
    			{
    				int wrap_quantity = (int)wrapSpinner.getValue();
    				double wrap_price = wrap_quantity * 3.99;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_wrap = number_format.format(wrap_price);
    				Item wrapItem = new Item("Pulled pork wrap", Double.parseDouble(formated_wrap), wrap_quantity);
    				if (totalItems + wrap_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				itemList.add(wrapItem);
    				totalItems += wrap_quantity;
				}
    			
    			if ((int)vegeSpinner.getValue() > 0) 
    			{
    				int vege_quantity = (int)vegeSpinner.getValue();
    				double vege_price = vege_quantity * 2.99;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_vege = number_format.format(vege_price);
    				Item vegeItem = new Item("Vegetable stir-fry", Double.parseDouble(formated_vege), vege_quantity);
    				if (totalItems + vege_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				itemList.add(vegeItem);
    				totalItems += vege_quantity;
				}
    			
    			if ((int)wineSpinner.getValue() > 0) 
    			{
    				int wine_quantity = (int)wineSpinner.getValue();
    				double wine_price = wine_quantity * 19.45;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_wine = number_format.format(wine_price);
    				Item wineItem = new Item("French wine", Double.parseDouble(formated_wine), wine_quantity);
    				if (totalItems + wine_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				itemList.add(wineItem);
    				totalItems += wine_quantity;
				}
    			
    			if ((int)cakeSpinner.getValue() > 0) 
    			{
    				int cake_quantity = (int)cakeSpinner.getValue();
    				double cake_price = cake_quantity * 3.45;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_cake = number_format.format(cake_price);
    				Item cakeItem = new Item("Chocolate cake", Double.parseDouble(formated_cake), cake_quantity);
    				if (totalItems + cake_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				itemList.add(cakeItem);
    				totalItems += cake_quantity;
				}
    			
    			if ((int)muffinSpinner.getValue() > 0) 
    			{
    				int muffin_quantity = (int)muffinSpinner.getValue();
    				double muffin_price = muffin_quantity * 2.99;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_muffin = number_format.format(muffin_price);
    				Item muffinItem = new Item("Blueberry muffin", Double.parseDouble(formated_muffin), muffin_quantity);
    				if (totalItems + muffin_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				itemList.add(muffinItem);
    				totalItems += muffin_quantity;
				}
    			
    			if ((int)tiramisuSpinner.getValue() > 0) 
    			{
    				int tiramisu_quantity = (int)tiramisuSpinner.getValue();
    				double tiramisu_price = tiramisu_quantity * 3.45;
    					DecimalFormat number_format = new DecimalFormat("#.###");
    					String formated_tiramisu = number_format.format(tiramisu_price);
    				Item tiramisuItem = new Item("Tiramisu", Double.parseDouble(formated_tiramisu), tiramisu_quantity);
    				if (totalItems + tiramisu_quantity> 99)
    				{
                		//clears basket
    					itemList.clear();
    					totalItems = 0;
    					JOptionPane.showMessageDialog(frame, "You have more than 99 items in your basket");
    					return;
    				}
    				itemList.add(tiramisuItem);
    				totalItems += tiramisu_quantity;
				}
    			//end adding
    			
    			//show list
    			for (Item item : itemList) 
    			{
    				String itemString = item.getName() + " (quantity: " + item.getQuantity() + ", price: £" + item.getPrice() + ")";
    				listModel.addElement(itemString);
    				
    				totalPrice += item.getPrice();
    			}
    			
//    			//check for items(list, item)
//        		Item itemToCheck = new Item("Chicken and rice", 3.45, 0);
//        		
//        		if (inListCheck.checkIfItemExists(itemList, itemToCheck)) {
//        			System.out.println("Item already exists");
//        		}
//        		//end checking
        		
    			BasketFrameTest basketFrame = new BasketFrameTest(listModel, totalPrice);
        		basketFrame.setVisible(true);
        		//end
        		
            	//3 minutes timer, clears basket
            	Timer timer = new Timer(180000, new ActionListener() 
            	{
            		@Override
            		public void actionPerformed(ActionEvent e) {
            			basketFrame.clearBasket();
            		}
            	});
            	timer.setRepeats(false);
            	timer.start();
            	//end of timer
    		}
    		
    	});
    	//end of "Basket" frame
    	
    	
        //Set the size and visibility of the window
    	frame.setSize(600, 500);
    	frame.setLayout(null);
    	frame.setVisible(true);
        
        
    }
}
