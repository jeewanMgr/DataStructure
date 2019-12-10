package ourStack;

public class Tester {
	public static void main(String[] args) {
		//create an object ourStack
		ourStack st = new ourStack();
		st.push(-3);
		st.push(-5);
		st.push(-10);
		st.push(-31);
		st.print();
		System.out.println("removing " + st.pop());
		st.print();
		System.out.println("The top of the stack is " + st.peek());		
	}
}
