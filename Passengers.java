package grp1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.util.random.*;
@SuppressWarnings("unused")
public class Passengers {
	protected JFrame frame;
	protected JTextField textField;
	protected JTextField textField_1;
	protected JTextField textField_3;
	protected JTextField textField_4;
	protected JTextField textField_5;
	protected JTextField textField_6;
	protected final ButtonGroup buttonGroup = new ButtonGroup();
	protected JTextField txtinfo;
	protected static JDateChooser dateChooser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {


					String seats[] = {"1A","6A","11A"};
					String itinerary[][]= {

							{"1A","Mehemed"},
							{"1B", "Fatma"},
							{"6A", ""},
							{"11A", "Mansur"}
					};



					for (int i = 0; i < seats.length; i++) {
						String seat = seats[i];
						System.out.println(seat + " checking");


						for (int j = 0; j < itinerary.length; j++) {

							if(seat.equals(itinerary[j][0]) && itinerary[j][1].equals("")) {

								Passengers window = new Passengers(seat);
								window.frame.setVisible(true);
							}

						}
					}







				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Passengers(String seat) {

		frame = new JFrame();
		frame.setBounds(100, 100, 685, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(240, 248, 255));
		frame.getContentPane().add(desktopPane);
		desktopPane.setLayout(new BorderLayout(0, 0));

		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(SystemColor.window);
		desktopPane.add(desktopPane_1, BorderLayout.CENTER);

		JLabel lblNewLabel = new JLabel("Brunel London City Airport");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 19));
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBounds(180, 6, 273, 41);
		desktopPane_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Number of Bags");
		lblNewLabel_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBounds(47, 295, 130, 16);
		desktopPane_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setBounds(47, 105, 106, 16);
		desktopPane_1.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Last Name");
		lblNewLabel_2_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel_2_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_1.setBounds(348, 105, 106, 16);
		desktopPane_1.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Date Of Birth");
		lblNewLabel_2_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_1_1.setBounds(47, 143, 106, 16);
		desktopPane_1.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_2 = new JLabel("Email Address ");
		lblNewLabel_2_1_2.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel_2_1_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_1_2.setBounds(47, 193, 106, 16);
		desktopPane_1.add(lblNewLabel_2_1_2);

		JLabel lblNewLabel_2_1_3 = new JLabel("Passport Number");
		lblNewLabel_2_1_3.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel_2_1_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_1_3.setBounds(348, 143, 130, 16);
		desktopPane_1.add(lblNewLabel_2_1_3);

		JLabel lblNewLabel_2_1_4 = new JLabel("Telephone Number");
		lblNewLabel_2_1_4.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel_2_1_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_1_4.setBounds(348, 193, 130, 16);
		desktopPane_1.add(lblNewLabel_2_1_4);

		textField = new JTextField();
		textField.setBounds(180, 102, 130, 21);
		desktopPane_1.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(492, 100, 130, 26);
		desktopPane_1.add(textField_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(180, 188, 130, 26);
		desktopPane_1.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(490, 138, 130, 26);
		desktopPane_1.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(180, 241, 130, 26);
		desktopPane_1.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(490, 188, 130, 26);
		desktopPane_1.add(textField_6);

		JLabel lblNewLabel_3 = new JLabel("Passenger Information:");
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		lblNewLabel_3.setBounds(47, 53, 231, 26);
		desktopPane_1.add(lblNewLabel_3);

		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd/MM/yyyy");
		dateChooser.setBounds(180, 143, 130, 16);
		desktopPane_1.add(dateChooser);

		// SPECIFY DATE FORMAT TO DD/MM/YYYY

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		comboBox.setBounds(180, 291, 66, 27);
		desktopPane_1.add(comboBox);

		JLabel lblNewLabel_4 = new JLabel("Any Disabilities ?");
		lblNewLabel_4.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4.setBounds(47, 352, 121, 16);
		desktopPane_1.add(lblNewLabel_4);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Yes");
		chckbxNewCheckBox.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		buttonGroup.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setForeground(new Color(0, 0, 128));
		chckbxNewCheckBox.setBounds(180, 348, 66, 23);
		desktopPane_1.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("No");
		chckbxNewCheckBox_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		buttonGroup.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setForeground(new Color(0, 0, 128));
		chckbxNewCheckBox_1.setBounds(244, 348, 66, 23);
		desktopPane_1.add(chckbxNewCheckBox_1);


		JLabel lblNewLabel_6 = new JLabel("Passport Origin");
		lblNewLabel_6.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_6.setBounds(47, 246, 106, 16);
		desktopPane_1.add(lblNewLabel_6);

		txtinfo = new JTextField();
		txtinfo.setForeground(new Color(0, 0, 128));
		txtinfo.setBounds(348, 347, 231, 26);
		desktopPane_1.add(txtinfo);
		txtinfo.setColumns(10);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBounds(505, 407, 117, 29);
		desktopPane_1.add(btnNewButton);

		JLabel seattext = new JLabel("New label");
		seattext.setBounds(492, 20, 47, 16);
		seattext.setText(seat);
		desktopPane_1.add(seattext);

		JLabel lblNewLabel_5 = new JLabel("if yes please specify:");
		lblNewLabel_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_5.setBounds(348, 328, 140, 16);
		desktopPane_1.add(lblNewLabel_5);


		comboBox.addItem("none");
		comboBox.addItem("1");
		comboBox.addItem("2");



		//Validation starts here:


		btnNewButton.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {


				String lastname = textField_1.getText();
				String firstname = textField.getText();
				String email1 = textField_3.getText();
				String passNum = textField_4.getText();
				String origincountry = textField_5.getText();
				Random number = new Random();
				int ticketNumber = number.nextInt(100000000);
				String numOfbags = (String) comboBox.getSelectedItem();
				String birthdate = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
				String disabilityinfo = txtinfo.getText();
				String telepNum = textField_6.getText();
				String flightdeparture = "08/03/2023,06:20,11:57,05:37,7021.04,179,HND,Tokyo,SYD,Sydney,TS4977,Easyplane";
				String returnflight ="27/03/2023,18:23,03:44,09:21,11687.85,10,SYD,Sydney,HND,Tokyo,ST4138,Eastair";








				// if statements used to determine if the data entered is valid or not


				if(firstname.isEmpty()== true) {
					JOptionPane.showMessageDialog(btnNewButton, "Please enter a valid first name.");
					return;
				}
				else if(validatefirstname()== false) {
					JOptionPane.showMessageDialog(btnNewButton, "First Name can only include alphabets.");
					return;
				}
				else if(lastname.isEmpty()== true) {
					JOptionPane.showMessageDialog(btnNewButton, "Please enter a valid last name.");
					return;
				}
				else if(validatelastname()== false) {
					JOptionPane.showMessageDialog(btnNewButton, "Last Name can only include alphabets.");
					return;

				}

				else if(validateemail()== false) {
					JOptionPane.showMessageDialog(btnNewButton, "Please enter a valid Email.");
					return;

				}
				else if(email1.isEmpty()== true) {
					JOptionPane.showMessageDialog(btnNewButton, "Please enter your Email.");
					return;

				}
				else if(passNum.isEmpty()== true) {
					JOptionPane.showMessageDialog(btnNewButton, "Please enter your Passport Number.");
					return;
				}
				else if(validatePassport()== false){
					JOptionPane.showMessageDialog(btnNewButton, "Please enter a valid Passport Number.");
					return;

				}
				else if(passNum.isEmpty()== true) {
					JOptionPane.showMessageDialog(btnNewButton, "Please fill in the Passport Number field.");
					return;


				}
				else if(telepNum.isEmpty()) {
					JOptionPane.showMessageDialog(btnNewButton, "Please fill in the telephone Number field.");
					return;

				}
				else if(!telepNum.matches("^\\d{10}$")){
					JOptionPane.showMessageDialog(btnNewButton, "Please enter a valid telephone number.");
					return;

				}
				else if(origincountry.isEmpty()== true) {
					JOptionPane.showMessageDialog(btnNewButton, "Please add the passport's country of origin.");
					return;

				}
				else if((!origincountry.matches("[a-zA-Z\\s]+$"))) {
					JOptionPane.showMessageDialog(btnNewButton, "Country name can only include letters.");
					return;

				}

				else if(birthdate.isEmpty()) {
					JOptionPane.showMessageDialog(btnNewButton, "please add your date of birth.");
					return;
				}
				else if(numOfbags == "none") {

				}
				else if ((Integer.parseInt(numOfbags)) > 2) {

					JOptionPane.showInputDialog("Enter the weight of the bag.");
					return;

				}
				else if(Integer.parseInt(numOfbags) == 2) {

					for (int b = 1; b <= Integer.parseInt(numOfbags); b++) {
						String weightStr = JOptionPane.showInputDialog("Enter the weight of bag " + b + " in kgs:");
						if(weightStr != null) {
							double weight = Double.parseDouble(weightStr);
							System.out.println(weight);

						}

					}
				}

				else if ((Integer.parseInt(numOfbags)) == 1){
					JOptionPane.showInputDialog("Enter the weight of your bag here.");

				}
				

				if(getage() < 13 ) {

					System.out.println("Passenger must have the same passport number as one of their parents.");
					JOptionPane.showMessageDialog(btnNewButton, "Thank you for using our website!" + " Your Ticket Number is " +  + ticketNumber);
				}
				else if(getage() < 18) {
					System.out.println("Passenger must be accompained by an adult.");
					JOptionPane.showMessageDialog(btnNewButton, "Thank you for using our website!" + " Your Ticket Number is " +  + ticketNumber);
				}
				else if(getage() > 70 ) {
					System.out.println("Passenger gets a free meal.");
					JOptionPane.showMessageDialog(btnNewButton, "Thank you for using our website!" + " Your Ticket Number is " +  + ticketNumber);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Thank you for using our website!" + " Your Ticket Number is " +  + ticketNumber);
				}
				
				
                // Array list to display all the info taken from the user

				ArrayList<String> userInput = new ArrayList<>();

				userInput.add(firstname);
				userInput.add(lastname);
				userInput.add(email1);
				userInput.add(telepNum);
				userInput.add(passNum);
				userInput.add(origincountry);
				userInput.add(numOfbags);
				userInput.add(birthdate);
				userInput.add(String.valueOf(getage()));
				userInput.add(disabilityinfo);
				userInput.add(Integer.toString(ticketNumber));
				userInput.add(flightdeparture);
				userInput.add(returnflight);




				for(String element : userInput )
					System.out.println(element);




			}

		});

	}
	
	// age calculated from the date of birth



	public static int getage() {

		String dateofbirth = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();

		String[] dob= dateofbirth.split("/");

		int day = Integer.parseInt(dob[0]);
		int month = Integer.parseInt(dob[1]);
		int year = Integer.parseInt(dob[2]);



		LocalDate selectedDate = LocalDate.of(year, day, month);
		LocalDate currentDate = LocalDate.now();
		int age = Period.between(selectedDate,currentDate).getYears();
		System.out.println(age);
		return age;


	}





	public  boolean validatefirstname() {

		return textField.getText().matches("^[a-zA-Z\\s]+$");

	}
	public boolean validatelastname() {

		return textField_1.getText().matches("^[a-zA-Z\\s]+$");
	}

	public boolean validateemail() {
		return textField_3.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");

	}

	public boolean validatePassport() {
		return textField_4.getText().matches("[a-zA-Z0-9]+");
	}













}





