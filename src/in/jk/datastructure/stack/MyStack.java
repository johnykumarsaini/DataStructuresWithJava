package in.jk.datastructure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

	private Queue<Object> firstQueue = new LinkedList<Object>();
	private Queue<Object> secondQueue = new LinkedList<Object>();
	private int size;

	public Object pop() {

		if (firstQueue.isEmpty()) {
			return null;
		}

		Object output = firstQueue.peek();
		return output;

	}

	public void push(Object object) {

		secondQueue.add(object);
		size++;

		// Move All First queue element to second queue
		while (!firstQueue.isEmpty()) {

			secondQueue.add(firstQueue.peek());
			firstQueue.remove();

		}

		Queue<Object> queue = firstQueue;
		firstQueue = secondQueue;
		secondQueue = queue;

	}

	public void remove() {

		if (firstQueue.isEmpty()) {
			return;
		}

		firstQueue.remove();
		size--;
	}

	public int size() {

		return size;

	}

}
