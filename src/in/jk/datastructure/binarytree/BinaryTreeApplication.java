package in.jk.datastructure.binarytree;

import in.jk.datastructure.binarytree.Node;

public class BinaryTreeApplication {
	
	public static void main(String[] args) {
		
	
	BinaryTree binaryTree = new BinaryTree();
	Node node = new Node(10); 
	node.leftNode = new Node(11);
	node.rightNode = new Node(12);
	
	binaryTree.add(node, 15);
	binaryTree.add(node, 16);
	binaryTree.add(node, 20);
	binaryTree.add(node, 21);
	binaryTree.add(node, 30);
	binaryTree.add(node, 40);
	binaryTree.add(node, 50);
	binaryTree.add(node, 22);
	binaryTree.inOrderTraversal(node);
    System.out.println();
    
    
	BinaryTree binaryTree1 = new BinaryTree();
	binaryTree1.add(10);
	binaryTree1.add(11);
	binaryTree1.add(12);
    binaryTree1.add(15);
    binaryTree1.add(16);
    binaryTree1.add(20);
    binaryTree1.add(21);
    binaryTree1.add(40);
    binaryTree1.add(50);
    binaryTree1.add(60);
    binaryTree1.add(70);
    binaryTree1.add(25);
    binaryTree1.add(30);
    binaryTree1.add(100);
    binaryTree1.add(101);
    binaryTree1.add(102);
//	
	
	binaryTree1.inOrderTraversal();
	
	System.out.println();
	
	binaryTree1.inOrderTraversal1();
	
	}

}
