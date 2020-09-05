package in.jk.datastructure.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSGraph {

	private int vertex;
	private LinkedList<Integer>[] adjacncyGraph;

	public BFSGraph() {

		vertex = 5;
		adjacncyGraph = new LinkedList[vertex];

		for (int i = 0; i < adjacncyGraph.length; i++) {
			adjacncyGraph[i] = new LinkedList<Integer>();

		}
	}

	public void addEdge(int v, int w) {

		adjacncyGraph[v].add(w);

	}
	
	
	public void BFSGraphTravarsal(int startVertex) {
		
		boolean [] visited = new  boolean[vertex]; 
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[startVertex] = true;
		queue.add(startVertex);
		while (queue.size()!=0) {
			
			startVertex = queue.poll();
			
			System.out.print(" "+startVertex);
			
			
			Iterator<Integer> iterator = adjacncyGraph[startVertex].iterator();
			
			while (iterator.hasNext()) {
				Integer vertex = (Integer) iterator.next();
				
				if(!visited[vertex]) {
					
					visited[vertex]=Boolean.TRUE;
					queue.add(vertex);
				}
				
				
			}
			 
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		BFSGraph graph = new BFSGraph();
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		System.out.println("Following is Breadth Traversal starting vertex 2");
		graph.BFSGraphTravarsal(2);
		
		
		
	}

}
