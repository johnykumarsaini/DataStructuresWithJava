package in.jk.datastructure.queue;

import java.util.StringJoiner;

public class Queue {

	private QueueNode frontQueueNode;
	private QueueNode rearQueueNode;

	public Queue() {

		this.frontQueueNode = null;
		this.rearQueueNode = null;
	}

	public void add(Object data) {

		QueueNode queueNode = new QueueNode(data);

		// Add node at the Front
		if (this.rearQueueNode == null) {

			this.frontQueueNode = queueNode;
			this.rearQueueNode = queueNode;
			return;

		}

		// Add the Queue in the end and the change rear
		this.rearQueueNode.nextNode = queueNode;
		this.rearQueueNode = queueNode;

	}

	public void remove() {

		if (this.frontQueueNode == null) {
			return;
		}

		// Get the front node and move to next node
		QueueNode tempNode = this.frontQueueNode;
		this.frontQueueNode = this.frontQueueNode.nextNode;

		if (this.frontQueueNode == null) {
			this.rearQueueNode = null;
		}

		tempNode = null;
	}

	public Object peek() {

		if (this.frontQueueNode == null) {
			return null;
		}

		return this.frontQueueNode.data;
	}

	public void print() {

		QueueNode head = this.frontQueueNode;

		while (head != null) {

			System.out.print(head.data + " ");

			head = head.nextNode;

		}

		System.out.println();

	}

	public String toString() {

		QueueNode head = this.frontQueueNode;

		String prifix = "[";
		String suffix = "]";
		StringJoiner stringJoiner = null;
		stringJoiner = new StringJoiner(",");
		while (head != null) {
			stringJoiner.add(head.data.toString());
			head = head.nextNode;

		}

		return prifix + stringJoiner + suffix;

	}

}
