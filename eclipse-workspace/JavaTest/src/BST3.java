import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BST3 {

	Node8 root; 
	Queue<Integer> que = new LinkedList<>();
	Deque<Integer> stack = new ArrayDeque<>();
	
	BST3(){
		root = null; 
	}
	
	void addToTree(int key)
	{
		Node8 newNode = new Node8(key);
		Node8 focusNode = root;
		
		if(root == null)
		{
			root = newNode;
			return; 
		}
		
		while (true)
		{
			if(key<focusNode.key)
				if(focusNode.leftChild == null) {focusNode.leftChild = newNode; return; }
				else {focusNode = focusNode.leftChild; }
			else
				if(focusNode.rightChild == null) {focusNode.rightChild = newNode; return; }
				else {focusNode = focusNode.rightChild; }
		}
	}
	
	void printBFS ()
	{
		System.out.println("\nBFS");
		if(root == null) {System.out.println("No tree to print"); return;}
		que.add(root.key);
		printBFS (root);
	}
	
	void printBFS (Node8 focusNode)
	{
		System.out.print(que.remove()+" ");
		if(focusNode.leftChild != null)que.add(focusNode.leftChild.key);
		if(focusNode.rightChild != null)que.add(focusNode.rightChild.key);
		
		if(focusNode.leftChild != null) printBFS(focusNode.leftChild);
		if(focusNode.rightChild != null)printBFS(focusNode.rightChild);
	}
		
	void printDFSPreorder ()
	{
		System.out.println("\nDFSPreorder");
		if(root == null) {System.out.println("Nothing to print"); return;}
		printDFSPreorder(root); 
	}
	
	void printDFSPreorder (Node8 focusNode)
	{
		stack.push(focusNode.key);
		
		System.out.print(stack.pop()+" ");
		if(focusNode.leftChild != null) printDFSPreorder(focusNode.leftChild);
		if(focusNode.rightChild != null) printDFSPreorder(focusNode.rightChild);
	}
	
	void printDFSInorder()
	{
		System.out.println("\nDFSInOrder");
		if(root == null) {System.out.println("Nothing to print"); return; }
		printDFSInorder(root);
	}
	
	void printDFSInorder(Node8 focusNode)
	{
		stack.push(focusNode.key);
		if(focusNode.leftChild != null) printDFSInorder(focusNode.leftChild);
		System.out.print(stack.pop() + " ");
		if(focusNode.rightChild != null) printDFSInorder(focusNode.rightChild);
	}
	
	public static void main(String[] args) {
		BST3 theTree = new BST3(); 
		theTree.addToTree(3);
		theTree.addToTree(2);
		theTree.addToTree(4);
		theTree.addToTree(1);
		theTree.printBFS();
		theTree.printDFSPreorder();
		theTree.printDFSInorder();
	}
}

class Node8 {
	int key; 
	Node8 leftChild; 
	Node8 rightChild; 
	
	Node8(int key)
	{
		this.key = key; 	
	}
}
