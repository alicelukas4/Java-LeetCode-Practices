
public class ArmstrongNumber {

	ArmstrongNumber()
	{
		for(int i =0; i<1000; i++)
		{
			//modulus 100, 10, 1
			int digits_hundreds = i/100; 
			int r = i%100;
			int digits_tenth = r/10; 
			r = i%10;
			int digits_oneth = r; 
			
			if( i == digits_hundreds*digits_hundreds*digits_hundreds + digits_tenth*digits_tenth*digits_tenth + digits_oneth*digits_oneth*digits_oneth)
				System.out.println(digits_hundreds + "" + digits_tenth + "" + digits_oneth);
		}
	}
	public static void main(String args[])
	{
		ArmstrongNumber x = new ArmstrongNumber(); 
	}
}
