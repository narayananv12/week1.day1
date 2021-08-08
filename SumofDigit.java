package Assingment;



public class SumofDigit {
	public static void main(String[] args) {
		int number = 123;
		int reminder; 
		int sum = 0;   
		while(number > 0)  
		{  
		reminder = (number % 10);  
		 System.out.println("Reminder :" + reminder);
		sum = sum + reminder; 
		System.out.println("Sum to confirm :" + sum);
		number = (number / 10);  
		System.out.println("Quotient of number :" + number);
		} 
		
		System.out.println("Sum of Digits: " + sum);  
			
			
		}
	}


