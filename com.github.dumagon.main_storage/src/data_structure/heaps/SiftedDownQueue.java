package data_structure.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class SiftedDownQueue {
	
	public static void main(String[] args) {
		
		Queue <String> q =new PriorityQueue<>();
		
		
		
		q.add("1");
		q.add("2");
		q.add("3");
		q.add("4");
		q.add("0");
		q.add("6");
		
		System.out.println(q);
		
		
		q.poll();
		
		
		
		
		System.out.println(q);
		
	
		
		
		
		
		
		

	}

}
