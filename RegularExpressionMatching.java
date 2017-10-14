public class RegularExpressionMatching {

	public RegularExpressionMatching(String a, String b)
	{
		boolean status = isMatch(a, b);
		System.out.println(a + " " + b + " " + status);
	}
	
	boolean isMatch(String a, String b)
	{
		boolean match = true;
		boolean result = true; 
		boolean wildCardFound = false; 
		boolean checkNext = true; 
		char prev = 0;  
		int i = 0; 
		int j =0;
		
		//convert to char array
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray(); 
		
		while(i<aArray.length && j<bArray.length)
		{
			checkNext = true; 
			match = true; 

			//if it doesn't match, check if it is '.' or '*' or next character is '*'
			if(aArray[i] != bArray[j])
			{
				if(bArray[j] == '.')
				{
					//any character. match is true
				}
				else if(bArray[j] == '*')
				{
					wildCardFound = true; 
				}
				else {
					match = false;
					if(j < bArray.length-1 && bArray[j+1] == '*') 
					{
						checkNext = false; 
					}
				}
				
			}
			else
			{
				match = true; 
			}
			
			//record previous to handle '*'
			if(j<bArray.length && bArray[j] != '*')
				prev = bArray[j];
			
			//handle wildcard
			if((aArray.length-i) != (bArray.length-j))
			{
				if(wildCardFound == false)
				{					
					match = false; 
				}
				else // if wildCardFound = true;
				{
					if(prev == '.')
					{
						 //match is true
					}
					else if (aArray[i] == prev)
					{
						//match is true
					}
					else if (aArray[i] != prev)
					{
						//reset
						if(bArray[j] == '*') 
						{
							checkNext = false; 
							match = true; 
						}
					}
						
					wildCardFound = false;
				}
			}
			
			//handle c* where *=0; 
			if(checkNext == true)
			{
				i++;
				result &= match; 
				//System.out.print(match + "  ,");
			}
			j++;
			
			//System.out.print(match);
			//System.out.println();
		}
		return result;
	}
	
	public static void main(String[] args) {
		RegularExpressionMatching regex0 = new RegularExpressionMatching("aa", "a"); //false
		RegularExpressionMatching regex1 = new RegularExpressionMatching("aa", "aa"); //true
		RegularExpressionMatching regex2 = new RegularExpressionMatching("aaa", "aa"); //false
		RegularExpressionMatching regex3 = new RegularExpressionMatching("aa", "a*"); //true
		RegularExpressionMatching regex4 = new RegularExpressionMatching("aa", ".*"); //true
		RegularExpressionMatching regex5 = new RegularExpressionMatching("ab", ".*"); //true
		
		RegularExpressionMatching regex6 = new RegularExpressionMatching("aab", "c*a*b"); //true
		RegularExpressionMatching regex7 = new RegularExpressionMatching("aab", "d*c*aab"); //true
		RegularExpressionMatching regex8 = new RegularExpressionMatching("aab", "d*c*aaab"); //false
		
	}
}
