package sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void swap(int i,int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,1,7,6,14,9};
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			
			for(int j=i; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(j,j+1,arr);
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
