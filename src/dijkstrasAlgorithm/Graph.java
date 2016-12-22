package dijkstrasAlgorithm;
import java.util.*;

public class Graph {
	private ArrayList<Edge> listOfEdges;
	private HashMap<Integer, Vertex> listOfVertex;
	private boolean directed = false;
	
	public Graph (boolean directed) {
		this.directed = directed;
		listOfEdges = new ArrayList<Edge>();
		listOfVertex = new HashMap<Integer, Vertex>();
	}
	
	/*
	 * 1. Add vertices for both directed and undirected graphs to the listOFVertex
	 * 2. Add edge
	 * 3. Add adjacent for vertex1 and vertex2
	 */
	
	public void addEdge(int ID1, int ID2, int weight) {
		
		Vertex vertex1 = null;
		
		if (listOfVertex.containsKey(ID1)) {
			vertex1 = listOfVertex.get(ID1);
		}
		
		else {
			vertex1 = new Vertex(ID1);
			listOfVertex.put(ID1, vertex1);
		}
		
		Vertex vertex2 = null;
		
		if (listOfVertex.containsKey(ID2)) {
			vertex2 = listOfVertex.get(ID2);
		}
		
		else {
			vertex2 = new Vertex(ID2);
			listOfVertex.put(ID2, vertex2);
		}
		
		Edge edge = new Edge (vertex1, vertex2, weight, directed);
		listOfEdges.add(edge);
		vertex1.addAdjacentVertex(edge, vertex2);
		if (!directed) {
			vertex2.addAdjacentVertex(edge, vertex1);
		}
		
	}
	
	public ArrayList<Edge> getListOfEdges() {
		return listOfEdges;
	}
	
	public HashMap<Integer, Vertex> getListOfVertex() {
		return listOfVertex;
	}
	
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
	 * 4. Each vertex has adjacent vertices
	 */
	
	int ID;
	private String data;
	private ArrayList<Edge> listOfEdges = new ArrayList<Edge>();
	private ArrayList<Vertex> listOfAdjacentVertices = new ArrayList<Vertex>();
	
	
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
		return listOfAdjacentVertices;
	}
	
	//add a vertex 
	public void addAdjacentVertex(Edge edge, Vertex vertex) {
		listOfEdges.add(edge);
		listOfAdjacentVertices.add(vertex);
		
	}
	
	
}
