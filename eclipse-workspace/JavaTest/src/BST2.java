import java.util.*;

public class BST2 {
	Node7 root; 
	Node7 focusNode;
	Queue<Integer> queue = new LinkedList<>();
	Deque<Integer> stack = new ArrayDeque<>();
	
	BST2()
	{
		
	}
	
	//this tree does NOT rebalance itself yet 
	void addToTree(int key)
	{
		Node7 newNode = new Node7(key); 
		
		if(root == null){
			root = newNode; 		
		}
		else {
			focusNode = root;
			
			while(true)
			{
				if(key < focusNode.key) {
					if(focusNode.leftChild == null) {
						focusNode.leftChild = newNode;
						System.out.println("Added Left Child: " +focusNode.leftChild.key);
						return;
					} 
					else{
						System.out.println("focusNodeLeftChild");
						focusNode = focusNode.leftChild; 
					}
				}
				else {
					if(focusNode.rightChild == null) {
						focusNode.rightChild = newNode; 
						System.out.println("Added Right Child " +focusNode.rightChild.key);
						return;
					}
					else{
						System.out.println("focusNodeRightChild");
						focusNode = focusNode.rightChild;
					}
				}
				
			}
		}	
	}
	
	void printTree() {
		focusNode = root; 
		if (focusNode == null) {
			System.out.println("Nothing to print"); return; 
		}
		else{
			queue.add(focusNode.key);
			System.out.println("BFS:");
			printTreeBFS(focusNode); 
			System.out.println();
			System.out.println("DFS In Order:");
			printTreeDFSInOrder(focusNode);
		}
	}
	
	void printTreeBFS(Node7 focusNode) {

		if(queue.isEmpty()) return;
		//print the root
		int val = queue.remove();
		System.out.print(val + " ");
		
		if(focusNode.leftChild != null) {queue.add(focusNode.leftChild.key);}		
		if(focusNode.rightChild != null) {queue.add(focusNode.rightChild.key);}
		
		if(focusNode.leftChild != null) {
			printTreeBFS(focusNode.leftChild);
		}
		
		if(focusNode.rightChild != null) {
			printTreeBFS(focusNode.rightChild);
		}
	}
	
	void printTreeDFSInOrder(Node7 focusNode)
	{
		//check if current node is null yes return
		if(focusNode == null) return;
		//if no, push to stack
		else {
			stack.push(focusNode.key);
			//check left child 
			if(focusNode.leftChild != null) printTreeDFSInOrder(focusNode.leftChild);
			//pop itself from stack
			System.out.print(stack.pop()+" ");
			//check right child
			if(focusNode.rightChild != null) printTreeDFSInOrder(focusNode.rightChild);
		}
	}
	
	public static void main(String[] args) {
		BST2 theTree = new BST2(); 
		theTree.addToTree(4); 
		theTree.addToTree(2); 
		theTree.addToTree(6); 
		theTree.addToTree(1); 
		theTree.addToTree(3); 
		theTree.addToTree(5); 
		theTree.addToTree(7); 
		theTree.printTree();
	}
}

class Node7 {
	int key;
	Node7 leftChild; 
	Node7 rightChild; 
	
	Node7(int key)
	{
		this.key = key;
	}
}