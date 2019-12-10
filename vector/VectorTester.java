import java.util.*;
public class VectorTester {
		public static void main(String[] args) {
			//Vectors are generic data structure, you can create a vector of any object 
			//type you want. If you want to create a vector of integer you have to use 
			//the class Integer 
			//declare a Vector of integers of size 100
			Vector<Integer> myVec = new Vector<Integer>(); 
			//without a parameter it will default; 
			//show the size of the vector
			System.out.println("size = " + myVec.size() + "  capacity = " + myVec.capacity());
			//you could specify one parameter 
			//it will be the initial size or two parameters where the first is the initial 
			//size and the second is the increment (when the vector gets full it will 
			//be increased by that increment. 
			Vector<Integer> myVec1 = new Vector<Integer>(200); 
			System.out.println("size = " + myVec1.size() + "  capacity = " + myVec1.capacity());
			Vector<Integer> myVec2 = new Vector<Integer>(10, 20); 
			//let's fill the array 
			for (int i =0; i<10; i++) {
				myVec2.addElement(i);
			}
			System.out.println("size = " + myVec2.size() + "  capacity = " + myVec2.capacity());
			myVec2.addElement(13);
			System.out.println("size = " + myVec2.size() + "  capacity = " + myVec2.capacity());
			//to access an element at specific index
			System.out.println("element at 10 is " +  myVec2.elementAt(10));
			//to insert an elment you can use .addElement(obj, index) 
			myVec2.insertElementAt(-12, 1);
			System.out.println("element at 0 1 and 2 are " +  myVec2.elementAt(0) + " " + 
					myVec2.elementAt(1) + " " + myVec2.elementAt(2));
			myVec2.setElementAt(-9, 2);
			System.out.println("element at 0 1 and 2 are " +  myVec2.elementAt(0) + " " + 
					myVec2.elementAt(1) + " " + myVec2.elementAt(2));
			myVec2.removeElementAt(2);
			System.out.println("element at 0 1 and 2 are " +  myVec2.elementAt(0) + " " + 
					myVec2.elementAt(1) + " " + myVec2.elementAt(2));
			
			
			
			
		}
}
