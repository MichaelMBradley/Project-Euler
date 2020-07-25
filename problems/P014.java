public class P014 {
	public static void main(String[] args) {
		int best = 0;
		int besti = 0;
		double n;
		int t;
		for(int i = 2; i < 1000000; i++) {
			t = 0;
			n = i;
			do {
				if(n%2==0) {
					n/=2;
				} else {
					n=n*3+1;
				}
				t++;
			} while(n!=1);
			if(t>best) {
				best = t;
				besti = i;
			}
		}
		System.out.println(besti);
	}
}
