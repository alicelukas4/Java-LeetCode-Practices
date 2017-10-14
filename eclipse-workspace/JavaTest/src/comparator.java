import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Write a Comparator in Java to compare two employees based upon there name, departments and age?
Read more: http://www.java67.com/2012/08/10-java-coding-interview-questions-and.html#ixzz4nrt5kjZq*/

public class comparator implements Comparator<comparator>{
	
    public String name; 
    public String department;  
    public int age; 
		 
	public comparator()
	{
		
	}
	
	comparator(String n, String d, int a) {
		name = n;
		department = d;
		age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	   // Overriding the compareTo method
	   public int compareTo(comparator d) {
	      return (this.name).compareTo(d.name);
	   }
	
	   // Overriding the compare method to sort the age 
	   public int compare(comparator d, comparator d1) {
	      return d.age - d1.age;
	   }
	
	public static void main(String args[])
	{
		ArrayList<comparator> list = new ArrayList<comparator>();
		list.add(new comparator("Casey", "electrical", 35));
		list.add(new comparator("Alice", "computer", 33));
		//Collections.sort(list);
	
		for(comparator a: list)   // printing the sorted list of names
	         System.out.println(a.getName() + ", " + a.getAge() );
		
	}

}
