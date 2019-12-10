
public class Node<T> {
	private T data;
	private Node next;
	
	//default constructor
	public Node() {
		data = null;
		next = null;
	}
	//with the data
	public Node(T d) {
		data = d;
		next = null;
	}
	//with both parameters 
	public Node(T d, Node n) {
		data = d;
		next = n;
	}
	//getters 
	public T Data() {
		return data;
	}
	public Node<T> Next() {
		return next;
	}
	//setters 
	public void setData(T d) {
		data = d;
	}
	public void setNext(Node n) {
		next = n;
	}
	public String toString() {
		String s = "" + data;
		return s;
	}
}
