import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class B_747  extends start {

	JFrame frame1;
	
	//Array to save the seats
	private Flights DataSet = new Flights();
	private int numSeatsSelected = 0;
	public  ArrayList<JButton> selectedSeats = new ArrayList<>();
	public ArrayList<JButton> AlreadyReserved = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	//All buttons in an array
			JButton Seat1;
			JButton Seat2;
			JButton Seat3;
			JButton Seat4;
			JButton Seat5;
			JButton Seat6;
			JButton Seat7;
			JButton Seat8;
			JButton Seat9;
			JButton Seat10;
			JButton Seat11;
			JButton Seat12;
			JButton Seat13;
			JButton Seat14;
			JButton Seat15;
			JButton Seat16;
			JButton Seat17;
			JButton Seat18;
			JButton Seat19;
			JButton Seat20;
			JButton Seat21;
			JButton Seat22;
			JButton Seat23;
			JButton Seat24;
			JButton Seat25;
			JButton Seat26;
			JButton Seat27;
			JButton Seat28;
			JButton Seat29;
			JButton Seat30;
			JButton Seat31;
			JButton Seat32;
			JButton Seat33;
			JButton Seat34;
			JButton Seat35;
			JButton Seat36;
			JButton Seat37;
			JButton Seat38;
			JButton Seat39;
			JButton Seat40;
			JButton Seat41;
			JButton Seat42;
			JButton Seat43;
			JButton Seat44;
			JButton Seat45;
			JButton Seat46;
			JButton Seat47;
			JButton Seat48;
			JButton Seat49;
			JButton Seat50;
			JButton Seat51;
			JButton Seat52;
			JButton Seat53;
			JButton Seat54;
			JButton Seat55;
			JButton Seat56;
			JButton Seat57;
			JButton Seat58;
			JButton Seat59;
			JButton Seat60;
			JButton Seat61;
			JButton Seat62;
			JButton Seat63;
			JButton Seat64;
			JButton Seat65;
			JButton Seat66;
			JButton Seat67;
			JButton Seat68;
			JButton Seat69;
			JButton Seat70;
			JButton Seat71;
			JButton Seat72;
			JButton Seat73;
			JButton Seat74;
			JButton Seat75;
			JButton Seat76;
			JButton Seat77;
			JButton Seat78;
			JButton Seat79;
			JButton Seat80;
			JButton Seat81;
			JButton Seat82;
			JButton Seat83;
			JButton Seat84;
			
			
			
    private JFrame frame;
    private int seatCounter = 1; // Add a seat counter
    private final int maxSeats = 3; // Set the maximum allowed seat selections

    /**
     * Launch the application.
     */
 // The main method is the entry point of the application
  
        // EventQueue.invokeLater is used to ensure that the GUI is created and updated on the Event Dispatch Thread (EDT)

            public void run() {
                try {
                    // Create a new instance of the B_747 class
                    B_747 window = new B_747();
                    // Set the main application window (JFrame) to be visible
                    window.frame1.setVisible(true);
                } catch (Exception e) {
                    // If an exception occurs, print the stack trace
                    e.printStackTrace();
                }
            }
        ;
    

    /**
     * Create the application.
     */
    // The B_747 constructor initializes the application by calling the initialize() method
    public B_747() {
        initialize();
    }


    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame1 = new JFrame();
        frame1.setBounds(100, 100, 670, 700);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.getContentPane().setLayout(null);
        frame1.setVisible(true);


	ArrayList<String> selectedSeats = new ArrayList<>();
	
	// ...
	
	ActionListener listener = new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton btnNewButton = (JButton) e.getSource();
	        if (btnNewButton.getBackground() == Color.RED) {
	            btnNewButton.setBackground(Color.white);
	            seatCounter--; // Decrease the seat counter when a seat is deselected
	            selectedSeats.remove(btnNewButton.getText());
	        } else {
	            if (seatCounter < maxSeats) {
	                btnNewButton.setBackground(Color.RED);
	                seatCounter++; // Increase the seat counter when a seat is selected
	                selectedSeats.add(btnNewButton.getText());
	                btnNewButton.setEnabled(false); // Disable the button once it is selected
	            } else {
	                JOptionPane.showMessageDialog(frame1, "You can only select up to " + maxSeats + " seats.", "Maximum Seats Reached", JOptionPane.WARNING_MESSAGE);
	            }
	        }
	    }
	};
					ActionListener panel = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				        JFrame popup = new JFrame();
				        JLabel message = new JLabel("This seat is not available");
				        message.setHorizontalAlignment(SwingConstants.CENTER);
				        popup.getContentPane().add(message);
				        popup.pack();
				        popup.setLocationRelativeTo(null);
				        popup.setVisible(true);
				    }
};  


//for age under13 but need data from other components to work
ActionListener underThirteenSeatListener = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selectedSeat = (JButton) e.getSource();
        if (selectedSeat.getBackground() == Color.WHITE) {
            selectedSeat.setBackground(Color.YELLOW);

            // Find the index of the selected seat in an ordered list of seats
            List<JButton> allSeats = Arrays.asList(Seat1, Seat2, Seat3, Seat4, Seat5, Seat6, Seat7, Seat8, Seat9, Seat10, Seat11, Seat12, Seat13, Seat14, Seat15, Seat16, Seat17, Seat18, Seat19, Seat20, Seat21, Seat22, Seat23, Seat24, Seat25, Seat26, Seat27, Seat28, Seat29, Seat30, Seat31, Seat32, Seat33, Seat34, Seat35, Seat36, Seat37);
            int selectedIndex = allSeats.indexOf(selectedSeat);

            // Assign the next seat if it's available
            if (selectedIndex + 1 < allSeats.size()) {
                JButton nextSeat = allSeats.get(selectedIndex + 1);
                if (nextSeat.getBackground() == Color.WHITE) {
                    nextSeat.setBackground(Color.YELLOW);
                }
            }
        } else {
            selectedSeat.setBackground(Color.WHITE);
        }
    }
};

			//Disable person 
				ActionListener disabledSeatListener = new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        Object[] options = {"Yes", "No"};
				        int n = JOptionPane.showOptionDialog(frame1,
				                "Are you a disabled person?",
				                "Disability Confirmation",
				                JOptionPane.YES_NO_OPTION,
				                JOptionPane.QUESTION_MESSAGE,
				                null,
				                options,
				                options[1]);
				
				        if (n == JOptionPane.YES_OPTION) {
				            JButton btnNewButton = (JButton) e.getSource();
				            btnNewButton.setBackground(Color.red);
				        } else {
				            JFrame popup = new JFrame();
				            JLabel message = new JLabel("This seat is only for disabled persons");
				            message.setHorizontalAlignment(SwingConstants.CENTER);
				            popup.getContentPane().add(message);
				            popup.pack();
				            popup.setLocationRelativeTo(null);
				            popup.setVisible(true);
				        }
				    }
};
          //All Seats with their names and some labels
			JButton Seat1 = new JButton("1A");
			Seat1.setForeground(Color.BLACK);
			Seat1.setBackground(new Color(0, 255, 0));
			Seat1.setBounds(112, 131, 63, 20);
			frame1.getContentPane().add(Seat1);
			Seat1.addActionListener(disabledSeatListener);

		    
			JButton Seat2 = new JButton("2A");
			Seat2.setForeground(Color.BLACK);
			Seat2.setBackground(new Color(0, 255, 0));
			Seat2.setBounds(112, 150, 63, 20);
			frame1.getContentPane().add(Seat2);
			Seat2.addActionListener(disabledSeatListener);
			
			JButton Seat3 = new JButton("3A");
			Seat3.setForeground(Color.BLACK);
			Seat3.setBackground(Color.WHITE);
			Seat3.setBounds(112, 169, 63, 20);
			frame1.getContentPane().add(Seat3);
			Seat3.addActionListener(listener);
		
			JButton Seat4 = new JButton("4A");
			Seat4.setForeground(Color.BLACK);
			Seat4.setBackground(new Color(255, 0, 0));
			Seat4.setBounds(112, 188, 63, 20);
			frame1.getContentPane().add(Seat4);
			Seat4.addActionListener(listener);
		
			JButton Seat5 = new JButton("5A");
			Seat5.setForeground(Color.BLACK);
			Seat5.setBackground(Color.WHITE);
			Seat5.setBounds(112, 207, 63, 20);
			frame1.getContentPane().add(Seat5);
			Seat5.addActionListener(listener);
							
			
			JButton Seat6 = new JButton("1B");
			Seat6.setForeground(Color.BLACK);
			Seat6.setBackground(new Color(0, 255, 0));
			Seat6.setBounds(432, 131, 63, 20);
			frame1.getContentPane().add(Seat6);
			Seat6.addActionListener(disabledSeatListener);
			
			JButton Seat7 = new JButton("2B");
			Seat7.setForeground(Color.BLACK);
			Seat7.setBackground(new Color(0, 255, 0));
			Seat7.setBounds(432, 150, 63, 20);
			frame1.getContentPane().add(Seat7);
			Seat7.addActionListener(disabledSeatListener);

			JButton Seat8 = new JButton("3B");
			Seat8.setForeground(Color.BLACK);
			Seat8.setBackground(Color.WHITE);
			Seat8.setBounds(432, 169, 63, 20);
			frame1.getContentPane().add(Seat8);
			Seat8.addActionListener(listener);

			JButton Seat9 = new JButton("4B");
			Seat9.setForeground(Color.BLACK);
			Seat9.setBackground(Color.WHITE);
			Seat9.setBounds(432, 188, 63, 20);
			frame1.getContentPane().add(Seat9);
			Seat9.addActionListener(listener);

			JButton Seat10 = new JButton("5B");
			Seat10.setForeground(Color.BLACK);
			Seat10.setBackground(Color.WHITE);
			Seat10.setBounds(432, 207, 63, 20);
			frame1.getContentPane().add(Seat10);
			Seat10.addActionListener(listener);

			JButton Seat11 = new JButton("11A");
			Seat11.setForeground(Color.BLACK);
			Seat11.setBackground(Color.WHITE);
			Seat11.setBounds(112, 430, 63, 20);
			frame1.getContentPane().add(Seat11);
			Seat11.addActionListener(listener);

			JButton Seat12 = new JButton("12A");
			Seat12.setForeground(Color.BLACK);
			Seat12.setBackground(Color.WHITE);
			Seat12.setBounds(112, 449, 63, 20);
			frame1.getContentPane().add(Seat12);
			Seat12.addActionListener(listener);

			JButton Seat13 = new JButton("13A");
			Seat13.setForeground(Color.BLACK);
			Seat13.setBackground(Color.WHITE);
			Seat13.setBounds(112, 468, 63, 20);
			frame1.getContentPane().add(Seat13);
			Seat13.addActionListener(listener);

			JButton Seat14 = new JButton("14A");
			Seat14.setForeground(Color.BLACK);
			Seat14.setBackground(new Color(128, 128, 128));
			Seat14.setBounds(112, 487, 63, 20);
			frame1.getContentPane().add(Seat14);
			Seat14.addActionListener(panel);
			
			JButton Seat15 = new JButton("15A");
			Seat15.setForeground(Color.BLACK);
			Seat15.setBackground(Color.WHITE);
			Seat15.setBounds(112, 506, 63, 20);
			frame1.getContentPane().add(Seat15);
			Seat15.addActionListener(listener);

			
			JButton Seat16 = new JButton("11B");
			Seat16.setForeground(Color.BLACK);
			Seat16.setBackground(Color.WHITE);
			Seat16.setBounds(174, 430, 63, 20);
			frame1.getContentPane().add(Seat16);
			Seat16.addActionListener(listener);

			JButton Seat17 = new JButton("12B");
			Seat17.setForeground(Color.BLACK);
			Seat17.setBackground(Color.WHITE);
			Seat17.setBounds(174, 449, 63, 20);
			frame1.getContentPane().add(Seat17);
			Seat17.addActionListener(listener);

			JButton Seat18 = new JButton("13B");
			Seat18.setForeground(Color.BLACK);
			Seat18.setBackground(Color.WHITE);
			Seat18.setBounds(174, 468, 63, 20);
			frame1.getContentPane().add(Seat18);
			Seat18.addActionListener(listener);

			JButton Seat19 = new JButton("14B");
			Seat19.setForeground(Color.BLACK);
			Seat19.setBackground(Color.WHITE);
			Seat19.setBounds(174, 487, 63, 20);
			frame1.getContentPane().add(Seat19);
			Seat19.addActionListener(listener);

			JButton Seat20 = new JButton("15B");
			Seat20.setForeground(Color.BLACK);
			Seat20.setBackground(Color.WHITE);
			Seat20.setBounds(174, 506, 63, 20);
			frame1.getContentPane().add(Seat20);
			Seat20.addActionListener(listener);

			JButton Seat21 = new JButton("11C");
			Seat21.setForeground(Color.BLACK);
			Seat21.setBackground(Color.WHITE);
			Seat21.setBounds(236, 430, 63, 20);
			frame1.getContentPane().add(Seat21);
			Seat21.addActionListener(listener);

			JButton Seat22 = new JButton("12C");
			Seat22.setForeground(Color.BLACK);
			Seat22.setBackground(Color.WHITE);
			Seat22.setBounds(236, 449, 63, 20);
			frame1.getContentPane().add(Seat22);
			Seat22.addActionListener(listener);

			JButton Seat23 = new JButton("13C");
			Seat23.setForeground(Color.BLACK);
			Seat23.setBackground(Color.WHITE);
			Seat23.setBounds(236, 468, 63, 20);
			frame1.getContentPane().add(Seat23);
			Seat23.addActionListener(listener);

			JButton Seat24 = new JButton("14C");
			Seat24.setForeground(Color.BLACK);
			Seat24.setBackground(Color.WHITE);
			Seat24.setBounds(236, 487, 63, 20);
			frame1.getContentPane().add(Seat24);
			Seat24.addActionListener(listener);

			JButton Seat25 = new JButton("15C");
			Seat25.setForeground(Color.BLACK);
			Seat25.setBackground(Color.WHITE);
			Seat25.setBounds(236, 506, 63, 20);
			frame1.getContentPane().add(Seat25);
			Seat25.addActionListener(listener);

			JButton Seat26 = new JButton("11D");
			Seat26.setForeground(Color.BLACK);
			Seat26.setBackground(new Color(128, 128, 128));
			Seat26.setBounds(309, 430, 63, 20);
			frame1.getContentPane().add(Seat26);
			Seat26.addActionListener(panel);
			
			JButton Seat27 = new JButton("12D");
			Seat27.setForeground(Color.BLACK);
			Seat27.setBackground(Color.WHITE);
			Seat27.setBounds(309, 449, 63, 20);
			frame1.getContentPane().add(Seat27);
			Seat27.addActionListener(listener);

			JButton Seat28 = new JButton("13D");
			Seat28.setForeground(Color.BLACK);
			Seat28.setBackground(Color.WHITE);
			Seat28.setBounds(309, 468, 63, 20);
			frame1.getContentPane().add(Seat28);
			Seat28.addActionListener(listener);

			JButton Seat29 = new JButton("14D");
			Seat29.setForeground(Color.BLACK);
			Seat29.setBackground(Color.WHITE);
			Seat29.setBounds(309, 487, 63, 20);
			frame1.getContentPane().add(Seat29);
			Seat29.addActionListener(listener);
			
			JButton Seat30 = new JButton("15D");
			Seat30.setForeground(Color.BLACK);
			Seat30.setBackground(Color.WHITE);
			Seat30.setBounds(309, 506, 63, 20);
			frame1.getContentPane().add(Seat30);
			Seat30.addActionListener(listener);

			JButton Seat31 = new JButton("11E");
			Seat31.setForeground(Color.BLACK);
			Seat31.setBackground(Color.WHITE);
			Seat31.setBounds(372, 430, 63, 20);
			frame1.getContentPane().add(Seat31);
			Seat31.addActionListener(listener);

			JButton Seat32 = new JButton("12E");
			Seat32.setForeground(Color.BLACK);
			Seat32.setBackground(Color.WHITE);
			Seat32.setBounds(372, 449, 63, 20);
			frame1.getContentPane().add(Seat32);
			Seat32.addActionListener(listener);

			JButton Seat33 = new JButton("13E");
			Seat33.setForeground(Color.BLACK);
			Seat33.setBackground(Color.WHITE);
			Seat33.setBounds(372, 468, 63, 20);
			frame1.getContentPane().add(Seat33);
			Seat33.addActionListener(listener);

			JButton Seat34 = new JButton("14E");
			Seat34.setForeground(Color.BLACK);
			Seat34.setBackground(Color.WHITE);
			Seat34.setBounds(372, 487, 63, 20);
			frame1.getContentPane().add(Seat34);
			Seat34.addActionListener(listener);

			JButton Seat35 = new JButton("15E");
			Seat35.setForeground(Color.BLACK);
			Seat35.setBackground(Color.WHITE);
			Seat35.setBounds(372, 506, 63, 20);
			frame1.getContentPane().add(Seat35);
			Seat35.addActionListener(listener);
			
			JButton Seat36 = new JButton("11F");
			Seat36.setForeground(Color.BLACK);
			Seat36.setBackground(new Color(128, 128, 128));
			Seat36.setBounds(432, 430, 63, 20);
			frame1.getContentPane().add(Seat36);
			Seat36.addActionListener(panel);
			
			JButton Seat37 = new JButton("12F");
			Seat37.setForeground(Color.BLACK);
			Seat37.setBackground(Color.WHITE);
			Seat37.setBounds(432, 449, 63, 20);
			frame1.getContentPane().add(Seat37);
			Seat37.addActionListener(listener);

			JButton Seat38 = new JButton("13F");
			Seat38.setForeground(Color.BLACK);
			Seat38.setBackground(Color.WHITE);
			Seat38.setBounds(432, 468, 63, 20);
			frame1.getContentPane().add(Seat38);
			Seat38.addActionListener(listener);

			JButton Seat39 = new JButton("14F");
			Seat39.setForeground(Color.BLACK);
			Seat39.setBackground(Color.WHITE);
			Seat39.setBounds(432, 487, 63, 20);
			frame1.getContentPane().add(Seat39);
			Seat39.addActionListener(listener);

			JButton Seat40 = new JButton("15F");
			Seat40.setForeground(Color.BLACK);
			Seat40.setBackground(Color.WHITE);
			Seat40.setBounds(432, 506, 63, 20);
			frame1.getContentPane().add(Seat40);
			Seat40.addActionListener(listener);

			JButton Seat41 = new JButton("16A");
			Seat41.setForeground(Color.BLACK);
			Seat41.setBackground(Color.WHITE);
			Seat41.setBounds(112, 525, 63, 20);
			frame1.getContentPane().add(Seat41);
			Seat41.addActionListener(listener);

			JButton Seat42 = new JButton("17A");
			Seat42.setForeground(Color.BLACK);
			Seat42.setBackground(Color.WHITE);
			Seat42.setBounds(112, 544, 63, 20);
			frame1.getContentPane().add(Seat42);
			Seat42.addActionListener(listener);

			JButton Seat43 = new JButton("18A");
			Seat43.setForeground(Color.BLACK);
			Seat43.setBackground(Color.WHITE);
			Seat43.setBounds(112, 563, 63, 20);
			frame1.getContentPane().add(Seat43);
			Seat43.addActionListener(listener);

			JButton Seat44 = new JButton("19A");
			Seat44.setForeground(Color.BLACK);
			Seat44.setBackground(Color.WHITE);
			Seat44.setBounds(112, 582, 63, 20);
			frame1.getContentPane().add(Seat44);
			Seat44.addActionListener(listener);

			JButton Seat45 = new JButton("16B");
			Seat45.setForeground(Color.BLACK);
			Seat45.setBackground(Color.WHITE);
			Seat45.setBounds(174, 525, 63, 20);
			frame1.getContentPane().add(Seat45);
			Seat45.addActionListener(listener);

			JButton Seat46 = new JButton("17B");
			Seat46.setForeground(Color.BLACK);
			Seat46.setBackground(Color.WHITE);
			Seat46.setBounds(174, 544, 63, 20);
			frame1.getContentPane().add(Seat46);
			Seat46.addActionListener(listener);

			JButton Seat47 = new JButton("18B");
			Seat47.setForeground(Color.BLACK);
			Seat47.setBackground(Color.WHITE);
			Seat47.setBounds(174, 563, 63, 20);
			frame1.getContentPane().add(Seat47);
			Seat47.addActionListener(listener);

			JButton Seat48 = new JButton("19B");
			Seat48.setForeground(Color.BLACK);
			Seat48.setBackground(Color.WHITE);
			Seat48.setBounds(174, 582, 63, 20);
			frame1.getContentPane().add(Seat48);
			Seat48.addActionListener(listener);
			
			JButton Seat49 = new JButton("16C");
			Seat49.setForeground(Color.BLACK);
			Seat49.setBackground(Color.WHITE);
			Seat49.setBounds(236, 525, 63, 20);
			frame1.getContentPane().add(Seat49);
			Seat49.addActionListener(listener);

			JButton Seat50 = new JButton("17C");
			Seat50.setForeground(Color.BLACK);
			Seat50.setBackground(Color.WHITE);
			Seat50.setBounds(236, 544, 63, 20);
			frame1.getContentPane().add(Seat50);
			Seat50.addActionListener(listener);

			JButton Seat51 = new JButton("18C");
			Seat51.setForeground(Color.BLACK);
			Seat51.setBackground(Color.WHITE);
			Seat51.setBounds(236, 563, 63, 20);
			frame1.getContentPane().add(Seat51);
			Seat51.addActionListener(listener);

			JButton Seat52 = new JButton("19C");
			Seat52.setForeground(Color.BLACK);
			Seat52.setBackground(Color.WHITE);
			Seat52.setBounds(236, 582, 63, 20);
			frame1.getContentPane().add(Seat52);
			Seat52.addActionListener(listener);

			JButton Seat53 = new JButton("16D");
			Seat53.setForeground(Color.BLACK);
			Seat53.setBackground(Color.WHITE);
			Seat53.setBounds(309, 525, 63, 20);
			frame1.getContentPane().add(Seat53);
			Seat53.addActionListener(listener);

			JButton Seat54 = new JButton("17D");
			Seat54.setForeground(Color.BLACK);
			Seat54.setBackground(Color.WHITE);
			Seat54.setBounds(309, 544, 63, 20);
			frame1.getContentPane().add(Seat54);
			Seat54.addActionListener(listener);

			JButton Seat55 = new JButton("18D");
			Seat55.setForeground(Color.BLACK);
			Seat55.setBackground(Color.WHITE);
			Seat55.setBounds(309, 563, 63, 20);
			frame1.getContentPane().add(Seat55);
			Seat55.addActionListener(listener);

			JButton Seat56 = new JButton("19D");
			Seat56.setForeground(Color.BLACK);
			Seat56.setBackground(Color.WHITE);
			Seat56.setBounds(309, 582, 63, 20);
			frame1.getContentPane().add(Seat56);
			Seat56.addActionListener(listener);

			JButton Seat57 = new JButton("16E");
			Seat57.setForeground(Color.BLACK);
			Seat57.setBackground(Color.WHITE);
			Seat57.setBounds(371, 525, 63, 20);
			frame1.getContentPane().add(Seat57);
			Seat57.addActionListener(listener);

			JButton Seat58 = new JButton("17E");
			Seat58.setForeground(Color.BLACK);
			Seat58.setBackground(Color.WHITE);
			Seat58.setBounds(371, 544, 63, 20);
			frame1.getContentPane().add(Seat58);
			Seat58.addActionListener(listener);

			JButton Seat59 = new JButton("18E");
			Seat59.setForeground(Color.BLACK);
			Seat59.setBackground(Color.WHITE);
			Seat59.setBounds(371, 563, 63, 20);
			frame1.getContentPane().add(Seat59);
			Seat59.addActionListener(listener);

			JButton Seat60 = new JButton("19E");
			Seat60.setForeground(Color.BLACK);
			Seat60.setBackground(Color.WHITE);
			Seat60.setBounds(371, 582, 63, 20);
			frame1.getContentPane().add(Seat60);
			Seat60.addActionListener(listener);
			
			JButton Seat61 = new JButton("16F");
			Seat61.setForeground(Color.BLACK);
			Seat61.setBackground(Color.WHITE);
			Seat61.setBounds(432, 525, 63, 20);
			frame1.getContentPane().add(Seat61);
			Seat61.addActionListener(listener);
			
			JButton Seat62 = new JButton("17F");
			Seat62.setForeground(Color.BLACK);
			Seat62.setBackground(Color.WHITE);
			Seat62.setBounds(432, 544, 63, 20);
			frame1.getContentPane().add(Seat62);
			Seat62.addActionListener(listener);
			
			JButton Seat63 = new JButton("18F");
			Seat63.setForeground(Color.BLACK);
			Seat63.setBackground(Color.WHITE);
			Seat63.setBounds(432, 563, 63, 20);
			frame1.getContentPane().add(Seat63);
			Seat63.addActionListener(listener);
			
			JButton Seat64 = new JButton("19F");
			Seat64.setForeground(Color.BLACK);
			Seat64.setBackground(Color.WHITE);
			Seat64.setBounds(432, 582, 63, 20);
			frame1.getContentPane().add(Seat64);
			Seat64.addActionListener(listener);
			
			JButton Seat65 = new JButton("6A");
			Seat65.setForeground(Color.BLACK);
			Seat65.setBackground(new Color(0, 255, 0));
			Seat65.setBounds(112, 274, 63, 20);
			frame1.getContentPane().add(Seat65);
			Seat65.addActionListener(disabledSeatListener);

			JButton Seat66 = new JButton("7A");
			Seat66.setForeground(Color.BLACK);
			Seat66.setBackground(new Color(0, 255, 0));
			Seat66.setBounds(112, 293, 63, 20);
			frame1.getContentPane().add(Seat66);
			Seat66.addActionListener(disabledSeatListener);

			JButton Seat67 = new JButton("8A");
			Seat67.setForeground(Color.BLACK);
			Seat67.setBackground(Color.WHITE);
			Seat67.setBounds(112, 312, 63, 20);
			frame1.getContentPane().add(Seat67);
			Seat67.addActionListener(listener);

			JButton Seat68 = new JButton("9A");
			Seat68.setForeground(Color.BLACK);
			Seat68.setBackground(Color.WHITE);
			Seat68.setBounds(112, 331, 63, 20);
			frame1.getContentPane().add(Seat68);
			Seat68.addActionListener(listener);

			JButton Seat69 = new JButton("10A");
			Seat69.setForeground(Color.BLACK);
			Seat69.setBackground(Color.WHITE);
			Seat69.setBounds(112, 350, 63, 20);
			frame1.getContentPane().add(Seat69);
			Seat69.addActionListener(listener);

			JButton Seat70 = new JButton("6D");
			Seat70.setForeground(Color.BLACK);
			Seat70.setBackground(new Color(0, 255, 0));
			Seat70.setBounds(432, 274, 63, 20);
			frame1.getContentPane().add(Seat70);
			Seat70.addActionListener(disabledSeatListener);
			
			JButton Seat71 = new JButton("7D");
			Seat71.setForeground(Color.BLACK);
			Seat71.setBackground(new Color(0, 255, 0));
			Seat71.setBounds(432, 293, 63, 20);
			frame1.getContentPane().add(Seat71);
			Seat71.addActionListener(disabledSeatListener);
			
			JButton Seat72 = new JButton("8D");
			Seat72.setForeground(Color.BLACK);
			Seat72.setBackground(Color.WHITE);
			Seat72.setBounds(432, 312, 63, 20);
			frame1.getContentPane().add(Seat72);
			Seat72.addActionListener(listener);

			JButton Seat73 = new JButton("9D");
			Seat73.setForeground(Color.BLACK);
			Seat73.setBackground(Color.WHITE);
			Seat73.setBounds(432, 331, 63, 20);
			frame1.getContentPane().add(Seat73);
			Seat73.addActionListener(listener);

			JButton Seat74 = new JButton("10D");
			Seat74.setForeground(Color.BLACK);
			Seat74.setBackground(Color.WHITE);
			Seat74.setBounds(432, 350, 63, 20);
			frame1.getContentPane().add(Seat74);
			Seat74.addActionListener(listener);
			
			JButton Seat75 = new JButton("6B");
			Seat75.setForeground(Color.BLACK);
			Seat75.setBackground(new Color(128, 128, 128));
			Seat75.setBounds(236, 274, 63, 20);
			frame1.getContentPane().add(Seat75);
			Seat75.addActionListener(panel);
			
			JButton Seat76 = new JButton("7B");
			Seat76.setForeground(Color.BLACK);
			Seat76.setBackground(Color.WHITE);
			Seat76.setBounds(236, 293, 63, 20);
			frame1.getContentPane().add(Seat76);
			Seat76.addActionListener(listener);
			
			
			JButton Seat77 = new JButton("8B");
			Seat77.setForeground(Color.BLACK);
			Seat77.setBackground(Color.WHITE);
			Seat77.setBounds(236, 312, 63, 20);
			frame1.getContentPane().add(Seat77);
			Seat77.addActionListener(listener);
			
			JButton Seat78 = new JButton("9B");
			Seat78.setForeground(Color.BLACK);
			Seat78.setBackground(Color.WHITE);
			Seat78.setBounds(236, 331, 63, 20);
			frame1.getContentPane().add(Seat78);
			Seat78.addActionListener(listener);
			
			JButton Seat79 = new JButton("10B");
			Seat79.setForeground(Color.BLACK);
			Seat79.setBackground(Color.WHITE);
			Seat79.setBounds(236, 350, 63, 20);
			frame1.getContentPane().add(Seat79);
			Seat79.addActionListener(listener);
			
			JButton Seat80 = new JButton("6C");
			Seat80.setForeground(Color.BLACK);
			Seat80.setBackground(new Color(128, 128, 128));
			Seat80.setBounds(309, 274, 63, 20);
			frame1.getContentPane().add(Seat80);
			Seat80.addActionListener(panel);
			
			JButton Seat81 = new JButton("7C");
			Seat81.setForeground(Color.BLACK);
			Seat81.setBackground(Color.WHITE);
			Seat81.setBounds(309, 293, 63, 20);
			frame1.getContentPane().add(Seat81);
			Seat81.addActionListener(listener);
			
			JButton Seat82 = new JButton("8C");
			Seat82.setForeground(Color.BLACK);
			Seat82.setBackground(Color.WHITE);
			Seat82.setBounds(309, 312, 63, 20);
			frame1.getContentPane().add(Seat82);
			Seat82.addActionListener(listener);
			
			JButton Seat83 = new JButton("9C");
			Seat83.setForeground(Color.BLACK);
			Seat83.setBackground(Color.WHITE);
			Seat83.setBounds(309, 331, 63, 20);
			frame1.getContentPane().add(Seat83);
			Seat83.addActionListener(listener);
			
			JButton Seat84 = new JButton("10C");
			Seat84.setForeground(Color.BLACK);
			Seat84.setBackground(Color.WHITE);
			Seat84.setBounds(309, 350, 63, 20);
			frame1.getContentPane().add(Seat84);
			Seat84.addActionListener(listener);
			
			JLabel lblNewLabel = new JLabel("SEATS");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel.setBackground(Color.BLACK);
			lblNewLabel.setBounds(236, 0, 123, 29);
			frame1.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_3 = new JLabel("First Class");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_3.setBounds(88, 100, 107, 14);
			frame1.getContentPane().add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Economy");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_4.setBounds(88, 390, 69, 14);
			frame1.getContentPane().add(lblNewLabel_4);
			
			JLabel lblNewLabel_1 = new JLabel("Departing: Boeing 747");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_1.setBounds(10, 38, 150, 14);
			frame1.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Select Seat");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_2.setBounds(10, 58, 80, 14);
			frame1.getContentPane().add(lblNewLabel_2);
			
			JLabel lblNewLabel_3_1 = new JLabel("Business Class");
			lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_3_1.setBounds(88, 249, 107, 14);
			frame1.getContentPane().add(lblNewLabel_3_1);
			
			JLabel lblNewLabel_5 = new JLabel("Instructions:");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_5.setBounds(544, 101, 80, 14);
			frame1.getContentPane().add(lblNewLabel_5);
			
			JButton btnNewButton_9 = new JButton("**");
			btnNewButton_9.setBackground(new Color(255, 255, 255));
			btnNewButton_9.setBounds(528, 134, 34, 14);
			frame1.getContentPane().add(btnNewButton_9);
			
			
			JLabel lblNewLabel_6 = new JLabel("-available");
			lblNewLabel_6.setBounds(565, 134, 79, 14);
			frame1.getContentPane().add(lblNewLabel_6);
			
			JButton btnNewButton_9_1 = new JButton("**");
			btnNewButton_9_1.setBackground(new Color(255, 0, 0));
			btnNewButton_9_1.setBounds(528, 156, 34, 14);
			frame1.getContentPane().add(btnNewButton_9_1);
			
			JLabel lblNewLabel_6_1 = new JLabel("-selected");
			lblNewLabel_6_1.setBounds(565, 156, 79, 14);
			frame1.getContentPane().add(lblNewLabel_6_1);
			
			JButton btnNewButton_9_2 = new JButton("**");
			btnNewButton_9_2.setForeground(Color.WHITE);
			btnNewButton_9_2.setBackground(Color.GRAY);
			btnNewButton_9_2.setBounds(528, 175, 34, 14);
			frame1.getContentPane().add(btnNewButton_9_2);
			
			JLabel lblNewLabel_6_2 = new JLabel("-not available");
			lblNewLabel_6_2.setBounds(565, 175, 79, 14);
			frame1.getContentPane().add(lblNewLabel_6_2);
			
			JLabel lblNewLabel_7 = new JLabel("EXIT");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_7.setForeground(new Color(255, 0, 0));
			lblNewLabel_7.setBounds(22, 118, 46, 14);
			frame1.getContentPane().add(lblNewLabel_7);
			
			JLabel lblNewLabel_7_1 = new JLabel("EXIT");
			lblNewLabel_7_1.setForeground(Color.RED);
			lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_7_1.setBounds(22, 261, 46, 14);
			frame1.getContentPane().add(lblNewLabel_7_1);
			
			JLabel lblNewLabel_7_2 = new JLabel("EXIT");
			lblNewLabel_7_2.setForeground(Color.RED);
			lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_7_2.setBounds(22, 430, 46, 14);
			frame1.getContentPane().add(lblNewLabel_7_2);
			
			JLabel lblNewLabel_7_3 = new JLabel("EXIT");
			lblNewLabel_7_3.setForeground(Color.RED);
			lblNewLabel_7_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_7_3.setBounds(500, 118, 46, 14);
			frame1.getContentPane().add(lblNewLabel_7_3);
			
			JLabel lblNewLabel_7_4 = new JLabel("EXIT");
			lblNewLabel_7_4.setForeground(Color.RED);
			lblNewLabel_7_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_7_4.setBounds(500, 263, 46, 14);
			frame1.getContentPane().add(lblNewLabel_7_4);
			
			JLabel lblNewLabel_7_5 = new JLabel("EXIT");
			lblNewLabel_7_5.setForeground(Color.RED);
			lblNewLabel_7_5.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_7_5.setBounds(505, 431, 46, 14);
			frame1.getContentPane().add(lblNewLabel_7_5);
			
			JButton btnNewButton_9_2_1 = new JButton("**");
	        btnNewButton_9_2_1.setForeground(Color.WHITE);
	        btnNewButton_9_2_1.setBackground(new Color(0, 255, 0));
	        btnNewButton_9_2_1.setBounds(528, 194, 34, 14);
	        frame1.getContentPane().add(btnNewButton_9_2_1);
	        
	        JLabel lblNewLabel_6_2_1 = new JLabel("-for disabled");
	        lblNewLabel_6_2_1.setBounds(565, 194, 79, 14);
	        frame1.getContentPane().add(lblNewLabel_6_2_1);
	
	        //Random Seat select  button
			JButton btnNewButton_8_1 = new JButton("Select Randon Seat");
			// Create an ActionListener to handle the button click event
			ActionListener selectRandomSeatListener = new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        // Get a list of all the buttons representing seats
			        List<JButton> seatButtons = Arrays.asList(Seat11, Seat12, Seat13, Seat15, Seat16, Seat17,
			        		Seat18, Seat19, Seat20, Seat21, Seat22, Seat23, Seat24, Seat25, Seat27, 
			        		Seat28, Seat29, Seat30, Seat31, Seat32, Seat33, Seat34, Seat35, Seat37,
			        		Seat38, Seat39, Seat40, Seat41, Seat42, Seat43, Seat44, Seat45, Seat46, Seat47,
			        		Seat48, Seat49, Seat50, Seat51,
			        		Seat52, Seat53, Seat54, Seat55, Seat56, Seat57, Seat58, Seat59, Seat60, Seat61,
			        		Seat62, Seat63, Seat64);			        
			        // Select a random seat button
			        Random rand = new Random(); 
			        JButton randomSeatButton = seatButtons.get(rand.nextInt(seatButtons.size()));
			        
			        // Perform the selected seat button's action
			         randomSeatButton.doClick();
			    }
			};
			
			// Add the ActionListener to the button
			btnNewButton_8_1.addActionListener(selectRandomSeatListener);
			btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnNewButton_8_1.setBounds(225, 220, 150, 23);
			frame1.getContentPane().add(btnNewButton_8_1);
	
			//to save your seats
			JButton btnNewButton_8 = new JButton("Next");
	        btnNewButton_8.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	        btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 11));
	        btnNewButton_8.setBounds(485, 627, 89, 23);
	        frame1.getContentPane().add(btnNewButton_8);
	        //Action performed here to reserve seat or chose returning seat
	        btnNewButton_8.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Show a JOptionPane with Yes or No options
	                int response = JOptionPane.showConfirmDialog(frame1, "Do you want to reserve a seat for the returning plane?",
	                        "Returning Plane", JOptionPane.YES_NO_OPTION);

	                // If the user presses "Yes"
	                if (response == JOptionPane.YES_OPTION) {
	                    // Close the current window
	                    frame1.dispose();

	                    // Call the method in the ReturningB_747 class to show its GUI
	                    ReturningB_747 newWindow = new ReturningB_747();
	                    newWindow.createAndShowGUI();
	                } else if (response == JOptionPane.NO_OPTION) {
	                    // Show a confirmation message
	                    JOptionPane.showMessageDialog(frame1, "Dear customer, your seat is reserved. Thank you!");

	                    // Terminate the code
	                    System.exit(0);
	                }
	            }
	        });	
		}
	}