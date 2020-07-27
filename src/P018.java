//Maximum path sum I
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class P018 {
	public static void main(String[] args) {
		final int MAX = 15;
		
		String File = "data/P018.txt"; //Check data file for sense of problem
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
		
		//Smart way should work for P067
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
//1074