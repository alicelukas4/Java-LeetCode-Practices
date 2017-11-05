/*
 * 
t0 -> 0
t100 -> 100

s1 = [5, 10, 25, 37, 68]
s2 = [11, 27, 45, 67, 89]
s3 = [10, 28, 39, 53, 67, 99]

(starting time, ending time) => ending - starting = interval
Find the smaller interval (starting time, ending time)
*/


public class FindMinimumInterval {
	
	public int[] findMinMaxAndLowestValueSensors(int[] s1, int[]s2, int[]s3, int index_s1, int index_s2, int index_s3)
	{
		int min=1000; 
		int max=0; 
		int sensorWithLowestValue = 0; 
		
		int[] results = new int[3]; 
		
		for(int i = 0; i < 3; i++)
		{
			//find min
			if(s1[index_s1] < min)
			{
				min = s1[index_s1];
				sensorWithLowestValue = 1; 
			}
			if(s2[index_s2] < min)
			{
				min = s2[index_s2]; 
				sensorWithLowestValue = 2;
			}
			if(s3[index_s3] < min)
			{	
				min = s3[index_s3]; 
				sensorWithLowestValue = 3;
			
			}
			
			//find max
			if(s1[index_s1] > max)
				max = s1[index_s1];
			if(s2[index_s2] > max)
				max = s2[index_s2]; 
			if(s3[index_s3] > max)
				max = s3[index_s3];
		}
		results[0] = min; 
		results[1] = max; 
		results[2] = sensorWithLowestValue; 
		return results;
	}
	
	public int findLowestInterval(int[]s1, int[]s2, int[]s3)
	{
		//declaration
		int min = 0; 
		int	max = 0; 
		int index_s1 = 0; 
		int index_s2 = 0; 
		int index_s3 = 0; 
		int sensor = 0; 
		int index_int = 0; 
		int interval[] = new int [100];
		int s1_smallestInterval[] = new int [100]; 
		int s2_smallestInterval[] = new int [100];  
		int s3_smallestInterval[] = new int [100]; 
		
		if(s1 == null || s2 == null || s3 == null)
		{
			System.out.println("no sensor data available");
			return 0;
		}
		
		while(index_s1< s1.length && index_s2< s2.length && index_s3< s3.length  )
		{	
			int[] results = findMinMaxAndLowestValueSensors(s1, s2, s3, index_s1, index_s2, index_s3); 
		    min = results[0];
		    max = results[1]; 
		    
		    interval[index_int] = max - min; 
		    s1_smallestInterval[index_int] = index_s1; 
		    s2_smallestInterval[index_int] = index_s2;  
		    s3_smallestInterval[index_int] = index_s3;
		    
		    sensor = results[2];
		    if(sensor == 1)index_s1++; 
		    else if (sensor == 2)index_s2++;
		    else if (sensor == 3)index_s3++;
		    
		    System.out.println(interval[index_int]+" " + s1_smallestInterval[index_int] + " " + s2_smallestInterval[index_int] + " " + s3_smallestInterval[index_int]);
		    index_int++; 
		}
		
		min = 1000; 
		//return lowest value of interval
	    for(int i = 0; i<interval.length; i++)
	    {
	    	if(interval[i]<min && interval[i] != 0) {
	    		min = interval[i];
	    	};
	    }
		return min; 
	}
	public static void main(String[] args) {
		int s1[] = {5, 10, 25, 37, 68};
		int s2[] = {11, 27, 45, 67, 89};
		int s3[] = {10, 28, 39, 53, 67, 99};
		
		FindMinimumInterval minInterval = new FindMinimumInterval();
		System.out.println("minimum interval is " + minInterval.findLowestInterval(s1, s2, s3));
	}
}
