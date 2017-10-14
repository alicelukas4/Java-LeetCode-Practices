import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given an array S of n integers, are there elements a, b, c, and d in S 
 * such that a + b + c + d = target? 
 * Find all unique quadruplets in the array which gives the sum of target.

Note: The solution set must not contain duplicate quadruplets.
For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
 */
public class FourSum {
	public FourSum(int[] array, int target)
	{
		ArrayList <String>rec = new ArrayList<String>();
		Arrays.sort(array); //s -2 -1 0 0 1 2 // -2 -1 0 1 1 2 
		for(int index1 = 0; index1< array.length-3; index1++)
		{
			int index2 = index1+1; 
			int index3 = array.length-2;
			int index4 = array.length-1; 
			while(index1<index2 && index2<index3 && index3<index4 )
			{
				int sum = array[index1]+array[index2]+array[index3]+array[index4];
				
				if(sum == target)
				{
					rec.add(array[index1]+" "+array[index2]+" "+array[index3]+" "+array[index4]); 
					System.out.println(array[index1]+" "+array[index2]+" "+array[index3]+" "+array[index4]);
					
					if(index3-index2>2)
					{
						index2++;
						index3--;
					}
					else break;
				}
				else if (sum < target)
				{
					if(index4 < array.length-1) index4++;
					else if(index4-index3>1)index3++;
					else if(index3-index2>1)index2++;
					else break;
				}
				else if (sum > target)
				{
					if(index4-index3>1)index4--;
					else if(index3-index2>1)index3--;
					else if(index2-index1>1)index2--;
					else break; 
				}
			}
		}
	}


	public static void main(String[] args) 
	{
		int[] s = {1, 0, -1, 0, -2, 2};
		int target = 0; 
		
		FourSum sum = new FourSum(s, target); 
	}
}
