package in.jk.datastructure.stack;

public class StackApplication {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		stack.push("7");
		stack.push("8");
		
		System.out.println("Size :: "+stack.size());
		System.out.println("Top Element :: "+stack.pop());
		stack.remove();
		System.out.println("After removing first element ");
		System.out.println("Size :: "+stack.size());
		System.out.println("Top Element :: "+stack.pop());
		
		
		
		
		
		
	}

}
