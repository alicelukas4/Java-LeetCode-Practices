/*
 * Example 1:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.

Example 2:
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.

Note i2 = -1 according to the definition.
Note:

The input strings will not have extra blank.
The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.

*/
public class complexNumberMultiplication {
    public String complexNumberMultiplication(String a, String b) {
    	
    	char [] a_ch = a.toCharArray();
    	char [] b_ch = b.toCharArray(); 
    	boolean start = false;  
    	
    	for(int i = 0; i < a_ch.length; i++)
    	{
    		if(a_ch[i] == '(')
    		{
    			start = true; 
    		}
    		else if (a_ch[i] == ')')
    		{
    			start = false; 
    		}
    		else 
    		{
    			if(start == true)
    			{
    				
    			}
    		
    		}
    	}
    	
		return b;
        
    }
}