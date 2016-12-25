package dijkstrasAlgorithm;
import java.util.*;

public class algorithm {
	
	public HashMap<Vertex, Integer> dijkstra(Graph graph, Vertex source) {
		PriorityQueue minHeap = new PriorityQueue();
		HashMap<Vertex, Integer> distanceMap = new HashMap<Vertex, Integer>();
		HashMap<Integer, Vertex> parent = new HashMap<Integer, Vertex>();
		
		for (Vertex vertex: graph.getAllVertex()) {
			minHeap.add(Integer.MAX_VALUE, vertex);
		}
		
		
		
	}
	
}
