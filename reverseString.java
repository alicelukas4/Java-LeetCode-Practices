
public class reverseString {

	public static void main (String[] args)
	{
		//original string
        String str = "Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        //reversed string using Stringbuffer
        String strBuff = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String using STR BUFF: " + strBuff);
        
        //iterative method to reverse String in Java
        String IterativeStr = reverseIterative(str);
        System.out.println("Reverse String in Java using Iteration: " + IterativeStr);

        //recursive method to reverse String in Java
        String recursiveStr = reverseRecursive(str);
        System.out.println("Reverse String in Java using Recursive: " + recursiveStr);

	}
	
	private static String reverseIterative(String str) {
		StringBuilder reverse_str = new StringBuilder(); 
		char[] str_ch = str.toCharArray(); 
		
		for(int i = str_ch.length-1; i >=0; i--)
		{
			reverse_str.append(str_ch[i]);
		}
		return reverse_str.toString();
	}

	private static String reverseRecursive(String str) {
		//base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }	
        System.out.println(str.substring(1) +"--"+str.charAt(0));
		return reverseRecursive(str.substring(1)) + str.charAt(0);
	}
}
