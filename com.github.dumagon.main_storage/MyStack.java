import java.util.Stack;

public class MyStack {
	
	public static void main(String[] args) {

		Stack <String>s =new Stack<>();
		
		s.add("1");
		s.push("2");
		String peeked =s.peek();
		System.out.println(peeked);
		System.out.println(s);
		String popped =s.pop();
		System.out.println(popped);
		System.out.println(s);
		
		
	}

}
