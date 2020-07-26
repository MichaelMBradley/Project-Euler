//Special Pythagorean triplet
public class P009 {
	public static void main(String[] args) {
		double c;
		for(int a = 1; a < 500; a++) {
			for(int b = a + 1; b <= 500; b++) {
				c = 1000-a-b; //Nested for loops calculate every possible combination of a, b, c
				if(c*c==a*a+b*b) {
					System.out.print(a*b*c); //If numbers satisfy Pythagorean Theorum
				}
			}
		}
	}
}
//31875000
//[Finished in 0.559s]
