//Maximum path sum II
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class P067 {
	public static void main(String[] args) {
		final int MAX = 100;
		
		String File = "data/P067.txt"; //Check data file for sense of problem
		int[][] tri = new int[MAX][MAX];
		
		try {
			Scanner sc = new Scanner(new FileReader(File));
			for(int i = 0; i < MAX; i++) {
				for(int j = 0; j <= i; j++) {
					tri[i][j] = sc.nextInt(); //Reads numbers into array
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//This entire file is pretty much an exact copy of P018
		for(int i = MAX - 1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if(tri[i][j] > tri[i][j+1]) {
					tri[i-1][j] += tri[i][j];
				} else {
					tri[i-1][j] += tri[i][j+1];
				}
			}
		}
		
		System.out.print(tri[0][0]);
	}
}
//7273