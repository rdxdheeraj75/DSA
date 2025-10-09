package sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void swap(int i,int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		
		int[] arr = {64,25,12,22,11};
		
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					swap(i,j,arr);
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
