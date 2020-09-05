package in.jk.datastructure.binarysearchtree;

public class BinarySearchTree {
	
	Node root;
	
	class Node {
		
		Node leftNode;
		Node rightNode;
		int data;
		
		public Node(int data) {
			this.data =data;
		}
	}
	
	public void add(int data) {
	
		root=add(root, data);
	}
	
	
	private Node add(Node root ,int data) {
		
		if(root==null) {
			root = new Node(data);
			return root;
		}
		
		if(data<root.data) {
			root.leftNode = add(root.leftNode,data);
			
		}else if(data>root.data) {
			root.rightNode = add(root.rightNode,data);
			
		}
		return root;
		
	}
	
	
	
    
    public void remove(int data) {
    	
    	root = remove(root, data);
    	
    }
    
    private Node remove(Node root,int data) {
		
    	if(root==null) {
    		return root;
    	}
    	
    	if(data<root.data) {
    		root.leftNode = remove(root.leftNode, data);
    	}else if(data>root.data) {
    		root.leftNode = remove(root.leftNode, data);
    	}else {
    		
    		if(root.leftNode==null) {
    			return root.rightNode; 
    		}else if(root.rightNode==null) {
    			return root.leftNode;
    		}
    		
    		root.data = minValue(root.rightNode);
    		root.rightNode = remove(root.rightNode, data);
    	}
    	
    	
    	return root;
    	
    }
    
    private int minValue(Node root) {
    	
    	int minValue = root.data;
    	while (root.leftNode!=null) {
			
    		minValue =root.leftNode.data;
    		root = root.leftNode;
		}
		return minValue;
    }
    
    
    public  void inOrderTraversal() {
		inOrderTraversal(root);
		
	}
	
    private void inOrderTraversal(Node root) {
    	
    	
    	if(root!=null) {
    	inOrderTraversal(root.leftNode);
		System.out.print(root.data+" ");
		inOrderTraversal(root.rightNode);
    	}
	}
    

}
