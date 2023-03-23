import java.io.File;

public class file_paths {

	private static File Read_Path = new File("H:\\Flights.csv");
	private static File Write_Path = new File("H:\\flightReadwrite\\FlightData1.txt");

	
	
	public static void setRead_Path(File Read_Path) 
	{
		file_paths.Read_Path = Read_Path;
	}
	
	public static File getRead_Path()
	{
		return Read_Path;
	}
	
	
	public static void setWrite_Path(File Write_Path) 
	{
		file_paths.Write_Path = Write_Path;
	}
	
	public static File getWrite_Path()
	{
		return Write_Path;
	}
	

}
