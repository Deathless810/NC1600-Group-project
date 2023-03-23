import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

//Split this into 2 different classes,
//1. parse the csv to a accessible arraylist
//2. A class that filters the generated arraylist using the Flightparam get methods
public class csvparse {

	private static	ArrayList<String[]> Flight = new ArrayList<String[]>();
	private static	ArrayList<String[]> cache = new ArrayList<String[]>();




	public static ArrayList<String[]> getFlightList() {
		return Flight;
	}

	public static ArrayList<String[]> getCacheList() {
		return cache;
	}





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

		}
	}

}
//Flight.get(10)[0] full from arrayList
//.get(row)[column]