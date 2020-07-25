public class P009 {
	public static void main(String[] args) {
		double c;
		for(int a = 1; a < 500; a++) {
			for(int b = a + 1; b <= 500; b++) {
				c = 1000-a-b;
				if(c*c==a*a+b*b) {
					System.out.print(a*b*c);
				}
			}
		}
	}
}