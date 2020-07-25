import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DefaultRead {
	public static void main(String[] args) {
		String File = "info/PXXX.txt";
		try {
			Scanner sc = new Scanner(new FileReader(File));
			
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}