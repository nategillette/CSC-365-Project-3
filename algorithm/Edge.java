package algorithm;

import java.io.Serializable;

public class Edge implements Serializable {

	private double weight;
	private Vertex src;
	private Vertex dest;
	
	public Edge(double weight, Vertex src, Vertex dest) {
		this.weight = weight;
		this.src = src;
		this.dest = dest;
	}
	
	public double getWeight() {

		return this.weight;
	}
	
	public Vertex getSrc() {

		return this.src;
	}
	
	public Vertex getDest() {

		return this.dest;
	}
}
