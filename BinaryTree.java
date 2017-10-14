
public class BinaryTree {

	Node2 root; 
	
	public void addNode(int value, String Name)
	{
		Node2 newNode = new Node2(value, Name);
		if(root == null)
		{
			root = newNode; 
		}
		else
		{
			Node2 focusNode = root; 
			Node2 parent; 
			
			//add node 
			while(true)
			{
				parent = focusNode;
				if(value < focusNode.value)
				{
					focusNode = focusNode.leftChild; 
					
					if(focusNode == null)
					{
						parent.leftChild = newNode; 
						return;
					}
					
				}
				else
				{
					focusNode = focusNode.rightChild; 
					
					if(focusNode == null)
					{
						parent.rightChild = newNode; 
						return;
					}
				}
			}
		}
		
	}
	
	public void inOrderTraverse (Node2 focusNode)
	{
		if(focusNode != null)
		{
			inOrderTraverse(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverse(focusNode.rightChild);
		}
	}
	
	public void preOrderTraverse (Node2 focusNode)
	{
		if(focusNode != null)
		{
			System.out.println(focusNode);
			preOrderTraverse(focusNode.leftChild);
			preOrderTraverse(focusNode.rightChild);
		}
	}
	
	public void postOrderTraverse (Node2 focusNode)
	{
		if(focusNode != null)
		{
			postOrderTraverse(focusNode.leftChild);
			postOrderTraverse(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
	 
	public Node2 findKey (int key)
	
	{
		Node2 focusNode = root; 
		
		while(key != focusNode.value)
		{
			if(key < focusNode.value)
			{
				focusNode = focusNode.leftChild; 
			}
			else
			{
				focusNode = focusNode.rightChild;
			}
			
			if(focusNode == null)
			{
				return null; 
			}
		}
		
		return focusNode; 
	}
	
	public static void main (String args[])
	{
		BinaryTree theTree = new BinaryTree(); 
		theTree.addNode(10, "Alice");
		theTree.addNode(50, "Alice5");
		theTree.addNode(80, "Alice8");
		theTree.addNode(20, "Alice2");
		
		System.out.println("\nInOrder:");
		theTree.inOrderTraverse(theTree.root);
		
		System.out.println("\nPreOrder:");
		theTree.preOrderTraverse(theTree.root);
		
		System.out.println("\nPostOrder:");
		theTree.postOrderTraverse(theTree.root);
		
		System.out.println("\nFind Tree:");
		System.out.println(theTree.findKey(50));
	}
}

class Node2 {
	int value; 
	String Name;
	
	Node2 leftChild; 
	Node2 rightChild; 
	
	Node2 (int x, String y)
	{
		this.value = x; 
		this.Name = y; 
	}
	
	public String toString()
	{
		return Name + "has a value" + value; 
	}
	
}