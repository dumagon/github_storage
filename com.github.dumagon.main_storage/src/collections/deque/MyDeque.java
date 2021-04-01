package collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MyDeque {
	
	public static void main(String[] args) {
		
		
		Deque <String> myDeque=new LinkedList<>();
		
		Deque <Integer> myArrDeque=new ArrayDeque<>();
		
		
		// the add method throws an exception when fails
		
		myDeque.add("element 1");   // internally invokes linkLast
		myDeque.addFirst("element 2"); // internally invokes linkFirst
		
		// the offer method returns false if the addition fails
		myDeque.offer("element 3");
		myDeque.offerFirst("element 4");
		
		
		//adds elements to the beginning (head) of the deque
		myDeque.push("element 5");
		
		
		myDeque.peek();
		myDeque.peekLast();
		
		
		myDeque.getFirst();
		myDeque.getLast();
		
		
		// throws an exception
		myDeque.removeFirst();
		myDeque.removeLast();
		
		// returns false
		myDeque.pollFirst();
		myDeque.pollLast();
		
		// removes an element from the head of the deque
		myDeque.pop();
		
		
		myDeque.contains("element 3");
		
		myDeque.size();
		
		
		
		
		
		
		
		
		
		
		
	}

}
