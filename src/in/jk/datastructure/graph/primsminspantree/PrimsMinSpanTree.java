package in.jk.datastructure.graph.primsminspantree;

public class PrimsMinSpanTree {

	private static final int vertex = 5;

	private int minKey(int key[], Boolean[] primMST) {

		int min = Integer.MAX_VALUE;
		int minIndex = -1;

		for (int i = 0; i < vertex; i++) {

			if (primMST[i] == false && key[i] < min) {
				min = key[i];
				minIndex = i;
			}

		}

		return minIndex;
	}

	public void primsMinSpanTree(int graph[][]) {

		int[] parrent = new int[vertex];
		int[] key = new int[vertex];
		Boolean[] mstSet = new Boolean[vertex];

		for (int i = 0; i < vertex; i++) {
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = Boolean.FALSE;

		}

		key[0] = 0;
		parrent[0] = -1;

		for (int i = 0; i < vertex - 1; i++) {

			int u = minKey(key, mstSet);
			mstSet[u] = Boolean.TRUE;

			for (int j = 0; j < vertex; j++) {

				if (graph[u][j] != 0 && mstSet[j] == false && graph[u][j] < key[j]) {
					parrent[j] = u;
					key[j] = graph[u][j];

				}

			}

		}
		printPrimMinSpanTree(parrent,graph);

	}
	
	
	public  void printPrimMinSpanTree(int parent[],int graph[][]) {
		
		System.out.println("Prim Min Span Tree");
		
		for (int i = 1; i < vertex; i++) {
			
			System.out.println(parent[i]+ "-"+i+ "\t"+graph[i][parent[i]]);
			
		}
		
	}

	public static void main(String[] args) {
		
		PrimsMinSpanTree  minSpanTree =  new  PrimsMinSpanTree();
		
		int graph[][] =null;
		
		
		graph = new int [][] {
			                  {0,2,0,6,0},
			                  {2,0,3,8,5},
			                  {2,3,0,0,7},
			                  {6,8,0,0,9},
			                  {0,5,7,9,0}
		                        };
		
		
		
		
		minSpanTree.primsMinSpanTree(graph);
		
	}
	

}


