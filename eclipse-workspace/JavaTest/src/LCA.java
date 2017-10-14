//Given an unordered binary tree and any two distinct nodes in the tree, find their common ancestor.  
public class LCA {

	Node6 root; 
	public int[] path1 = new int[20];  
	public int indexPath1 = 0;
	
	public LCA()
	{
		root = null;
	}
	
	public int findNode(Node6 root, int key)
	{
		if(root == null)
		{
			return 0;
		}
		
		path1[indexPath1++] = root.key;
		for(int i=0; i<10; i++)
		{
			System.out.print(path1[i] + " ");
		}
		System.out.println(" ");
		
		if(key < root.key)
		{
			findNode(root.left, key);
		}
		else if (key > root.key)
		{
			findNode(root.right, key);
		}
		else
		{	
			return 1; 
		}
		
		return 1; 
	}
	
	public static void main(String[] args) {
		LCA lca = new LCA();
		lca.root= new Node6(4); 
		lca.root.left= new Node6(2); 
		lca.root.right= new Node6(6); 
		lca.root.left.left= new Node6(1); 
		lca.root.left.right= new Node6(3); 
		lca.root.right.left= new Node6(5); 
		lca.root.right.right= new Node6(7); 
		
		lca.findNode(lca.root, 1); 
		lca.indexPath1 = 10; 
		lca.findNode(lca.root, 7);
		
		for(int i=0; i<10; i++)
		{
			System.out.print(lca.path1[i] + " ");
		}
		
		for(int i=0; i<10; i++)
		{
			System.out.print(lca.path1[i+10] + " ");
		}
	}
}

class Node6{
	int key; 
	Node6 left; 
	Node6 right;
	
	Node6(int key)
	{
		this.key = key; 
	}
}