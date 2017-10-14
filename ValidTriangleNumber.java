/*
 * 
Given an array consists of non-negative integers, your task is to count the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

Example 1:
Input: [2,2,3,4]
Output: 3
Explanation:
Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
Note:
The length of the given array won't exceed 1000.
The integers in the given array are in the range of [0, 1000].
 */
public class ValidTriangleNumber {

	//   \_
	//   /_
	//	|_
	
	// 
	
	ValidTriangleNumber(int[] value)
	{
		for(int i = 0; i< value.length-2; i++)
		{
			for(int j =1; j< value.length-1; j++)
			{
				for(int k =2; k< value.length-0; k++)
				{
					if(j != k && i !=j)
					{
						System.out.println(value[i] + " " + value[j] + " " + value[k] + " " );
						if (value[i]+value[j] > value[k] && ((value[k]>=value[i]) && (value[k]>=value[j])))
						{
							System.out.println("triangle" +value[i] + " " + value[j] + " " + value[k] + " " );
						}
						else if (value[i]+value[k] > value[j] && ((value[j]>=value[i]) && (value[j]>=value[k])))
						{
							System.out.println("triangle" +value[i] + " " + value[j] + " " + value[k] + " " );
						}
						else if (value[j]+value[k] > value[i] && ((value[i]>=value[j]) && (value[i]>=value[k])))
						{
							System.out.println("triangle" +value[i] + " " + value[j] + " " + value[k] + " " );
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int triArray[] = {2,2,3,4};
		ValidTriangleNumber triangle = new ValidTriangleNumber(triArray); 
	}
}
