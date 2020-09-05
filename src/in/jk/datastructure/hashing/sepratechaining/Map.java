package in.jk.datastructure.hashing.sepratechaining;

import java.util.ArrayList;
import java.util.Iterator;

public class Map<K,V> {
	
	class MapNode<K,V>{
		
		K key;
		V value;
		MapNode <K,V> nextNode;
		
		public MapNode(K key,V value) {
			
			this.key =key;
			this.value = value;
			
		}
		
	}
	
	ArrayList<MapNode<K,V>> buckets =null; 
	int size=0;
	int numOfBuckets =5;
	final double LOAD_FACTOR = 0.75;
	
	
	public Map() {
		
		System.out.println("Map Intializaton ...");
		numOfBuckets =5;
		buckets = new ArrayList<>(numOfBuckets);
		
		  for (int i = 0; i < numOfBuckets; i++) { 
	            // Initialising to null 
	            buckets.add(null); 
	        } 
	        System.out.println("HashMap created"); 
	        System.out.println("Number of pairs in the Map: " + size); 
	        System.out.println("Size of Map: " + numOfBuckets);
		
	}
	
	private int getBucketsIndex(K key) {
		
		int hashcode = key.hashCode();
		return hashcode%numOfBuckets;
		
	
		
		
	}
	
	
	public void put(K key,V value) {
		
		int bucketsIndex = getBucketsIndex(key);
		MapNode<K, V> head = buckets.get(bucketsIndex);
		
		while(head!=null) {
			
		if(head.key.equals(key)) {
			head.value = value;
			return;
		}
		
		head =head.nextNode;
		}
		
		
		MapNode<K, V> mapNode = new MapNode<K, V>(key, value);
		mapNode.nextNode =head;
		
		int index = getBucketsIndex(key);
		
		buckets.add(index, mapNode);
		
		size++;
		
		
		double cuurentLoadFactor = LOAD_FACTOR/numOfBuckets;
		
		
		if(cuurentLoadFactor>LOAD_FACTOR) {
			
			System.out.println("List id full need to reshah ");
		}
		
		
	}
	
	
	public void print() {
		
	for (int i = 0; i < buckets.size(); i++) {
		
		MapNode<K, V> mapNode = buckets.get(i);
		
		while (mapNode!=null) {
			
			System.out.println(mapNode.key +"="+ mapNode.value);
			mapNode = mapNode.nextNode;
			
		}
		
		System.out.println();
		
	}
		
		
		
		
		
	}
	

}
