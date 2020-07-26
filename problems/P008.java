//Largest product in a series
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class P008 {
	public static void main(String[] args) {
		String File = "data/P008.txt"; //View data file for general sense of problem
		String num = "";
		try {
			Scanner sc = new Scanner(new FileReader(File));
			for(int i = 0; i < 20; i++) {
				num += sc.nextLine(); //Reads number
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		double product;
		double big = 0;
		int len = 13;
		for(int i = 0; i < num.length()-len; i++) { //Runs through each 13 digit substring
			product = 1;
			for(int j = i; j < i+len; j++) {
				product *= Integer.parseInt(num.substring(j,j+1)); //Calculates product of substring
			}
			if(product>big) {
				big = product; //Finds largest product
			}
		}

		System.out.print(big);
	}
}
//23514624000
//[Finifhed in 0.629s]
