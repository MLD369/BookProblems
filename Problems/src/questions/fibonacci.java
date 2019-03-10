package questions;

public class fibonacci {

	
	
	public static void main (String [] args){
		int t1 = 0;
		int t2 = 1;
		int next = 1;
		
		
		
		
		for( int i = 0; i < 10 ; i ++)
		{
			System.out.println(t1);
			next = t1 + t2;
			t1 = t2;
			t2 = next;
			
		}
		
	}
}
