package Tree;

class Node {
	int data;
	Node left, right;
	Node(int d) {
		data =d;
		left = right = null;
	}
}
public class CheckBST {
	static Node root;
	

	public static void main(String[] args) {
		CheckBST tree = new CheckBST();
		tree.root = new Node(4); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(5); 
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(3); 
  
        if(isBST(root))
        	System.out.println("Is a BST");
        else
        	System.out.println("Not a BST");

	}
	 static boolean isBST(Node root)
     {
         // code here.
         return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
     }
     static boolean checkBST(Node root, int left, int right) {
         if(root == null){
             return true;
         }
         if(root.data < left || root.data > right) {
             return false;
         }
         return (checkBST(root.left, left, root.data-1 ) && checkBST(root.right,  root.data+1, right ));
     }

}
