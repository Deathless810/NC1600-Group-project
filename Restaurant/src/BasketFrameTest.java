import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;

public class BasketFrameTest extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<String> listModel;
	private JLabel totalPricelbl;
	private JList<String> itemList;

	//Open basket frame for all items sent inside the basket
	public BasketFrameTest(DefaultListModel<String> listModel, double totalPrice)
	{
		this.listModel = listModel;
		setBounds(100, 100, 372, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel selection = new JLabel("Your Selection: ");
		selection.setBounds(10, 10, 172, 47);
		contentPane.add(selection);
		
		//list
		JList<String> list = new JList<>(listModel);
		list.setBounds(10, 60, 338, 310);
		contentPane.add(list);
		//end list
		
		//show price list
			DecimalFormat number_format = new DecimalFormat("#.###");
			String formated_total = number_format.format(totalPrice);
		totalPricelbl = new JLabel("Total price: £" + formated_total);
		totalPricelbl.setBounds(10, 380, 172, 47);
		contentPane.add(totalPricelbl);
		//end price list
		
    	//first name & last name fields to enter
    	JTextField firstNameField = new JTextField();
    	JTextField lastNameField = new JTextField();
    	firstNameField.setBounds(10, 510, 100, 20);
    	lastNameField.setBounds(120, 510, 100, 20);
    	contentPane.add(firstNameField);
    	contentPane.add(lastNameField);
		
		//link to personal first and last name
		JButton checkOut = new JButton("Check Out");
		checkOut.setBounds(230, 506, 118, 32);
		contentPane.add(checkOut);
		checkOut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
		    	String firstName = firstNameField.getText();
		    	String lastName = lastNameField.getText();
				if (firstName.isEmpty() || lastName.isEmpty())
					{
						//calls out
		    			JOptionPane.showMessageDialog(contentPane, "Invalid characters detected");
		    			return;
					}
				if (!firstName.matches("[a-zA-Z]+") || !lastName.matches("[a-zA-Z]+")) {
					JOptionPane.showMessageDialog(contentPane, "Invalid characters detected");
					return;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Items added to your account!");
				}
			}
		});
		//end check out
		
		JLabel firstNameLabel = new JLabel("First Name");
		firstNameLabel.setBounds(10, 486, 78, 27);
		contentPane.add(firstNameLabel);
		
		JLabel lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setBounds(120, 486, 78, 27);
		contentPane.add(lastNameLabel);
		
		setVisible(true);
	}
	
	
	public DefaultListModel<String> getModel()
	{
		return listModel;
	}
	
	public void clearBasket() 
	{
		listModel.clear();
	}
}
