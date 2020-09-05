package in.jk.datastructure.binarysearchtree;

public class BinarySearchTreeApplication {
	
	public static void main(String[] args) {
		
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		binarySearchTree.add(10);
		binarySearchTree.add(20);
		binarySearchTree.add(1);
		binarySearchTree.add(5);
		binarySearchTree.add(4);
		binarySearchTree.add(15);
		binarySearchTree.add(7);
		binarySearchTree.add(25);
		binarySearchTree.add(3);
		binarySearchTree.add(30);
		binarySearchTree.add(35);
		binarySearchTree.inOrderTraversal();
		
		System.out.println();
		
		binarySearchTree.remove(25);
		binarySearchTree.inOrderTraversal();
		
		
		
	}

}
