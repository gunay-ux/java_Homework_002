package shapeWork2;

public class App {

	public static void main(String[] args) {
	
		
		java.util.Scanner kb  = new java.util.Scanner(System.in);
		System.out.println("Enter a height number");
		int height = Integer.parseInt(kb.nextLine());
		System.out.println("Enter a width number ");
		int width = Integer.parseInt(kb.nextLine());
		model.run(height, width);

	}

}

class model{
	
	public static void run (int h, int w ) {
	
		int i;
		int count = 0;
			
		while(count != h) {	
			for(i = 1; i < w; i++ ) {
				System.out.print ("|");
				
				
				for (int j = 1; j < i; j++) 
					System.out.print(" ");
					
		
				System.out.print("*");
				for (int j = 0; j < w-i; ++j) 
					   System.out.print(" ");
				
				count++;	
				System.out.print("|");	
			    System.out.println();
			    if(count == h)
			    	return;
			   }
			
			for(i = 1; i < w; ++i ) {
					System.out.print ("|");	
					
					for (int j = 0; j < w-i; ++j) 
						   System.out.print(" ");	
						
							
				   System.out.print("*");
				   for (int j = 1; j < i ; j++) 
						System.out.print(" ");
		
				   
				   count++;	
				   System.out.print("|");
				   System.out.println();
				   if(count == h)
				    	return;
				   
				}
			}
		}
	}
		



