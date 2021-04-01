package collections;

import java.util.*;








 class MyIterable<E> implements Iterable<E>{
	
	 Object [] arr;
	
	private int size;
	private int count;
	
	
	public MyIterable() {
		
		this.arr=new Object[10];
	}
	
	public MyIterable(E[]arr) {
		
		this.arr=arr;
		this.size=arr.length;
		
	}
	
	
	public boolean add(E value) {
		
		try {
			arr[count]=value;
			count++;
			return true;
			
					
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}
	
	
	
	
	public boolean set (int index,E value){
		
		try {
			
			this.arr[index]=value;
			return true;
			
		} catch (Exception e) {
			System.out.println("OutOfBoundIndex ");
			System.out.println(e.getMessage());
			return false;
		}
		
	}
	
	public boolean remowe(int index) {
		if(size>0) {
		if(index>=0 && index<=arr.length) {
			
			this.arr[index]=null;
			return true;
		}else {
			System.out.println("OutBoundIndex");
			return false;
		}
		}else {
			System.out.println("array is null");
			return false;
		}
		
		
		
		
	}
	
	


	
	
	public String toString() {
		
		//return Arrays.toString(arr);
		String arrg=null;
		
		if(arr!=null) {
			
			arrg="[ ";
			
			if(arr[0+1]==null) {
				
				arrg=arrg+arr[0];
			}else {
				
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]!=null)
					arrg=arrg+arr[i]+" , ";
				}
				
				
			}return arrg+" ]";
			
			
			
		
		
		}return "no";
			
		
}
		
		
	
	
	
	public int  size() {
		
		return size;
		
	}

	
		
	
 
 
 
	

	

	@SuppressWarnings("hiding")
	class MyIterator<E> implements Iterator<E>{
		
		private E[] arr;
		int count=0;
		E next;
		int size;
		
		 public MyIterator(E[]arr) {
				this.arr=arr;
			this.size=arr.length;
		}
		

		@Override
		public boolean hasNext() {
			
			return size>0;
		}

		@Override
		public E next() {
			if(this.hasNext()) {
			next=arr[count];	
			count++;	
			size--;
			}
			return next;
		}
		
		
     

	
	
	
	
	
	
	
	
	
}











	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(arr);
	}
	
 }	

 class Word {
	
	 String value;
	
	public Word(String val) {
		
		this.value=val;
		
	}
	
	static Word factory(String val) {
		
 return new Word(val); 		
	}
	
	public String toString() {
		
		return this.value;
		
	}
	
	
	
	
}






 











