//Largest prime factor
public class P003 {
	public static void main(String[] args) {
		double prime[] = new double[10000];
		double big = 6.00851475143e11; //Number to calculate LPF for
		double bigprime = 0;
		double test = 5;
		double jump = 2;
		boolean divis;
		int i = 0;

		prime[0] = 2; //Initializing prime array
		prime[1] = 3;
		prime[2] = 5;
		do {
			if(i>=3) {
				do {
					test+=jump; //Gets new potential prime
					jump = jump * -1 + 6; //Skips potentials that do not satisfy 6n+-1
					divis = false;
					for(int j = 0; j < i; j++) {
						if(test%prime[j]==0) { //Checks if potential is divisible by previously calculated primes
							divis = true;
						}
					}
				} while (divis == true);
			}
			prime[i]=test;
			i++;
			while(big%test==0) { //Factors out any primes 'big' is divisible by
				big/=test;
				bigprime = test;
			}
		} while (big!=1); //When 'big' = 1, test will be the largest factor yet

		System.out.print(bigprime);
	}
}
//6857
//[Finished in 0.553s]
