package sorting;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,1,6,9,-3,87,0};
		quickSort(arr,0,7);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void quickSort(int[] arr, int s, int e) {
		
		// base case
		if(s>=e)
			return;
		
		int pivot = partition(arr,s,e);
		
		quickSort(arr,s,pivot-1);
		quickSort(arr,pivot+1,e);
		
	}
	
	static void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static int partition(int[] arr, int s, int e) {
		
		int pivot = arr[s];
		
		int count = 0;
		for(int i=s; i<=e; i++) {
			if(arr[i] < pivot)
				count++;
		}
		
		swap(arr,s,s+count);
		
		int i=s;
		int j=e;
		while(i<j) {
			
			if(arr[i] < pivot) {
				i++;
			}
			else if(arr[j] > pivot) {
				j--;
			}
			else
			{
				swap(arr,i,j);
				i++;
				j--;
			}
			
		}
		
		return s + count;
		
	}

}
