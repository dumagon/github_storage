package generic_in_use.ex001.raw_type;

import java.util.ArrayList;
import java.util.List;


public class Main { 
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		
		List l =new ArrayList();                                            //                                           raw type  !!!!!
		
		List<String> list =new ArrayList<>();
		
		l.add(34);
		
		l.add("hey");
		
		list= l;
		
	
		
		System.out.println(list.get(0));  

	}

}






