package threads.thread_local;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class InitialThreadLocal {
	
	public static void main(String[] args) {

		ThreadLocal<String> myThreadLocal=new ThreadLocal<String>() {
			
			@Override
			protected String initialValue() {
				
				return "default";
				
			}
			
			
			
		};
		
		
		ThreadLocal<String> thrloc =ThreadLocal.withInitial(new Supplier<String>() {

			@Override
			public String get() {
				
				return "default";
			}
			
			
			
		});
		
		ThreadLocal<String> thrloc1 = ThreadLocal.withInitial(()->{return "default";});
		
		
		ThreadLocal<String> thrloc2 = ThreadLocal.withInitial(()-> "default");
		
		
		List<String> threadLocalCollection =new ArrayList<>();
		
		threadLocalCollection.add(myThreadLocal.get());
		threadLocalCollection.add(thrloc.get());
		threadLocalCollection.add(thrloc1.get());
		threadLocalCollection.add(thrloc2.get());
		
		System.out.println(threadLocalCollection.toString());
		
		
		
		
	}

}































