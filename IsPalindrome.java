package LinkedList;

import java.util.Stack;

import LinkedList.DetectLoop.Node;

public class IsPalindrome {
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	static Node head;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Node one = new Node(1); 
	    Node two = new Node(3); 
	    Node three = new Node(5); 
	    Node four = new Node(3); 
	    Node five = new Node(1); 
	    one.next = two; 
	    two.next = three; 
	    three.next = four; 
	    four.next = five; 
	    if(isPalindrome(one))
	    	System.out.print("is Palindrome");
	    else 
	    	System.out.print("Not a palindrome");
	  

	}
	static boolean isPalindrome(Node head) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        boolean isPalin = true;
        Node nextNode = head;
        while(nextNode!=null) {
            stack.push(nextNode.data);
            nextNode = nextNode.next;
        }
        
        while(head!=null) {
            int element = stack.pop();
            if(head.data == element){
                isPalin = true;
            } else {
                isPalin = false;
                break;
                
            }
            head = head.next;
        }
        return isPalin;
    }    

}
