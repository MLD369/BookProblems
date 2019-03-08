package questions;
// Program finds the nth number of pi

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Pi {

	
	
	public static void main(String [] args){
	
	int roundedTo;


	roundedTo = getInput();
	
	printPi(roundedTo);
	
	
	}
	
	// method to get and check the users input
	public static int getInput(){
		
		// create scanner object
		Scanner scan = new Scanner(System.in);	
		// int to hold user rounding
		int input;
		
		// make sure the user inputs an integer
		while(true)
		{
			
			// try to get the next int. if exception is thrown let user try a new input
			try{
				// get the user input
				System.out.println("Enter an Integer to the the Nth digit of PI. Max size 15");
				
				input = scan.nextInt();
				
				// make sure it is within the range
				if(input > 15){
					throw new Exception();
				}
				// close scanner
				scan.close();
				return input;
			 
			}
			catch(Exception e){
				scan.nextLine();
				
			}
		
		
		}
		
		
	}
	
	
	// print pi rounded number parameter
	public static void printPi(int number){
		String pi = Double.toString(Math.PI);
		 System.out.println(new BigDecimal(pi).setScale(number, RoundingMode.HALF_UP));
		
		
	}
	
	
}
