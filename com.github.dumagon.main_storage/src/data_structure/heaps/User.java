package data_structure.heaps;

import java.util.Arrays;

class  User{
	
	
	
	public static void main(String[] args) {
		
		 int[] arr= {67,7,98,0,5,14,34,666,89};
		
		System.out.println("print arr "+Arrays.toString(arr));

		HeapMin heapAll =new HeapMin(arr);
		System.out.println("print arr "+Arrays.toString(arr));
		
		HeapMin heap =new HeapMin();
		
		HeapMax heapUp=new HeapMax();
		
		HeapMax heapUpArray=new HeapMax(arr);
		System.out.println("print arr "+Arrays.toString(arr));
		
		
		
		heap.add(3);
		heap.add(30);
		heap.add(355);
		heap.add(7);
		heap.add(66);
		heap.add(0);
		
		System.out.println(" print heap after addition.....");
		System.out.println(heap);
		
		heap.poll();
		
		System.out.println("print heap after polling ......");
		System.out.println(heap);
		
		heap.arrangeRight();
		
		System.out.println("print heap after right arrangment.....");
		System.out.println(heap);
		
		
		
		
		
		System.out.println("print heapAll after taken an array as a parameter......");
		System.out.println(heapAll);
		
        
		
		
		heapAll.arrangeRight();
		
		System.out.println("print heapAll after right arrangment........ ");
		System.out.println(heapAll);
		
		
		heapUp.add(3);
		heapUp.add(46);
		heapUp.add(700);
		heapUp.add(897);
		heapUp.add(7);
		
		heapUp.arrangeRight();
		
		System.out.println("print heapUp after addition .......");
		System.out.println(heapUp);
		
		
		
		
		System.out.println("print heapUpArray after taking an array as a parameter...... ");
		System.out.println(heapUpArray);
		
		
		
		
		
		
		
		
	
		
	}
	
	
}