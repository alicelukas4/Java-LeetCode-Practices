import java.util.Scanner;

public class mergeSort {

	static Scanner userInput = new Scanner(System.in);
	int[]leftArray = new int[100];
	int[]rightArray = new int[100];
	static int[]tmp_array = new int[100];
    static int [] array;
	
	static void merge(int lo , int med, int hi)
	{
		for(int i = lo; i<= hi; i++)
		{
			tmp_array[i] = array[i]; 
		}
		
		int i = lo; 
		int j = med+1; 
		int k = lo; 
		
		while(i<=med && j<=hi)
		{
			System.out.println(i +" "+ med +" "+ j +" "+ hi); 
			if(tmp_array[i] <= tmp_array[j])
			{
				array[k] = tmp_array[i];
				System.out.println(array[k]); 
				i++; 
				k++;
			}
			else
			{
				array[k] = tmp_array[j];
				System.out.println(array[k]); 
				j++;
				k++;
			}	
		}
		
		while (i <= med) {
            array[k] = tmp_array[i];
            k++;
            i++;
        }
	}
	
	public static void main (String args[])
	{
		int size = 0; 
		
		System.out.println("Please enter array size:");
        if(userInput.hasNextLine())
        {
        	size = Integer.parseInt(userInput.nextLine());
        } 
        array = new int[size];
        for(int i=0; i<size; i++)
        {
        	System.out.println("data " + i + ":"); 
        	array[i] = Integer.parseInt(userInput.nextLine());
        } 
        mergeSort1(0, size-1); 
        for(int i=0; i<size; i++)
        {
        	System.out.println(array[i]); 
        } 
	}

	private static void mergeSort1(int lo, int hi) {
		System.out.println(lo+" "+hi);
		if(hi>lo)
		{
			int med = lo + (hi-lo)/2;
			if(med -lo >=1)
				mergeSort1(lo, med); 
			if(hi - (med+1)>=1)
				mergeSort1(med+1, hi); 
			merge(lo, med, hi);
		}
	}
}
