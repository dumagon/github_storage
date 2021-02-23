package iterration;

import java.util.Iterator;

public class Ranks implements Iterable<String> {
	
	private String[] ranks= {"sergeant","lieutenant","carpral"};
	
	public static void main(String[] args) {

	 Ranks my_ranks=new Ranks();
	 
	 
	Iterator<String> itr=my_ranks.iterator();
		
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
		
		
		
	}
	
		
		
	}

	@Override
	public Iterator<String> iterator() {
		return new OverridenIterator(ranks);
	}
	
	
	static class OverridenIterator implements Iterator<String> {
		
		private String [] s;
		private int count;
		
		
		public OverridenIterator(String [] s) {
			
			this.s=s;
			
		}
		

		@Override
		public boolean hasNext() {
			if(count<s.length)
				    return true;
			else 
			       return false;
		}

		@Override
		public String next() {
			
			
			
			return s[count++];
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
