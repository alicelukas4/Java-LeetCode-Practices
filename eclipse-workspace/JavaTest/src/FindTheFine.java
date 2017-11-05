/*
 * Given an array of penalties, an array of car numbers and also the date. 
 * The task is to find the total fine which will be collected on the given date. 
 * Fine is collected from odd-numbered cars on even dates and vice versa.

Input:
The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow. Each test case consists of three lines. First line of each 
test case contains two integers N & Date, second line contains N space separated car 
numbers and third line contains N space separated penalties.

Output:
For each test case,In new line print the total fine.

Constraints:
1<=T<=100
1<=N<=105
1000<= Car num<=9999
1<=Date<=31
1<=penalty[i]<=103
Example:
Input:
2
4 12
2375 7682 2325 2352
250 500 350 200
3 8
2222 2223 2224
200 300 400
Output:
600
300
 */

public class FindTheFine {
	
	void calculateTheFine(int[] array)
	{
		int caseCount = array[0]; 
		int numberCars[] = {array[1], array[11]};
		int dates[] = {array[2], array[12]};
		int carUniqueNumbers[] = {array[3], array[4], array[5], array[6], array[13], array[14], array[15]};
		int penalty[] = {array[7], array[8], array[9], array[10], array[16], array[17], array[18]}; 
		
		int j = 0;	
		if(1<=caseCount && caseCount<=100)	{
			for(int i = 0; i<caseCount; i++)
			{
				int penalties = 0; 
				if(1<=numberCars[i] && numberCars[i]<=105 && 1<=dates[i]&& dates[i]<=31)
				{
					numberCars[i] += j; 
					for(; j<numberCars[i]; j++)
					{
						if(1000<= carUniqueNumbers[j] && carUniqueNumbers[j]<=9999 && 1<=penalty[j] && penalty[j]<=1000)
						{
							if(dates[i]%2 == 0 && carUniqueNumbers[j] %2 == 1)
							{
								penalties += penalty[j];
							}
							if(dates[i]%2 == 1 && carUniqueNumbers[j] %2 == 0)
							{
								penalties += penalty[j];
							}
						}
					}
					System.out.println(penalties);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {
				2,
				4, 12,
				2375, 7682, 2325, 2352,
				250, 500, 350, 200,
				3, 8,
				2222, 2223, 2224,
				200, 300, 400
		};
		
		FindTheFine totalFine = new FindTheFine ();
		totalFine.calculateTheFine(array);
	}
}
