package ourStack;
/*A stack is a data structure that works as follows: when an element is added
 * it is added to the top and when we remove we remove the top. The interface 
 * a stack exposes is the following (we do not care how it is done, as long as 
 * the interface works as advertised!)
 * void push(int a); adds an integer to the top
 * int pop(); removes the element at the top and returns it
 * boolean isEmpty(); return true if the stack is empty, false otherwise
 * int peek(); return the top without removing it from the stack
 * int size(); return the number of elements in the stack
 * void print(); prints the content of the stack
 *  
 *  Design and code a stack (ourStack) that is a wrapper to ourList that implements
 *  a stack. You should not have more than an ourList as a private member variable. 
 * 
 * Write a class Tester where you test all the properties of your class
 */
public class ourStack {
	ourList  list;
	//default constructor; a constructor is a method with the same name as the class 
	//it allows you to instantiate the class (create objects)
	ourStack() {
		list = new ourList();
	}
	//constructor that specifies initial capacity
	ourStack(int c) {
		list = new ourList(c);
	}
	//all the methods above
	void push(int a){
		list.addFront(a);
	}
	int pop() {
		return list.removeFront();
	}
	boolean isEmpty() {
		return list.isEmpty();
	}
	int peek(){
		return list.elementAt(0);
	}
	int size() {
		return list.getSize();
	}
	void print(){
		list.print();
	}

}
