import java.util.ArrayList;

public class flight_filter {

public static	ArrayList<String[]> cache;

	public static   ArrayList<String[]> Flight_filter(String date,String depart, String arrival) {
		ArrayList<String[]> Flight = csvparse.getFlightList();
		ArrayList<String[]> cache =  new ArrayList<String[]>();
		String leftAlignFormat = "| %-13s | %-14s | %-12s | %-15s | %-17s | %-5s | %-17s | %-14s | %-15s | %-12s | %-13s | %-30s  |%n";

		System.out.format("+---------------+----------------+--------------+-----------------+-------------------+-------+-------------------+----------------+-----------------+--------------+---------------+---------------------------------+%n");
		System.out.format("|Date of Flight | Departure Time | Arrival Time | Flight Duration |Distance travelled | Delay | Departure Airport | Departure City | Arrival Airport | Arrival City | Flight Number | Airline                         |%n");
		System.out.format("+---------------+----------------+--------------+-----------------+-------------------+-------+-------------------+----------------+-----------------+--------------+---------------+---------------------------------+%n");
		int Fsize = Flight.size();
		for (int i = 0 ; i < Fsize ; i++) 
		{
			if ((Flight.get(i)[0].contains(date)) && (Flight.get(i)[7].contains(depart)) && (Flight.get(i)[9].contains(arrival))) 
			{
			String []	store = Flight.get(i);
			cache.add(Flight.get(i));


				System.out.format(leftAlignFormat, store[0], store[1], store[2], store[3], store[4], store[5], store[6], store[7], store[8], store[9], store[10], store[11]);

			}

		}
		System.out.format("+---------------+----------------+--------------+-----------------+-------------------+-------+-------------------+----------------+-----------------+--------------+---------------+---------------------------------+%n");
System.out.println(cache.size());
return cache;
	}
}

