
public class MiddleNode {
	
	Node1 headNode;
	Node1 lastNode;
	
	public MiddleNode()
	{
		headNode = null;
		lastNode = headNode; 
	}
	
	public void addNode(int x)
	{
		if(headNode == null)
		{
			headNode = new Node1 (x);
			lastNode = headNode; 
		}
		else
		{
			lastNode.insert(x);
		}
				 
	}
	
	
	public void findMiddle()
	{
		int length = 0; 
		Node1 middleNode = headNode; 
		Node1 focusNode  = headNode; 
		System.out.println(" head"+ focusNode.key);
		
		
		while(focusNode != null)
		{
			length++;
			System.out.println(focusNode.key);
			if(length %2 == 0)
			{
				middleNode = middleNode.next; 
			}
			focusNode = focusNode.next; 
			
		}
		System.out.println(length+ " middle"+ middleNode.key);
		
	}
	
	public static void main(String args[])
	{
		MiddleNode x = new MiddleNode(); 
		x.addNode(1);
		x.addNode(2);
		x.addNode(3);
		x.addNode(4);
		x.addNode(5);
		x.addNode(6);
		x.addNode(7);
		x.addNode(8);
		x.addNode(9);
		x.findMiddle();
	}
}

class Node1{
	int key; 
	Node1 next; 
	
	Node1 (int x)
	{
		this.key = x; 
	}
	
	public void insert(int valueToInsert) {
		// TODO Auto-generated method stub
		if(this.next == null)
		{
			this.next = new Node1(valueToInsert);
		}
		else
		{
			this.next.insert(valueToInsert);
		}
	}

}