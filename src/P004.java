//Largest palindrome product
public class P004 {
	public static void main(String[] args) {
		int p;
		int big = 0;
		for(int i = 999; i > 99; i--) {
			for(int j = i; j > 99; j--) { //Nested for loops run through every possible combination of three digit numbers
				p=i*j;
				if(p>big) {//Checks if product is larger than previous best
					if(((p%10)*100)+(((p/10)%10)*10)+((p/100)%10)==p/1000) { //Checks if product is a palindrome
						big = p;
					}
				}
			}
		}

		System.out.print(big);
	}
}
//906609