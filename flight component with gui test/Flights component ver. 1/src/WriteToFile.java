import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	private static String[] store;
	private static String storm = "";
	
/**
 * takes in a flight number, filters using this flight number
 * then write that row the flight number is in to the file given in the
 * file_paths.getWrite_Path()
 * @param flight_number type: string
 * @return void
 */
	public static void write(String flight_number) 
	{
		try {
			//"H:\\flightReadwrite\\FlightData.txt"
			//	FileWriter FileWriter = new FileWriter("C:\\FlightReadWrite\\FlightData.txt");
			BufferedWriter FileWriter= new BufferedWriter(new FileWriter(file_paths.getWrite_Path(), true));
//it is now possible to use the cached of all valid inputs getCacheList instead of flight
			for (int i = 0 ; i < csvparse.getFlightList().size(); i++) 
			{
				if ((csvparse.getFlightList().get(i)[10].contains(flight_number)) ) 
				{
					store = csvparse.getFlightList().get(i);
					storm = String.join(",",store);
					
				}

			}
		
			FileWriter.write(storm); 
	//		FileWriter.write(Arrays.toString(store)); // not csv format
	//		FileWriter.write(String.join(",",store)); // in csv fromat
			FileWriter.newLine();
			FileWriter.close();
			System.out.println("written successfully");

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}



}

