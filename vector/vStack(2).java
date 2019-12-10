import java.util.*;
public class vStack<T> {
	private Vector<T> v;
	
	vStack() {
		v = new Vector<T>();
	}
	//constructor that specifies initial capacity
	vStack(int c) {
		v = new Vector<T>(c);
	}
	//all the methods above
	void push(T a){
		//insert at 0 remember to remove from 0
		v.insertElementAt(a, v.size());
	}
	T pop() {
		return v.remove(v.size()-1);
		
	}
	boolean isEmpty() {
		return v.isEmpty();
	}
	T peek(){
		return v.elementAt(v.size()-1);
	}
	int size() {
		return v.size();
	}
	int capacity() {
		return v.capacity();
	}
	public boolean isFull() {
		if (v.size() == v.capacity())
			return true;
		return false;
	}
	void print(){
		System.out.println(v.toString());
	}
	public String toString() {
		return v.toString();
	}
	
}
