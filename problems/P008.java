import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class P008 {
	public static void main(String[] args) {
		String File = "data/P008.txt";
		String num = "";
		try {
			Scanner sc = new Scanner(new FileReader(File));
			for(int i = 0; i < 20; i++) {
				num += sc.nextLine();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		double product;
		double big = 0;
		int len = 13;
		for(int i = 0; i < num.length()-len; i++) {
			product = 1;
			for(int j = i; j < i+len; j++) {
				product *= Integer.parseInt(num.substring(j,j+1));
			}
			if(product>big) {
				big = product;
			}
		}

		System.out.print(big);
	}
}
