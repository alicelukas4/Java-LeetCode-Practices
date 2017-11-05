/*
 * Given a positive integer num, write a function which returns True 
 * if num is a perfect square else False.
Note: Do not use any built-in library function such as sqrt.

Example 1:
Input: 16
Returns: True

Example 2:
Input: 14
Returns: False

 */
public class PerfectSquare {
	
	boolean perfectSquare(int ps)
	{
		for(int i = 0; i<ps; i++)
		{
			if(i*i == ps)
				return true; 
		}
		return false; 	
	}
	
	public static void main(String[] args) {
		PerfectSquare ps = new PerfectSquare(); 
		System.out.println(ps.perfectSquare(2));
		System.out.println(ps.perfectSquare(4));
	}
	
}
