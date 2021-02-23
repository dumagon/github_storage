package hash_maping;

import java.util.HashMap;
import java.util.Map;

public class PassportUser2 {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		HashMap<Integer, String>passports_users=new HashMap<>();
		HashMap<Integer, String>passportsAndusers=new HashMap<>();
				
 	    passports_users.put(2345, "Joe Peers");
		passports_users.put(3456,"Sean Brook");
		passports_users.put(4567, "Serena Walls");
		
		passportsAndusers.put(3323, "John Meadow");
		passportsAndusers.put(6787, "Gori Nelson");
		
		
// you can merge two HashMaps together  by using  ...                                                                          HashMap1.putAll(HashMap2)
		
		
		passports_users.putAll(passportsAndusers);
		
		System.out.println(passports_users);
		
		
		///  if you need to get all the members  ( key+value)    one by one  use the following 'for each'
		
		
		 
		for (Map.Entry entry : passports_users.entrySet()   ){
			
			
			System.out.println(entry);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
