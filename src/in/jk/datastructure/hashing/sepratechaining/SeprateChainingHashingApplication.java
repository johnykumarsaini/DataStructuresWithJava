package in.jk.datastructure.hashing.sepratechaining;

public class SeprateChainingHashingApplication {
	
	
	public static void main(String[] args) {
		
	
	Map<Integer, String> map = new Map<Integer, String>();
	
	map.put(1, "Java");
	map.put(2, "Servlet");
	map.put(3, "Java Server Page");
	map.put(4, "Spring");
	map.put(5, "Hibernate");
	map.put(1, "Jax-RS");
	map.put(4, "Struts");
	map.put(2, "CDI");
	
	map.print();
	
	
	}
}
