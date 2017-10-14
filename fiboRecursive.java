
public class fiboRecursive {

	public fiboRecursive(int n)
	{
		int res = fiboRecursive1(n); 
		System.out.println("res" + res); 

	}
	
	public int fiboRecursive1(int n)
	{
		if(n>1)
			return n*fiboRecursive1(n-1); 
		else 
			return n;
	}
	
	public static void main (String args[])
	{
		System.out.println("Running fibo"); 
		int n = 5; 
		fiboRecursive x = new fiboRecursive(n); 
	}
}
