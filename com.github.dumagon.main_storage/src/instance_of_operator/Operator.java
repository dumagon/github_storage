package instance_of_operator;

import java.util.HashMap;
import java.util.Map;

public class Operator {
	
	
	public static void main(String[] args) {

		Map map =new HashMap();
		HashMap hash=new HashMap();
		
		boolean result1 = map instanceof HashMap;
		boolean result2 =hash instanceof Map;
		boolean result3 = map instanceof Map;
		
		
		System.out.println("1 "+result1+" 2 "+result2+" 3 "+result3);
		
	}
	

}
