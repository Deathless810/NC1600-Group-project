import java.io.File;  
import java.io.IOException;
public class CreateFile {
	public static void make() {
		try {
			File myObj = file_paths.getWrite_Path();
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
