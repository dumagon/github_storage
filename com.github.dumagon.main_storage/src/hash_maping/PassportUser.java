package hash_maping;

import java.util.HashMap;

public class PassportUser {
	
	public static void main(String[] args) {

		
		HashMap<Integer, String>passport_name=new HashMap<>();
		
		
	//   we use method ' PUT'  to add new members                                          PUT
		
	
passport_name.put(345677, "Joe Biden");
passport_name.put(234567, "Donald Trump");
passport_name.put(342434, "Mike Ermuntraut");
passport_name.put(456776, "Rhea Seehorn");



 
////  HashMap has an overridden method 'toString' 

System.out.println(passport_name);


//  when you  ' put ' a new member with the same key as one of the members already has ,you will overwrite  it. 

passport_name.put(234567, "Just SomeGuy");


System.out.println(passport_name);		


// you can delete or get values by applying  ' REMOVE' and 'GET' respectively to the keys .                                                                  REMOVE                   GET  

System.out.println(passport_name.get(456776));     

passport_name.remove(234567);

System.out.println(passport_name);


///   you can check  if a HashMap  has some certain values or keys  by using ........                                                          containsValue()                          containsKey()   
//  returns   boolean

System.out.println(passport_name.containsKey(234567)); 
System.out.println(passport_name.containsKey(456776));



System.out.println(passport_name.containsValue("Mike Ermuntraut"));


// you can get all the values or keys  by using ...                                                                                                                                                   values()               keySet()   


System.out.println(passport_name.values());

System.out.println(passport_name.keySet());                       // the keys are going to a collection called   'Set'  




// you can know the number  all the elements   or removed them all by ...                                                                                              size()                               clear()


System.out.println(passport_name.size());

passport_name.clear();


//  you can see if a HashMap   contains any members   using ....                                                                                                            isEmpty()
// returns boolean

System.out.println(passport_name.isEmpty());










                                                           




		
		
		
		
		
	}

}
