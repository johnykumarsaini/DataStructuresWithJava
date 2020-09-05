package in.jk.datastructure.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSGraph {

	private int vertex;
	private LinkedList<Integer>[] adjacncyGraph;

	public DFSGraph() {

		vertex = 5;
		adjacncyGraph = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
			adjacncyGraph[i] = new LinkedList<Integer>();

		}

	}
	
	public void addEdge(int v,int w) {
		
		adjacncyGraph[v].add(w);
	}

	public void DFSGraphTraversal(int startVertex) {

		boolean[] visited = new boolean[vertex];
		DFSGraphTraversal(startVertex, visited);

	}

	private void DFSGraphTraversal(int v, boolean[] visited) {

		visited[v] = Boolean.TRUE;
		System.out.print(" " + v);
		Iterator<Integer> iterator = adjacncyGraph[v].iterator();
        while (iterator.hasNext()) {
			Integer vertex = (Integer) iterator.next();
			if (!visited[vertex]) {
				DFSGraphTraversal(vertex, visited);
			}

		}

	}
	
	public static void main(String[] args) {
		
		DFSGraph graph = new DFSGraph();
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		System.out.println("Following Depth First Search from vertext 2 :: ");
		
		graph.DFSGraphTraversal(2);
		
	}

}
