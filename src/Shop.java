
		import java.awt.EventQueue;
		import javax.swing.Timer;
		import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.time.Duration;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import java.awt.List;
import java.awt.TextField;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;

import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import javax.swing.SpinnerNumberModel;
	public class Shop extends BOGOF {
		
		
		 private static ArrayList<Product> products;
    
		private JFrame frmShop;
	
		private JTextField textField_1;
		private JTextField textField_2;
		

		public boolean isBOGOFspecial() {
		    LocalTime startTime = LocalTime.of(0, 0); // THIS Will start the time of the offer
		    LocalTime endTime = LocalTime.of(23, 55); // ending time of offer
		    Duration interval = Duration.ofMinutes(5); // time interval for offer
		    
		    
		    
		    LocalTime currentTime = LocalTime.now();
		    
		    if (currentTime.isAfter(startTime) && currentTime.isBefore(endTime)) {
		        long minutesSinceStart = startTime.until(currentTime, ChronoUnit.MINUTES);
		        return minutesSinceStart % interval.toMinutes() == 0;
		    }

		    return false;
		}
			public static void main(String[] args)  {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Shop window = new Shop();
							window.frmShop.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
							
						}
						try {
						      FileWriter writer = new FileWriter("output.txt");
						      writer.write("This is some text that will be written to the file.");
						      writer.close();
						      System.out.println("Data written to file.");
						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						      e.printStackTrace();
						    }
						  
					}
				});
			}
			/**
			 * Create the application.
			 */
			public Shop() {super(LocalTime.of(0, 0), LocalTime.of(23, 59));
			
			products = new ArrayList<Product>();
	        products.add(new Product("Soda", 1.67));
	        products.add(new Product("Chocolates", 2.5));
	        products.add(new Product("Crisps", 1.25));
	        products.add(new Product("Biscuits", 1.67));
	        products.add(new Product("Wine", 7.05));
	        products.add(new Product("Digital Camera", 340));
	        products.add(new Product("Cigarettes", 8));
	        products.add(new Product("Perfume", 45));
	        products.add(new Product("Times Magazine", 6.89));
	        products.add(new Product("The Harry Potter series", 9.72));
	        products.add(new Product("1984 by George Orwell", 4.89));
	        products.add(new Product("The Lord of the Rings by J.R.R. Tolkien", 16.72));
			
	     
				initialize();
			}
			public static ArrayList<Product> getProducts() {
				// TODO Auto-generated method stub
				return products;
			}
			/**
			 * Initialize the contents of the frame.
			 */
			private void initialize() {
				frmShop = new JFrame();
				frmShop.getContentPane().addComponentListener(new ComponentAdapter() {
					
					public void componentHidden(ComponentEvent e) {
					}
				});
				frmShop.setTitle("Shop");
				frmShop.setBounds(100, 100, 875, 516);
				frmShop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frmShop.getContentPane().setLayout(null);
				
				
				
		
				
				JButton btnNewButton_1 = new JButton("Snacks&Drinks");
				btnNewButton_1.setForeground(new Color(0, 0, 128));
				btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				btnNewButton_1.setBounds(10, 90, 201, 81);
				frmShop.getContentPane().add(btnNewButton_1);
				
		        
				JSpinner spinner = new JSpinner();
				spinner.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner.setBounds(139, 196, 30, 20);
				frmShop.getContentPane().add(spinner);
				
				JTextPane txtpnCrackers = new JTextPane();
				txtpnCrackers.setEditable(false);
				txtpnCrackers.setText("Soda £1.67");
				txtpnCrackers.setBounds(28, 196, 101, 20);
				frmShop.getContentPane().add(txtpnCrackers);
				
				JTextPane txtpnChoclates = new JTextPane();
				txtpnChoclates.setEditable(false);
				txtpnChoclates.setText("Choclates £3.08");
				txtpnChoclates.setBounds(28, 258, 101, 20);
				frmShop.getContentPane().add(txtpnChoclates);
				
				JTextPane txtpnCrisps = new JTextPane();
				txtpnCrisps.setEditable(false);
				txtpnCrisps.setText("Crisps £2.06");
				txtpnCrisps.setBounds(28, 318, 101, 20);
				frmShop.getContentPane().add(txtpnCrisps);
				
				JTextPane txtpnBusi = new JTextPane();
				txtpnBusi.setEditable(false);
				txtpnBusi.setText("Biscuits £1.98");
				txtpnBusi.setBounds(28, 381, 101, 20);
				frmShop.getContentPane().add(txtpnBusi);
				
				JSpinner spinner_2 = new JSpinner();
				spinner_2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner_2.setBounds(139, 258, 30, 20);
				frmShop.getContentPane().add(spinner_2);
				
				JSpinner spinner_1_1 = new JSpinner();
				spinner_1_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner_1_1.setBounds(139, 318, 30, 20);
				frmShop.getContentPane().add(spinner_1_1);
				
				JSpinner spinner_1_3 = new JSpinner();
				spinner_1_3.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner_1_3.setBounds(139, 381, 30, 20);
				frmShop.getContentPane().add(spinner_1_3);
				
				JSpinner spinner_1 = new JSpinner();
				spinner_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner_1.setBounds(423, 196, 30, 20);
				frmShop.getContentPane().add(spinner_1);
				
				JTextPane txtpnWine = new JTextPane();
				txtpnWine.setEditable(false);
				txtpnWine.setText("Wine   £7.5");
				txtpnWine.setBounds(289, 196, 124, 20);
				frmShop.getContentPane().add(txtpnWine);
				
				JTextPane txtpnChoclates_1 = new JTextPane();
				txtpnChoclates_1.setEditable(false);
				txtpnChoclates_1.setText("Cigerattes Pack £8");
				txtpnChoclates_1.setBounds(289, 258, 124, 20);
				frmShop.getContentPane().add(txtpnChoclates_1);
				
				JTextPane txtpnCrisps_1 = new JTextPane();
				txtpnCrisps_1.setEditable(false);
				txtpnCrisps_1.setText("Perfume    £45");
				txtpnCrisps_1.setBounds(289, 318, 124, 20);
				frmShop.getContentPane().add(txtpnCrisps_1);
			
				JTextPane txtpnBusi_1 = new JTextPane();
				txtpnBusi_1.setEditable(false);
				txtpnBusi_1.setText("Digital Camera £340");
				txtpnBusi_1.setBounds(289, 381, 124, 20);
				frmShop.getContentPane().add(txtpnBusi_1);
				
				JSpinner spinner_2_1 = new JSpinner();
				spinner_2_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner_2_1.setBounds(423, 258, 30, 20);
				frmShop.getContentPane().add(spinner_2_1);
				
				JSpinner spinner_1_1_1 = new JSpinner();
				spinner_1_1_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner_1_1_1.setBounds(423, 318, 30, 20);
				frmShop.getContentPane().add(spinner_1_1_1);
				
				JSpinner spinner_1_3_1 = new JSpinner();
				spinner_1_3_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner_1_3_1.setBounds(423, 381, 30, 20);
				frmShop.getContentPane().add(spinner_1_3_1);
				
				JSpinner spinner_3 = new JSpinner();
				spinner_3.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner_3.setBounds(748, 196, 30, 20);
				frmShop.getContentPane().add(spinner_3);
				
				JTextPane txtpnChoclates_2 = new JTextPane();
				txtpnChoclates_2.setEditable(false);
				txtpnChoclates_2.setText("\"The Harry Potter series\" by J.K. Rowling £9.72\r\n");
				txtpnChoclates_2.setBounds(610, 258, 136, 34);
				frmShop.getContentPane().add(txtpnChoclates_2);
				
				JTextPane txtpnCrisps_2 = new JTextPane();
				txtpnCrisps_2.setEditable(false);
				txtpnCrisps_2.setText("Times Magazine £6.89\r\n");
				txtpnCrisps_2.setBounds(610, 318, 136, 20);
				frmShop.getContentPane().add(txtpnCrisps_2);
				
				JTextPane txtpnBusi_2 = new JTextPane();
				txtpnBusi_2.setEditable(false);
				txtpnBusi_2.setText("\"1984\" by George Orwell £4.89");
				txtpnBusi_2.setBounds(610, 365, 136, 34);
				frmShop.getContentPane().add(txtpnBusi_2);
				
				JSpinner spinner_2_2 = new JSpinner();
				spinner_2_2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner_2_2.setBounds(748, 258, 30, 20);
				frmShop.getContentPane().add(spinner_2_2);
				
				JSpinner spinner_1_1_2 = new JSpinner();
				spinner_1_1_2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner_1_1_2.setBounds(748, 318, 30, 20);
				frmShop.getContentPane().add(spinner_1_1_2);
				
				JSpinner spinner_1_3_2 = new JSpinner();
				spinner_1_3_2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
				spinner_1_3_2.setBounds(748, 365, 30, 23);
				frmShop.getContentPane().add(spinner_1_3_2);
				
				JButton btnNewButton_1_1 = new JButton("Duty-free items");
				btnNewButton_1_1.setForeground(new Color(0, 0, 128));
				btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				btnNewButton_1_1.setBounds(275, 90, 199, 81);
				frmShop.getContentPane().add(btnNewButton_1_1);
				
				JButton btnNewButton_1_2 = new JButton("Books&Magazines\r\n\r\n");
				btnNewButton_1_2.setForeground(new Color(0, 0, 128));
				btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
				btnNewButton_1_2.setBounds(592, 90, 201, 81);
				frmShop.getContentPane().add(btnNewButton_1_2);
				
				JLabel lblNewLabel = new JLabel("Belgium Cholcate with rich,\r\n creamy indulgence.");
				lblNewLabel.setForeground(new Color(0, 0, 128));
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lblNewLabel.setBounds(24, 280, 201, 28);
				frmShop.getContentPane().add(lblNewLabel);
				
				JLabel lblOfferingASatisfying = new JLabel("offering a satisfying crunch to satisfy your craving.\r\n");
				lblOfferingASatisfying.setForeground(new Color(0, 0, 128));
				lblOfferingASatisfying.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lblOfferingASatisfying.setBounds(28, 342, 223, 28);
				frmShop.getContentPane().add(lblOfferingASatisfying);
				
				JLabel lblClassicAndBeloved = new JLabel("classic and beloved treat.");
				lblClassicAndBeloved.setForeground(new Color(0, 0, 128));
				lblClassicAndBeloved.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lblClassicAndBeloved.setBounds(28, 407, 111, 28);
				frmShop.getContentPane().add(lblClassicAndBeloved);
				
				JLabel lblVersatileAndCrunchy = new JLabel("sweet and bubbly beverage,offering a\r\n ");
				lblVersatileAndCrunchy.setForeground(new Color(0, 0, 128));
				lblVersatileAndCrunchy.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lblVersatileAndCrunchy.setBounds(28, 219, 275, 28);
				frmShop.getContentPane().add(lblVersatileAndCrunchy);
				
				JLabel lblNewLabel_1 = new JLabel("refreshing burst of sweetness");
				lblNewLabel_1.setForeground(new Color(0, 0, 128));
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lblNewLabel_1.setBounds(28, 243, 208, 10);
				frmShop.getContentPane().add(lblNewLabel_1);
				
				JLabel lblIndulgeInThe = new JLabel("Indulge in the rich and sophisticated flavors\r\n", SwingConstants.CENTER);
				lblIndulgeInThe.setForeground(new Color(0, 0, 128));
				lblIndulgeInThe.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lblIndulgeInThe.setBounds(258, 219, 208, 20);
				frmShop.getContentPane().add(lblIndulgeInThe);
				
				JLabel lblRichInTobacco = new JLabel("Rich in tobacco filled pack of twelve cigerattes.");
				lblRichInTobacco.setForeground(new Color(0, 0, 128));
				lblRichInTobacco.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lblRichInTobacco.setBounds(273, 280, 201, 28);
				frmShop.getContentPane().add(lblRichInTobacco);
				
				JLabel lbldiscoverYourSignature = new JLabel("\"Discover your signature scent with our perfumes.\"");
				lbldiscoverYourSignature.setForeground(new Color(0, 0, 128));
				lbldiscoverYourSignature.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lbldiscoverYourSignature.setBounds(273, 342, 223, 28);
				frmShop.getContentPane().add(lbldiscoverYourSignature);
				
				JLabel lblcaptureLifesMost = new JLabel("\"Capture life's most precious moments with \r\n");
				lblcaptureLifesMost.setForeground(new Color(0, 0, 128));
				lblcaptureLifesMost.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lblcaptureLifesMost.setBounds(278, 412, 188, 20);
				frmShop.getContentPane().add(lblcaptureLifesMost);
				

				
				JLabel lblNewLabel_2 = new JLabel("Full Name\r\n");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblNewLabel_2.setBounds(592, 13, 73, 17);
				frmShop.getContentPane().add(lblNewLabel_2);
				
				JLabel lblNewLabel_2_1 = new JLabel("Ticket Number");
				lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblNewLabel_2_1.setBounds(592, 41, 91, 17);
				frmShop.getContentPane().add(lblNewLabel_2_1);
				
				JLabel lblNewLabel_3 = new JLabel(" of our hand-selected, premium.");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lblNewLabel_3.setForeground(new Color(0, 0, 128));
				lblNewLabel_3.setBounds(289, 241, 136, 14);
				frmShop.getContentPane().add(lblNewLabel_3);
				
				JLabel lblNewLabel_4 = new JLabel("our range of high-quality cameras\".");
				lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lblNewLabel_4.setForeground(new Color(0, 0, 128));
				lblNewLabel_4.setBounds(288, 430, 174, 14);
				frmShop.getContentPane().add(lblNewLabel_4);
				
				JTextPane txtpnCrackers_2 = new JTextPane();
				txtpnCrackers_2.setEditable(false);
				txtpnCrackers_2.setText("\"The Lord of the Rings\" by J.R.R. Tolkien £16.72\r\n");
				txtpnCrackers_2.setBounds(610, 196, 136, 34);
				frmShop.getContentPane().add(txtpnCrackers_2);
				
				JButton btnNewButton = new JButton("Purchase");
				btnNewButton.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				    	String name = textField_1.getText();
				        String ticketNumber = textField_2.getText();
				        if (name.equals("Aaron Samuels") && ticketNumber.equals("83746578") ||
				                name.equals("Regina George") && ticketNumber.equals("27475839") ||
				                name.equals("Cady Heron") && ticketNumber.equals("95738494")) {

				        } else {
				        	 JOptionPane.showMessageDialog(null, "Incorrect name or ticket number.", "Error", JOptionPane.ERROR_MESSAGE);
				        }
      
				        

				        }
				    
		});
		
			
				btnNewButton.setBounds(677, 413, 101, 48);
			frmShop.getContentPane().add(btnNewButton);
			
			JTextPane txtpnCrackers_1 = new JTextPane();
			txtpnCrackers_1.setEditable(false);
			txtpnCrackers_1.setText("EasyPlane");
			txtpnCrackers_1.setBounds(61, 10, 64, 20);
			frmShop.getContentPane().add(txtpnCrackers_1);
			
			JLabel lblNewLabel_5 = new JLabel("Airline;");
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel_5.setBounds(15, 14, 49, 14);
			frmShop.getContentPane().add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("BrunelCity Shop");
			lblNewLabel_6.setForeground(new Color(0, 0, 128));
			lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblNewLabel_6.setBounds(286, 11, 210, 47);
			frmShop.getContentPane().add(lblNewLabel_6);
			
			JButton btnCart = new JButton("Cart");
			btnCart.setBounds(557, 413, 101, 48);
			frmShop.getContentPane().add(btnCart);
			
			textField_1 = new JTextField();
			textField_1.setBounds(682, 11, 96, 20);
			frmShop.getContentPane().add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(682, 39, 96, 20);
			frmShop.getContentPane().add(textField_2);
			
			JLabel lblNewLabel_7 = new JLabel("<html> Buy One get One free Offer <br> \r\n                      5mins Offer   </html>                                                                                                                    ");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 9));
			lblNewLabel_7.setBounds(309, 51, 145, 34);
			frmShop.getContentPane().add(lblNewLabel_7);
			  
			
			
			
			btnCart.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {

			    	String passengerName = textField_1.getText(); 
			    	
			        int sodaQty = (int) spinner.getValue();
			        int chocolatesQty = (int) spinner_2.getValue();
			        int crispsQty = (int) spinner_1_1.getValue();
			        int biscuitsQty = (int) spinner_1_3.getValue();
			        int wineQty = (int) spinner_1.getValue();
			        int cameraQty = (int) spinner_1_3_1.getValue();
			        int cigarettesQty = (int) spinner_2_1.getValue();
			        int perfumeQty = (int) spinner_1_1_1.getValue();
			        int magazineQty = (int) spinner_1_1_2.getValue();
			        int bookQty = (int) spinner_2_2.getValue();
			        int book3Qty = (int) spinner_3.getValue();
			        int book2Qty = (int) spinner_1_3_2.getValue();

			 
			        
			        
			        
//			        if (timer.isRunning()) {
//			        	if (timeElapsed < 5 * 60 * 1000) {
//			        		
//			        		 sodaQty *= 2;
//			                 chocolatesQty *= 2;
//			                 crispsQty *= 2;
//			                 biscuitsQty *= 2;
//			                 wineQty *= 2;
//			                 cameraQty *= 2;
//			                 cigarettesQty *= 2;
//			                 perfumeQty *= 2;
//			                 magazineQty *= 2;
//			                 bookQty *= 2;
//			                 book2Qty *= 2;
//			                 book3Qty *= 2;
//			             } else {
//			            	 
//			            	 timer.stop();
//			                 timeElapsed = 0;
//			             }
//			         } else {
//			             // Start the timer and reset the time elapsed
//			             timer.start();
//			             timeElapsed = 0;
//			         }

			        
			        
			        
			        double SodaPrice = sodaQty * 1.67;
			        double chocolatesPrice = chocolatesQty * 2.5;
			        double crispsPrice = crispsQty * 1.25;
			        double biscuitsPrice = biscuitsQty * 1.67;
			        double winePrice = wineQty * 7.05;
			        double cameraPrice = cameraQty * 340;
			        double cigarettesPrice = cigarettesQty * 8;
			        double perfumePrice = perfumeQty * 45;
			        double magazinePrice = magazineQty * 6.89;
			        double bookPrice = bookQty * 9.72;
			        double book2Price = book2Qty * 4.89;
			        double book3Price = book3Qty * 16.72;
			        double totalPrice = chocolatesPrice + crispsPrice + cameraPrice + cigarettesPrice +
			                perfumePrice + magazinePrice + bookPrice + book2Price+book3Price+winePrice;
			        
			        DecimalFormat df = new DecimalFormat("#.##");
			        String formattedTotalPrice = df.format(totalPrice);
			        
			        String cartMessage = 
			        		
			        	
			        		"Passenger Name: " + textField_1.getText() + "\n\n" +
				        	"Soda:" +sodaQty + "x 1.67 = £" +SodaPrice +"\n" +
				            "Chocolates: " +chocolatesQty + " x £2.50 = £" + chocolatesPrice + "\n" +
				            "Crisps: " +crispsQty + " x £1.25 = £" + crispsPrice + "\n" +
				            "Biscuits:" +biscuitsQty + "x £1.67= £" +biscuitsPrice + "\n" +
				            "Wine:" +wineQty +"x £7.5 = £" + winePrice + "\n" +
				            "Cigarettes: " + cigarettesQty +" x £8 = £" + cigarettesPrice + "\n" +
				            "Digital Camera: " +cameraQty + " x £340 = £" + cameraPrice + "\n" +
				            "Perfume: " + perfumeQty + " x £45 = £" + perfumePrice + "\n" +
				            "Times Magazine: " + magazineQty + " x £6.89 = £" + magazinePrice + "\n" +
				            "1984 by George Orwell : " + book2Qty+ " x £4.89 = £" + book2Price + "\n" +
				            "The Lord of the Rings by J.R.R. Tolkien " + book3Qty+ " x £16.72= £" + book3Price + "\n" +
				            "\"The Harry Potter series\": " + bookQty + " x 9.72 = £" + bookPrice + "\n\n" +
				            
				            "Total Price: £" + formattedTotalPrice;
				
				        JOptionPane.showMessageDialog(null, cartMessage, "Cart", JOptionPane.INFORMATION_MESSAGE);
				    }
				});
								
	}
	}
	
	
