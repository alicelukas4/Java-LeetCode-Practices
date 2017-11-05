/**
 * Convert integer to camelCase String
 * @param int value
 * @author Alice
 *
 */
public class CamelCase {
	
	public void convertToCamelCase(int value)
	{
		if(value < 0 && value > 1000000000)
		{	
			System.out.println("Out of range");
			return; 
		}
		
		int divisor = 10; 
		int number = (int) (value/divisor); 
		while(number > 10)
		{
			divisor *=10;
			number = (int) (value / divisor); 
		}
		
		while(true)
		{
			number = (int) (value/divisor); 
			printNumber(number, divisor);
			value = value % divisor; 
			if(divisor<10)
			{
				break; 
			}
			divisor /= 10; 
		}
		
	}
	private void printNumber(int number, int divisor) {
		// TODO Auto-generated method stub
		switch(number)
		{
			case 1: System.out.print("One");break; 
			case 2: System.out.print("Two");break;
			case 3: System.out.print("Three");break;
			case 4: System.out.print("Four");break;
			case 5: System.out.print("Five");break;
			case 6: System.out.print("Six");break;
			case 7: System.out.print("Seven");break;
			case 8: System.out.print("Eight");break;
			case 9: System.out.print("Nine");break;
			case 0: System.out.print("Zero");break;
		}
		
		switch(divisor)
		{
			case 100:System.out.print("Hundred");break;
			case 1000:System.out.print("Thousand");break;
			case 1000000:System.out.print("Million");break;
			case 1000000000:System.out.print("Billion");break;
				
		}
	}

	public static void main(String[] args) {
		CamelCase number = new CamelCase(); 
		number.convertToCamelCase(181234);
		
	}
}
