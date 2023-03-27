import java.util.*;
import java.util.List;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.io. File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author humza
 *
 */

public class departures {
	private JFrame frame;
	public static JTable table;
	public static ArrayList<String[]> flights;
	public static String formattedDate;
	Date thisdate = new Date();
	SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					departures window = new departures();
					window.frame.setVisible(true);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 * @throws FileNotFoundException 
	 */
	public departures() throws FileNotFoundException {
		try {
			initialize();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Initialize the contents of the frame.
	 * @throws FileNotFoundException 
	 */
	private void initialize() throws FileNotFoundException {

		controller c = new controller();

		//DELCARE FILE
		File csv = new File("./src/Flights.csv");

		//READ FILE
		Scanner reader = new Scanner(csv);

		//ARRAYLIST
		flights = new ArrayList<String[]>();


		//PROCESS FILE
		while(reader.hasNextLine()) {

			String row = reader.nextLine();

			String[] col = row.split(",");

			flights.add(col);


		}

		frame = new JFrame();
		frame.setBounds(1500, 1250, 1250, 1250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setLayout(null);

		//Close Button
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setBounds(846, 772, 104, 37);
		frame.getContentPane().add(btnNewButton);

		btnNewButton.addActionListener(e -> {
			frame.dispose();
		});


		//START OF MAP

		//BUTTONS
		JButton btnNewButton_1 = new JButton("Bangkok");
		btnNewButton_1.addActionListener(c);
		btnNewButton_1.setBounds(858, 260, 92, 16);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_4 = new JButton("Hong Kong");
		btnNewButton_1_4.setBounds(873, 232, 92, 16);
		frame.getContentPane().add(btnNewButton_1_4);
		btnNewButton_1_4.addActionListener(c);

		JButton btnNewButton_1_3_1_3_1 = new JButton("Sweden");
		btnNewButton_1_3_1_3_1.setBounds(569, 100, 82, 16);
		frame.getContentPane().add(btnNewButton_1_3_1_3_1);
		btnNewButton_1_3_1_3_1.addActionListener(c);

		JButton btnNewButton_1_3_1 = new JButton("London");
		btnNewButton_1_3_1.setBounds(532, 144, 52, 16);
		frame.getContentPane().add(btnNewButton_1_3_1);
		btnNewButton_1_3_1.addActionListener(c);

		JButton btnNewButton_1_3_2 = new JButton("Madrid");
		btnNewButton_1_3_2.setBounds(558, 172, 65, 16);
		frame.getContentPane().add(btnNewButton_1_3_2);
		btnNewButton_1_3_2.addActionListener(c);

		JButton btnNewButton_1_4_1 = new JButton("Dehli");
		btnNewButton_1_4_1.setBounds(755, 200, 92, 16);
		frame.getContentPane().add(btnNewButton_1_4_1);
		btnNewButton_1_4_1.addActionListener(c);

		JButton btnNewButton_1_3_1_2 = new JButton("Paris");
		btnNewButton_1_3_1_2.setBounds(558, 150, 52, 16);
		frame.getContentPane().add(btnNewButton_1_3_1_2);
		btnNewButton_1_3_1_2.addActionListener(c);

		JButton btnNewButton_1_3_1_1_1 = new JButton("Rome");
		btnNewButton_1_3_1_1_1.setBounds(599, 150, 52, 16);
		frame.getContentPane().add(btnNewButton_1_3_1_1_1);
		btnNewButton_1_3_1_1_1.addActionListener(c);

		JButton btnNewButton_1_3_1_3 = new JButton("Amsterdam");
		btnNewButton_1_3_1_3.setBounds(569, 128, 82, 16);
		frame.getContentPane().add(btnNewButton_1_3_1_3);
		btnNewButton_1_3_1_3.addActionListener(c);

		JButton btnNewButton_1_2_1_1 = new JButton("Sydney");
		btnNewButton_1_2_1_1.setBounds(975, 413, 92, 16);
		frame.getContentPane().add(btnNewButton_1_2_1_1);
		btnNewButton_1_2_1_1.addActionListener(c);

		JButton btnNewButton_1_3_1_1 = new JButton("Athens");
		btnNewButton_1_3_1_1.setBounds(620, 172, 52, 16);
		frame.getContentPane().add(btnNewButton_1_3_1_1);
		btnNewButton_1_3_1_1.addActionListener(c);

		JButton btnNewButton_1_3 = new JButton("Lisbon");
		btnNewButton_1_3.setBounds(503, 172, 65, 16);
		frame.getContentPane().add(btnNewButton_1_3);
		btnNewButton_1_3.addActionListener(c);

		JButton btnNewButton_6_1_3 = new JButton("New York");
		btnNewButton_6_1_3.setBounds(316, 175, 75, 10);
		frame.getContentPane().add(btnNewButton_6_1_3);
		btnNewButton_6_1_3.addActionListener(c);

		JButton btnNewButton_1_2_1 = new JButton("Johannesburg");
		btnNewButton_1_2_1.setBounds(622, 402, 92, 16);
		frame.getContentPane().add(btnNewButton_1_2_1);
		btnNewButton_1_2_1.addActionListener(c);

		JButton btnNewButton_1_2 = new JButton("Dublin");
		btnNewButton_1_2.setBounds(479, 131, 65, 10);
		frame.getContentPane().add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(c);

		JButton btnNewButton_1_1 = new JButton("Lagos");
		btnNewButton_1_1.setBounds(555, 272, 75, 16);
		frame.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1_1.setBounds(594, 106, 65, 10);
		frame.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(c);

		JButton btnNewButton_3_1 = new JButton("Dubai");
		btnNewButton_3_1.setBounds(707, 212, 65, 16);
		frame.getContentPane().add(btnNewButton_3_1);
		btnNewButton_3_1.addActionListener(c);

		JButton btnNewButton_4_1 = new JButton("Sao Paulo");
		btnNewButton_4_1.setBounds(392, 382, 75, 16);
		frame.getContentPane().add(btnNewButton_4_1);
		btnNewButton_4_1.addActionListener(c);

		JButton btnNewButton_3 = new JButton("Cairo");
		btnNewButton_3.setBounds(632, 212, 65, 16);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(c);

		JButton btnNewButton_4 = new JButton("Tokyo");
		btnNewButton_4.setBounds(948, 172, 75, 16);
		frame.getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(c);

		JButton btnNewButton_6_1_2 = new JButton("Toronto");
		btnNewButton_6_1_2.setBounds(316, 153, 75, 10);
		frame.getContentPane().add(btnNewButton_6_1_2);
		btnNewButton_6_1_2.addActionListener(c);

		JButton btnNewButton_6_1_1 = new JButton("Mexico");
		btnNewButton_6_1_1.setBounds(220, 228, 75, 10);
		frame.getContentPane().add(btnNewButton_6_1_1);
		btnNewButton_6_1_1.addActionListener(c);

		JButton btnNewButton_5 = new JButton("Marrakesh");
		btnNewButton_5.setBounds(503, 201, 83, 16);
		frame.getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(c);

		JButton btnNewButton_6 = new JButton("Las Vegas");
		btnNewButton_6.addActionListener(c);

		JButton btnNewButton_6_1 = new JButton("Texas");
		btnNewButton_6_1.setBounds(241, 155, 75, 10);
		frame.getContentPane().add(btnNewButton_6_1);
		btnNewButton_6.setBounds(203, 189, 75, 10);
		frame.getContentPane().add(btnNewButton_6);
		btnNewButton_6_1.addActionListener(c);

		JButton btnNewButton_2_1 = new JButton("Moscow");
		btnNewButton_2_1.setBounds(649, 128, 65, 10);
		frame.getContentPane().add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(c);

		//END OF BUTTONS

		//START OF MAP BG

		ImageIcon image = new ImageIcon(this.getClass().getResource("map.png"));
		JLabel lblNewLabel = new JLabel(image);
		lblNewLabel.setBounds(10, 0, 1234, 545);
		frame.getContentPane().add(lblNewLabel);

		//END OF MAP BG

		//START OF DEPARTURES

		JLabel lblNewLabel_1 = new JLabel("Click The Location On The Map To View More Information");
		lblNewLabel_1.setBounds(452, 546, 365, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnDepartures = new JButton("Departures");
		btnDepartures.setBounds(326, 771, 104, 37);
		frame.getContentPane().add(btnDepartures);
		
		JLabel lblNewLabel_1_1 = new JLabel("Click Here For Today's Departures");
		lblNewLabel_1_1.setBounds(267, 733, 214, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Click Here For Close Window");
		lblNewLabel_1_1_1.setBounds(807, 733, 181, 16);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		btnDepartures.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				for (int i = 0; i < departures.flights.size() ; i++) {

					if (departures.flights.get(i)[0].contains(dateform.format(thisdate)))

					{
						if (departures.flights.get(i)[5].equals("0")) 

						{ 

							System.out.println("Flight " + departures.flights.get(i)[10] + " Departing From " + departures.flights.get(i)[7] + " To " + departures.flights.get(i)[9] + " Is On Time! ");	
							System.out.println(" ");	

						}

					}


				}
				
				}
			
		}
				)
		;




		//END OF DEPARTURES
	}
}
