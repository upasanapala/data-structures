package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DetectLoop {
	
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
		DetectLoop linkedList = new DetectLoop();
		linkedList.push(20);
		linkedList.push(4);
		linkedList.push(15);
		linkedList.push(10);
		linkedList.push(4);
		
		linkedList.head.next.next.next.next = linkedList.head;
		
		if(detectLoop(head))
			System.out.println("Loop detected");
		else
			System.out.println("No loop");
		

	}
	public static void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public static Boolean detectLoop(Node n) {
		
		
		 HashSet<Node> set = new HashSet<Node>();
	        
	        while(n!=null) {
	            if(set.contains(n))
	            return true;
	            else
	            {
	                set.add(n);
	                n = n.next;
	            }

	        }
	        return false;	
	}

}
