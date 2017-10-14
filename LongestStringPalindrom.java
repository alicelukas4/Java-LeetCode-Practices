
public class LongestStringPalindrom {

	public LongestStringPalindrom(String string)
	{
		//subsequence answer
		int[][]metrix = new int[string.length()][string.length()];
		char[]charArray = string.toCharArray(); 
		
		
		for(int i =string.length()-1; i>=0; i--)
		{
			for(int j=i; j<string.length(); j++)
			{
				
				if(j ==i)
				{
					metrix[i][j] = 1;
				}
				else if (j== i+1) 
				{
					if (charArray[i] == charArray[j]) metrix[i][j] = 2; 
					else metrix[i][j] = 1; 
				}
				else
				{
					if (charArray[i] == charArray[j]) {metrix[i][j] = 2+Math.max(metrix[i+1][j], metrix[i][j-1]); }
					else {metrix[i][j] = Math.max(metrix[i+1][j], metrix[i][j-1]);}
				}
				
			}
		}
		
		for(int i =0; i<string.length(); i++)
		{
			for(int j=0; j<string.length(); j++)
			{
				System.out.print(metrix[i][j] + " ");
			}
			System.out.println();
		}
		
		char[] newString = new char[metrix[0][string.length()-1]+1]; 
		int i = 0; int j = string.length()-1; 
		int i1 = 0; int i2 = metrix[0][string.length()-1]; 
		newString[i2] = '\0';
		i2--;
		while(i != j)
		{
			
			if(metrix[i][j] == metrix[i+1][j-1])
			{
				i = i+1;
				j = j-1; 
			}
			else if (metrix[i][j] == metrix[i+1][j])
			{
				i = i+1;
			}
			else if (metrix[i][j] == metrix[i][j-1])
			{
				j = j-1;
			}
			else
			{
				newString[i1] = charArray[i];
				newString[i2] = charArray[i];
				i1++; i2--; 
				
				i = i+1;
				j = j-1; 
			}
			
		}
		newString[i2] = charArray[i];
		System.out.println(newString);
	}
	
	public static void main(String[] args) {
		LongestStringPalindrom palindrom = new LongestStringPalindrom("banaxruranas"); 
	}
}
