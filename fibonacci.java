
public class fibonacci {

	public fibonacci()
	{
		//iteration
		
		long fibo_nminus1 = 0, fibo_temp = 0; 
		long fibo_n = 1; 
		int count = 100; 
		for(int i=0; i<count; i++)
		{
			fibo_temp = fibo_n; 
			fibo_n += fibo_nminus1; 
			System.out.println(fibo_n);
			fibo_nminus1 = fibo_temp; 
		}
		
		//recursion
	}
	
	public static void main (String args[])
	{
		System.out.println("Running fibo"); 
		fibonacci x = new fibonacci(); 
	}
}
