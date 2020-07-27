//Counting Sundays
public class P019 {
	public static void main(String[] args) {
		int day = 2;
		int date = 1;
		int month = 1;
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year = 1900;
		int sum = 0;
		
		while(year < 2001) {
			day++;
			date++;
			
			if(day > 7) {
				day = 1;
			}
			if((date > days[month-1]) && !(date == 29 && month == 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
				date = 1;
				month++;
				if(month > 12) {
					month = 1;
					year++;
				}
			}
			
			if(day == 1 && date == 1 && year > 1900) {
				sum++;
			}
		}
		
		System.out.print(sum);
	}
}
//171