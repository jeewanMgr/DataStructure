

public class Node<T> {
	private T data;
	private Node next;
	private Node previous;
	
	//default constructor
	public Node() {
		data = null;
		next = null;
		previous = null;
	}
	//with the data
	public Node(T d) {
		data = d;
		next = null;
		previous = null;
	}
	//getters 
	public T Data() {
		return data;
	}
	public Node<T> Next() {
		return next;
	}
	public Node<T> Previous() {
		return previous;
	}
	//setters 
	public void setData(T d) {
		data = d;
	}
	public void setNext(Node n) {
		next = n;
	}
	public void setPrevious(Node n) {
		previous = n;
	}
	
	public String toString() {
		String s = "" + data;
		return s;
	}
}
