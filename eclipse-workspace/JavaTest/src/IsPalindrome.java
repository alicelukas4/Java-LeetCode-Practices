/*
 * Determine whether an integer is a palindrome. Do this without extra space.
 */

public class IsPalindrome {
	public IsPalindrome(int number) {
		
		if (number >10) {
			char numberChar[] = Integer.toString(number).toCharArray();
			
			int i = 0;
			int j = numberChar.length-1; 
			
			while(j != i)
			{
				if(numberChar[i] != numberChar[j])
				{
					System.out.println("Not Palindrome");
					return;
				}
				i++; j --; 
			}
			
			System.out.println("Palindrome");
		}
	}
	
	public void IsPalindromeNoExtraSpace(int number) {
		int divisor = 1; 
		while(number /divisor >10) divisor *=10; 
		int trailingdivisor = 10; 
		
		while(number > 10)
		{
			System.out.println(number);
			if (number/divisor != number % trailingdivisor)
			{
				System.out.println("Not Palindrome");
				return;
			}
			
			number = number %divisor; 
			number = number /10; 
		}
		
		System.out.println("Palindrome");
		
	}
	public static void main(String[] args) {
		IsPalindrome number = new IsPalindrome(1232); 
		System.out.println("No Extra Space");
		number.IsPalindromeNoExtraSpace(12321);
	}
}
