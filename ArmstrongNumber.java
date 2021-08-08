package Assingment;

public class ArmstrongNumber {
	public static void main(String[] args) {
	int number = 153;
		int calculated=0;
		int remainder;
		int original ;
		original=number;
		
		while (original > 0) {
			remainder = (original %10);
			original = (original/10);
			calculated = calculated+(remainder*remainder*remainder);
		}
			
		if(calculated == number) {
			System.out.println("The number " + calculated+ "Amstrong");
		}
	
       
	

}	
}	



