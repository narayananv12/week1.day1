package Assingment;



public class Factorial {
	public static void main(String[] args) {
		int number = 5;
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact=i*fact;
		}
		System.out.println("Factorial: " + fact);
	} 

}
