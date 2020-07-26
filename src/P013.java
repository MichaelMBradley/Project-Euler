//Large sum
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class P013 {
	public static void main(String[] args) {
		double temp = 0;
		String File = "data/P013.txt"; //Check data file for sense of problem
		String[] nums = new String[100];

		try {
			Scanner sc = new Scanner(new FileReader(File));
			for(int i = 0; i < 100; i++) {
				nums[i] = sc.nextLine(); //Reads numbers into array
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for(int k = 0; k < 40; k++) {
			for(int j = 0; j < 100; j++) {
				temp+=Character.getNumericValue(nums[k].charAt(nums[k].length()-1)); //Calculates the sum of the final digit in eacht number
				nums[j]=nums[j].substring(0, nums[j].length()-1); //Removes final digit of each number
			}
			temp=temp%10; //Removes final digit of sum
		} //Repeat until all numbers are 10 digits
		for(int j = 0; j < 100; j++) {
			temp+=Double.parseDouble(nums[j]); //Adds remaining 10 digit numbers to previously calculated sum
		}
		System.out.print(temp);
	}
}
//553737623000