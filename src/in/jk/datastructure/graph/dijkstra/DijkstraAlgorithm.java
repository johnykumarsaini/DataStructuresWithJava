package in.jk.datastructure.graph.dijkstra;

public class DijkstraAlgorithm {

	private static final int vertex = 9;

	public int findMinDistance(int dist[], Boolean[] set) {

		int minIndex = -1;
		int minValue = Integer.MAX_VALUE;

		for (int i = 0; i < vertex; i++) {

			if (set[i] == false && dist[i] < minValue) {

				minValue = dist[i];
				minIndex = i;
			}

		}
		return minIndex;

	}

	public void shortestPathTreeByDijkstra(int graph[][], int src) {

		int[] dist = new int[vertex];
		Boolean[] sptSet = new Boolean[vertex];

		for (int i = 0; i < vertex; i++) {

			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = Boolean.FALSE;

		}

		dist[src] = 0;

		for (int i = 0; i < vertex - 1; i++) {

			int u = findMinDistance(dist, sptSet);
			sptSet[u] = Boolean.TRUE;

			for (int j = 0; j < vertex; j++) {

				if (!sptSet[j] && graph[u][j] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][j] < dist[j]) {

					dist[j] = dist[u] + graph[u][j];
				}

			}
		}
		;

		shortestPathTreeByDijkstra(dist);

	}

	public void shortestPathTreeByDijkstra(int[] dist) {

		System.out.println("Shortest Path Tree By Dijkstra :: ");
		for (int i = 0; i < vertex; i++) {
			System.out.println(i + "\t\t" + dist[i]);

		}
	}

	public static void main(String[] args) {

		int[][] graph = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
			                          { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
				                      { 0, 8, 0, 7, 0, 0, 0, 0, 2 }, 
				                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
				                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
				                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
				                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
				                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
				                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
				                      
				                      
				                      
     DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
     dijkstraAlgorithm.shortestPathTreeByDijkstra(graph, 0);
     
     
	}

}
