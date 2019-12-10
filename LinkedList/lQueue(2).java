
public class lQueue<T> {
	private Node<T> head = null;
	private int size = 0;
	public lQueue() {
		head = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	boolean isEmpty() {
		return (size == 0);
	}
	public void insert(T e) {
		Node<T> newNode = new Node<T>(e);
		if(size == 0) {
			head = newNode;
			size++;
		}else {
			newNode.setNext(head);
			head = newNode;
			size++;
		}
	}
	public T remove() {
		//if only one element
		if (isEmpty())
			return null;		
		if(size == 1) {
			//The returned data will be the data of the first node
			T retEl = head.Data();
			head = null;
			size = 0;
			return retEl;
		}else {
			//go to the next to last node
			Node<T> temp = head;
			while(temp.Next().Next() != null) {
				temp = temp.Next();
			}
			T retEl = temp.Next().Data();
			temp.setNext(null);
			size--;
		}
	}
	public void print() {
		Node<T> temp = head;
		while(temp!= null) {
			System.out.println(temp.toString());
			temp = temp.Next();
		}
	}
}
