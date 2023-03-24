import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

//Split this into 2 different classes,
//1. parse the csv to a accessible arraylist
//2. A class that filters the generated arraylist using the Flightparam get methods
/**
 * 
 * Contains:
 * <p> <p>
 * getFlightList()
 * <p> <p>
 * flightparse()
 */

public class csvparse {

	private static	ArrayList<String[]> Flight = new ArrayList<String[]>();
	//	private static	ArrayList<String[]> cache = new ArrayList<String[]>();


	/**
	 * @return the getFlightList() returns a ArrayList<String[]> containing the
	 *  flight data in the flights.csv 
	 */

	public static ArrayList<String[]> getFlightList() {
		return Flight;
	}

	//	public static ArrayList<String[]> getCacheList() {
	//		return cache;
	//	}




	/**
	 * <p>
	 * the method checks the file path given in file_paths.getRead_Path(),
	 * if this path exists flightparse() will read the file and append all lines into
	 * to a ArrayList called Flight which is callable with csvparse.getFlightList().
	 * <p>
	 * 
	 * <p>
	 * when flightparse() reads a csv file it spearates the data by column
	 * <p>
	 * 
	 * <p>
	 * for get/read entire row use: csvparse.getFlightList().get(i); i being the row
	 * <p>
	 * 
	 * <p>
	 * to get/read use: Flight.get(i)[j]; i being the row and j being the column
	 * <p>
	 * @return void
	 */
	
	//    column reference 
	//	 |Date of Flight | Departure Time | Arrival Time | Flight Duration |Distance travelled | Delay | Departure Airport | Departure City | Arrival Airport | Arrival City | Flight Number | Airline|
	//	        0                1               2                3                 4              5            6                  7                8                 9              10           11
	public static void flightparse()
	{


		File csvFile = file_paths.getRead_Path();
		{

			if (csvFile.isFile()) 

			{

				BufferedReader csvReader = null;

				try 
				{
					csvReader = new BufferedReader(new FileReader(file_paths.getRead_Path()));


					String row;

					while ((row = csvReader.readLine()) != null) 

					{

						String[] col = row.split(",");
						Flight.add(col);

					}
					csvReader.close();

				}




				catch (Exception e) 
				{
					e.printStackTrace();
				}


			}

			else 
			{
				System.out.println("file path does not exist/invalid");	
			}

		}
	}

}
//Flight.get(10)[0] full from arrayList
//.get(row)[column]