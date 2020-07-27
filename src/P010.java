//Summation of primes
import java.util.BitSet;

public class P010 {
	public static void main(String[] args) {
		//Much faster prime calculation
		final int MAX = 2000001;
		
		double sum = 2;
		BitSet c = new BitSet(MAX);
		
		for(int i = 3; i < MAX; i+=2) {
			if(!c.get(i)) {
				for(int j = i*2; j < MAX; j+=i) {
					c.set(j, true);
				}
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.print(sum);
	}
}
//142913828922