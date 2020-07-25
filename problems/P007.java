public class P007 {
	public static void main(String[] args) {
		int num = 10001;
		int prime[] = new int[num];
		int test = 5;
		int jump = 2;
		boolean divis;
		
		prime[0] = 2;
		prime[1] = 3;
		prime[2] = 5;
		for(int i = 3; i < num; i++) { //Generates primes. Probably not very efficient but given that I only need the first 26 it doesn't really matter.
			do {
				test+=jump; //Gets new number
				jump = jump * -1 + 6; //With the exception of 2 and 3, all prime numbers fall into 6n+/-1. This swaps to jump between 2 and 4.
				divis = false;
				for(int j = 0; j < i; j++) {
					if(test%prime[j]==0) { //Divides by all previously generated primes
						divis = true;
					}
				}
			} while (divis == true); //Runs until new prime is found
			prime[i]=test;
		}
		
		System.out.print(prime[num - 1]);
	}
}