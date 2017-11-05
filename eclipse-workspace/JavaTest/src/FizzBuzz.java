/*
 * "Write a program that prints the numbers from 1 to 100. But for multiples of 
 * three print “Fizz” instead of the number and for the multiples of five print 
 * “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”."
 */
public class FizzBuzz {

	FizzBuzz(){
		for(int i=1; i<=100; i++)
		{
			if(i%15 == 0)
				System.out.println("FizzBuzz");
			else if(i%3 == 0)
				System.out.println("Fizz");
			else if(i%5 == 0)
				System.out.println("Buzz");
			else
				System.out.print(i);
		}
	}
	
	void reverseString(String fizzbuzz)
	{
		System.out.println(new StringBuilder(fizzbuzz).reverse().toString());
		System.out.println(new StringBuilder(fizzbuzz).reverse().toString().toUpperCase());
	}
	
	void reverseStringByWords(String fizzbuzz)
	{
		String[] sArray= fizzbuzz.split(" ");
		for(int i = 0; i<sArray.length/2; i++)
		{
			String temp = sArray[sArray.length-1-i];
			sArray[sArray.length-1-i] = sArray[i];
			sArray[i] = temp; 
		}
		
		StringBuilder newFizzBuzz = new StringBuilder(); 
		for(int i = 0; i<sArray.length; i++)
		{
			newFizzBuzz.append(sArray[i] + " ");
		}
		
		System.out.println(new StringBuilder(fizzbuzz).reverse().toString());
		System.out.println(new StringBuilder(fizzbuzz).reverse().toString().toUpperCase());
	}
	
	
	public static void main(String[] args) {
		FizzBuzz fizzbuzz = new FizzBuzz(); 
		fizzbuzz.reverseString("fizzbuzz");
		
		fizzbuzz.reverseStringByWords("fizzbuzz is simple not");
	}
}
