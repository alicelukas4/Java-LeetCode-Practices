/*Given some resources in the form of linked list you have to canceled out all the resources whose sum up to 0(Zero) and return the remaining list. 

E.g-->> 6 -6 8 4 -12 9 8 -8 

the above example lists which gets canceled : 
6 -6 
8 4 -12 
8 -8 
o/p : 9 
case 3 : 4 6 -10 8 9 10 -19 10 -18 20 25 
O/P : 20 25
*/


public class stack {

	Node3 bottom; 
	Node3 top; 
	boolean stall = true; 
	int sum = 0; 
	int array[]; 
	
	public stack()
	{
		bottom = null; 
		top = null; 
	}
	
	public static void main(String args[])
	{
		stack s = new stack();
		s.push(6);
		s.push(-6);
		s.push(8);
		s.push(4);
		s.push(-12);
		s.push(9);
		s.push(8);
		s.push(-8);
	}
	
	public void checkSum()
	{
	

	}
	
	public void viewStack()
	{
		Node3 currentNode = bottom; 
		while(currentNode != null)
		{
			System.out.print(currentNode.key + ",");
			currentNode = currentNode.next; 
		}
		System.out.print("\n");
	}
	
	public void push(int val)
	{
		Node3 newNode = new Node3(val);
		if(bottom == null)
		{
			bottom = newNode; 
			top = newNode; 
		}
		else
		{
			top.next = newNode; 
			top = top.next; 
		}
		System.out.println("push" + top.key);
	}
	
	public void pop()
	{
		Node3 current = bottom; 
		Node3 prev = bottom; 
		
		if(current == null)
		{
			System.out.println("nothing to pop");
			top = null; 
			bottom = null; 
			return;
		}
		else if(current.next == null)
		{
			System.out.println("pop" + current.key);
			top = null; 
			bottom = null; 
			return;
		}
		else 
		{
			while(current.next != null)
			{
				
				if(stall == true)
				{
					stall = false;
				}
				else
				{ 
					prev = prev.next;
				}
				current = current.next; 
			}
			
			prev.next = null; 
			top = prev;
			current = prev; 
			stall = true;
			
			System.out.println("pop! top =" + top.key);
			
		}
		
	}
	
	public int peek()
	{
		return top.key; 
	}
}

class Node3
{
	int key; 
	Node3 next; 
	
	Node3 (int k)
	{
		this.key = k;
	}
}
