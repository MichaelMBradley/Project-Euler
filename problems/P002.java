public class P002 {
	public static void main(String[] args) {
		int[] f = new int[40];
		int sum = 2;
		
		f[0] = 1;
		f[1] = 2;
		for(int i = 2; i < 40; i++) {
			f[i] = f[i-1] + f[i-2];
			if(f[i]%2==0&&f[i]<4e6) {
				sum+=f[i];
			}
		}
		
		System.out.print(sum);
	}
}
