import java.util.*;
public class vStackTester {
	public static void main(String[] args) {
		//create an object ourStack
				vStack<Integer> st = new vStack<Integer>();
				st.push(-3);
				st.push(-5);
				st.push(-10);
				st.push(-31);
				System.out.println(st.toString());
				System.out.println("removing " + st.pop());
				System.out.println(st.toString());
				System.out.println("The top of the stack is " + st.peek());	
				System.out.println(st.toString());
	}
}
