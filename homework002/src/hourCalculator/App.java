package hourCalculator;

public class App {

	public static void main(String[] args) {
		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Enter saniye:");
		long second  = kb.nextLong();
		calculator.printDuration(second);
	}
}

class calculator{
	public static long hour(long second) {
		long hour = second / 3600;
		return hour;
		
		
	}

	public static long minute(long second) {
		second %= 3600;
		long minute =  second / 60;
		return minute;
		
	}
	
	public static void printDuration(long second) {
		
		long  hour = hour(second);
		long  minute = minute(second);
		second  %= 60; 
		
		if(hour == 0 || minute == 0 || second == 0 )
			return;
		
		if(hour > 0)
			System.out.printf("hours :%d%n", hour);
		if(minute > 0)
			System.out.printf("minute :%d%n", minute);
		if(second > 0)
			System.out.printf("second :%d%n", second);
		
		 
	}
	
	
	
}
