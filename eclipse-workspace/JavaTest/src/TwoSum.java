import java.util.Arrays;

/*
 * LeetCode – Two Sum (Java)
 
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

For example:

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=0, index2=1
 */
public class TwoSum {

	public TwoSum(int[] nums, int i) {
		int[] array = new int[2]; 
		array = TwoSum(nums, i, true); 
		
		array = TwoSumBetterTimeComplexity(nums, i);
	}

	public int[] TwoSum(int[] nums, int target) 
	{
		int[] array = new int[2]; 
		for(int i=0; i<nums.length-1; i++)
		{
			for(int j=i+1; j<nums.length; j++)
			{
				if(nums[i]+nums[j] == target)
				{
					array[0] = i; 
					array[1] = j; 
				}
			}
		}
		
		return array;
	}
	//pointers method
	public int[] TwoSumBetterTimeComplexity(int[] nums, int target) 
	{
		int[] arrays = new int[2]; 
		Arrays.sort(nums);
		int j = nums.length-1;
		int i = 0; 
		while(i<nums.length)
		{
			if(nums[i]+nums[j] == target)
			{
				arrays[0] = nums[i]; 
				arrays[1] = nums[j]; 
				System.out.println("\nPointers: "+i+ " "+ j);
				return arrays;
			}
			else if (nums[i]+nums[j] > target) j--; 
			else i++;
		
		}
		
		return arrays;
	}
	//hash method
	//fail if input value > 15, duplicates, 
	public int[] TwoSum(int[] nums, int target, boolean ON) 
	{
		System.out.print("Hash method: ");
		int[] hash = new int[15]; 
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]<target)
			{
				if(hash[target-nums[i]] >0) 
				{
					System.out.print (i + " and " +(hash[target-nums[i]]-1));
				}
				hash[nums[i]]=i+1;

			}
		}
		
		return hash;
	}
	
	public static void main(String args[])
	{
		int[] nums = {2, 7, 11, 15}; 
		TwoSum twoSum = new TwoSum(nums, 9); 
	}
}
