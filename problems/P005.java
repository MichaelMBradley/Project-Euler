//Smallest multiple
public class P005 {
	public static void main(String[] args) {
		int p = 1;
		int max = 20;
		int prime[] = new int[max]; //For bigger numbers divide max by 2, 3, whatever, to save memory
		int test = 5;
		int jump = 2;
		boolean divis;

		prime[0] = 2; //Calculates prime numbers, see P003.java or P007.java
		prime[1] = 3;
		prime[2] = 5;
		for(int i = 0; i < max; i++) {
			if(i>=3) {
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
				if(test>max) { //Stops calculating primes when prime[i]>max
					i=max;
				}
			}
			if(test<=max) {
				p*=Math.pow(prime[i], Math.floor(Math.log(max)/Math.log(prime[i]))); //Once a prime is found, it's greatest exponential less than 'max' is multiplied into the running product
			}
		}

		System.out.print(p);
	}
}
//232792560
//[Finished in 0.529s]
