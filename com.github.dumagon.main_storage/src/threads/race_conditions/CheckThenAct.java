package threads.race_conditions;

import java.util.HashMap;
import java.util.Map;

public class CheckThenAct {
	
	static void checkThenAct(Map<String,String>sharedMap) {
		
		// if one or more threads execute the if part only the first executing will remove the value , the others will get 
		// null !!!!
		
		if(sharedMap.containsKey("key")) {
			
			String val =sharedMap.remove("key");
			
			if(val==null) {
				
				System.out.println("val is null" +Thread.currentThread().getName());
				
			}else {
				
				sharedMap.put("key","value");
				
			}
			
			
		}
		
	}
	

	public static void main(String[] args) {

		Map<String,String> map =new HashMap<>();
		
		map.put("key", "value");
		
		Thread a =new Thread() {
			
			public void run() {
				
				checkThenAct(map);
			}
			
			
		};
		
            Thread b =new Thread() {
			
			public void run() {
				
				checkThenAct(map);
			}
			
			
		};
		
		
		a.start();
		b.start();
		
		
	}
	
	
	
}
