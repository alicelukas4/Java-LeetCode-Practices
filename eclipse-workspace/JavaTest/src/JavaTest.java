import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
//import java.utils.*; 

public class JavaTest {

	static Scanner userInput = new Scanner(System.in);
	int array[]; 
	int size = 0; 
	int key = 0; 
	
	public JavaTest() {	
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
        
        /*System.out.println("Please enter key to search");
        if(userInput.hasNextLine())
        {
        	key = Integer.parseInt(userInput.nextLine());
        } */
        bubblesort(); 
        stringVsStringBuffer();   
    }
	
	public void bubblesort() {
		for(int i=1; i<size; i++)
		{
			for(int j =0; j<size; j++)
			{ 
				if(array[i]-array[j] < 0)
				{
					int tmp = array[j]; 
					array[j] = array[i]; 
					array[i] = tmp; 
				}
				
			}
			for(int k=0; k<size; k++)
			{
				System.out.print(array[k]+",");
			}
			System.out.println("\n");
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.println(array[i]+",");
		}
		
	}
	
	public void stringVsStringBuffer()
	{
		StringBuffer str1 = new StringBuffer("Hello ");
		StringBuffer str2 = new StringBuffer("Lilith ");
		String str3 = new String ("Loloth ");
		String str4 = new String ("Lalath ");
		StringBuilder str5 = new StringBuilder("Luluth "); 
		str1.append(str2);
		str1.append(str3);
		System.out.println(str1);
		str3 += str4;
		System.out.println(str3);
		str5.append(str3);
		System.out.println(str5);
		str3.concat(str4); 
		System.out.println(str3);
		int i =str3.compareTo(str4);
		System.out.println(i);
		boolean comp = Objects.equals(str3, new String("Loloth Lalath ")); // --> true
		System.out.println(comp);
	}
	
	public static void main(String[] args) {
		JavaTest a = new JavaTest(); 
	}
	
}



