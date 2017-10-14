/*
 * Given an integer, convert it to a roman numeral.
Input is guaranteed to be within the range from 1 to 3999.
1 -> I
5 -> V
10 -> X
50 -> L
100 -> C
500 -> D
1000 -> M
 */

public class IntegerToRoman {
	public IntegerToRoman(int integerValue)
	{
		
		
		if(integerValue<=3999)
		{
			convertToRoman(integerValue);
		}
		else
		{
			System.out.println("value too large!");
		}
		
		
	}
	
	public void convertToRoman(int integerValue)
	{
		int[] intHash = {1, 5, 10, 50, 100, 500, 1000};
		char[] charHash = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		int j = intHash.length-1;
		boolean convert = false; 
		
		if(integerValue == 0) {
			return;
		}
		else {
			do{
				if(integerValue/intHash[j]>=1)
				{
					convert = true; 
				}
				else
				{
					j--;
				}
			}while(!convert);
			
			integerValue = integerValue - intHash[j];
			System.out.print(charHash[j]);
			
			convertToRoman(integerValue);
		}
	}
	
	public static void main(String[] args) {
		IntegerToRoman roman = new IntegerToRoman(3999); 
		
	}
}
