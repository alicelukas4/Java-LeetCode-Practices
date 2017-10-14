import java.util.Scanner;

public class convertIntToBinary {
	static Scanner userInput = new Scanner(System.in);
	static int value = 0; 
	static int remainder[] = new int[100]; 
	static int i = 0;
	
	convertIntToBinary()
	{
		while(value > 1)
		{
			remainder[i] = value %2; 
			value = value/2;
			i++; 
		}
		remainder[i] = value; 
	}
	
	public static void main(String args[])
	{
		
		System.out.println("Please enter int to be converted to binary:");
        if(userInput.hasNextLine())
        {
        	value = Integer.parseInt(userInput.nextLine());
        } 
        convertIntToBinary x = new convertIntToBinary();
        while(i>=0)
        {
        	System.out.println(convertIntToBinary.remainder[i]);
        	i--; 
        }
        
	}
}
