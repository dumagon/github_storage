package collections.stacks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class MyStack {
	
	public static void main(String[]args) {
	
	Stack <String>stack=new Stack<String>();
	
	// filling the stack
	
	stack.push("one");
	stack.push("two");
	stack.push("three");
	
	// searching for an item (receiving the index of the searched)
	
	
     int indexOf=stack.search("two");
     
     // getting the last added item (the stack remains intact)
     
     String peeked=stack.peek();
     
     System.out.println(stack);
     
     // getting the last added item (the item will be removed)
     
     String popped=stack.pop();
     
     System.out.println(stack);
     
     System.out.println(indexOf);
     System.out.println(peeked);
     
     // iterating over the stack
     
     
     Iterator<String> myItr=stack.iterator();
     System.out.println();
     
     while(myItr.hasNext()) {
    	 
    	 System.out.println(myItr.next());
    	 
     }
     
    // processing the stack by Stream AP 
     
     Stream<String> myStr=stack.stream();
     System.out.println();
     
     myStr.forEach((value)->{
    	 
    	 System.out.println(value);
    	 
     });
     
     
     List<String> myArr= new ArrayList<>();
     
     myArr.add("1");
     myArr.add("2");
     myArr.add("3");
     
     System.out.println(myArr);
     
     
      myArr = reverseAnyList(myArr);
      
      System.out.println(myArr);
      
      
     
     
     
     

	}
	
	
	




  //  we can pass an instance of a list to this method in order to reverse 

   public  static List reverseAnyList(List list) {
	   
	   
	   Stack utilityStack =new Stack();
	   
	   while(list.size()>0) {
	   
	   utilityStack.push(list.remove(0));
	   
	 
	   }
	   
	  while(utilityStack.size()>0) {
		  
		  list.add(utilityStack.pop());
	  }
	   
	   return list;
	   
	   
   }
}





















