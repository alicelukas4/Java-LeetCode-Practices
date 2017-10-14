/*
 * Given a string, find the length of the longest substring without repeating characters.
Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. 
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class FindLongestSubstring {

	public FindLongestSubstring(String string) {
		// TODO Auto-generated constructor stub
		char[] character = string.toCharArray(); 
		StringBuilder longestSubstring=new StringBuilder();

		boolean[] hash = new boolean[256];
		int startIndex = 0;
		int length = 0; 
		
		if(character.length > 0)
		{
			for(int i = 0; i<character.length; i++)
			{
				if(hash[(int)character[i]] == true)
				{
					if(i-startIndex > length)
					{
						length = i - startIndex; 
						longestSubstring=new StringBuilder();
						longestSubstring.append(character, startIndex, length);
					}
					hash = new boolean[256];
					startIndex = i; 
				}
				
				hash[(int)character[i]] = true;
				
			}
			System.out.println(longestSubstring.toString());
		}
		
		
	}
	
	public static void main(String[] args) {
		FindLongestSubstring substring = new FindLongestSubstring("abcabcabb"); 
		
	}
}
