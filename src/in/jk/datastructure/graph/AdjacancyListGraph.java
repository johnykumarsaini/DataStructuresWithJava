package in.jk.datastructure.graph;

import java.util.ArrayList;

public class AdjacancyListGraph {
	
	
	public void addEdge(ArrayList<ArrayList<Integer>> graphList,int u ,int v) {
		
		graphList.get(v).add(u);
		graphList.get(u).add(v);
		
	}
	
	public void print(ArrayList<ArrayList<Integer>> graphList) {
		
		for (int i = 0; i < graphList.size(); i++) {
			
			System.out.println("Adjacany List of vertex :: "+i);
			ArrayList<Integer> arrayList = graphList.get(i);
			
			for (int j = 0; j < arrayList.size(); j++) {
				
				System.out.print("-> "+graphList.get(i).get(j));
				
			}
			
			System.out.println();
			
		}
		
		
	}
	
	
	
	
	
	

}
