package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class Main {
	
	public static void main(String[] args) {
		
		Set<String> myhash =new HashSet<>();
		
		Set<String>myTreeSet=new TreeSet<>();
		
		myhash.add("bass");
		myhash.add("bus");
		System.out.println(myhash);
		boolean added= myhash.add("bus");
		boolean added1=myhash.add("stay");
		System.out.println(added);
		System.out.println(added1);
		System.out.println(myhash);
		
		Set<String> collection =Set.of("fsg", "wsp", "twr");
		
		boolean addCollection =myhash.addAll(collection);
		
		System.out.println(addCollection+" "+(myhash));
		
	myTreeSet.add("dod");
	
	myTreeSet.add("sod");
	
	myTreeSet.add("ofd");
	
	System.out.println(myTreeSet.contains("dod"));
	System.out.println(myTreeSet.contains("lod"));
	
	Iterator <String> miItr=myTreeSet.iterator();
	
	while(miItr.hasNext()) {
		
		System.out.println(miItr.next());
	}
	
	
		
		

	}
	

}
