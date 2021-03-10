import java.util.*;
public class ImplOfList {
	
	public static void main(String[] args) {
		
		List <String>array =new ArrayList<String>();
		array.add("1");
		array.add("2");
		
		
		List<String> linked=new LinkedList<String>();
		linked.add("1.1");
		linked.add("2.2");
		
		
		array=linked;
		
	System.out.println(array.getClass());
		

	}

}
