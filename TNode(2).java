
public class TNode<T> {
	private T data;
	private int key;
	private TNode<T> left, right;
	
	public TNode() {
		key = 0;
		data = null;
		left = right = null;
	}
	public TNode(int k, T e) {
		data = e;
		key = k;
		left = right = null;
	}
	public T getData() {
		return data;
	}
	public void setData(T e) {
		data = e;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int k) {
		key = k;
	}
	public TNode<T> getLeft() {
		return left;
	}
	public TNode<T> getRight() {
		return right;
	}
	//mutators
	public void setLeft(TNode<T> n) {
		left = n;
	}
	public void setRight(TNode<T> n) {
		right = n;
	}
	public String toString() {
		String st = "("+ key + ", " + data + ")";
		return st;
	}
}
