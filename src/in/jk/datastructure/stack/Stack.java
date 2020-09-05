package in.jk.datastructure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {

	private Queue<Object> firstQueue = new LinkedList<Object>();
	private Queue<Object> secondQueue = new LinkedList<Object>();
	private int size;

	public Object pop() {

		if (firstQueue.isEmpty()) {
			return null;
		}

		// Move firstQueue element to second queue except last element
		while (firstQueue.size() != 1) {
			secondQueue.add(firstQueue.peek());
			firstQueue.remove();
		}

		Object output = firstQueue.peek();
		firstQueue.remove();
		secondQueue.add(output);

		Queue<Object> queue = firstQueue;
		firstQueue = secondQueue;
		secondQueue = queue;

		return output;

	}

	public void push(Object object) {

		firstQueue.add(object);
		size++;

	}

	public void remove() {

		if (firstQueue.isEmpty()) {
			return;
		}

		// Move firstQueue element to second queue except last element
		while (firstQueue.size() != 1) {
			secondQueue.add(firstQueue.peek());
			firstQueue.remove();
		}

		firstQueue.remove();
		size--;

		Queue queue = firstQueue;
		firstQueue = secondQueue;
		secondQueue = queue;

	}

	public int size() {
		
		return size;

	}

}
