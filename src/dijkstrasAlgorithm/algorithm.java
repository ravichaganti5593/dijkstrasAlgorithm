package dijkstrasAlgorithm;
import java.util.*;

public class algorithm {
	
	public int numberOfVertexes;
	
	public algorithm(int numberOfVertexes) {
		this.numberOfVertexes = numberOfVertexes;
	}
	
	
	public void dijkstra (int[][] Graph, int source) {
		int[] distance = new int[numberOfVertexes];
		boolean[] shortestPathSet = new boolean[numberOfVertexes];
		
		
		//initialize distance and shortestPathSet to infinity and false
		for (int i = 0; i < numberOfVertexes; i++) {
			shortestPathSet[i] = false;
			distance[i] = Integer.MAX_VALUE;
		}
		
		distance[source] = 0;
		
		//find shortest path for all the vertexes

		for (int i = 0; i < numberOfVertexes - 1; i++) {
			
			//start with the lowest distance VERTEX***
			int minimumDistanceVertex = minimumDistanceMethod(distance, shortestPathSet);
			
			//once you get this vertex, set its boolean value to true
			shortestPathSet[minimumDistanceVertex] = true;
			
			//update adjacent distance values of this vertex
			for (int j = 0; j < numberOfVertexes; j++) {
				if (!shortestPathSet[j]) {
					if (Graph[minimumDistanceVertex][j] != 0) {
						if (distance[minimumDistanceVertex] != Integer.MAX_VALUE) {
							if (distance[minimumDistanceVertex] + Graph[minimumDistanceVertex][j] < distance[j]) {
								distance[j] = distance[minimumDistanceVertex] + Graph[minimumDistanceVertex][j];
							}
						}
					}
				}
			}
			
			
		}
		
		printDistance(distance);
		
	}
	
	
	public int minimumDistanceMethod (int[] distance, boolean[] shortestPathSet) {
		int minValue = Integer.MAX_VALUE;
		int indexOfminimumDistanceVertex = -1;
		
		for (int i = 0; i < numberOfVertexes; i++) {
			if (shortestPathSet[i] == false && distance[i] < minValue) {
				minValue = distance[i];
				indexOfminimumDistanceVertex = i;
			}
		}
		
		return indexOfminimumDistanceVertex;
	}
	 
	public void printDistance (int[] distance) {
		
		System.out.println("Node      Distance from Source");
		for (int i = 0; i < numberOfVertexes; i++) {
			System.out.println(i + " \t\t " + distance[i]);
		}
	}
	
	
	public static void main (String[] args) {
		
		int[] zero = {0, 5, 0, 9, 2, 0};
		int[] one = {5, 0, 2, 0, 0, 0};
		int[] two = {0, 2, 0, 3, 0, 0};
		int[] three = {9, 0, 3, 0, 0, 2};
		int[] four = {2, 0, 0, 0, 0, 3};
		int[] five = {0, 0, 0, 2, 3, 0};
		
		
		int[][] Graph = {zero, one, two, three, four, five};
		
		algorithm algorithm = new algorithm(Graph.length);
		algorithm.dijkstra(Graph, 0);
	}
	
}
