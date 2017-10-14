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
		//System.out.println(array[0] +", "+ array[1]);
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
	
	//fail if input value > 15, duplicates, 
	public int[] TwoSum(int[] nums, int target, boolean ON) 
	{
		int[] hash = new int[15]; 
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]<target)
			{
				if(hash[target-nums[i]] >0) 
				{
					System.out.println(i + "and" +(hash[target-nums[i]]-1));
				}
				hash[nums[i]]=i+1;

			}
		}
		
		return hash;
	}
	
	public static void main(String args[])
	{
		int[] nums = {1, 3, 4, 1, 7, 3, 7, 11, 15, 8, 16}; 
		TwoSum twoSum = new TwoSum(nums, 8); 
	}
}
