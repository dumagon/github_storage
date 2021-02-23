package collections.maps;

import java.util.*;
import java.util.stream.Stream;

public class MyMap {
	public static void main(String[] args) {
		
		Map<String, Integer> mapHash = new HashMap<String, Integer>();
		

		
		//filling the map
		
		mapHash.put("The first", 1);
		mapHash.put("The second", 2);
		
		// null keys are acceptable 
		
		mapHash.put(null, 0);
		
		// null values are also possible 
		
		mapHash.put("nothing", null);
		
		// let's get the nulls
		
		System.out.println(mapHash.get(null)+" "+mapHash.get("nothing"));
		
		// checking if the map contains the given value
		
		System.out.println(mapHash.containsValue(1));
		
		// getting the view of the values stored in this map 
		
		System.out.println(mapHash.values());
		
		// ForEaching the values  
		
		for (Integer integer : mapHash.values()) {
			
			System.out.println(integer);
		}
		
		
		// getting the values through stream 
		
		Stream <Integer> stream=mapHash.values().stream();
		
		stream.forEach((value)->{
			
			System.out.println(value);
		});
		
		// p.s. same operations can be carried out over Keys ,as well as Entries
		
		
		
	}

}















