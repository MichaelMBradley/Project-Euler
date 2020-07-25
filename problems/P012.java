public class P012 {
	public static void main(String[] args) {
		double tri = 1;
		int n = 1;
		int factors;
		do {
			factors = 1;
			n++;
			tri+=n;
			for(int j = 1; j <= Math.sqrt(tri); j++) {
				if(tri%j==0) {
					factors++;
					if(j!=Math.sqrt(tri)) {
						factors++;
					}
				}
			}
		} while(factors<500);
		System.out.print(tri);
	}
}