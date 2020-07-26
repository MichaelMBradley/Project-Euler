//Highly divisible triangular number
public class P012 {
	public static void main(String[] args) {
		double tri = 1;
		int n = 1;
		int factors;
		do {
			factors = 1;
			n++;
			tri+=n; //Next triangular number
			for(int j = 1; j <= Math.sqrt(tri); j++) { //Checks every divisor <= the suare root
				if(tri%j==0) {
					factors+=2; //+2 to factor count if factor found
					if(Double.valueOf(j)==Math.sqrt(tri)) { //If it's the square root only one factor should have been added
						factors--;
					}
				}
			}
		} while(factors<500);
		System.out.print(tri);
	}
}
//76576500
//[Finished in 3.473s]
