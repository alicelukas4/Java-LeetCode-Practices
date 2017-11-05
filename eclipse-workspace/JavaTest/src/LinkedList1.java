//Create a Java program to find middle node of linked list in Java in one pass? 

	
public class LinkedList1 {

	public class Node
	{
		int val; 
		Node next; 
		Node(int x) { val = x; }	
	}
	
	public LinkedList1()
	{

		int length = 0; 
		Node list = new Node(1); 
		
		
		Node head = new Node(0); 
		head.next = list; 
		Node mid = head; 
		Node temp = list; 
		
		temp= new Node(2); 
    	
    	list.next = temp;
    	Node temp1 = new Node(3); 
    	
    	temp.next = temp1;
    	Node temp2 = new Node(4); 
    	
    	temp1.next = temp2;
    	Node temp3 = new Node(5); 
    
    	temp2.next = temp3;
    	Node temp4 = new Node(6); 
    
    	temp3.next = temp4;
    	Node temp5 = new Node(7); 

    	temp4.next = temp5;
    	temp5.next = null; 
    	
    	temp = head.next; 
    	while(temp!= null )
    	{
    		length++;
    		System.out.println(". " +temp.val);
    		if(length%2 == 0)
    		{
    			mid = mid.next;
    		}
    		temp = temp.next; 	
    	}
    	if(length%2 == 1)
		{
    		mid = mid.next;
		}
    	System.out.println("mid " +mid.val);
    	System.out.println("length " +length);
	}
	
	public static void main (String args[])
	{
		LinkedList1 x = new LinkedList1(); 
	}
}
