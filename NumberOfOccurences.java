
/*
 * 
Count number of occurrences (or frequency) in a sorted array
Given a sorted array arr[] and a number x, write a function that counts 
the occurrences of x in arr[]. Expected time complexity is O(Logn)

Examples:

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
  Output: 1 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
  Output: 2 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
  Output: -1 // 4 doesn't occur in arr[] 
 */
public class NumberOfOccurences {
	public NumberOfOccurences(int[] arr, int i) {
		// TODO Auto-generated constructor stub
		NumberOfOccurences(arr, i);
	}

	public int NumberOfOccurences(int[] arr, int key)
	{
		int loIndex = 0; 
		int hiIndex = arr.length-1; 
		int answer = 0; 
		if(arr.length == 0) 
		{}
		else
		{
			answer = findNumberOfOccurences(arr, key, loIndex, hiIndex);
		}
		System.out.println(answer);

		return answer; 

		
	}

	private int findNumberOfOccurences(int[] arr, int key, int loIndex, int hiIndex)
	{
		int curValue, curIndex = loIndex; 
		int medIndex = loIndex+(hiIndex-loIndex)/2;
		int medValue = arr[medIndex];
		int startIndex=0, lastIndex = 0; 
		
		if(loIndex == hiIndex)
		{
			if(key != arr[loIndex])
				return 0;
			else
				return 1;
		}
		else if(hiIndex-loIndex == 1)
		{
			if(key != arr[loIndex] || key != arr[hiIndex])
				return 0;
			else if (key == arr[loIndex] || key == arr[hiIndex])
				return 2;
			else
				return 1; 
		}
		else if(key < medValue)
		{
			//if(hiIndex )
			hiIndex = medIndex; 
			return findNumberOfOccurences(arr, key, loIndex, hiIndex);
		}
		else if (key > medValue)
		{
			loIndex = medIndex;
			return findNumberOfOccurences(arr, key, loIndex, hiIndex);
		}
		else //key == medValue
		{
			//find first key value
			do
			{
				curValue = arr[curIndex]; 
				curIndex++;
			}
			while(curValue != key);
			curIndex--; 
			
			//find last key value
			startIndex = curIndex; 
			curValue = arr[curIndex];
			while(curValue == key)
			{
				if(curIndex < arr.length-1)
				{
					curIndex++;
					curValue = arr[curIndex]; 
				}
				else {
					break; 
				}
			}
				if(curValue == key && curIndex == arr.length-1)
				{
					//do nothing
				}
				else 
				{
					curIndex--;
				}
			lastIndex = curIndex; 
			
			//System.out.println(lastIndex-startIndex+1);
				
		}
		
		return (lastIndex-startIndex+1);
	}
	
	public static void main(String[] args) {
		int[]arr = {3, 3,3 };
		NumberOfOccurences numberString = new NumberOfOccurences(arr, 3);
	}
}
