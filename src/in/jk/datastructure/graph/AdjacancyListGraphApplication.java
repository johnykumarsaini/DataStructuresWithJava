package in.jk.datastructure.graph;

import java.util.ArrayList;

public class AdjacancyListGraphApplication {
	
	public static void main(String[] args) {
		
		int vertex =5;
		ArrayList<ArrayList<Integer>> graphList = new ArrayList<ArrayList<Integer>>(vertex);
		
		for (int i = 0; i < vertex; i++) {
		
			graphList.add(new ArrayList<Integer>());
			
		}
		
		
		
		AdjacancyListGraph graph = new AdjacancyListGraph();
		
		graph.addEdge(graphList, 0, 1);
		graph.addEdge(graphList, 0, 4);
		graph.addEdge(graphList, 1, 2);
		graph.addEdge(graphList, 1, 3);
		graph.addEdge(graphList, 1, 4);
		graph.addEdge(graphList, 2, 3);
		graph.addEdge(graphList, 3, 4);
		
		graph.print(graphList);

	}

}
