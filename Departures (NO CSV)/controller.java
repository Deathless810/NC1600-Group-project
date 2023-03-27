import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class controller implements ActionListener{

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub

		JButton copy = (JButton) event.getSource();
		System.out.println(copy.getText());

		Date thisdate = new Date();
		SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/yyyy");
		

		//APPLY FILTERS
		for (int i = 0; i < departures.flights.size() ; i++) {

			if (departures.flights.get(i)[0].contains(dateform.format(thisdate)) 
					&& departures.flights.get(i)[7].contains(copy.getText()))

			{
				if (departures.flights.get(i)[5].equals("0")) 

				{ 
					
					System.out.println("Flight " + departures.flights.get(i)[10] + " Is On Time ");	
					System.out.println(" ");	

				}
			
				else {
					System.out.println("Flight " + departures.flights.get(i)[10] + " Departing From " + departures.flights.get(i)[6] + "," + departures.flights.get(i)[7] + " At " + departures.flights.get(i)[1] + " Is Now Delayed By " + departures.flights.get(i)[5] + " Minutes. Our New Arrival Time Is " + departures.flights.get(i)[12]);
					System.out.println(""); 
					

				}}
			
			
			
			


			}




		}}


	





