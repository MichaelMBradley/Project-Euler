//Number letter counts
public class P017 {
	public static void main(String[] args) {
		String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		int sum = 0;
		String txt;
		
		for(int i = 1; i < 1000; i++) {
			txt = "";
			
			if(i > 99) {
				txt = ones[Math.abs(i/100)] + "hundred";
				if(i%100 > 0) {
					txt += "and";
				}
			}
			
			if((i%100) > 9 && (i%100) < 20) {
				txt += teens[(i%100)-10];
			} else {
				txt += tens[Math.abs((i%100)/10)];
				txt += ones[i%10];
			}
			
			sum += txt.length();
		}
		
		//Could be more generalized, but this works for now
		
		txt = "onethousand";
		sum+=txt.length();
		System.out.print(sum);
	}
}
//21124