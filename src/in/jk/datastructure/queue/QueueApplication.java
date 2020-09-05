package in.jk.datastructure.queue;

public class QueueApplication {
	
	public static void main(String[] args) {
		
		Queue queue = new  Queue();
		queue.add("Java");
		queue.add("Servlet");
		queue.add("Java Server Page");
		queue.add("Spring Boot");
		queue.add("Spring ");
		queue.add("Hibernate");
		queue.add("JAX-RS");
		
		queue.remove();
	    queue.print();
	    
	    queue.print();
	    
	    System.out.println(queue);
	    System.out.println(queue.peek());
		
		
	
		
	   
		
		
	}

}
