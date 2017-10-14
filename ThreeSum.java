/*
 * Given an array S of n integers, are there elements a, b, c in S such that 
 * a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.
For example, given array S = [-1, 0, 1, 2, -1, -4],
A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
public class ThreeSum {
	public ThreeSum(int[] intArray) {
		int[] k = new int[40]; 
		int[] counterHash = new int [40];
		
		//populate hash table
		for(int i =0; i< intArray.length; i++)
		{
			k[intArray[i]+20]=1; 
			counterHash[intArray[i]+20]+=3; 
		}
		
		for(int i =0; i< intArray.length-1; i++)
		{
			counterHash[intArray[i]+20]--; 
			for(int j=1; j<intArray.length; j++)
			{
				counterHash[intArray[j]+20]--; 
				int isInHashIndex = 20-intArray[i]-intArray[j];
				int isInHash= k[isInHashIndex];
				int sum = intArray[i]+intArray[j]+isInHashIndex-20; 
				if(isInHash >0 && sum==0 && counterHash[intArray[j]+20]>=3)
					System.out.println(intArray[i]+" "+intArray[j]+" "+(isInHashIndex-20));
			}
		}
	}

	public static void main(String[] args) {
		int[] intArray = {-1,0,1,2,-1,-4};
		ThreeSum threeSum = new ThreeSum(intArray);
	}
}
