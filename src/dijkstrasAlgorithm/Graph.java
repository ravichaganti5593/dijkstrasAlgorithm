package dijkstrasAlgorithm;
import java.util.*;

public class Graph {
	
}

class Edge {
	/*
	 * 1. Each edge has 2 vertices
	 * 2. It may or may not be directed
	 * 3. Each edge will have a weight
	 */
	
	private Vertex Vertex1, Vertex2;
	private boolean directed;
	private int weight;
	
	
	//create edge with weight, vertices and check if it's directed
	
	//weighted, directed graph
	Edge (Vertex Vertex1, Vertex Vertex2, int weight, boolean directed) {
		this.Vertex1 = Vertex1;
		this.Vertex2 = Vertex2;
		this.weight = weight;
		this.directed = directed;
	}
	
	//weighted, undirected graph
	Edge (Vertex Vertex1, Vertex Vertex2, int weight) {
		this.Vertex1 = Vertex1;
		this.Vertex2 = Vertex2;
		this.weight = weight;
	}
	
	public Vertex getVertex1() {
		return Vertex1;
	}
	
	public Vertex getVertex2() {
		return Vertex2;
	}
	
	public boolean getDirected() {
		return directed;
	}
	
	public int getWeight() {
		return weight;
	}
		
}

class Vertex {
	
	/*
	 * 1. Each vertex has an ID
	 * 2. Each vertex has some data
	 * 3. Each vertex has edges
	 * 4. Each vertex has neighbouring vertices
	 */
	
	int ID;
	private String data;
	private ArrayList<Edge> listOfEdges = new ArrayList<Edge>();
	private ArrayList<Vertex> listOfVertices = new ArrayList<Vertex>();
	
	
	//create Vertex with an ID
	Vertex(int ID) {
		this.ID = ID;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public ArrayList<Edge> listOfEdges() {
		return listOfEdges;
	}
	
	public ArrayList<Vertex> listOfVertices() {
		return listOfVertices;
	}
	
}
