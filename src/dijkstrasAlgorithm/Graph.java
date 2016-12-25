package dijkstrasAlgorithm;
import java.util.*;

public class Graph {

	/*
	 * 1. Add vertices for both directed and undirected graphs to the listOFVertex
	 * 2. Add edge
	 * 3. Add adjacent for vertex1 and vertex2
	 */
	
	private ArrayList<Vertex> listOfVertexes;
	private ArrayList<Edge> listOfEdges;
	
	public Graph(ArrayList<Vertex> listOfVertexes, ArrayList<Edge> listOfEdges) {
		this.listOfVertexes = listOfVertexes;
		this.listOfEdges = listOfEdges;
	}
	
	public ArrayList<Vertex> getListOfVertexes() {
		return listOfVertexes;
	}

	public ArrayList<Edge> getListOfEdges() {
		return listOfEdges;
	}
			
}

class Edge {
	/*
	 * 1. Each edge has 2 vertices
	 * 2. Each edge will have a weight
	 * 3. Each edge will have an ID
	 */

	private Vertex source, destination;
	private int weight;
	private int ID;
	
	public Edge(Vertex source, Vertex destination, int weight, int ID) {
		this.source = source;
		this.destination = destination;
		this.weight = weight;
		this.ID = ID;
	}
	
	public Vertex getSource() {
		return source;
	}

	public Vertex getDestination() {
		return destination;
	}

	public int getWeight() {
		return weight;
	}

	public int getID() {
		return ID;
	}
	
}

class Vertex {
	
	/*
	 * 1. Each vertex has an ID
	 * 2. Each vertex has some data
	 */
	
	private int ID;
	private String data;
	
	public Vertex(int ID, String data) {
		this.ID = ID;
		this.data = data;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getData() {
		return data;
	}
	
}
