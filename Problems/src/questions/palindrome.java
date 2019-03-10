package questions;


import java.util.*;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Enter a word to see if it's a palindrome");
		
		String word = scan.next();	
	
		
		
	
		
		for( int i = 0 ; i < word.length()/2;i++){
			
			if( word.charAt(i) != word.charAt(word.length()-++i) )
			{
				System.out.println(false);
				return;
			}
			
		}
		
		System.out.println(true);
	
		
	}

}
