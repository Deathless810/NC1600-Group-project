public class start {
	public Flights DataSet = new Flights();

	public static void main(String[] args) {   
	    String flightsdep = "Amsterdam, London";
	    String passengerData [][]  = {
	            {"Zear Ibrahim", "12300", "30"},
	            {"Alaa Marshan", "96325", "40"},
	            {"Asma Mubarak", "456258", "29"},
	            {"Oussamma Ibrahim", "23432", "41"}, 
	            {"Mohsin", "45632", "21"}
	    };
    	
        // Added time duration variable (in minutes)
        int timeDuration = 120 ; // change this value to represent the flight duration

        // Timer: if the flight duration is more than 120 minutes, B_747 will be used, otherwise A_318 will be used
        if (timeDuration < 120) {
            A_318 a = new A_318();
        } else {
            B_747 b = new B_747();
        }
    }
}