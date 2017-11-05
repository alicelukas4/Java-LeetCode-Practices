

/*
 * Given a linked list, remove the nth node from the end of list and 
 * return its head.

For example, Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */
public class RemoveNthNodeFromEndofList 
{

	Node6 headNode = null;
	Node6 currentNode = null;
	Node6 nthNodeFromEndOfList = null;  
	
	
	RemoveNthNodeFromEndofList()
	{
		
	}
	
	public void add(int x)
	{
		Node6 newNode = new Node6(x);
		if(headNode == null)
		{
			headNode = newNode;
			currentNode = headNode; 
		}
		else
		{
			currentNode.next = newNode; 
			currentNode = currentNode.next; 
		}
	}

	public void removeNthNode(int n)
	{
		int counter = 1; 
		currentNode = headNode; 
		nthNodeFromEndOfList = headNode; 
		
		while(currentNode != null)
		{
			if(counter>n && currentNode.next !=null)
			{
				nthNodeFromEndOfList = nthNodeFromEndOfList.next; 
			}
			currentNode = currentNode.next;
			counter++; 
		}
		System.out.println(nthNodeFromEndOfList.val);
		
		//remove the nth element
		nthNodeFromEndOfList.next = nthNodeFromEndOfList.next.next; 
	}

	public static void main(String[] args) 
	{
		RemoveNthNodeFromEndofList list = new RemoveNthNodeFromEndofList(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.removeNthNode(2);
		
		for(list.currentNode = list.headNode; list.currentNode != null; list.currentNode = list.currentNode.next)
		{
			System.out.println(list.currentNode.val);
		}

	}
	
	class Node6 
	{
		int val; 
		Node6 next; 
		Node6(int x) { val = x; }	
	}
}
