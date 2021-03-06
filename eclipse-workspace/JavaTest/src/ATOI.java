/*
 * Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. 
If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely 
(ie, no given input specs). You are responsible to gather all the input requirements up front.

Update (2015-02-10): 
The signature of the C++ function had been updated. 
If you still see your function signature accepts a const char * argument, 
please click the reload button  to reset your code definition.

spoilers alert... click to show requirements for atoi.
 */
public class ATOI {

	public ATOI(String string) {
		char atoiChar[] = string.toCharArray();
		int number = 0;
		
		for(int i=0; i<atoiChar.length; i++)
		{
			
			number = (number*10)+(atoiChar[i]-'0'); 
		}
		
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		
		ATOI atoi = new ATOI("123456"); 
	}
}
