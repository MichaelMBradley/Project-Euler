import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class P013 {
	public static void main(String[] args) {
		double temp = 0;
		String File = "info/P013.txt";
		String[] nums = new String[100];
		try {
			Scanner sc = new Scanner(new FileReader(File));
			for(int i = 0; i < 100; i++) {
				nums[i] = sc.nextLine();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for(int k = 0; k < 40; k++) {
			for(int j = 0; j < 100; j++) {
				temp+=Character.getNumericValue(nums[k].charAt(nums[k].length()-1));
				nums[j]=nums[j].substring(0, nums[j].length()-1);
			}
			temp=temp%10;
		}
		for(int j = 0; j < 100; j++) {
			temp+=Double.parseDouble(nums[j]);
		}
		System.out.print(temp);
	}
}