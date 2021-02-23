public class Test {
	
	public static void sort(int[] A, int left, int right) {
	    if (right > left) {
	        // Choose outermost elements as pivots
	        if (A[left] > A[right])
	        	swap(A, left, right);
	        int p = A[left], q = A[right];

	        // Partition A according to invariant below
	        int l = left + 1, g = right - 1, k = l;
	        while (k <= g) {
	            if (A[k] < p) {
	                swap(A, k, l);
	                ++l;
	            } else if (A[k] >= q) {
	                while (A[g] > q && k < g) {--g;}
	                swap(A, k, g);
	                --g;
	                if (A[k] < p) {
	                    swap(A, k, l);
	                    ++l;
	                }
	            }
	            ++k;
	        }
	        --l;
	        ++g;

	        // Swap pivots to final place
	        swap(A, left, l);
	        swap(A, right, g);

	        // Recursively sort partitions
	        sort(A, left, l - 1);
	        sort(A, l + 1, g - 1);
	        sort(A, g + 1, right);
	    }
	}

	public static void swap(int[] A, int i, int j) {
	    final int tmp = A[i];
	    A[i] = A[j];
	    A[j] = tmp;
	}          
	  
	
	public static void main(String[] args){
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random() * array.length);
			System.out.print(array[i] +" ");
		}
		System.out.println("");
		
		sort(array, 0, array.length - 1);

		for(int i : array)
			System.out.print(i +" ");
    }
	
}