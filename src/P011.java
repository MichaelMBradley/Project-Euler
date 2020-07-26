//Largest product in a grid
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class P011 {
	public static void main(String[] args) {
		String File = "data/P011.txt"; //View data file for sense of problem
		int[][] nums = new int[20][20];
		double best = 0;
		double temp;

		try {
			Scanner sc = new Scanner(new FileReader(File));
			for(int j = 0; j < 20; j++) {
				for(int k = 0; k < 20; k++) {
					nums[k][j] = sc.nextInt(); //Reads numbers into 2D array
					if(k>2) {
						temp = prod(k,j,-1,0, nums); //Calculates product of numbers that are already loaded (left)
						if(temp>best) {
							best = temp; //Finds largest product
						}
					}
					if(j>2) {
						if(k>2) {
							temp = prod(k,j,-1,-1, nums); //If possible, find product in down left direction
							if(temp>best) {
								best = temp;
							}
						}
						temp = prod(k,j,0,-1, nums); //If possible, find product in down direction
						if(temp>best) {
							best = temp;
						}
						if(k<17) {
							temp = prod(k,j,1,-1, nums); //If possible, find product in down right direction
							if(temp>best) {
								best = temp;
							}
						}
					}
				}
			}
			System.out.print(best);
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static double prod(int x, int y, int a, int b, int[][] nums) {
		double t = nums[x][y]; //First term in product
		for(int j = 1; j < 4; j++) {
			t*=nums[x+a*j][y+b*j]; //Multiplies next three numbers in specified direction
		}
		return t;
	}
}
//70600674