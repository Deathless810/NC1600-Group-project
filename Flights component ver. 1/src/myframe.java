import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Dimension;

public  class myframe extends JFrame implements ActionListener{

	JPanel myframe;
	JComboBox depcity;
	JComboBox year1w;
	JComboBox month1w;
	JComboBox day1w;
	JComboBox arrcity;
	JComboBox year2w;
	JComboBox month2w;
	JComboBox day2w;
	JComboBox FlightDep;
	JComboBox FlightArr;
	JButton search;
	JButton confirm;
	JTextArea DEP;
	JTextArea ARR;
	String depart;
	String arrival;
	String date1w;
	String date2w;
	ArrayList<String> departureC = new ArrayList<String>(); 
	ArrayList<String> arrivalC = new ArrayList<String>();
	ArrayList<String[]> deplist = new ArrayList<String[]>();
	ButtonGroup group;
	JRadioButton rad1;
	JRadioButton rad2;
	Date selected1;
	Date selected2;
	Date currentdate;


	public myframe()
	{



		//update to use layouts
		myframe = new JPanel();
		myframe.setLayout(null);



		//round trip
		group = new ButtonGroup();
		rad1 = new JRadioButton();
		rad2 = new JRadioButton();
		rad1.setText("one-way");
		rad2.setText("two-way");
		rad1.setBounds(15,85,80,50);
		rad2.setBounds(100,85,80,50);
		this.add(rad1);
		this.add(rad2);
		group.add(rad1);
		group.add(rad2);


		// DEPARTURE CITY
		depcity = new JComboBox<>(new String[]{"DEPARTURE", "Amsterdam", "Athens", "Bangkok", "Cairo", "Delhi", "Dubai", "Dublin", "Hong Kong", "Johannesburg", "Lagos", "Las Vegas", "Lisbon","London", "Madrid", "Marrakesh", "Mexico", "Moscow", "New York", "Paris", "Rome", "San Paulo", "Sweden", "Sydney", "Texas", "Tokyo", "Toronto"});
		depcity.setBounds(15, 150,95,25);

		// DEPARTURE DATE YEAR
		year1w = new JComboBox<>(new String[]{"YEAR","2022","2023"});
		year1w.setBounds(875,150,95,25);

		// DEPARTURE DATE MONTH
		month1w = new JComboBox<>(new String[]{"MONTH","01","02","03","04","05","06","07","08","09","10","11","12"});
		month1w.setBounds(775,150,95,25);

		// DEPARTURE DATE DAY
		day1w = new JComboBox<>(new String[]{"DAY","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"});
		day1w.setBounds(675,150,95,25);

		// ARRIVAL CITY    
		arrcity = new JComboBox<>(new String[]{"ARRIVAL", "Amsterdam", "Athens", "Bangkok", "Cairo", "Delhi", "Dubai", "Dublin", "Hong Kong", "Johannesburg", "Lagos", "Las Vegas", "Lisbon","London", "Madrid", "Marrakesh", "Mexico", "Moscow", "New York", "Paris", "Rome", "San Paulo", "Sweden", "Sydney", "Texas", "Tokyo", "Toronto"});
		arrcity.setBounds(15,300,95,25);

		// RETURN DATE YEAR
		year2w = new JComboBox<>(new String[]{"YEAR","2022","2023"});
		year2w.setBounds(875,300,95,25);

		// RETURN DATE MONTH
		month2w = new JComboBox<>(new String[]{"MONTH","01","02","03","04","05","06","07","08","09","10","11","12"});
		month2w.setBounds(775,300,95,25);

		// RETURN DATE DAY
		day2w = new JComboBox<>(new String[]{"DAY","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"});
		day2w.setBounds(675,300,95,25);




		//gets departure flight number 
		FlightDep = new JComboBox<>(new String[] {"select a flight number"});
		FlightDep.setBounds(15,660,180,25);
		FlightDep.setEnabled(false);


		//gets arrival flight number
		FlightArr = new JComboBox<>(new String[] {"select a flight number"});
		FlightArr.setBounds(570,660,180,25);
		FlightArr.setEnabled(false);


		// DEPARTURE FLIGHT OUT
		DEP = new JTextArea();
		DEP.setBounds(15,400,400,250);
		DEP.setEditable(false);
		DEP.setLineWrap(true);







		// RETURN FLIGHT OUT
		ARR = new JTextArea();
		ARR.setBounds(570,400,400,250);
		ARR.setEditable(false);
		ARR.setLineWrap(true);



		// search button for flights
		search = new JButton("Search");
		search.setBounds(875,340,95,25);

		// confirm button 
		confirm = new JButton("confirm");
		confirm.setBounds(775,340,95,25);






		add(myframe);
		myframe.add(depcity);
		myframe.add(year1w);
		myframe.add(month1w);
		myframe.add(day1w);
		myframe.add(arrcity);
		myframe.add(year2w);
		myframe.add(month2w);
		myframe.add(day2w);
		myframe.add(DEP);
		myframe.add(ARR);
		myframe.add(search);
		myframe.add(confirm);
		myframe.add(FlightArr);
		myframe.add(FlightDep);


		depcity.addActionListener(this);
		year1w.addActionListener(this);
		month1w.addActionListener(this);
		day1w.addActionListener(this);
		arrcity.addActionListener(this);
		year2w.addActionListener(this);
		month2w.addActionListener(this);
		day2w.addActionListener(this);
		search.addActionListener(this);
		confirm.addActionListener(this);
		rad1.addActionListener(this);
		rad2.addActionListener(this);
		FlightDep.addActionListener(this);
		FlightArr.addActionListener(this);


		this.setTitle("FLIGHTS"); 
		this.setSize(1000,750); 
		this.setLocationRelativeTo(null); 
		this.setVisible(true); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		confirm.setEnabled(false); // this stays disabled until input checks have been done


	}

	//	public static void main(String[] args) 
	//	{
	//
	//		JFrame myframe  = new myframe();
	//
	//
	//
	//		//		  myframe.setTitle("FLIGHTS");
	//		//		  myframe.setSize(1000,750);
	//		//		  myframe.setLocationRelativeTo(null); 
	//		//		  myframe.setVisible(true);
	//		//		  myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//
	//
	//	}




	public void actionPerformed(ActionEvent e)
	{
		//date on click
		Instant x = Instant.now();
		String year = x.toString().substring(0,4);
		String month = x.toString().substring(5,7);
		String day = x.toString().substring(8,10);
		String datef = day  + "/" + month +"/"+year ;
		//System.out.println(datef);


		//checks if a radio button is selected
		if(e.getSource() == search) 
		{
			if((rad1.isSelected() == false) && (rad2.isSelected() == false) ) 
			{
				JOptionPane.showMessageDialog(null,"please click one-way or two-way","trip type not selected",1);
			}
		}


		// disables return date so only oneway trips are allowed
		if(e.getSource() == rad1)
		{
			year2w.setEnabled(!rad1.isSelected());
			month2w.setEnabled(!rad1.isSelected());
			day2w.setEnabled(!rad1.isSelected());
			//confirm.setEnabled(false);
		}

		// enables return date if disabled
		if(e.getSource() == rad2)
		{
			year2w.setEnabled(rad2.isSelected());
			month2w.setEnabled(rad2.isSelected());
			day2w.setEnabled(rad2.isSelected());
			//confirm.setEnabled(false);
		}


		//one way
		if(e.getSource() == search && rad1.isSelected()) 
		{
			DEP.setText("");
			ARR.setText("");
			FlightDep.setEnabled(false);
			FlightArr.setEnabled(false);
			confirm.setEnabled(false);
			//gets the date and time now and the user input regardless of validation since the checks prevent invalid inputs from being put in the filter
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
			try 
			{
				currentdate = sdf.parse(datef);
				selected1 = sdf.parse(String.valueOf(day1w.getSelectedItem() + "/" + month1w.getSelectedItem() + "/" + year1w.getSelectedItem()));
			} 
			catch (ParseException e1) 
			{

			}

			if((rad1.isSelected() == false) && (rad2.isSelected() == false) ) 
			{    //if none selected show dialog box
				JOptionPane.showMessageDialog(null,"please click one-way or two-way","trip type not selected",1);
			}
			else if(depcity.getSelectedItem().equals(arrcity.getSelectedItem()) || depcity.getSelectedItem().equals("DEPARTURE") || arrcity.getSelectedItem().equals("ARRIVAL") )
			{//if departure and arrival are equal or not selected show dialog box
				JOptionPane.showMessageDialog(null,"please select two different departure and arrival locations","same departure and arrival",1);
			}
			else if (day1w.getSelectedItem().equals("DAY") || month1w.getSelectedItem().equals("MONTH") || year1w.getSelectedItem().equals("YEAR")) 
			{// if date not selected show dialog box
				JOptionPane.showMessageDialog(null,"please select a valid date","invalid date",1);
			}
			else if (selected1.before(currentdate) )  
			{// if date is before today show dialog box
				JOptionPane.showMessageDialog(null,"please select a valid date that is today or later","invalid date",1);
			}
			else if(flight_filter.Flight_filter(String.valueOf(day1w.getSelectedItem() + "/" + month1w.getSelectedItem() + "/" + year1w.getSelectedItem()),String.valueOf(depcity.getSelectedItem()),String.valueOf(arrcity.getSelectedItem())).isEmpty())
			{
				// order of filter: date , departure, arrival
				JOptionPane.showMessageDialog(null,"no valid flights avaliable","flights not found",1);

			}
			else 
			{
				confirm.setEnabled(true);
				FlightDep.setEnabled(true);
				FlightDep.removeAllItems();
				FlightDep.setEnabled(true);
				ArrayList<String[]> deplist = flight_filter.Flight_filter(String.valueOf(day1w.getSelectedItem() + "/" + month1w.getSelectedItem() + "/" + year1w.getSelectedItem()),String.valueOf(depcity.getSelectedItem()),String.valueOf(arrcity.getSelectedItem()));
				FlightDep.addItem("select a flight number");
				for(int i = 0; i < deplist.size();i++) 
				{
					DEP.append(deplist.get(i)[0].toString() + "," + deplist.get(i)[1].toString() + "," + deplist.get(i)[2].toString()  + "," + deplist.get(i)[10].toString()+ "," + deplist.get(i)[11].toString());
					DEP.append("\n");
					FlightDep.addItem(deplist.get(i)[10].toString());
				}


				if (FlightDep.getSelectedItem().equals("select a flight number")) 
				{
					JOptionPane.showMessageDialog(null,"please select the flight number for desired flight","flights not selected",1);
				}


			}



		}

		if(e.getSource() == confirm && rad1.isSelected())
		{
			if(FlightDep.getSelectedItem().toString().equals("select a flight number")) 
			{
				JOptionPane.showMessageDialog(null,"please select a flight number","no flight number selected",1);
			}
			else 
			{
				System.out.println(FlightDep.getSelectedItem().toString());
				WriteToFile.write(FlightDep.getSelectedItem().toString());
				JOptionPane.showMessageDialog(null,"your flight has been selected click ok to move to next menu","flight confirmed",1);
			}
		}






		//two way 
		if(e.getSource() == search && rad2.isSelected() ) 
		{
			DEP.setText("");
			ARR.setText("");
			FlightDep.setEnabled(false);
			FlightArr.setEnabled(false);
			confirm.setEnabled(false);

			//gets the date and time now and the user input regardless of validation since the checks prevent invalid inputs from being put in the filter
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
			try 
			{
				currentdate = sdf.parse(datef);
				selected1 = sdf.parse(String.valueOf(day1w.getSelectedItem() + "/" + month1w.getSelectedItem() + "/" + year1w.getSelectedItem()));
				selected2 = sdf.parse(String.valueOf(day2w.getSelectedItem() + "/" + month2w.getSelectedItem() + "/" + year2w.getSelectedItem()));
			} 
			catch (ParseException e1) 
			{

			}

			if((rad1.isSelected() == false) && (rad2.isSelected() == false) ) 
			{
				JOptionPane.showMessageDialog(null,"please click one-way or two-way","trip type not selected",1);
			}
			else if(depcity.getSelectedItem().equals(arrcity.getSelectedItem()) || depcity.getSelectedItem().equals("DEPARTURE") || arrcity.getSelectedItem().equals("ARRIVAL") )
			{
				JOptionPane.showMessageDialog(null,"please select two different departure and arrival locations","same departure and arrival",1);
			}
			else if (day1w.getSelectedItem().equals("DAY") || month1w.getSelectedItem().equals("MONTH") || year1w.getSelectedItem().equals("YEAR")) 
			{
				JOptionPane.showMessageDialog(null,"please select a valid date","invalid date",1);
			}
			else if (day2w.getSelectedItem().equals("DAY") || month2w.getSelectedItem().equals("MONTH") || year2w.getSelectedItem().equals("YEAR")) 
			{
				JOptionPane.showMessageDialog(null,"please select a valid date","invalid date",1);
			}
			else if (selected1.before(currentdate) )  
			{// if date is before today show dialog box
				JOptionPane.showMessageDialog(null,"please select a valid date that is today or later","invalid date",1);
			}
			else if (selected2.before(currentdate) )  
			{// if date is before today show dialog box
				JOptionPane.showMessageDialog(null,"please select a return date that is tomorrow or later","invalid date",1);
			}
			else if (selected1.equals(selected2))  
			{// if date is before today show dialog box
				JOptionPane.showMessageDialog(null,"please select a return date that is not on the same day","invalid date",1);
			}
			else if (selected2.before(selected1))  
			{// if date is before today show dialog box
				JOptionPane.showMessageDialog(null,"please select a return date that is not before the departure date","invalid date",1);
			}
			else if(flight_filter.Flight_filter(String.valueOf(day1w.getSelectedItem() + "/" + month1w.getSelectedItem() + "/" + year1w.getSelectedItem()),String.valueOf(depcity.getSelectedItem()),String.valueOf(arrcity.getSelectedItem())).isEmpty())
			{
				// order of filter: date , departure, arrival
				JOptionPane.showMessageDialog(null,"no valid flights avaliable","flights not found",1);

			}
			else if(flight_filter.Flight_filter(String.valueOf(day2w.getSelectedItem() + "/" + month2w.getSelectedItem() + "/" + year2w.getSelectedItem()),String.valueOf(arrcity.getSelectedItem()),String.valueOf(depcity.getSelectedItem())).isEmpty())
			{
				// order of filter: date , departure, arrival
				JOptionPane.showMessageDialog(null,"no valid flights avaliable","flights not found",1);
			}
			else 
			{
				confirm.setEnabled(true);
				FlightDep.setEnabled(true);
				FlightArr.setEnabled(true);
				FlightDep.removeAllItems();
				FlightArr.removeAllItems();
				FlightDep.setEnabled(true);
				FlightArr.setEnabled(true);
				ArrayList<String[]> deplist = flight_filter.Flight_filter(String.valueOf(day1w.getSelectedItem() + "/" + month1w.getSelectedItem() + "/" + year1w.getSelectedItem()),String.valueOf(depcity.getSelectedItem()),String.valueOf(arrcity.getSelectedItem()));
				FlightDep.addItem("select a flight number");
				
				for(int i = 0; i < deplist.size();i++) 
				{
					DEP.append(deplist.get(i)[0].toString() + "," + deplist.get(i)[1].toString() + "," + deplist.get(i)[2].toString() + "," + deplist.get(i)[3].toString()+ "," + deplist.get(i)[10].toString()+ "," + deplist.get(i)[11].toString());
					DEP.append("\n");
					FlightDep.addItem(deplist.get(i)[10].toString());
				}

				ArrayList<String[]> arrlist = flight_filter.Flight_filter(String.valueOf(day2w.getSelectedItem() + "/" + month2w.getSelectedItem() + "/" + year2w.getSelectedItem()),String.valueOf(arrcity.getSelectedItem()),String.valueOf(depcity.getSelectedItem()));
				FlightArr.addItem("select a flight number");
				
				for(int i = 0; i < arrlist.size();i++) 
				{
					ARR.append(arrlist.get(i)[0].toString() + "," + arrlist.get(i)[1].toString() + "," + arrlist.get(i)[2].toString() + "," + arrlist.get(i)[3].toString()+ "," + arrlist.get(i)[10].toString()+ "," + arrlist.get(i)[11].toString());
					ARR.append("\n");
					FlightArr.addItem(arrlist.get(i)[10].toString());
				}

				if (FlightDep.getSelectedItem().equals("select a flight number") || FlightArr.getSelectedItem().equals("select a flight number")) 
				{
					JOptionPane.showMessageDialog(null,"please select the flight number for desired flight","flights not selected",1);
				}


				if(e.getSource() == confirm)
				{
					WriteToFile.write((deplist.get(FlightDep.getSelectedIndex())[0].toString() + "," + deplist.get(FlightDep.getSelectedIndex())[1].toString() + "," + deplist.get(FlightDep.getSelectedIndex())[2].toString() + "," + deplist.get(FlightDep.getSelectedIndex())[3].toString()+ "," + deplist.get(FlightDep.getSelectedIndex())[10].toString()+ "," + deplist.get(FlightDep.getSelectedIndex())[11].toString()));
					WriteToFile.write((arrlist.get(FlightArr.getSelectedIndex())[0].toString() + "," + arrlist.get(FlightArr.getSelectedIndex())[1].toString() + "," + arrlist.get(FlightArr.getSelectedIndex())[2].toString() + "," + arrlist.get(FlightArr.getSelectedIndex())[3].toString()+ "," + arrlist.get(FlightArr.getSelectedIndex())[10].toString()+ "," + arrlist.get(FlightArr.getSelectedIndex())[11].toString()));
					JOptionPane.showMessageDialog(null,"your flight has been selected click ok to move to next menu","flight confirmed",1);
				}



			}
		}

		if(e.getSource() == confirm && rad2.isSelected())
		{
			if(FlightDep.getSelectedItem().toString().equals("select a flight number") || FlightArr.getSelectedItem().toString().equals("select a flight number") ) 
			{
				JOptionPane.showMessageDialog(null,"please select a flight number","no flight number selected",1);
			}
			else 
			{
				System.out.println(FlightDep.getSelectedItem().toString());
				WriteToFile.write(FlightDep.getSelectedItem().toString());
				WriteToFile.write(FlightArr.getSelectedItem().toString());
				JOptionPane.showMessageDialog(null,"your flight has been selected click ok to move to next menu","flight confirmed",1);
			}
		}



	}

}


