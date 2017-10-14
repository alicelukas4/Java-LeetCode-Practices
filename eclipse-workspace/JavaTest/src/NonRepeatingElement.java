/*
 * Find the two non-repeating elements in an array of repeating elements
Asked by SG
Given an array in which all numbers except two are repeated once. 
(i.e. we have 2n+2 numbers and n numbers are occurring twice and 
remaining two have occurred once). Find those two numbers in the most efficient way.

Recommended: Please solve it on “PRACTICE ” first, 
before moving on to the solution.
Method 1(Use Sorting)
First sort all the elements. In the sorted array, 
by comparing adjacent elements we can easily get the non-repeating elements. 
Time complexity of this method is O(nLogn)
 */
public class NonRepeatingElement {
	public NonRepeatingElement()
	{
		int[] array = {6,2,2,6,7, 9, 8 , 3 ,3, 3 ,3 ,4 ,8};
		
		//merge sort
		int startIndex = 0; 
		int endIndex = array.length-1; 
		mergeSort(array, startIndex, endIndex); 
		
		//print array in sorted order
		for(int i = startIndex; i <=endIndex; i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
		
		//check for non duplicate number
		int[]hash = new int[array[endIndex]+1];
		for(int i=0; i<array.length; i++)
		{
			hash[array[i]]++;
		}
		
		//print unique number 
		for(int i=0; i<array.length; i++)
		{
			if(hash[array[i]] == 1) 
				System.out.println(array[i]);
		}
		
	}
	
	public void mergeSort(int[] array, int startIndex, int endIndex)
	{
		if(array == null)
			return; 
		
		if(endIndex > startIndex)
		{
			int medIndex = startIndex+((endIndex-startIndex)/2);
			mergeSort(array, startIndex, medIndex);
			mergeSort(array, medIndex+1, endIndex);
			merge(array, startIndex, medIndex, endIndex);
			
		}
		
	}
	
	public void merge(int[] array, int startIndex, int medIndex, int endIndex)
	{
		//if array has 2 entry only
		if(endIndex-startIndex == 1)
		{
			if(array[startIndex] > array[endIndex])
			{
				int temp = array[endIndex];
				array[endIndex] = array[startIndex];
				array[startIndex] = temp; 
			}
		}
		else
		{
			int i = startIndex; 
			int j = medIndex+1; 
			
			int leftArray[] = new int [medIndex+1-startIndex];
			int rightArray[] = new int [endIndex-medIndex];
			
			int leftIndex = 0;
			while(i<= medIndex)
			{
				leftArray[leftIndex] = array[i];
				leftIndex++;i++;
			}
				
			int rightIndex = 0;
			while(j <= endIndex)
			{
				rightArray[rightIndex] = array[j];
				rightIndex++;j++;
			}
			
			i= startIndex; 
			rightIndex = 0;
			leftIndex = 0; 
			
			while(rightIndex < rightArray.length && leftIndex<leftArray.length)
			{
				if(rightArray[rightIndex] > leftArray[leftIndex])
				{
					array[i] = leftArray[leftIndex];
					leftIndex++; 
				}
				else
				{
					array[i] = rightArray[rightIndex];
					rightIndex++;
				}
				i++;
			}
			
			while(rightIndex<rightArray.length)
			{
				array[i] = rightArray[rightIndex];
				rightIndex++;
				i++;
			}
			
			while(leftIndex<leftArray.length)
			{
				array[i] = leftArray[leftIndex];
				leftIndex++;
				i++;
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		NonRepeatingElement element = new NonRepeatingElement(); 
	}
}
