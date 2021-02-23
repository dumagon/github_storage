package collections.linked_list;

import java.util.ArrayList;
import java.util.LinkedList;



public class MyLinkedLIst {
	
	
	public static void main(String[] args) {
		
		LinkedList<String>linked=new LinkedList<>();
		
		linked.add("first");                                                                                                   // O(1)
		linked.addFirst("added in the begging");                                                         //   O(1)
		linked.addLast("added in the end");                                                                  // O(1)
		linked.add(2,"added in the middle ");                                                              // O(n) !!
		
		ArrayList  <String>strings= new ArrayList<>();
		
		strings.add("we are");
		strings.add("from strings");
		
		linked.addAll(strings);
		
		System.out.println(linked.hashCode());
		
		System.out.println(linked.element());
		
		linked.contains("first");
		
		linked.isEmpty();

	}
	
	
	
	

}
