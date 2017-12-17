
public class SortingAlgorithmPractices {
	public static void main(String[] args) {
		int[] myTestArr = {1,3,2,4,5};
		quick(myTestArr, 0, myTestArr.length-1); 
		printArray(myTestArr);
	}
	
	public static void bubble(int[] list) {
		int i; boolean done = false; 
		
		while(done == false) { 
			done = true; 
			for (i = 1; i < list.length; i++) {
				if (list[i-1] > list[i]) {
					done = false; 
					swap(list, i-1,i);
				}
			}
		}
	}
	
	public static void printArray(int[] list) {
		for (int i =0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

	private static void swap(int[] list, int i, int i2) {
		int temp = list[i];
		list[i] = list[i2];
		list[i2] = temp;
	}
	
	public static void selection(int[] list) {
		int i,j, min; 
		
		for (i = 0; i < list.length-1; i++) {
			min = i;
			for (j= i+1; j < list.length-1; j++) {
				if (list[min] > list[j]) {
					min = j;
				}
			}
			swap(list, i, min);
			}
	}
	
	public static void insertion(int[] list) {
		int i, j, temp; 
		for (i = 1; i < list.length; i++) {
			temp = list[i];
			for (j = i; j > 0 && list[j-1] > temp; j--) {
				list[j] = list[j-1];
			}
			list[j] = temp;
		}
	}
	
	public static int[] merge(int[] list) {
		int N = list.length;
		if (N <= 1) {
			return list;
		}
		int[] a = new int[N/2];
		int[] b = new int[N - N/2];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = list[i];
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = list[i + N/2];
		}
		return mergeLists(merge(a), merge(b));
	}
	
	// Utility method for merging two lists
	public static int[] mergeLists(int[] a, int[] b){
		int[] c = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		for (int k = 0; k < c.length; k++) {
			if (i >= a.length) {
				c[k] = b[j++];
 			}
			else if (j >= b.length) {
				c[k] = a[j++];
			}
			else if (a[i] <= b[j]) {
				c[k] = a[i++];
			}
			else {
				c[k] = b[j++];			}
		}
		return c; 
	}
	
	public static void quick(int[] list, int low, int high ) {
		if (list == null || list.length == 0) {
			return; 
		}
		
		if (low >= high) {
			return;
		}
		
		// Select the pivot
		int middle = low + ((high -low)/2);
		int pivot = list[middle];
		
		// Make left < pivot and right > pivot
		int i = low;
		int j = high;
		
		while(i <= j) { 
			while(list[i] < pivot) {
				i++;
			}
			while(list[j] > pivot) {
				j--;
			}
			
			if (i <= j) {
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp; 
				i++;
				j--; 
			}
		}
	
		if (low < j) {
			quick(list, low, j);
		}
		if (high > i) {
			quick(list, i, high);
		}
	}

}
