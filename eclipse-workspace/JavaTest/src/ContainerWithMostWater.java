/*
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate 
 * (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) 
 * and (i, 0). Find two lines, which together with x-axis forms a container, such that the \
 * container contains the most water.

Note: You may not slant the container and n is at least 2.


 */
public class ContainerWithMostWater {
	public ContainerWithMostWater(int[] height)
	{
		int i = 0;
		int area = 0;
		
		int j = height.length-1; 
		while(true)
		{
			area = Math.min(height[i], height[j])*(j-i);
			System.out.println(area + " "+ i + " "+j );
			if((height[i+1]>height[i] || height[j-1]>height[j]) && i<j)
			{
				//if neighbouring height is greater than the current height, move
				if(height[i+1]>height[i])
					i++;
				else if (height[j-1]>height[j]) 
					j--;
			}
			else
			{
				break; 
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] height = {1, 2, 7, 4, 5, 8, 2};
		ContainerWithMostWater container = new ContainerWithMostWater(height); 
	}
}
