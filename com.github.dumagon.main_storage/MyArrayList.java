import java.util.ArrayList;


public class MyArrayList {
	
	public static void main(String[] args) {

		ArrayList<String>arr=new ArrayList<>();
		
		arr.add("1");
		
		boolean success=arr.add("2");
		
		System.out.println(success);
	
		
		System.out.println(arr);
		
		String deleted_value=arr.set(1,"3");
		System.out.println(deleted_value);
		
		System.out.println(arr);
		
		
	}

}
