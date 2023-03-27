
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.util.random.*;
import java.text.DecimalFormat;

public class gui extends JFrame {

	// fields

	JPanel mypanel;
	JButton comfButton;
	JButton backButton;
	JLabel lblPageTitle;
	JLabel ticketIndc;

	// constructor

	public gui(ArrayList<booking> bookingArray) {
		mypanel = new JPanel();
		mypanel.setLayout(null);
		lblPageTitle = new JLabel("Payment Confirmation");
		lblPageTitle.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblPageTitle.setBounds(334, 32, 398, 43);
		setContentPane(mypanel);
		mypanel.add(lblPageTitle);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(186, 186, 186));
		panel.setBounds(26, 78, 1069, 683);
		mypanel.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(217, 217, 217));
		panel_1.setBounds(29, 18, 745, 641);
		panel.add(panel_1);
		panel_1.setLayout(null);

		comfButton = new JButton("Confirm");
		comfButton.setBounds(865, 419, 85, 43);
		panel.add(comfButton);
		comfButton.setBackground(new Color(217, 217, 217));

		double tPrice = 0;
		double food = Math.random() * (100 - 0 + 1) + 0;
		double product = Math.random() * (100 - 0 + 1) + 0;;
		int tDelay = 0;
		int childTick = 0;
		int freeMeal = 0;
		int bags = 0;

		for (int i = 0; i < bookingArray.size(); i++) {
			// Create a JLabel for each piece of ticket information
			JLabel firstName = new JLabel(bookingArray.get(i).getFirstName());
			JLabel dob = new JLabel(bookingArray.get(i).getDob());
			JLabel flightnum = new JLabel("Flight Number: " + bookingArray.get(i).getFlightNum());
			JLabel ticketNumber = new JLabel("Ticket Number: " + bookingArray.get(i).getTicketNum());
			JLabel depCity = new JLabel("From: " + bookingArray.get(i).getDepCity());
			JLabel arrivcity = new JLabel("To: " + bookingArray.get(i).getArrivCity());
			JLabel arrivTime = new JLabel("Leaving at: " + bookingArray.get(i).getArrivTime());
			JLabel depTime = new JLabel("Arriving at: " + bookingArray.get(i).getDepTime());
			JLabel depAirport = new JLabel(bookingArray.get(i).getDepAirport());
			JLabel arrivAirport = new JLabel(bookingArray.get(i).getArrivAirport());
			JLabel company = new JLabel(bookingArray.get(i).getCompany());
			JLabel Seat = new JLabel(bookingArray.get(i).getSeat());
			JLabel disability = new JLabel(bookingArray.get(i).disability());

			tPrice = tPrice + bookingArray.get(i).ticketCost();
			bags = bags + bookingArray.get(i).bagCost();
			tDelay = tDelay + bookingArray.get(i).delayCost();
			childTick = childTick + bookingArray.get(i).childTicket();
			freeMeal = freeMeal + bookingArray.get(i).mealComp();

			firstName.setBounds(10, 10 + i * 50, 100, 20);
			dob.setBounds(120, 10 + i * 50, 100, 20);
			flightnum.setBounds(230, 10 + i * 50, 150, 20);
			ticketNumber.setBounds(390, 10 + i * 50, 150, 20);
			depCity.setBounds(550, 10 + i * 50, 100, 20);
			arrivcity.setBounds(10, 40 + i * 50, 100, 20);
			depTime.setBounds(120, 40 + i * 50, 100, 20);
			arrivTime.setBounds(230, 40 + i * 50, 100, 20);
			depAirport.setBounds(340, 40 + i * 50, 100, 20);
			arrivAirport.setBounds(450, 40 + i * 50, 100, 20);
			company.setBounds(550, 40 + i * 50, 100, 20);
			Seat.setBounds(660, 40 + i * 50, 100, 20);
			disability.setBounds(750, 40 + i * 50, 100, 20);
			// Add the JLabels to the Panel
			panel_1.add(firstName);
			panel_1.add(dob);
			panel_1.add(flightnum);
			panel_1.add(ticketNumber);
			panel_1.add(depCity);
			panel_1.add(arrivcity);
			panel_1.add(depTime);
			panel_1.add(arrivTime);
			panel_1.add(depAirport);
			panel_1.add(arrivAirport);
			panel_1.add(company);
			panel_1.add(Seat);
		}

		DecimalFormat number_format = new DecimalFormat("#.##");
		String formatedTic = number_format.format(tPrice);
		
		JLabel ticPrice = new JLabel("tickets:  £" + formatedTic);
		JLabel bagP = new JLabel("Bags:  £" + bags);
		JLabel delay = new JLabel("Delay: -" + tDelay );
		if (freeMeal == 0) {
			JLabel fMeal = new JLabel("Free Meal");
			food = 0;
			fMeal.setBounds(800,260,100,20);
			panel.add(fMeal);
		} else {
			String formatedFood = number_format.format(food);
			JLabel Meal = new JLabel("Food:  £" + formatedFood);
			Meal.setBounds(800,260,100,20);
			panel.add(Meal);
		}
		String formatedShop = number_format.format(product);
		JLabel shop = new JLabel("Products:  £" + formatedShop);
		
		double sPrice = tPrice +bags-tDelay+product + food;
		String formatedTotal = number_format.format(sPrice);
		JLabel total = new JLabel("Total:  £" +( formatedTotal));
		
		ticPrice.setBounds(800,10+60,150,20);
		bagP.setBounds(800,110,100,20);
		delay.setBounds(800,150,100,20);
		shop.setBounds(800,210,100,20);
		total.setBounds(800,360,150,20);
		
		panel.add(ticPrice);
		panel.add(bagP);
		panel.add(delay);
		panel.add(shop);
		panel.add(total);

		backButton = new JButton("Back");
		backButton.setBounds(1000, 32, 95, 43);
		mypanel.add(backButton);

	}

	public static void main(String[] args) {
		ArrayList<booking> bookingArray = new ArrayList<booking>();
		// dummy data to test the functionality of the program
		String[][] flights = {
				{ "08/03/2023", "06:20", "11:57", "05:37", "7021.04", "179", "HND", "Tokyo", "SYD", "Sydney", "TS4977",
						"Easyplane" },
				{ "27/03/2023", "18:23", "03:44", "09:21", "11687.85", "10", "SYD", "Sydney", "HND", "Tokyo", "ST4138",
						"Eastair" } };

		String ticket[][] = { { "Aaron", "Samuels", "83746578", "1A" }, { "Regina", "George", "27475839", "6A" },
				{ "Cady", "Heron", "95738494", "11A" } };

		int numOfTix = ticket.length;

		int z = 0;

		// for loop allows for class instances to be created dynamically
		for (int i = 0; i < 2; i++) {
			for (int x = 0; x < numOfTix; x++) {
				
				int Bags = (int) Math.floor(Math.random() * (10 - 0 + 1) + 0);
				// random weight for bag
				double bagweight = Math.random() * (60 - 0 + 1) + 0;
				
				int age = (int)Math.floor(Math.random()*(100-0+1)+0);

				String classArr[] = {"First Class", "Econnomy","Business Class"};
				Random random = new Random();
				int select = random.nextInt(classArr.length);
				
				
				bookingArray.add(new booking(ticket[x][2], flights[z][10], ticket[x][0], ticket[x][1], false, Bags,
						bagweight, classArr[select], Double.parseDouble(flights[z][4]), Integer.parseInt(flights[z][5]),
						flights[z][0], flights[z][7], flights[z][9], flights[z][1], flights[z][2], flights[z][6],
						flights[z][8], flights[z][11], ticket[x][3],age));
			}
			z++;
		}

		JFrame gui = new gui(bookingArray);
		gui.setTitle("Ticket Confirmation");
		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(1250, 9000);
		

	}
}
