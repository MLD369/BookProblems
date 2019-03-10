package questions;

import java.util.Scanner;

public class prime {
	
	public static void main(String []args){
		
		
		// create variables
		Scanner scan = new Scanner(System.in);
		int number;
		
		// give user instructions
		
		System.out.println("Enter a whole number to see if its prime");
		
		
		// loop to make sure user input is correct
		while(true)
		{
			try{
					number = scan.nextInt();
					
						if(number < 2)
						{
							throw new Exception();
						}
					break;
				}
			catch (Exception ex){
				// error message
				System.out.println("Number must be greater than 1 and a whole number");
					scan.nextLine();
			}
		}
	
		// print result
		System.out.println(checkNumber(number));
	}
	// check if number is prime method
	private static boolean checkNumber(int num){
		
		// loop and check if number has a remainder of zero when divided
		for(int i = 1; i < num;i++ )
		{
			if( i == 1 || i == num)
			{	
				continue;
			}
			else
			{
				if( num % i == 0)
				{
					return false;
				}
			}
			
			
			 
		}
		return true;
		
	}

}
