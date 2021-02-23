package collections.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetComparator {
	public static void main(String[] args) {
		
		Comparator<Integer> comparator =new MyComparator();
		
		SortedSet<Integer> sorted =new TreeSet<Integer>(comparator);
		
		sorted.add(3);
		sorted.add(5);
		sorted.add(50);
		sorted.add(1);
		
		;
		
		System.out.println(sorted);
		
		
		

	}
}




class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		
	/*
	 *                A negative value means that the first object was smaller than second object.
                         The value 0 means the two objects are equal.
                        A positive value means that the first object was larger than the second object.
	 * 
	 */
		
		if(o1==o2) 

		return 0;
		
		else {
			if(o1>o2)
			
			return 1;
			
			else {
				
				return -1;
			}
		}
		
	}
}
	
	















	



