package collections;

import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		
		Word[] array =new Word[10];
		
		Word e =Word.factory("t");
		Word t =Word.factory("y");
		
		System.out.println(e);
		System.out.println(t);
		
		
		for (int i = 0; i < array.length; i++) {
			
			Double randomVal =Math.random();
			String val =randomVal.toString();
			
			
			
			array[i]=Word.factory(val);
			
}
		
		System.out.println(array[9].toString());
		
		
		
		
	MyIterable<Word> instance =new MyIterable<>(array);
	
	System.out.println(instance.size());
	
	Iterator<Word> itr =instance.iterator();
	
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
	
	
	
	//if(instance.iterator().hasNext()) {
		
		System.out.println(instance.iterator().next().toString());
		
	//}
	
	
		
		
		
		
		

	}

}
