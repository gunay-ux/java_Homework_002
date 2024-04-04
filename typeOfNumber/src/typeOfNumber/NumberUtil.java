package typeOfNumber;

public class NumberUtil {

	public static void main(String[] args) {
		
		run();

	}
	
public static  void run () {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);
		System.out.println("Enter a numbers");
		int a  = Integer.parseInt(input.nextLine());
		input.close();
		
		controlTypeOfNumber(a );
	}

private static void controlTypeOfNumber(int a) {
	
	int b  = TypeOfNumber(a);
	System.out.printf("%d", b);
	
}

private static int TypeOfNumber(int a) {
	
	if(a < 0)
		return -1;
	if(a > 0)
		return 1;
	
	return 0;
	   
	
}




}
