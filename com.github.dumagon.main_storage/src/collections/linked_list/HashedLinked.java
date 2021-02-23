package collections.linked_list;
import java.util.Hashtable;
import java.util.LinkedList;
public class HashedLinked {
	public static void main(String[] args) {
		
		LinkedList<String>l1=new LinkedList<>();
		LinkedList<String>l2=new LinkedList<>();
		LinkedList<String>l3=new LinkedList<>();
		
		l1.add("1");
		l1.add("2");
		l1.add("3");
		
		l2.add("4");
		l2.add("5");
		l2.add("6");
		
		l3.add("7");
		l3.add("8");
		l3.add("9");
		
		Hashtable<Integer,LinkedList<String>>h=new Hashtable<>();
		
		h.put(1, l1);
		h.put(2, l2);
		h.put(3, l3);
		
		
		System.out.println(h.get(1).get(2));
		

	}

}





























