package in.jk.datastructure.linklist.singular;

import in.jk.datastructure.linklist.singular.LinkList.Node;

public class LinkListApplication {

	public static void main(String[] args) {

		LinkList linkList = new LinkList();

		linkList.add(1);
		linkList.add(3);
		linkList.append("jk");
		linkList.add("8");
		linkList.add("7");
		linkList.add("10");

		Node node = linkList.head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.nextNode;

		}

		System.out.println();
		linkList.remove("8");

		Object obj = linkList.get(3);
		System.out.println(obj);
		boolean isPresent = linkList.contains("jk");
		System.out.println(isPresent);
        int size = linkList.size();
		System.out.println(size);
        System.out.println();
		node = linkList.head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.nextNode;

		}
		System.out.println();
		System.out.println();
		
		
		LinkList linkList1 = new LinkList();

		linkList1.add(1);
		linkList1.add(3);
		linkList1.append("jk");
		linkList1.add("8");
		linkList1.add("7");
		linkList1.add("10");
		
		linkList1.remove("8");
		
		node = linkList1.head;
		
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.nextNode;

		}

	}

}
