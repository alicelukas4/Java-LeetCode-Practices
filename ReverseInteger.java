/*
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Note:
The input is assumed to be a 32-bit signed integer. 
Your function should return 0 when the reversed integer overflows.
 */

public class ReverseInteger {
	public ReverseInteger(int nonRevInt)
	{
		int remainder;
		int newNumber=0; 
		
		if(nonRevInt < (2^31))
		{
			while (nonRevInt != 0)
			{
				remainder = nonRevInt%10;
				nonRevInt = nonRevInt/10;
				
				newNumber = newNumber*10+remainder; 
			}
		}
		else
		{
			newNumber = 0; 
		}
		
		System.out.println(newNumber);
		
		
	}

	public static void main(String[] args) {
		int nonRevInt = -321; 
		ReverseInteger revInt = new ReverseInteger(nonRevInt); 
	}
}
