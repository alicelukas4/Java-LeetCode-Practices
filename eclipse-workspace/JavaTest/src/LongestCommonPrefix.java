/*
 * 
Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {

	public LongestCommonPrefix(String a, String b)
	{
		char[] aArray = a.toCharArray(); 
		char[] bArray = b.toCharArray(); 
	
		//find minimum
		int loIndex = 0; 
		int hiIndex = Math.min(aArray.length-1, bArray.length-1);
		
		int resIndex = searchBST(aArray, bArray, loIndex, hiIndex);
		System.out.println(resIndex);
	}
	
	public int searchBST(char[] aArray, char[] bArray, int loIndex, int hiIndex)
	{
		int midIndex = loIndex+((hiIndex-loIndex)/2); 
		int index = 0;
		if(aArray == null || bArray == null) return 0; 
		
		if(hiIndex - loIndex == 1)
		{
			if(aArray[hiIndex] == bArray[hiIndex])
			{
				index = hiIndex;
			}
			else
			{
				index = loIndex; 
			}
		}
		
		else if(aArray[midIndex] != bArray[midIndex])
		{
			index = searchBST(aArray, bArray, loIndex, midIndex);
		}
		else if(aArray[midIndex] == bArray[midIndex])
		{
			index = searchBST(aArray, bArray, midIndex, hiIndex);
		}
		
		return index; 
	}
	
	public static void main(String[] args) {
		LongestCommonPrefix lcp = new LongestCommonPrefix("geek", "geek"); 
	}
}


