import java.io.File;  
import java.io.IOException;

/**
 * CreateFile only contins make() method.
 */
public class CreateFile {
	/**
	 * make() uses file_paths.getWrite_Path() to get file path, it then verifies if a file exists in that pathway with the
	 * same name, if there is no changes are made and "File already exists."
	 * is printed to console to confirm this. if the file does not exists a new file 
	 * of the given name in the file path will be made.
	 * @return void
	 */
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
