//Factorial digit sum
public class P020 {
	public static void main(String[] args) {
		String f = "1";
		String temp;
		int base;
		int sum = 0;
		int carry;
		
		for(int i = 1; i<=100; i++) {
			temp = "";
			carry = 0;
			for(int j = f.length() - 1; j >= 0; j--) {
				base = Integer.valueOf(String.valueOf(f.charAt(j)))*i + carry;
				temp = String.valueOf(base%10) + temp;
				carry = base/10;
			}

			if(carry!=0) {
				f = String.valueOf(carry) + temp;
			} else {
				f = temp;
			}
		}
		
		for(int k = 0; k < f.length(); k++) {
			sum+=Integer.valueOf(String.valueOf(f.charAt(k)));
		}
		
		System.out.print(sum);
	}
}
//648