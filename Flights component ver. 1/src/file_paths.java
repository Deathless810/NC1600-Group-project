import java.io.File;

public class file_paths {

	private static File Read_Path = new File("H:\\Flights.csv");
	private static File Write_Path = new File("H:\\flightReadwrite\\FlightData.txt");

	
	/**
	 * Allows upadating read path
	 * 
	 * @param Read_Path
	 */
	public static void setRead_Path(File Read_Path) 
	{
		file_paths.Read_Path = Read_Path;
	}
	
	/**
	 * @return flight.csv file path in File data type
	 */
	public static File getRead_Path()
	{
		return Read_Path;
	}
	
	
	/**
	 * Allows the updating write path
	 * 
	 * @param Write_Path
	 */
	
	public static void setWrite_Path(File Write_Path) 
	{
		file_paths.Write_Path = Write_Path;
	}
	
	/**
	 * @return file path for the data that will be saved in File data format
	 */
	public static File getWrite_Path()
	{
		return Write_Path;
	}
	

}
