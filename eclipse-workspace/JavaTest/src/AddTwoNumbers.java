/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

/**
 * Definition for singly-linked list.
 * 
 */

public class AddTwoNumbers {
	
	
	public void addTwoNumbers1() {
		//set up linkedlist 
		ListNode l1 = new ListNode(2); 
		ListNode l2 = new ListNode(4); 
		ListNode l3 = new ListNode(3); 
		l1.next = l2;
		l2.next = l3; 
		l3.next = null; 
		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(6); 
		ListNode l6 = new ListNode(4); 
		l4.next = l5;
		l5.next = l6; 
		l6.next = null;
		ListNode dummyHead = new ListNode(0);
        int carry = 0; 
        ListNode p = l1, q = l4, result = dummyHead, tmp; 
        
        
        while(p !=null || q != null)
        {
        	int x = (p != null) ?p.val: 0;
        	int y = (q != null) ?q.val: 0;
        	int res = (x + y + carry)%10;
        	tmp = new ListNode(res);
        	carry = (x + y + carry)/10;
        	
        	tmp.next = result.next;  
        	result.next = tmp;
        	System.out.println(x +" "+y +" "+tmp.val);
        	p = p.next; 
        	q = q.next; 
        }

        if(carry>0)
        {
        	tmp = new ListNode (carry);
        	tmp.next = result.next; 
        	result.next = tmp; 
        	System.out.println(tmp.val);
        }
        //return result; 
        while (dummyHead.next != null )
        {
        	System.out.println("d"+dummyHead.next.val);
        	dummyHead.next = dummyHead.next.next; 
        }
    }

	public class ListNode {
		 int val;
		 ListNode next;
	     ListNode(int x) { val = x; }
	}
	public static void main(String[] args)
	{
		AddTwoNumbers x = new AddTwoNumbers(); 
		x.addTwoNumbers1();
	}
	private void addTwoNumbers() {
		// TODO Auto-generated method stub
		
	}
}
