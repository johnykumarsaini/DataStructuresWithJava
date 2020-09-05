package in.jk.datastructure.linklist.singular;

public class LinkList {

	Node head;

	class Node {

		Object data;
		Node nextNode;

		public Node(Object data) {

			this.data = data;
			nextNode = null;

		}
	}

	// Adding node in list
	// adding Node in first of list

	public void add(Object obj) {

		Node newNode = new Node(obj);
		newNode.nextNode = head;
		head = newNode;
	}

	// Adding a node after a Giving node .

	public void addAfter(Node previousNode, Object data) {

		if (previousNode == null) {
			System.out.println("Previous Node is null . Can not be null .");
			return;
		}

		Node newNode = new Node(data);
		newNode.nextNode = previousNode.nextNode;
		previousNode.nextNode = newNode;

	}

	// Add node in the end of list

	public void append(Object data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = new Node(data);
			return;
		}
		newNode.nextNode = null;

		Node lastNode = head;
		while (lastNode.nextNode != null) {
			lastNode = lastNode.nextNode;
			lastNode.nextNode = newNode;
			return;

		}

	}

	// Get list element by index position
	public Object get(int index) {

		Node node = head;
		int listIndex = 0;

		while (node != null) {
			if (index == listIndex) {
				return node.data;
			} else {

				listIndex++;
				node = node.nextNode;
			}
		}

		return null;

	}

	// Check presence of element .
	public boolean contains(Object input) {

		Node node = head;

		while (node != null) {
			if (input.equals(node.data)) {
				return Boolean.TRUE;
			} else {

				node = node.nextNode;
			}
		}

		return Boolean.FALSE;

	}

	// delete a node from list
	public void remove(Object obj) {

		Node temp = head;
		Node previousNode = null;

		if (temp != null && temp.data == obj) {

			head = temp.nextNode;
			return;
		}

		while (temp != null && temp.data != obj) {

			previousNode = temp;
			temp = temp.nextNode;

		}

		if (temp == null) {
			System.out.println("No Such Element in list");
			return;
		}
        System.out.println(temp.data);
		System.out.println(temp.data != obj);
		previousNode.nextNode = temp.nextNode;

	}

	public int size() {

		int size = 0;

		Node temp = head;

		while (temp != null) {

			size++;
			temp = temp.nextNode;

		}

		return size;
	}

}
