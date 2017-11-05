/*1. Given a sorted integer array, print all distinct elements in array. 
 * The given array may contain duplicates and the output should print every element only once.
 * 
2. Given a sorted integer array, print all elements that appear only once in array. 
The given array may contain duplicates and the output should print every element only once.
Solution for both problems required space complexity O(1) & time complexity O(n).*/

public class DistinctNumber {

	DistinctNumber(int[] array)
	{
		System.out.print("Distinct Number:");
		for(int i = 1; i<array.length; i++)
		{
			if(array[i-1] != array[i])
			{
				if(i == 1)
					System.out.print(array[i-1]+","+array[i]+",");
				else
					System.out.print(array[i]+",");
			}
		}
	}
	
	public void appearOnce(int[] array)
	{
		System.out.print("Appeared once:");
		int prev = 0; int count = 0;
		for(int i = 0; i<array.length; i++)
		{
			if(i == 0)
			{
				prev = array[i];
				count = 1;
			}
			else 
			{
				if(array[i] != prev && count == 1)
				{
					System.out.print(prev+",");
					prev = array[i];
					count = 1; 
				}
				else if (array[i] != prev && count > 1)
				{
					prev = array[i];
					count = 1; 
				}
				else
					count++;
			}
		}
		//take cares of last case 
		if(count == 1)
		{
			System.out.print(prev+",");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 3, 4, 5, 5, 7};
		DistinctNumber number = new DistinctNumber(array); 
		number.appearOnce(array);
	}
}
