package in.jk.datastructure.graph.unionfindalgorithm;

public class Graph {

	int vertex;
	int edge;
	Edge[] graphEgde;

	class Edge {

		int src;
		int dest;
	}

	public Graph(int vertex, int edge) {
		this.vertex = vertex;
		this.edge = edge;

		graphEgde = new Edge[edge];
		for (int i = 0; i < edge; ++i) {
			graphEgde[i] = new Edge();

		}

	}

	// Function to find subset of element of an i
	private int find(int parrent[], int i) {

		if (parrent[i] == -1)
			return i;

		return find(parrent, parrent[i]);

	}

	private void union(int[] parrent, int x, int y) {

		int xset = find(parrent, x);
		int yset = find(parrent, y);
		parrent[xset] = yset;
	}

	public boolean isCycle(Graph graph) {

		boolean status = Boolean.FALSE;

		int parrent[] = new int[graph.vertex];

		for (int i = 0; i < graph.edge; ++i) {
			parrent[i] = -1;

		}

		for (int i = 0; i < graph.vertex; ++i) {

			int x = graph.find(parrent, graph.graphEgde[i].src);
			int y = graph.find(parrent, graph.graphEgde[i].dest);

			if (x == y) {

				System.out.println(x+"->"+y);
				status = Boolean.TRUE;
			}

			graph.union(parrent, x, y);

		}

		return status;

	}

	public static void main(String[] args) {

		int vertex = 3;
		int edge = 3;

		Graph graph = new Graph(vertex, edge);
		// 0 ->1
		graph.graphEgde[0].src = 0;
		graph.graphEgde[0].dest = 1;
        // 0 ->1
		graph.graphEgde[1].src = 1;
		graph.graphEgde[1].dest = 2;
		// 0 ->1
		graph.graphEgde[2].src = 0;
		graph.graphEgde[2].dest = 2;
		
		
		if(graph.isCycle(graph)) {
			System.out.println("Graph Contain Cycle ");
		}else {
			System.out.println("Graph Not Contain Cycle ");
		}
		

	}

}
