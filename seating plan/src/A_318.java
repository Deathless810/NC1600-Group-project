
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.beans.PropertyChangeEvent;
import java.awt.Cursor;
import javax.swing.UIManager;
public class A_318 extends start {
	private JFrame frame;
    private int seatCounter = 1; // Add a seat counter
    private final int maxSeats = 3; // Set the maximum allowed seat selections
	/**
	 * Launch the application.
	 */
     
			public void run() {
				try {
					A_318 window = new A_318();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
	
	/**
	 * Create the application.
	 */
	public A_318() {
		initialize();
	}
	
	public A_318(String string) {
		// TODO Auto-generated constructor stub
	
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
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
		                JOptionPane.showMessageDialog(frame, "You can only select up to " + maxSeats + " seats.", "Maximum Seats Reached", JOptionPane.WARNING_MESSAGE);
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
//Disable person 
			ActionListener disabledSeatListener = new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			      Object[] options = {"Yes", "No"};
			      int n = JOptionPane.showOptionDialog(frame,
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

		
	JButton SEAT1 = new JButton("1A");
	SEAT1.setForeground(new Color(0, 0, 0));
	SEAT1.setBackground(new Color(0, 255, 0));
	SEAT1.setBounds(97, 142, 63, 20);
	frame.getContentPane().add(SEAT1);
	SEAT1.addActionListener(disabledSeatListener);

	JButton SEAT2 = new JButton("2A");
	SEAT2.setForeground(new Color(0, 0, 0));
	SEAT2.setBackground(new Color(0, 255, 0));
	SEAT2.setBounds(97, 161, 63, 20);
	frame.getContentPane().add(SEAT2);
	SEAT2.addActionListener(disabledSeatListener);
	
	JButton SEAT3 = new JButton("3A");
	SEAT3.setForeground(new Color(0, 0, 0));
	SEAT3.setBackground(new Color(255, 255, 255));
	SEAT3.setBounds(97, 180, 63, 20);
	frame.getContentPane().add(SEAT3);
	SEAT3.addActionListener(listener);

	JButton SEAT4 = new JButton("4A");
	SEAT4.setForeground(new Color(0, 0, 0));
	SEAT4.setBackground(new Color(255, 255, 255));
	SEAT4.setBounds(97, 199, 63, 20);
	frame.getContentPane().add(SEAT4);
	SEAT4.addActionListener(listener);

	JButton SEAT5 = new JButton("5A");
	SEAT5.setForeground(new Color(0, 0, 0));
	SEAT5.setBackground(new Color(255, 0, 0));
	SEAT5.setBounds(97, 218, 63, 20);
	frame.getContentPane().add(SEAT5);
	SEAT5.addActionListener(listener);

	JButton SEAT6 = new JButton("1B");
	SEAT6.setForeground(new Color(0, 0, 0));
	SEAT6.setBackground(new Color(0, 255, 0));
	SEAT6.setBounds(417, 142, 63, 20);
	frame.getContentPane().add(SEAT6);
	SEAT6.addActionListener(disabledSeatListener);
	
	JButton SEAT7 = new JButton("2B");
	SEAT7.setForeground(new Color(0, 0, 0));
	SEAT7.setBackground(new Color(0, 255, 0));
	SEAT7.setBounds(417, 161, 63, 20);
	frame.getContentPane().add(SEAT7);
	SEAT7.addActionListener(disabledSeatListener);
	
	JButton SEAT8 = new JButton("3B");
	SEAT8.setForeground(new Color(0, 0, 0));
	SEAT8.setBackground(new Color(255, 255, 255));
	SEAT8.setBounds(417, 180, 63, 20);
	frame.getContentPane().add(SEAT8);
	SEAT8.addActionListener(listener);

	JButton SEAT9 = new JButton("4B");
	SEAT9.setForeground(new Color(0, 0, 0));
	SEAT9.setBackground(new Color(255, 255, 255));
	SEAT9.setBounds(417, 199, 63, 20);
	frame.getContentPane().add(SEAT9);
	SEAT9.addActionListener(listener);

	JButton SEAT10 = new JButton("5B");
	SEAT10.setForeground(new Color(0, 0, 0));
	SEAT10.setBackground(new Color(255, 255, 255));
	SEAT10.setBounds(417, 218, 63, 20);
	frame.getContentPane().add(SEAT10);
	SEAT10.addActionListener(listener);

	JButton SEAT11 = new JButton("6A");
	SEAT11.setForeground(new Color(0, 0, 0));
	SEAT11.setBackground(new Color(0, 255, 0));
	SEAT11.setBounds(97, 309, 63, 20);
	frame.getContentPane().add(SEAT11);
	SEAT11.addActionListener(disabledSeatListener);
	
	JButton SEAT12 = new JButton("7A");
	SEAT12.setForeground(new Color(0, 0, 0));
	SEAT12.setBackground(new Color(0, 255, 0));
	SEAT12.setBounds(97, 328, 63, 20);
	frame.getContentPane().add(SEAT12);
	SEAT12.addActionListener(disabledSeatListener);
	
	JButton SEAT13 = new JButton("8A");
	SEAT13.setForeground(new Color(0, 0, 0));
	SEAT13.setBackground(new Color(255, 255, 255));
	SEAT13.setBounds(97, 347, 63, 20);
	frame.getContentPane().add(SEAT13);
	SEAT13.addActionListener(listener);
	JButton SEAT14 = new JButton("9A");
	SEAT14.setForeground(new Color(0, 0, 0));
	SEAT14.setBackground(new Color(255, 255, 255));
	SEAT14.setBounds(97, 366, 63, 20);
	frame.getContentPane().add(SEAT14);
	SEAT14.addActionListener(listener);

	JButton SEAT15 = new JButton("10A");
	SEAT15.setForeground(new Color(0, 0, 0));
	SEAT15.setBackground(new Color(255, 255, 255));
	SEAT15.setBounds(97, 385, 63, 20);
	frame.getContentPane().add(SEAT15);
	SEAT15.addActionListener(listener);

	JButton SEAT16 = new JButton("6B");
	SEAT16.setForeground(new Color(0, 0, 0));
	SEAT16.setBackground(new Color(128, 128, 128));
	SEAT16.setBounds(159, 309, 63, 20);
	frame.getContentPane().add(SEAT16);
	SEAT16.addActionListener(panel);
	
	JButton SEAT17 = new JButton("7B");
	SEAT17.setForeground(new Color(0, 0, 0));
	SEAT17.setBackground(new Color(255, 255, 255));
	SEAT17.setBounds(159, 328, 63, 20);
	frame.getContentPane().add(SEAT17);
	SEAT17.addActionListener(listener);

	JButton SEAT18 = new JButton("8B");
	SEAT18.setForeground(new Color(0, 0, 0));
	SEAT18.setBackground(new Color(255, 255, 255));
	SEAT18.setBounds(159, 347, 63, 20);
	frame.getContentPane().add(SEAT18);
	SEAT18.addActionListener(listener);

	JButton SEAT19 = new JButton("9B");
	SEAT19.setForeground(new Color(0, 0, 0));
	SEAT19.setBackground(new Color(255, 255, 255));
	SEAT19.setBounds(159, 366, 63, 20);
	frame.getContentPane().add(SEAT19);
	SEAT19.addActionListener(listener);

	JButton SEAT20 = new JButton("10B");
	SEAT20.setForeground(new Color(0, 0, 0));
	SEAT20.setBackground(new Color(255, 255, 255));
	SEAT20.setBounds(159, 385, 63, 20);
	frame.getContentPane().add(SEAT20);
	SEAT20.addActionListener(listener);

	JButton SEAT21 = new JButton("6C");
	SEAT21.setForeground(new Color(0, 0, 0));
	SEAT21.setBackground(new Color(255, 255, 255));
	SEAT21.setBounds(221, 309, 63, 20);
	frame.getContentPane().add(SEAT21);
	SEAT21.addActionListener(listener);

	JButton SEAT22 = new JButton("7C");
	SEAT22.setForeground(new Color(0, 0, 0));
	SEAT22.setBackground(new Color(255, 255, 255));
	SEAT22.setBounds(221, 328, 63, 20);
	frame.getContentPane().add(SEAT22);
	SEAT22.addActionListener(listener);

	JButton SEAT23 = new JButton("8C");
	SEAT23.setForeground(new Color(0, 0, 0));
	SEAT23.setBackground(new Color(255, 255, 255));
	SEAT23.setBounds(221, 347, 63, 20);
	frame.getContentPane().add(SEAT23);
	SEAT23.addActionListener(listener);

	JButton SEAT24 = new JButton("9C");
	SEAT24.setForeground(new Color(0, 0, 0));
	SEAT24.setBackground(new Color(255, 255, 255));
	SEAT24.setBounds(221, 366, 63, 20);
	frame.getContentPane().add(SEAT24);
	SEAT24.addActionListener(listener);

	JButton SEAT25 = new JButton("10C");
	SEAT25.setForeground(new Color(0, 0, 0));
	SEAT25.setBackground(new Color(255, 255, 255));
	SEAT25.setBounds(221, 385, 63, 20);
	frame.getContentPane().add(SEAT25);
	SEAT25.addActionListener(listener);

	JButton SEAT26 = new JButton("6D");
	SEAT26.setForeground(new Color(0, 0, 0));
	SEAT26.setBackground(new Color(255, 255, 255));
	SEAT26.setBounds(294, 309, 63, 20);
	frame.getContentPane().add(SEAT26);
	SEAT26.addActionListener(listener);

	JButton SEAT27 = new JButton("7D");
	SEAT27.setForeground(new Color(0, 0, 0));
	SEAT27.setBackground(new Color(255, 255, 255));
	SEAT27.setBounds(294, 328, 63, 20);
	frame.getContentPane().add(SEAT27);
	SEAT27.addActionListener(listener);

	JButton SEAT28 = new JButton("8D");
	SEAT28.setForeground(new Color(0, 0, 0));
	SEAT28.setBackground(new Color(255, 255, 255));
	SEAT28.setBounds(294, 347, 63, 20);
	frame.getContentPane().add(SEAT28);
	SEAT28.addActionListener(listener);

	JButton SEAT29 = new JButton("9D");
	SEAT29.setForeground(new Color(0, 0, 0));
	SEAT29.setBackground(new Color(255, 255, 255));
	SEAT29.setBounds(294, 366, 63, 20);
	frame.getContentPane().add(SEAT29);
	SEAT29.addActionListener(listener);

	JButton SEAT30 = new JButton("10D");
	SEAT30.setForeground(new Color(0, 0, 0));
	SEAT30.setBackground(new Color(255, 255, 255));
	SEAT30.setBounds(294, 385, 63, 20);
	frame.getContentPane().add(SEAT30);
	SEAT30.addActionListener(listener);

	JButton SEAT31 = new JButton("6E");
	SEAT31.setForeground(new Color(0, 0, 0));
	SEAT31.setBackground(new Color(255, 255, 255));
	SEAT31.setBounds(356, 309, 63, 20);
	frame.getContentPane().add(SEAT31);
	SEAT31.addActionListener(listener);

	JButton SEAT32 = new JButton("7E");
	SEAT32.setForeground(new Color(0, 0, 0));
	SEAT32.setBackground(new Color(255, 255, 255));
	SEAT32.setBounds(356, 328, 63, 20);
	frame.getContentPane().add(SEAT32);
	SEAT32.addActionListener(listener);

	JButton SEAT33 = new JButton("8E");
	SEAT33.setForeground(new Color(0, 0, 0));
	SEAT33.setBackground(new Color(255, 255, 255));
	SEAT33.setBounds(356, 347, 63, 20);
	frame.getContentPane().add(SEAT33);
	SEAT33.addActionListener(listener);

	JButton SEAT34 = new JButton("9E");
	SEAT34.setForeground(new Color(0, 0, 0));
	SEAT34.setBackground(new Color(255, 255, 255));
	SEAT34.setBounds(356, 366, 63, 20);
	frame.getContentPane().add(SEAT34);
	SEAT34.addActionListener(listener);

	JButton SEAT35 = new JButton("10E");
	SEAT35.setForeground(new Color(0, 0, 0));
	SEAT35.setBackground(new Color(255, 255, 255));
	SEAT35.setBounds(356, 385, 63, 20);
	frame.getContentPane().add(SEAT35);
	SEAT35.addActionListener(listener);

	JButton SEAT36 = new JButton("6F");
	SEAT36.setForeground(new Color(0, 0, 0));
	SEAT36.setBackground(new Color(0, 255, 0));
	SEAT36.setBounds(417, 309, 63, 20);
	frame.getContentPane().add(SEAT36);
	SEAT36.addActionListener(disabledSeatListener);

	JButton SEAT37 = new JButton("7F");
	SEAT37.setForeground(new Color(0, 0, 0));
	SEAT37.setBackground(new Color(0, 255, 0));
	SEAT37.setBounds(417, 328, 63, 20);
	frame.getContentPane().add(SEAT37);
	SEAT37.addActionListener(disabledSeatListener);
	
	JButton SEAT38 = new JButton("8F");
	SEAT38.setForeground(new Color(0, 0, 0));
	SEAT38.setBackground(new Color(255, 255, 255));
	SEAT38.setBounds(417, 347, 63, 20);
	frame.getContentPane().add(SEAT38);
	SEAT38.addActionListener(listener);

	JButton SEAT39 = new JButton("9F");
	SEAT39.setForeground(new Color(0, 0, 0));
	SEAT39.setBackground(new Color(255, 255, 255));
	SEAT39.setBounds(417, 366, 63, 20);
	frame.getContentPane().add(SEAT39);
	SEAT39.addActionListener(listener);

	JButton SEAT40 = new JButton("10F");
	SEAT40.setForeground(new Color(0, 0, 0));
	SEAT40.setBackground(new Color(255, 255, 255));
	SEAT40.setBounds(417, 385, 63, 20);
	frame.getContentPane().add(SEAT40);
	SEAT40.addActionListener(listener);

	JButton SEAT41 = new JButton("11A");
	SEAT41.setForeground(new Color(0, 0, 0));
	SEAT41.setBackground(new Color(255, 255, 255));
	SEAT41.setBounds(97, 404, 63, 20);
	frame.getContentPane().add(SEAT41);
	SEAT41.addActionListener(listener);

	JButton SEAT42 = new JButton("12A");
	SEAT42.setForeground(new Color(0, 0, 0));
	SEAT42.setBackground(new Color(128, 128, 128));
	SEAT42.setBounds(97, 423, 63, 20);
	frame.getContentPane().add(SEAT42);
	SEAT42.addActionListener(panel);
	
	JButton SEAT43 = new JButton("13A");
	SEAT43.setForeground(new Color(0, 0, 0));
	SEAT43.setBackground(new Color(255, 255, 255));
	SEAT43.setBounds(97, 442, 63, 20);
	frame.getContentPane().add(SEAT43);
	SEAT43.addActionListener(listener);

	JButton SEAT44 = new JButton("14A");
	SEAT44.setForeground(new Color(0, 0, 0));
	SEAT44.setBackground(new Color(255, 255, 255));
	SEAT44.setBounds(97, 461, 63, 20);
	frame.getContentPane().add(SEAT44);
	SEAT44.addActionListener(listener);

	JButton SEAT45 = new JButton("11B");
	SEAT45.setForeground(new Color(0, 0, 0));
	SEAT45.setBackground(new Color(255, 255, 255));
	SEAT45.setBounds(159, 404, 63, 20);
	frame.getContentPane().add(SEAT45);
	SEAT45.addActionListener(listener);

	JButton SEAT46 = new JButton("12B");
	SEAT46.setForeground(new Color(0, 0, 0));
	SEAT46.setBackground(new Color(255, 255, 255));
	SEAT46.setBounds(159, 423, 63, 20);
	frame.getContentPane().add(SEAT46);
	SEAT46.addActionListener(listener);

	JButton SEAT47 = new JButton("13B");
	SEAT47.setForeground(new Color(0, 0, 0));
	SEAT47.setBackground(new Color(255, 255, 255));
	SEAT47.setBounds(159, 442, 63, 20);
	frame.getContentPane().add(SEAT47);
	SEAT47.addActionListener(listener);

	JButton SEAT48 = new JButton("14B");
	SEAT48.setForeground(new Color(0, 0, 0));
	SEAT48.setBackground(new Color(255, 255, 255));
	SEAT48.setBounds(159, 461, 63, 20);
	frame.getContentPane().add(SEAT48);
	SEAT48.addActionListener(listener);

	JButton SEAT49 = new JButton("11C");
	SEAT49.setForeground(new Color(0, 0, 0));
	SEAT49.setBackground(new Color(255, 255, 255));
	SEAT49.setBounds(221, 404, 63, 20);
	frame.getContentPane().add(SEAT49);
	SEAT49.addActionListener(listener);

	JButton SEAT50 = new JButton("12C");
	SEAT50.setForeground(new Color(0, 0, 0));
	SEAT50.setBackground(new Color(255, 255, 255));
	SEAT50.setBounds(221, 423, 63, 20);
	frame.getContentPane().add(SEAT50);
	SEAT50.addActionListener(listener);

	JButton SEAT51 = new JButton("13C");
	SEAT51.setForeground(new Color(0, 0, 0));
	SEAT51.setBackground(new Color(255, 255, 255));
	SEAT51.setBounds(221, 442, 63, 20);
	frame.getContentPane().add(SEAT51);
	SEAT51.addActionListener(listener);

	JButton SEAT52 = new JButton("14C");
	SEAT52.setForeground(new Color(0, 0, 0));
	SEAT52.setBackground(new Color(255, 255, 255));
	SEAT52.setBounds(221, 461, 63, 20);
	frame.getContentPane().add(SEAT52);
	SEAT52.addActionListener(listener);

	JButton SEAT53 = new JButton("11D");
	SEAT53.setForeground(new Color(0, 0, 0));
	SEAT53.setBackground(new Color(255, 255, 255));
	SEAT53.setBounds(294, 404, 63, 20);
	frame.getContentPane().add(SEAT53);
	SEAT53.addActionListener(listener);

	JButton SEAT54 = new JButton("12D");
	SEAT54.setForeground(new Color(0, 0, 0));
	SEAT54.setBackground(new Color(255, 255, 255));
	SEAT54.setBounds(294, 423, 63, 20);
	frame.getContentPane().add(SEAT54);
	SEAT54.addActionListener(listener);

	JButton SEAT55 = new JButton("13D");
	SEAT55.setForeground(new Color(0, 0, 0));
	SEAT55.setBackground(new Color(255, 255, 255));
	SEAT55.setBounds(294, 442, 63, 20);
	frame.getContentPane().add(SEAT55);
	SEAT55.addActionListener(listener);

	JButton SEAT56 = new JButton("14D");
	SEAT56.setForeground(new Color(0, 0, 0));
	SEAT56.setBackground(new Color(128, 128, 128));
	SEAT56.setBounds(294, 461, 63, 20);
	frame.getContentPane().add(SEAT56);
	SEAT56.addActionListener(panel);
	
	JButton SEAT57 = new JButton("11E");
	SEAT57.setForeground(new Color(0, 0, 0));
	SEAT57.setBackground(new Color(255, 255, 255));
	SEAT57.setBounds(356, 404, 63, 20);
	frame.getContentPane().add(SEAT57);
	SEAT57.addActionListener(listener);

	JButton SEAT58 = new JButton("12E");
	SEAT58.setForeground(new Color(0, 0, 0));
	SEAT58.setBackground(new Color(255, 255, 255));
	SEAT58.setBounds(356, 423, 63, 20);
	frame.getContentPane().add(SEAT58);
	SEAT58.addActionListener(listener);

	JButton SEAT59 = new JButton("13E");
	SEAT59.setForeground(new Color(0, 0, 0));
	SEAT59.setBackground(new Color(255, 255, 255));
	SEAT59.setBounds(356, 442, 63, 20);
	frame.getContentPane().add(SEAT59);
	SEAT59.addActionListener(listener);

	JButton SEAT60 = new JButton("14E");
	SEAT60.setForeground(new Color(0, 0, 0));
	SEAT60.setBackground(new Color(255, 255, 255));
	SEAT60.setBounds(356, 461, 63, 20);
	frame.getContentPane().add(SEAT60);
	SEAT60.addActionListener(listener);

	JButton SEAT61 = new JButton("11F");
	SEAT61.setForeground(new Color(0, 0, 0));
	SEAT61.setBackground(new Color(255, 255, 255));
	SEAT61.setBounds(417, 404, 63, 20);
	frame.getContentPane().add(SEAT61);
	SEAT61.addActionListener(listener);

	JButton SEAT62 = new JButton("12F");
	SEAT62.setForeground(new Color(0, 0, 0));
	SEAT62.setBackground(new Color(255, 255, 255));
	SEAT62.setBounds(417, 423, 63, 20);
	frame.getContentPane().add(SEAT62);
	SEAT62.addActionListener(listener);

	JButton SEAT63 = new JButton("13F");
	SEAT63.setForeground(new Color(0, 0, 0));
	SEAT63.setBackground(new Color(255, 255, 255));
	SEAT63.setBounds(417, 442, 63, 20);
	frame.getContentPane().add(SEAT63);
	SEAT63.addActionListener(listener);

	JButton SEAT64 = new JButton("14F");
	SEAT64.setForeground(new Color(0, 0, 0));
	SEAT64.setBackground(new Color(255, 255, 255));
	SEAT64.setBounds(417, 461, 63, 20);
	frame.getContentPane().add(SEAT64);
	SEAT64.addActionListener(listener);

	//to save your seats
	JButton btnNewButton_8 = new JButton("Next");
    btnNewButton_8.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 11));
    btnNewButton_8.setBounds(515, 527, 89, 23);
    frame.getContentPane().add(btnNewButton_8);
    //Action performed here to reserve seat or chose returning seat
    btnNewButton_8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // Show a JOptionPane with Yes or No options
            int response = JOptionPane.showConfirmDialog(frame, "Do you want to reserve a seat for the returning plane?",
                    "Returning Plane", JOptionPane.YES_NO_OPTION);

            // If the user presses "Yes"
            if (response == JOptionPane.YES_OPTION) {
                // Close the current window
                frame.dispose();

                // Call the method in the ReturningA_318 class to show its GUI
                ReturningA_318 newWindow = new ReturningA_318();
                newWindow.createAndShowGUI();
            } else if (response == JOptionPane.NO_OPTION) {
                // Show a confirmation message
                JOptionPane.showMessageDialog(frame, "Dear customer, your seat is reserved. Thank you!");

                // Terminate the code
                System.exit(0);
            }
        }
    });	


	JLabel lblNewLabel = new JLabel("SEATS");
	lblNewLabel.setForeground(new Color(0, 0, 0));
	lblNewLabel.setBackground(new Color(0, 0, 0));
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
	lblNewLabel.setBounds(175, 11, 123, 29);
	frame.getContentPane().add(lblNewLabel);

	JLabel lblNewLabel_1 = new JLabel("Departing: Airbus A318");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblNewLabel_1.setBounds(10, 31, 150, 14);
	frame.getContentPane().add(lblNewLabel_1);

	JLabel lblNewLabel_2 = new JLabel("Select Seat");
	lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblNewLabel_2.setBounds(10, 51, 80, 14);
	frame.getContentPane().add(lblNewLabel_2);

	JLabel lblNewLabel_3 = new JLabel("Business Class");
	lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblNewLabel_3.setBounds(73, 111, 107, 14);
	frame.getContentPane().add(lblNewLabel_3);

	JLabel lblNewLabel_4 = new JLabel("Economy");
	lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblNewLabel_4.setBounds(73, 267, 69, 14);
	frame.getContentPane().add(lblNewLabel_4);
	
	JLabel lblNewLabel_5 = new JLabel("Instructions:");
	lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblNewLabel_5.setBounds(524, 79, 80, 14);
	frame.getContentPane().add(lblNewLabel_5);
	
	JButton btnNewButton_9 = new JButton("**");
	btnNewButton_9.setBackground(Color.WHITE);
	btnNewButton_9.setBounds(508, 112, 34, 14);
	frame.getContentPane().add(btnNewButton_9);
	
	JLabel lblNewLabel_6 = new JLabel("-available");
	lblNewLabel_6.setBounds(545, 112, 79, 14);
	frame.getContentPane().add(lblNewLabel_6);
	
	JButton btnNewButton_9_1 = new JButton("**");
	btnNewButton_9_1.setBackground(Color.RED);
	btnNewButton_9_1.setBounds(508, 134, 34, 14);
	frame.getContentPane().add(btnNewButton_9_1);
	
	JLabel lblNewLabel_6_1 = new JLabel("-selected");
	lblNewLabel_6_1.setBounds(545, 134, 79, 14);
	frame.getContentPane().add(lblNewLabel_6_1);
	
	JButton btnNewButton_9_2 = new JButton("**");
	btnNewButton_9_2.setForeground(new Color(255, 255, 255));
	btnNewButton_9_2.setBackground(new Color(128, 128, 128));
	btnNewButton_9_2.setBounds(508, 160, 34, 14);
	frame.getContentPane().add(btnNewButton_9_2);
	
	JLabel lblNewLabel_6_2 = new JLabel("-not available");
	lblNewLabel_6_2.setBounds(545, 160, 79, 14);
	frame.getContentPane().add(lblNewLabel_6_2);
	
	JButton btnNewButton_8_1 = new JButton("Select Randon Seat");
		ActionListener selectRandomSeatListener = new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Get a list of all the buttons representing seats
		        List<JButton> seatButtons = Arrays.asList(SEAT13, SEAT14, SEAT15,
		        		SEAT17, SEAT18, SEAT19,
		        		SEAT20, SEAT21, SEAT22, SEAT23, SEAT24, SEAT25, SEAT26, 
		        		SEAT27, SEAT28, SEAT29, SEAT30, SEAT31, SEAT32, SEAT33, 
		        		SEAT34, SEAT35, SEAT38, SEAT39, SEAT40, 
		        		SEAT41, SEAT43, SEAT44, SEAT45, SEAT46, SEAT47, 
		        		SEAT48, SEAT49, SEAT50, SEAT51, SEAT52, SEAT53, SEAT54, 
		        		SEAT55, SEAT57, SEAT58, SEAT59, SEAT60, SEAT61, 
		        		SEAT62, SEAT63, SEAT64);			        
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
					frame.getContentPane().add(btnNewButton_8_1);
					
	btnNewButton_8_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
	btnNewButton_8_1.setBounds(221, 233, 150, 23);
	frame.getContentPane().add(btnNewButton_8_1);
	
	JLabel lblNewLabel_7 = new JLabel("EXIT");
	lblNewLabel_7.setForeground(Color.RED);
	lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_7.setBounds(10, 134, 46, 14);
	frame.getContentPane().add(lblNewLabel_7);
	
	JLabel lblNewLabel_7_1 = new JLabel("EXIT");
	lblNewLabel_7_1.setForeground(Color.RED);
	lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_7_1.setBounds(10, 297, 46, 14);
	frame.getContentPane().add(lblNewLabel_7_1);
	
	JLabel lblNewLabel_7_2 = new JLabel("EXIT");
	lblNewLabel_7_2.setForeground(Color.RED);
	lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_7_2.setBounds(452, 117, 46, 14);
	frame.getContentPane().add(lblNewLabel_7_2);
	
	JLabel lblNewLabel_7_3 = new JLabel("EXIT");
	lblNewLabel_7_3.setForeground(Color.RED);
	lblNewLabel_7_3.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel_7_3.setBounds(496, 297, 46, 14);
	frame.getContentPane().add(lblNewLabel_7_3);
	
	JButton btnNewButton_9_2_1 = new JButton("**");
	btnNewButton_9_2_1.setForeground(Color.WHITE);
	btnNewButton_9_2_1.setBackground(Color.GREEN);
	btnNewButton_9_2_1.setBounds(508, 179, 34, 14);
	frame.getContentPane().add(btnNewButton_9_2_1);
	
	JLabel lblNewLabel_6_2_1 = new JLabel("-for disabled");
	lblNewLabel_6_2_1.setBounds(545, 180, 79, 14);
	frame.getContentPane().add(lblNewLabel_6_2_1);
	}
	

	}





