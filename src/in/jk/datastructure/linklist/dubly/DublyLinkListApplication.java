package in.jk.datastructure.linklist.dubly;

import in.jk.datastructure.linklist.dubly.LinkList.Node;


public class DublyLinkListApplication {
	
	public static void main(String[] args) {
		
		LinkList linkList = new LinkList();
		
		linkList.add(1);
		linkList.add(3);
		linkList.append("jk");
		linkList.add("8");
		linkList.add("7");
		linkList.add("10");
		
		
		Node head = linkList.head;
		while (head!=null) {
			
		//System.out.print(head.data+" ");
		head= head.nextNode;
			
		}
		
		LinkList linkList1 = new LinkList();

		linkList1.add(1);
		linkList1.add(3);
		linkList1.append("jk");
		linkList1.add("8");
		linkList1.add("7");
		linkList1.add("10");
		
		linkList1.remove("8");
		
		Node node = linkList1.head;
		
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.nextNode;

		}

		
		//System.out.println(linkList.contains("jk"));
		//System.out.println(linkList.contains("jk1"));
		
		
	}

}
