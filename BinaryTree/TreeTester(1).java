
public class TreeTester {
	public static void main(String[] args){
		//create a tree of doubles
		BTree myTree = new BTree();
		//insert few keys with doubles (15, -1.2), 20, 10, 5, 7, 3, 9, 6, 16, 25, 22, 31, 27, 34
		myTree.insert(15,  -1.2);
		myTree.insert(20,  -4.2);
		myTree.insert(10,  -6.2);
		myTree.insert(5,  -56.2);
		myTree.insert(7,  -09.2);
		myTree.insert(3,  -12.2);
		myTree.insert(9,  -24.2);
		myTree.insert(6,  -34.2);
		myTree.insert(16,  -45.2);
		myTree.insert(25,  -56.2);
		myTree.insert(22,  -67.2);
		myTree.insert(31,  -65.2);
		myTree.insert(27,  -34.2);
		myTree.insert(34,  -40.2);
		//traverse in order
		myTree.TraverseInOrder();
		System.out.println("");
		myTree.TraversePreOrder();
		System.out.println("");
		myTree.TraversePostOrder();
	}
}
