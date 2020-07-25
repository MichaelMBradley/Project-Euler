public class P003 {
	public static void main(String[] args) {
		double prime[] = new double[10000];
		double big = 6.00851475143e11;
		double bigprime = 0;
		double test = 5;
		double jump = 2;
		boolean divis;
		int i = 0;
		
		prime[0] = 2;
		prime[1] = 3;
		prime[2] = 5;
		do {
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
			}
			prime[i]=test;
			i++;
			while(big%test==0) {
				big/=test;
				bigprime = test;
			}
		} while (big!=1);
		
		System.out.print(bigprime);
	}
}
