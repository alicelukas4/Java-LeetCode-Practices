/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/


public class ZigZagConversion{
	public ZigZagConversion(String string)
	{
		char[][] zigZagArray = new char[3][10]; 
		char[] inputString = string.toCharArray();

		int inputStringIndexTracker = 0; 
		for(int column = 0; column < zigZagArray[0].length; column++)
		{
			for(int row = 0; row < zigZagArray.length; row++)
			{
				if(inputStringIndexTracker < inputString.length)
				{
					if(column % 2 == 0)
					{
						zigZagArray[row][column] = inputString[inputStringIndexTracker];
						inputStringIndexTracker++; 
					}
					else
					{
						if(row == 1)
						{
							zigZagArray[row][column] = inputString[inputStringIndexTracker];
							inputStringIndexTracker++; 
						}
					}
				}	
			}
		}
		
		for(int row = 0; row < zigZagArray.length; row++)
			
		{
			for(int column = 0; column < zigZagArray[0].length; column++)
			{
				if(zigZagArray[row][column] != 0)
				{
					System.out.print(zigZagArray[row][column]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		String string = "Paypalishiring";
		ZigZagConversion zigzag = new ZigZagConversion(string);
	}
}
