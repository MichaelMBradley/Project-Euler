//Sum square difference
public class P006 {
	public static void main(String[] args) {
		double sum1 = 0;
		double sum2 = 0;

		for(int i = 1; i<=100; i++) {
			sum1+=i*i; //Sum of squares
			sum2+=i; //Sum of numbers
		}

		System.out.print(Math.pow(sum2, 2)-sum1); //Square of sums minus sum of squares
	}
}
//2516415
//[Finished in 0.551s]
