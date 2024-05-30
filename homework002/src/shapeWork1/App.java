package shapeWork1;

public class App {
	
	public static void main (String  [] args) {
		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Enter a number:");
		int n = kb.nextInt();
		
		test.run(n);
		test.optositeRun(n);
	
		
	}
}

class test{
	
	
	public static void run(int n) {
		
		
		 for (int i = 0; i < n; i++) {
			 
			
	            for (int j = 0; j < n - i - 1; j++) {
	               System.out.print(" ");
	              
	            }
	            
	            
	            for (int k = 0; k < 2 * i + 1; k++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
		 }
	}
	
	
	public static void optositeRun(int n) {
		
		
		 for (int i = n-1 ; 0 < i; i--) {
			
	            
	            for (int j = 0; j < n - i ; j++) {
	               System.out.print(" ");
	               
	            }
	            
	            for (int k = 0; k < 2 * i - 1; k++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
		 }
	}
	
}
