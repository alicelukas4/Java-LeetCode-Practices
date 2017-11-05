/*
 * Two strings are given. Modify 1st string such that all the common characters of the 2nd strings have to be removed 
 * and the uncommon characters of the 2nd string have to be concatenated with uncommon characters of the 1st string.

Note: If the modified string is empty then print '-1'.

Input:
The first line consists of an integer T i.e number of test cases. The first line of each test case consists 
of an string s1.The next line consists of an string s2. 

Output:
Print the required output.

Constraints: 
1<=T<=100
1<=|Length of Strings|<=100

Example:
Input:
2
aacdb
gafd
abcs
cxzca

Output:
cbgf
bsxz
 */
public class RemoveCommonCharAndConcatenate {

	//map all first array char to 1
	//check against sec array 
	//if such char already mapped, change the map value to 0; 
	//if not, change the map value to 1; 
	//print all value in map that is 1
		
	public void removeCommonChar(String a, String b)
	{
		int[] table1 = new int[26]; 
		int[] table2 = new int[26]; 
		//StringBuilder string = new StringBuilder(); 
		for(int i = 0; i<a.length(); i++)
		{
			table1[a.charAt(i)-'a']++; 
		}
		
		for(int i = 0; i<b.length(); i++)
		{
			table2[b.charAt(i)-'a']++;
		}
		
		for(int i = 0; i<table1.length; i++)
		{
			if((table1[i]>0 && table2[i]>0)||(table1[i]==0 && table2[i]==0))
			{
				//skip
			}
			else {
				System.out.print((char)(i+'a'));
			}
		}
	}
	
	public static void main(String[] args) {
		RemoveCommonCharAndConcatenate uniqueChars = new RemoveCommonCharAndConcatenate();
		String a = "aacdb";
		String b = "gafd";
		uniqueChars.removeCommonChar(a, b); 
		System.out.println();
		a = "abcs";
		b = "cxzca";
		uniqueChars.removeCommonChar(a, b); 
	}
}
