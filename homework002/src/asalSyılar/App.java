package asalSyılar;

public class App {
	
	public static void main(String[] args) {

		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Enter saniye:");
		long n  = kb.nextLong();
		Calculator.run(n);
		
		}
}
class Calculator{
	
	public static void run(long n) {
		
		System.out.print("Asalsayı çarpanları:");
		
		for(long i = 2; i <= n;) {
			
			while (n % i == 0) {
				
				System.out.print(i + " ");
				n = n/i;
			}
			 i++;
			
		
				
		}
}
}
