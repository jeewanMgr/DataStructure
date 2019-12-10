
public class Tester {
	public static void main(String[] args) {
		//create node N1 
		Node<Integer> N1 = new Node<Integer>();
		N1.setData(-5);
		//create node N2 holding a string //next will be set to null
		Node<String> N2 = new Node<String>("Hi there");
		//create N3 to hold a double and pointing to N1 
		Node<Double> N3 = new Node<Double>(-2.3, N1);
		Node<String> ourRef = N2;
		//ourRef and N2 refer to the same object, not two objects
		ourRef.setData("How are you?");
		System.out.println(N2.toString());
		//build that list ourRef->N2->N3->N1
		N2.setNext(N3);//we are done!!
		//what is going to be displayed by the following?
		System.out.println(N2.Next().Next().toString());
		//to move from N2 to N3 using a temporary reference 
		//create a reference, assign it to the first node 
		Node temp = ourRef;
		//display this node 
		System.out.println(temp.toString());
		//move to the next node 
		temp = temp.Next();
		System.out.println(temp.toString());
		temp = temp.Next();
		System.out.println(temp.toString());
		if(temp.Next() != null)
			temp = temp.Next();
		else 
			System.out.println("You reached the end \n");
		
		
		
	}
}
