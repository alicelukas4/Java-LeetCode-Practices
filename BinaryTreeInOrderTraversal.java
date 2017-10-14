import java.util.logging.Level;

/*
 * Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?
 */

public class BinaryTreeInOrderTraversal {

	Node4 root;
	Node4 current;
	Node4 previous; 
	
	public BinaryTreeInOrderTraversal()
	{
		root = null;
		current = root; 
		previous = root; 
	}
	
	public void addToTree(int value)
	{
		if (root == null)
		{
			root = new Node4(value); 
		}
		else
		{
			root.insert(value);
		}
	}
	
	public void deleteFromTree(int value)
	{
		if (root == null)
		{
			System.out.println("Nothing to delete");
		}
		else
		{
			root.delete(value);
		}
	}
	
	public void print()
	{
		if (root == null)
		{
			System.out.println("Nothing to print");
		}
		else
		{
			root.print();
		}
	}
	
	public void search(int value)
	{
		int depth; 
		if (root == null)
		{
			System.out.println("Nothing to search");
		}
		else
		{
			depth = root.search(value);
			System.out.println("Level " +depth); 

		}
	}
	
	
	public static void main(String[] args) {
		BinaryTreeInOrderTraversal binTree = new BinaryTreeInOrderTraversal();
		binTree.addToTree(1);
		binTree.addToTree(20);
		binTree.addToTree(3);
		binTree.addToTree(10);
		binTree.addToTree(2);
		binTree.addToTree(30);
		binTree.print();
		//binTree.search(50);
		binTree.search(10);
	}
}

class Node4{
	int key; 
	Node4 left;
	Node4 right;
	
	Node4 (int x)
	{
		this.key = x; 
	}
	
	void insert(int newValue)
	{
		if(newValue < this.key)
		{
			if(this.left == null)
			{
				this.left = new Node4(newValue);
			}
			else
			{
				this.left.insert(newValue); 
			}
		}
		else 
		{
			if(this.right == null)
			{
				this.right = new Node4(newValue);
			}
			else
			{
				this.right.insert(newValue);
			}
		}
		
	}
	
	void delete (int valueToBeDeleted)
	{
		if(valueToBeDeleted < this.key)
		{
			if(this.left == null)
			{
				System.out.println("No value found");
			}
			else 
			{
				this.left.delete(valueToBeDeleted);
			}
		}
		else if(valueToBeDeleted > this.key)
		{
			if(this.right == null)
			{
				System.out.println("No value found");
			}
			else 
			{
				this.right.delete(valueToBeDeleted);
			}
		}
		else if(valueToBeDeleted == this.key)
		{
			if(this.right == null)
			{
				//this.key = this.left.key;
				//replace with largest number from left child
				//delete largest number from left child
			}
			else
			{
				//replace with smallest number from right child
				//delete smallest number from right child
			}
		}
	}
	
	void print()
	{
		if(this.left == null)
		{
		}
		else
		{
			this.left.print();
		}
		
		System.out.println(this.key);
		
		if(this.right == null)
		{
		}
		else
		{
			this.right.print();
		}
		
	}
	
	int search(int valueToSearch)
	{
		int depth =0; 
		if(this.key != valueToSearch && this.left == null && this.right == null)
			return 0; 
		
		if(this.key == valueToSearch)
		{
			System.out.println("Found " + valueToSearch);
			return 1; 
		}
		else if(valueToSearch < this.key )
		{
			if(this.left == null)
			{
			}
			else
			{
				depth = this.left.search(valueToSearch);
			}
		}
		else if(valueToSearch > this.key)
		{
			if(this.right == null)
			{
			}
			else
			{
				depth = this.right.search(valueToSearch);
				
			}
		}
		
		if(depth > 0) depth++; 
		return depth; 
	}
}
