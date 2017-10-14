
public class PrintLevelBST {

	Node5 root;
	
	PrintLevelBST()
	{
		root = null; 
	}
	
	public int findTreeHeight(Node5 root)
	{
		int height; 
		if (root==null)
		{
			height = 0;
		}
		else
		{
			int leftHeight = findTreeHeight(root.left);
			int rightHeight = findTreeHeight(root.right);
			height = Math.max(leftHeight+1, rightHeight+1);
		}
		
		return height;
	}
	
	public void printBSTLevelByLevel(Node5 root, int level)
	{
		if(root == null)
			return; 
		if(level == 1)
			System.out.println(root.key + " ");
		else
		{
			printBSTLevelByLevel(root.left, level-1);
			printBSTLevelByLevel(root.right, level-1);
		}
			
	}
	
	public static void main(String[] args) 
	{
		PrintLevelBST bst = new PrintLevelBST();
		bst.root = new Node5(1); 
		bst.root.left = new Node5(2); 
		bst.root.right = new Node5(3); 
		bst.root.left.left = new Node5(4); 
		bst.root.left.right = new Node5(5); 
		bst.root.right.left = new Node5(6); 
		bst.root.right.right = new Node5(7); 
		
		int height = bst.findTreeHeight(bst.root);
		System.out.println("height is "+height);
		
		for(int i = 1; i<=height; i++)
		{
			System.out.println("level " +i);
			bst.printBSTLevelByLevel(bst.root, i);
		}
	}
}

class Node5{
	int key; 
	Node5 left; 
	Node5 right; 
	
	Node5(int key)
	{
		this.key = key; 
	}
	
}
