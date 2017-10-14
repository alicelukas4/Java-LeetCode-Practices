

public class passByValue {

	public static void main (String args[])
	{
		int number = 3; 
		printNext(number); 
		System.out.println("number inside main" + number);
	}

	public static void printNext(int number) {
		// TODO Auto-generated method stub
		number++;
		System.out.println("number inside printNext" + number);
	}
	
	
}
