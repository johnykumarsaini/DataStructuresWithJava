package in.jk.datastructure.stack;

public class MyStackApplication {
	
	public static void main(String[] args) {
		
		MyStack myStack = new MyStack();
		
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.push(6);
		myStack.push(7);
		myStack.push(8);
		
		
		System.out.println("Size :: "+myStack.size());
		System.out.println("Top Element :: "+myStack.pop());
		myStack.remove();
		System.out.println("After removing first element ");
		System.out.println("Size :: "+myStack.size());
		System.out.println("Top Element :: "+myStack.pop());
		
	}

}
