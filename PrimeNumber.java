package Assingment;



public class PrimeNumber {
	public static void main(String[] args) {
		int input = 13;
		boolean flag= false;

		for (int i = 2; i <= input/2 ; i++) 
		{
			
			input = input%i;
			if(input == 0)
			{
				flag = true;
			}
		}

		if(!flag)
		{
			System.out.println("The number is Prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}
}
