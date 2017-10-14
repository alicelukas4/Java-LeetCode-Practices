
public class IsNumeric {

	public IsNumeric(String string)
	{
		boolean isNumeric = true; 
		char[] array = string.toCharArray();
		boolean isDecimal = false; 
		boolean isExponential = false;
		
		for(int i = 0; i<array.length; i++)
		{
			if(array[i]<'0' || array[i] > '9')
			{
				if(array[i] == '.' && !isDecimal)
				{
					//do nothing
					isDecimal = true; 
				}
				
				
				else if(array[i] == 'e' && !isExponential)
				{
					//do nothing
					isExponential = true; 
					if(i==0)
					{
						isNumeric = false; 
					}
				}
				else if(array[i] == '+' || array[i] == '-')
				{
					//do nothing 
					if(i == 0) {}
					else if (i>0 && array[i-1] == 'e') {}
					else
					{
						isNumeric = false;
					}
				}
				else 
				{
					isNumeric = false; 
				}
			}
			
		}
		System.out.println(string + " "+isNumeric);
	}
	
	public static void main(String[] args) {
		IsNumeric isNumeric = new IsNumeric("3");
		IsNumeric isNumeric1 = new IsNumeric("3.4");
		IsNumeric isNumeric2 = new IsNumeric("3..5");
		IsNumeric isNumeric3 = new IsNumeric("+");
		IsNumeric isNumeric4 = new IsNumeric("+3");
		IsNumeric isNumeric5 = new IsNumeric("+-3");
		IsNumeric isNumeric6 = new IsNumeric("+3e+2");

	}
}
