package in.jk.datastructure.graph.kruskalsalgorithim;

import java.util.Arrays;
import java.util.Comparator;

public class Graph {

	private int vertex;
	private int edge;
	private Edge[] graphEdge;

	class Edge implements Comparable<Edge> {

		int src;
		int dest;
		int weight;

		@Override
		public int compareTo(Edge edge) {
			// TODO Auto-generated method stub
			return weight - edge.weight;
		}

	}

	class Subset {

		int parrent;
		int rank;
	}

	public Graph(int vertex, int edge) {

		this.vertex = vertex;
		this.edge = edge;
		graphEdge = new Edge[edge];
		for (int i = 0; i < edge; ++i) {

			graphEdge[i] = new Edge();

		}
	}

	private int find(Subset [] subsets, int i) {
		
		if(subsets[i].parrent!=i) {
			subsets[i].parrent = find(subsets, subsets[i].parrent);
		}
		return subsets[i].parrent;
		}
	
	
	private void union(Subset []subsets,int x,int y) {
		
		int xset = find(subsets, x) ;
		int yset = find(subsets, y) ;
		
		if (subsets[xset].rank<subsets[yset].rank) {
			subsets[xset].parrent=yset;
		}else if (subsets[xset].rank>subsets[yset].rank) {
			subsets[yset].parrent = xset;
			
		}else {
			
			subsets[yset].parrent=xset;
			subsets[xset].rank++;
		}
		
	}
	
	
	public void kruskalMinSpanTree() {
		
		Edge result[] = new Edge[vertex];
		int e =0;
		int i=0;
		
		for (int j = 0; j < vertex; ++j) {
			
			result[j] = new Edge();
			
		}
		Arrays.sort(graphEdge);
		Subset subsets[] = new Subset[vertex];
		
		for (int j = 0; j < vertex; ++j) {
			subsets[j]= new Subset();
			}
		
		
		for (int v = 0; v < vertex; ++v) {
			
			subsets[v].parrent=v;
			subsets[v].rank=0;
			
		}
		
		
		i =0;
		
		while (e<vertex-1) {
			
			Edge nextEdge = new  Edge();
			nextEdge =graphEdge[i++];
			
			int x = find(subsets, nextEdge.src);
			int y = find(subsets, nextEdge.dest);
			
			if(x!=y) {
				
				result[e++] = nextEdge;
				union(subsets, x, y);
			}
			
			
			
			
		}
		
		System.out.println("Kruskal Min Span Tree is follows ::");
		for (int j = 0; j <e; ++j) {
			
			System.out.println(result[j].src +"--"+result[j].dest+ "=="+result[j].weight);
			
		}
		
	}
	

	public static void main(String[] args) {
		int vertex =4;
		int edge =5;
		
		Graph graph = new Graph(vertex, edge);
		
		graph.graphEdge[0].src=0;
		graph.graphEdge[0].dest=1;
		graph.graphEdge[0].weight=10;
		
		graph.graphEdge[1].src=0;
		graph.graphEdge[1].dest=2;
		graph.graphEdge[1].weight=6;
		
		graph.graphEdge[2].src=0;
		graph.graphEdge[2].dest=3;
		graph.graphEdge[2].weight=5;
		
		graph.graphEdge[3].src=1;
		graph.graphEdge[3].dest=3;
		graph.graphEdge[3].weight=15;
		
		graph.graphEdge[4].src=2;
		graph.graphEdge[4].dest=3;
		graph.graphEdge[4].weight=4;
		
		
		graph.kruskalMinSpanTree();

	}

}
