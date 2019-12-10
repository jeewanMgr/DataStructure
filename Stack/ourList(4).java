package ourStack;

/*
 * HW: Redesign ourList with two indices that point to the last and the first element of the array.
 *Both should be set at -1 at the beginning. Pay special attention when you add the first element
 *pay special attention when you remove a last element (list becomes). 
 *You should code the index in a circular way: when you reah capacity-1 it should move to 0
 *You can achieve that by the following: front = (front+1)%capacity same for back
 *if an index is 0, if you subtract one it should equate to capacity-1.
 */

/*
 * Emulate Vector
 * Design a class that has the following properties:
 * private members: reference to an array of integers 
 * 		int size :The number of elements in the array 
 * 		capacity: the maximum number of integers in the array
 * 	constructors: 
 * 		default constructor that creates an array of 100 integers (capacity 100)
 * 				size = 0;
 * 		a Constructor that accepts a specific capacity
 *   Methods: 
 *   		int getSize() returns the size
 *   		int getCapacity() returns the capacity
 *   		int elementAt(int index)  returns the eleent at index index
 *   		void resize(int newCapacity); 
 *   		void addBack(int num); adds num to the tail of the array (size-1)
 *   		int removeBack(); remove the element at the back (size-1) and return it
 *   		void addFront(int num); adds num to the head of the array (index 0)
 *   		int  removeFront(); remove the element at the front and return it
 */
public class ourList { 
	//Object oriented programming provides a way to hide data, while you can act 
	//on it through methods. That's why in general we set member variables to private
	//a private can only be accessed by the class itself. 
	private int[] list; //the array is not yet created, we are only creating a reference
	private int size; //will be the same as length
	private int capacity; //the maximum of elements that you can store. 
	//constructors
	//Default does not accept any parameters; it is used to create an object 
	// to instantiate the class and create an instance.
	
	ourList() {
		//create an array of 100 integers
		list = new int[100]; //question Why not use the following 
							// int[] list = new int[100]; it would have disappeared right after 
							// the call to the constructor and you won't have an array
		size = 0;
		capacity = 100;
	}
	//a constructor that accepts a specific capacity
	ourList(int c) {
		list = new int[c];
		size = 0;
		capacity = c;
	}
	//getters, accessors
	int getSize() {
		return size;
	}
	int getCapacity() {
		return capacity;
	}
	int elementAt(int index) {
		if (index <0 || index >= size)
			System.out.println("Invalid index!");
		return list[index];
	}
	//resize needs make a bigger array with the same content
	//the only way os to create a temporary array, copy old content
	//then set our array to the new one
	void resize(int newCapacity) {
		if(newCapacity < capacity)
			return;
		int [] temp = new int[newCapacity];
		//copy the old array into the new one 
		for (int i = 0; i< size; i++) {
			temp[i] = list[i];
		}
		//update list to point to temp
		//The garbage collector of Java will destroy the old array as no reference
		//is pointing to it.
		list = temp;
		capacity = newCapacity;
	}
//void addBack(int num); adds num to the tail of the array (size-1)
boolean addBack(int num){
	if (size ==capacity) {
		return false;
	}
	list[size] = num;
	size++;
	return true;
}
//int removeBack(); remove the element at the back (size-1) and return it
int removeBack() {
	if (size == 0) {
		System.out.println("list empty cannot remove");
		return -1;
	}
	size--;
	return list[size];
}
//void addFront(int num); adds num to the head of the array (index 0)
boolean addFront(int num) {
	if(size == capacity)
		return false;
	//shift all element up by one
	for (int i = size-1; i>=0; i--) {
		list[i+1] = list[i];
	}
	list[0] = num;
	size++;
	return true;
	
}
//int  removeFront(); remove the element at the front and return it
int removeFront() {
	if (size == 0) {
		System.out.println("list empty cannot remove");
		return -1;
	}
	//save the front first before shifting
	int save = list[0];
	//shift down by one 
	for (int i =0; i <size-1; i++) {
		list[i] = list[i+1];
	}
	size--;
	return save;
}
public void print() {
	for (int i =0; i<size; i++) {
		System.out.println("List[" + i + "]=" + list[i]);
	}
}
public boolean isEmpty() {
	if (size == 0)
		return true;
	return false;
}
public boolean isFull() {
	if (size == capacity)
		return true;
	return false;
}
}
