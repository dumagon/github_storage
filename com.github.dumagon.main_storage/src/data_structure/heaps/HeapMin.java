package data_structure.heaps;

import java.nio.channels.IllegalSelectorException;
import java.util.Arrays;

class HeapMin {
	
	private int capacity=5;
	private int size=0;
	
	int[] items=new int[capacity];
	
	
	HeapMin() {};
	
	HeapMin(int[] arr){
		
		
		
		
		
		while(arr.length>capacity) {
			items=Arrays.copyOf(items, capacity*2);
			
			capacity*=2;
		}
		
		this.items=Arrays.copyOf(arr, arr.length);
		
		
		
		
		size=arr.length;
		
		heapifyAll();
		
		arrangeLeft();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
private int getParentIndex(int childIndex) {return (childIndex-1)/2; }
private int getLeftChildIndex(int parentIndex) {return 2*parentIndex+1;}
private int getRightChildIndex(int parentIndex) {return 2*parentIndex+2;}

private boolean hasParent(int childIndex) {return getParentIndex(childIndex)>=0;}
private boolean hasLeftChild(int parentIndex) {return getLeftChildIndex(parentIndex)<size;}
private boolean hasRightChild(int parentIndex) {return getRightChildIndex(parentIndex)<size;}


private int parent(int childIndex) {return items[getParentIndex(childIndex)];}
private int leftChild(int parentIndex) {return items[getLeftChildIndex(parentIndex)];}
private int rightChild(int parentIndex) {return items[getRightChildIndex(parentIndex)];}


private void swap(int indexA,int indexB) {
	
	int temp =items[indexA];
	items[indexA]=items[indexB];
	items[indexB]=temp;
}



private void ensureCapacity() {
	if(size==capacity) {
	items=Arrays.copyOf(items, capacity*2);
	capacity*=2;}
	
}


public int peek() {
	if(size==0) throw new IllegalStateException("size=0");
	return items[0];
	}


public int poll() {
	if(size==0)throw new IllegalStateException("size=0");
	int item =items[0];
	items[0]=items[size-1];
	items[size-1]=0;
	
	size--;
	heapifyDown();
	return item;
}


public void add(int item) {
	ensureCapacity();
	items[size]=item;
	size++;
	heapifyUp();
}

private void heapifyUp() {
	int index=size-1;
	while(hasParent(index) && parent(index)>items[index]) {
		swap(getParentIndex(index),index);
		index=getParentIndex(index);
		
	}
	
}

private void heapifyDown() {
	int index=0;
	while(hasLeftChild(index)) {
		int smallestChildIndex=getLeftChildIndex(index);
		if(hasRightChild(index) && rightChild(index)<leftChild(index)) {
			smallestChildIndex=getRightChildIndex(index);}
		
		if(items[index]<items[smallestChildIndex]) {
			break;
		}else {
			
			swap(index,smallestChildIndex);
		}
         index=smallestChildIndex;  
		
	}
	
	
	
	}



private void heapifyAll() {
	
	int tempsize=size;
	
	for (int i = 0; i < items.length; i++) {
		heapifyUp();
		size--;
	}
	
	size=tempsize;
	
}


public void arrangeLeft() {
	int index=0;
	while(hasRightChild(index) && index<size) {
		
		if(leftChild(index)>rightChild(index))
			
			swap(getLeftChildIndex(index),getRightChildIndex(index));
		
		index++;
		
		
	}
	
	
}



public void arrangeRight() {
	
	int index=0;
	while(hasRightChild(index) && index<size) {
		
		if(leftChild(index)<rightChild(index))
			
			swap(getLeftChildIndex(index),getRightChildIndex(index));
		
		index++;
		
		
	}
	
}



public String toString() {
	
	return Arrays.toString(items);
	
}


}





























