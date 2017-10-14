/*
 * 
Given a digit string, return all possible letter combinations that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below.
Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
import java.util.*;
public class LetterCombinationPhoneNumber {

	LetterCombinationPhoneNumber(int number)
	{
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(2,"abc");  
		  hm.put(3,"def");  
		  hm.put(4,"ghi");  
		  hm.put(5,"jkl");
		  hm.put(6,"mno");
		  hm.put(7,"pqrs");
		  hm.put(8,"tuv");
		  hm.put(9,"wxyz"); 
		  hm.put(0,""); 
		  
		  ArrayList<String> rec = new ArrayList<>();
		
		int digitizedNumber[] = new int[10]; 
		int i = 0; 
		while(number != 0 )
		{
			digitizedNumber[i] = number % 10;
			number = number/10;
			i++;
		}
		
		StringBuilder string = new StringBuilder();
		int digitizedNumberIndex = 0;
		print(string, digitizedNumber, digitizedNumberIndex, hm, rec);
		
	}
	
	void print(StringBuilder string, int[] digitizedNumber, int digitizedNumberIndex, HashMap<Integer,String> hm, ArrayList<String> rec)
	{
		char[] charEquiv = new char[hm.get(digitizedNumber[digitizedNumberIndex]).length()];
		charEquiv = hm.get(digitizedNumber[digitizedNumberIndex]).toCharArray();
		
		if (charEquiv == null) return; 
		if( digitizedNumber[digitizedNumberIndex] == 0)
		{
			rec.add(string.toString());
			System.out.print (string.toString()+" ");
	
			return;
		}

		for(int i = 0; i < charEquiv.length; i++)
		{
			string.append(charEquiv[i]);
			digitizedNumberIndex++; 
			print(string, digitizedNumber, digitizedNumberIndex, hm, rec);
			string.deleteCharAt(string.length()-1);
			digitizedNumberIndex--; 
		}
		
	}
	
	public static void main(String[] args) {
		int number = 2345; 
		LetterCombinationPhoneNumber letterCombo = new LetterCombinationPhoneNumber(number ); 
	}
}
