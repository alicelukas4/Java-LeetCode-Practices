import java.util.Stack;

/*
 * Design a Data Structure SpecialStack that supports all the stack operations like push(), 
 * pop(), isEmpty(), isFull() and an additional operation getMin() which should return 
 * minimum element from the SpecialStack. All these operations of SpecialStack must be O(1). 
 * To implement SpecialStack, you should only use standard Stack data structure and no other 
 * data structure like arrays, list, .. etc.

Example:

Consider the following SpecialStack
16  --> TOP
15
29
19
18

When getMin() is called it should return 15, which is the minimum 
element in the current stack. 

If we do pop two times on stack, the stack becomes
29  --> TOP
19
18

When getMin() is called, it should return 18 which is the minimum 
in the current stack.
 */
public class SpecialStackDataStructure extends Stack<Integer> {

	Stack<Integer> stack= new Stack<Integer>(); 
	Stack<Integer> minStack= new Stack<Integer>(); 
	
	public void push(int x){
		if (stack.size()==0) 
		{
			stack.push(x);
			minStack.push(x);
		}
		else 
		{
			stack.push(x);
			if(x>minStack.peek())
				minStack.push(minStack.peek());
			else
				minStack.push(x);
		}
		
	}
	
	public Integer pop(){
		if (stack.size()==0) 
		{
			return 0; 
		}
		else {
			Integer x = stack.pop();
			minStack.pop(); 
			return x;
		}
	}
	
	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	public boolean isFull() {
		return false;
	}
	
	public int getMin() {
		if(stack.size()==0) 
			return 0;
		else 
			return minStack.peek();
	}
	
	public static void main(String[] args) {
		SpecialStackDataStructure stack = new SpecialStackDataStructure(); 
		stack.push(5);
		stack.pop();
		stack.push(3);
		stack.push(7);
		System.out.println(stack.getMin());
	}
}
