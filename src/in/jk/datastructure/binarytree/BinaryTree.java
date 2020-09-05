package in.jk.datastructure.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	
	Object data;
	Node leftNode;
	Node rightNode;
	
	public Node(Object data) {
		this.data =data;
	}
	
}


public class BinaryTree {
	
	private Node root; 
	private Node temp=root; 
	
	
	
	public void inOrderTraversal(Node node) {
		
		if(node==null) {
			return;
		}
		
		inOrderTraversal(node.leftNode);
		System.out.print(node.data +" ");
		inOrderTraversal(node.rightNode);
	}
	
	
    public void inOrderTraversal() {
		
		if(temp==null) {
			return;
		}
		
		inOrderTraversal(temp.leftNode);
		System.out.print(temp.data +" ");
		inOrderTraversal(temp.rightNode);
	}
	
public void inOrderTraversal1() {
		
	//System.out.println("Root ::"+root);

		if(root==null) {
			return;
		}
		
		inOrderTraversal(root.leftNode);
		System.out.print(root.data +" ");
		inOrderTraversal(root.rightNode);
	}
	
	
	public void add(Object object) {
		
		if(root==null) {
			root=new Node(object);
			return;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			
			temp = queue.peek();
			System.out.println(temp.data);
			queue.remove();
			
			if(temp.leftNode==null) {
				temp.leftNode = new Node(object);
				queue.clear();
				break;
			}else {
				queue.add(temp.leftNode);// 11
			}
			
			if(temp.rightNode==null) {
				temp.rightNode = new Node(object);
				queue.clear();
				break;
			}else {
				queue.add(temp.rightNode); //12
			}
			
		}
		
	}
	
	
    public void add(Node node ,Object object) {
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		
		while (!queue.isEmpty()) {
			
			node = queue.peek();
			queue.remove();
			
			if(node.leftNode==null) {
				node.leftNode = new Node(object);
				
				break;
			}else {
				queue.add(node.leftNode);
			}
			
			if(node.rightNode==null) {
				node.rightNode = new Node(object);
				//queue.clear();
				break;
			}else {
				queue.add(node.rightNode);
			}
			
		}
		
	}


	public Node getRoot() {
		return root;
	}


	public void setRoot(Node root) {
		this.root = root;
	}
	
	
	
	

}
