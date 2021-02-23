package collections.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetComparator_1 {
	
	public static void main(String[] args) {
		//  
	SpaceShip n1=new SpaceShip("4.11.2134");
		SpaceShip n2=new SpaceShip("14.12.2135");
	SpaceShip n3=new SpaceShip("6.10.2130");
		//
		
		
		
		
		Comparator <SpaceShip>compr =new SpaceComparator();
		
		SortedSet<SpaceShip>mySet=new TreeSet<SpaceShip>(compr);
		
		
		mySet.add(n1);
		mySet.add(n2);
		mySet.add(n3);
		
		
		System.out.println(mySet.comparator().compare(n1, n3));
// iteration section
		
	Iterator<SpaceShip> iter = mySet.iterator();
	while(iter.hasNext()) {
		SpaceShip n=iter.next();
		String date =n.getDateOfManufacturing();
		System.out.println(date);
		
	}
	
	// 
	

	}

}
//         the following class does not implement Comparable , thus  using Comparator to sort is relevant.

class SpaceShip{
	
	private String dateOfManufacturing=null;
	
	public SpaceShip(String date) {
		
		this.dateOfManufacturing=date;
		
	}

	public String getDateOfManufacturing() {
		return dateOfManufacturing;
	}

}


class SpaceComparator implements Comparator<SpaceShip>{

	@Override
	public int compare(SpaceShip o1, SpaceShip o2) {
		
		return o1.getDateOfManufacturing().compareTo(o2.getDateOfManufacturing());
		
		
		
		/*
		 *    if compared fields are numbers and getDateOfManufacturing returns int
		 *    then deduction is the easiest way  :
		 *    
		 *    
		 *    return o1.getDateOfManufacturing()-o2.getDateOfManufacturing();
		 *    
		 *    
		 */
	}
	
	
	

	
	
}








