package collections.queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOne {
	
	public static void main(String[] args) {

		Queue <Integer> queueA = new LinkedList<Integer>();
		Queue<String> queueB = new PriorityQueue<String>();
		
		
		// a storage for popped values to be print 
		
		String [] buffer = new String[16];
		
		// a collection for addAll method
		
		Collection<Integer> coll = new ArrayList<Integer>();
		
		coll.add(4);
		coll.add(5);
		coll.add(6);
		
		// filling LinkedList 
		
		queueA.add(1);
		queueA.offer(2);
		queueA.offer(3);
		queueA.addAll(coll);
		
		System.out.println(queueA);
		
		
		
		
	   // converting objects from  Integer collection  and store them  into String collection
		
	   Collection <String> coll1=new ArrayList<String>();
				
				
	   for (Integer e : coll) {coll1.add(e.toString());}
	   coll=null;
		
		
		// filling PriorityQueue 
		
		queueB.add("one");
		queueB.add("second");
		queueB.offer("three");
		queueB.addAll(coll1);
		
		System.out.println(queueB);
		
		
		// retrieving data from queueA and queueB and store into array
		
		
		Integer peeked_atA =queueA.peek();
		buffer[0]=peeked_atA.toString();
		
		Integer elementedA =queueA.element();
		buffer[1]=elementedA.toString();
		
		
		
		Integer polledA =queueA.poll();
		buffer[2]=polledA.toString();
		
		Integer removedA =queueA.remove();
		buffer[3]=removedA.toString();
		
		
		
		
		String peeked_atB=queueB.peek();
		buffer[4]=peeked_atB;
		
		String elementedB=queueB.element();
		buffer[5]=elementedB;
		
		String polledB=queueB.poll();
		buffer[6]=polledB;
		
		System.out.println(queueB);
		
		String removedB=queueB.remove();
		buffer[7]=removedB;
		
		System.out.println(queueB);
		
		
	
		
		//iterating  .. 
		
		
		Iterator itrA=queueA.iterator();
		
		while(itrA.hasNext()){
			
			System.out.println(itrA.next());
			}
		
		System.out.println();
		
		Iterator itrB=queueB.iterator();
		
		while(itrB.hasNext()) {
			
			System.out.println(itrB.next());
			
		}
		
		System.out.println();
		
		
	  // printing buffer 
		
		for (int i = 0; i < buffer.length; i++) {
			
			System.out.print(buffer[i]+",");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
