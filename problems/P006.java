public class P006 {
	public static void main(String[] args) {
		double sum1 = 0;
		double sum2 = 0;
		
		for(int i = 1; i<=100; i++) {
			sum1+=i*i;
			sum2+=i;
		}
		
		System.out.print(Math.pow(sum2, 2)-sum1);
	}
}
