package in.jk.datastructure.linklist.dubly;

import java.util.LinkedList;

public class LinkList {

	Node head;

	class Node {

		Object data;
		Node nextNode;
		Node previousNode;

		public Node(Object data) {

			this.data = data;
		}
	}

	// Add object to list
	public void add(Object data) {

		Node newNode = new Node(data);
		newNode.nextNode = head;
		newNode.previousNode = null;

		if (head != null) {
			head.previousNode = newNode;
		}
		head = newNode;

	}

	// Append an object in list
	public void append(Object data) {

		Node newNode = new Node(data);
		Node lastNode = head;
		newNode.nextNode = null;

		if (head == null) {

			head = newNode;
			newNode.previousNode = null;
			return;
		}

		while (lastNode.nextNode != null) {
			lastNode = lastNode.nextNode;

		}
		lastNode.nextNode = newNode;
		newNode.previousNode = lastNode;
	}

	public void remove(Object data) {

		Node deleteNode = new Node(data);
		Node current = head;
		Node priviousNode = null;

		if (current != null && current.equals(deleteNode)) {
			head = null;
			return;
		}

		while (current != null && !current.equals(deleteNode)) {

			System.out.println("Not Matched :: "+current.data +" "+deleteNode.data);
			priviousNode = current;
			current = current.nextNode;

		}

		if (current == null) {
			System.out.println("NoSuchElement found in List ");
			return;
		}

		priviousNode.nextNode = current.nextNode;

	}

	public boolean contains(Object data) {

		Node node = head;

		while (node != null) {

			if (node.data == data) {

				return Boolean.TRUE;
			}
			
			node = node.nextNode;

		}

		return Boolean.FALSE;

	}

}
