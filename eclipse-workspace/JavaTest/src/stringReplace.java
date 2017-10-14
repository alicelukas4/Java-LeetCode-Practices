import java.util.*;

public class stringReplace {
	
	public static void main (String args[])
	{
		String str = "hello";
		char ch = 'a';
		stringReplace x = new stringReplace (str, ch); 
	}

	private stringReplace(String str, char ch) {
		str = str.replace("o","a");
		System.out.println(str);
		
		str = str.toUpperCase();
		System.out.println(str);
		
	}
}
