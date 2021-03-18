package data_structure.heaps;

import java.util.Arrays;
import java.util.Comparator;



class ArrayBuff<T>{
	
	
	Object [] arr=  new Object[100];
	int size=0;
	Comparator<? super T> cmp;
	
	
	
	
	
	
	public boolean add(T element) {
		
		int i=size;
		
		if(element==null) {
			
			return false;
		}else
		{
		
			arr[i]=element;
			
			
		size++;
		
		// heapifying after adding an element 
		
		SiftUp(arr,element,size,cmp);
		
		
		return true;}
		
	}

	
	
	
	@SuppressWarnings("unchecked")
	private  void SiftUp(Object [] arr,T element,int i,Comparator<? super T > cmp) {
		
		Comparable<? super T> el =(Comparable<? super T>)element;
		
		while(i>0) {
			
			int childIndex=i-1;
			
			int parentIndex =(childIndex-1)/2;
			
			Object parent=arr[parentIndex];
			
			// putting the least child to the right	
			rotate(parentIndex,arr);
			
			
			
			
			
			
				if(el.compareTo((T)parent)>0) {
				
				childIndex=Arrays.asList(arr).indexOf(el);
				
				swap(parentIndex,childIndex,arr);
				
				i=parentIndex+1;
				
				}else {
					
					break;
				}
			}
		
	
}	
		
	
	 
	
	private void rotate(int parentIndex,Object[]arr) {
		
		
		
		int left=parentIndex*2+1;
		int right=parentIndex*2+2;
		
		
		Comparable<?super T> leftChild=(Comparable<? super T>) arr[left];	
		
		Comparable<?super T> rightChild=(Comparable<? super T>) arr[right];
		
		if(leftChild!=null && rightChild!=null) 
		
		if(leftChild.compareTo((T) rightChild)>0) 
			
			swap(left,right,arr);
		
	}
	
	
	
	private void swap(int p, int c,Object[]arr) {
		
		Object temp=arr[p];
		
		arr[p]=arr[c];
		
		arr[c]=temp;
		
		
		
		
		
	}
	
	
 
 
	
	
	
	
	
	       public String toString() {
		
		return Arrays.toString(arr);
		
		
	}
	
}




public class Sieve {
	
	public static void main(String[] args) {
		
		ArrayBuff<Integer> ab=new ArrayBuff<>();
		
	  ab.add(2);
	  ab.add(5);
	  ab.add(1);
	  ab.add(0);
	  ab.add(500);
	  ab.add(4);
	  ab.add(7);
	  ab.add(73);
	  ab.add(2);
	  ab.add(8);
	  ab.add(1);
	  
	  System.out.println(ab);
	  
	  
	  
	  
		ArrayBuff<String> ab1=new ArrayBuff<>();
		
		  ab1.add("2");
		  ab1.add("5");
		  ab1.add("1");
		  ab1.add("0");
		  ab1.add("580");
		  
		  
		  System.out.println(ab1);
		
		
		

	}

}
