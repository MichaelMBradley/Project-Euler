//Lexicographic permutations
public class P024 {
	public static int z = 0;
	public static String[] n = new String[10];
	public static boolean[] u = new boolean[10];
	public static String s = "";
	public static void r(int d) {
		if(d<10) {
			for(int i = 0; i < 10; i++) {
				if(!u[i]) {
					u[i] = true;
					s+= n[i];
					r(d+1);
					u[i] = false;
					s = s.substring(0, s.length()-1);
				}
			}
		} else {
			z++;
			if(z==1000000) {
				System.out.print(s);
			}
		}
	}
	
	public static void main(String[] args) {
		for(int k = 0; k < 10; k++) {
			n[k] = String.valueOf(k);
			u[k] = false;
		}
		
		r(0);
	}
}
//2783915460