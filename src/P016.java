//Power digit sum
public class P016 {
	public static void main(String[] args) {
		String exp = "1";
		String temp;
		int base;
		int sum = 0;
		int carry;
		
		for(int i = 1; i<=1000; i++) {
			temp = "";
			carry = 0;
			for(int j = exp.length() - 1; j >= 0; j--) {
				base = Integer.valueOf(String.valueOf(exp.charAt(j)))*2 + carry;
				temp = String.valueOf(base) + temp;
				
				if(base>9) {
					carry = 1;
					if(j!=0) {
						temp = temp.substring(1);
					}
				} else {
					carry = 0;
				}
			}
			exp = temp;
		}
		
		for(int k = 0; k < exp.length(); k++) {
			sum+=Integer.valueOf(String.valueOf(exp.charAt(k)));
		}
		
		System.out.print(sum);
	}
}
//1366