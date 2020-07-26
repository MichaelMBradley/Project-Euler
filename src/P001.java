//Multiples of 3 and 5
public class P001 {
	public static void main(String[] args) {
		int sum = 0;

		for(int i = 1; i < 1000; i++) { //Numbers less than 1000
			if(i%3==0||i%5==0) { //Add if divisible by 3 or 5
				sum+=i;
			}
		}

		System.out.print(sum);
	}
}
//233168