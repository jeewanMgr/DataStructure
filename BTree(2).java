
public class BTree<T> {
	TNode<T> root;
	int size; 
	//default constructor
	public BTree() {
		root = null;
		size = 0;
	}
	//insert method to insert a data with a key
	public void insert(int k, T e) {
		TNode<T> newNode = new TNode<T> (k, e);
		if(root == null){
			root = newNode;
			size = 1;
			return;			
		}
		//create a temporary reference 
		TNode<T> temp = root;
		while(true) {
			if (k < temp.getKey() && temp.getLeft() == null) {
				//insert the node here on the left of temp
				size++;
				temp.setLeft(newNode);
				return;
			}else if (k>=temp.getKey() && temp.getRight() == null) {
				//insert it to the right of temp
				size++;
				temp.setRight(newNode);
				return;
			}else if(k < temp.getKey()){
				//go to the left
				temp = temp.getLeft();
			}else {
				//go to the right
				temp = temp.getRight();
			}
		}
	}
	//Tree traversal (we will use recursions) 
	//private method with recursion
	private void VisitInOrder(TNode<T> n){
		if (n == null)
			return;
		VisitInOrder(n.getLeft());
		System.out.print(n.toString()+", ");
		VisitInOrder(n.getRight());
	}
	private void VisitPreOrder(TNode<T> n){
		if (n == null)
			return;
		System.out.print(n.toString()+", ");
		VisitPreOrder(n.getLeft());
		VisitPreOrder(n.getRight());
	}
	private void VisitPostOrder(TNode<T> n){
		if (n == null)
			return;
		VisitPostOrder(n.getLeft());
		VisitPostOrder(n.getRight());
		System.out.print(n.toString()+", ");
	}
	public void TraverseInOrder(){
		//print the keys and data in order 
		VisitInOrder(root);
	}
	public void TraversePreOrder(){
		//print the keys and data in order 
		VisitPreOrder(root);
	}
	public void TraversePostOrder(){
		//print the keys and data in order 
		VisitPostOrder(root);
	}
}
