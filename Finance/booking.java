
public class booking 
{
	//fields 
	String ticketID;
	String flightID;
	
	String fName;
	String lName;
	String dob;
	String date;
	int age;
	boolean disabled;
	String depCity;
	String arrivCity;
	String depTime;
	String arrivTime;
	String depAirport;
	String arrivAirport;
	String company;
	String seat;
	
	int numOfBags;
	double bagWeight;
	String ticketClass;
	double flightDistance;
	int delay;
	
	//constructor
	booking (String tID, String fID, String fname, String lname, boolean pDisabled,int bags, double weightOfBags, String tickClass, double fDistance, int flightDelay, String day, String dCity, String aCity, String dTime, String aTime, String dAir, String aAir, String fComp, String pSeat, int pAge)
	{
		ticketID = tID;
		flightID = fID;
		fName = fname;
		lName = lname;
		age = pAge;// will be changed when input is received from other components
		numOfBags = bags;
		bagWeight = weightOfBags;
		ticketClass = tickClass;
		flightDistance = fDistance;
		delay = flightDelay;
		date = day;
		depCity = dCity;
		arrivCity = aCity;
		depTime = dTime;
		arrivTime = aTime;
		depAirport = dAir;
		arrivAirport = aAir;
		company = fComp;
		seat = pSeat;
	}
	
	//methods
	
	public int bagCost() 
	{
		int bagprice = 0;
		
		if (numOfBags <= 1) 
		{
			if (bagWeight <= 20)
			{
				bagprice = 0;
			}
			
			else 
			{
				bagprice = ((int)bagWeight - 20)*6;
			}
		}
		else if (numOfBags > 1)
		{
			bagprice = (numOfBags - 1)*25;
			for (int i = 1; i< numOfBags; i++)
			{
				if (bagWeight <= 20)
				{
					bagprice = bagprice + 0;
				}
				
				else if (bagWeight > 20)
				{
					bagprice = bagprice + 6;
				}
			}
		}
		
		return bagprice;
	}
	
	public double ticketCost() 
	{
		double price = 0;
		if (ticketClass == "First Class") 
		{
			price = 1.5 * flightDistance;
		}
		else if (ticketClass == "Business Class")
		{
			price = flightDistance;
		}
		else if (ticketClass == "Economy")
		{
			price = 0.5 * flightDistance;
		}
		
		return price;
	}
	
	public int delayCost() 
	{
		int delayComp = 0;
		if (delay <60) 
		{
			delayComp = 0;
		}
		else if (delay >=60 & delay <120)
		{
			delayComp = 100;
		}
		else if (delay >=120& delay <180)
		{
			delayComp = 200;
		}
		else if (delay >=180)
		{
			delayComp = 300;
		}
		
		return delayComp;
		
	}
	
	public int mealComp()
	{
		int freeMeal = 0;
		if (age >= 70) 
		{
			freeMeal = 1;
		}
		else
		{
			freeMeal = 0;
		}
		return freeMeal;
	}
	
	public int childTicket()
	{
		
		int discount = 0;
		if (age <13) 
		{
			if (flightDistance >= 1000)
			{
				discount = 2;
			}
			else if (flightDistance > 1000 & flightDistance <5000) 
			{
				discount = 5;
			}
			else if (flightDistance > 5000)
			{
				discount = 10;
			}	
		}
		else 
			discount = 0;
		return discount;
	}
	
	public String disability()
	{
		String extraseat;
		if (disabled = true) 
		{
			extraseat = "extra seat";
		}
		else 
		{
			extraseat = " ";
		}
		return extraseat;
	}

	public String getFirstName() {
		
		return fName + lName;
	}

	public String getDob() {

		return date;
	}

	public String getFlightNum() {
		
		return flightID;
	}

	public String getTicketNum() {
		
		return ticketID;
	}

	public String getDepCity() {
		// TODO Auto-generated method stub
		return depCity;
	}

	public String getArrivCity() {
		// TODO Auto-generated method stub
		return arrivCity;
	}

	public String getArrivTime() {
		// TODO Auto-generated method stub
		return arrivTime;
	}

	public String getDepTime() {
		// TODO Auto-generated method stub
		return depTime;
	}

	public String getDepAirport() {
		// TODO Auto-generated method stub
		return depAirport;
	}

	public String getArrivAirport() {
		// TODO Auto-generated method stub
		return arrivAirport;
	}

	public String getCompany() {
		// TODO Auto-generated method stub
		return company;
	}

	public String getSeat() {
		// TODO Auto-generated method stub
		return seat;
	}


	}
	

