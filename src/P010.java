//Summation of primes
public class P010 {
	public static void main(String[] args) {
		double sum = 10;
		int max = 2000000;
		int prime[] = new int[max/10]; //For bigger numbers divide max by 2, 3, whatever to save memory
		int test = 5;
		int jump = 2;
		boolean divis;

		prime[0] = 2; //Prime generation has already been discussed in earlier problems
		prime[1] = 3;
		prime[2] = 5;
		for(int i = 3; i < max/10; i++) {
			do {
				test+=jump;
				jump = jump * -1 + 6;
				divis = false;
				for(int j = 0; j < i; j++) {
					if(test%prime[j]==0) {
						divis = true;
					}
				}
			} while (divis == true);
			prime[i]=test;
			if(test>max) {
				break; //Stops calculation if prime>max
			} else {
				sum+=test; //Sums primes
			}
		}

		System.out.print(sum);
	}
}
//142913828922