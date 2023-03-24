import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {


		// flie_paths need to be modified for the read and write functions to work 
		CreateFile.make(); 
		//        csvparse.flightparse();
		//        System.out.println(csvparse.getFlightList().size());
		JFrame myframe  = new myframe();
		csvparse.flightparse(); //
		System.out.println(csvparse.getFlightList().size()); //


	}
}

