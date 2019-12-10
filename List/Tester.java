package ourList;
/*
 * Write a Tester class to test all methods of ourList
 */
public class Tester {
	public static void main(String[] args) {
		//create a list 
		//instantiate a class create an object 
		//className  objectName = new className(vhadf);
		ourList myList = new ourList(10);
		//add numbers to it, front and back
		myList.addFront(-2);
		myList.addFront(-5);
		myList.addFront(-8);
		myList.addBack(-10);
		myList.addBack(-7);
		myList.addBack(-13);
		myList.addBack(-22);
		myList.addFront(-18);
		myList.print();
		System.out.println("removing " + myList.removeFront());
		System.out.println("removing " + myList.removeBack());
		//show the list
		myList.addBack(-26);
		myList.addBack(-32);
		myList.addBack(-42);
		if (!myList.addBack(-48)) {
			System.out.println("cannot add -48");
		}
		if (!myList.addBack(-58)) {
			System.out.println("cannot add -58");
			myList.resize(11);
			myList.addBack(-58);
		}
		if (!myList.addFront(-68)) {
			System.out.println("cannot add -68");
			
		}
		myList.print();
		
		
	}

}
