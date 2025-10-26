package week3;

import java.util.Arrays;

public class ModifyAnArray {

	//https://www.geeksforgeeks.org/dsa/rearrange-array-arrj-becomes-arri-j/
	public static void main(String[] args) {
		
		//int[] arr = {2,0,1};
		
		int[] arr = {2, 0, 1, 4, 5, 3};
		
		modify2(arr);

	}
	
	// [Expected Approach 1] Using Cycle Replacement - O(n) Time and O(1) Space
	public static void modify1(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			arr[i]++;
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i] > 0) {
				modifyUtil(arr,i);
			}
		}
		
		for(int i=0; i<n; i++) {
			arr[i] = -arr[i] - 1;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void modifyUtil(int[] arr, int i) {
		// 		2, 0, 1, 4, 5, 3
		//		0  1  2  3  4  5
		
		// 		3, 1, 2, 5, 6, 4
		//		0  1  2  3  4  5
		
		// 		3, 1, -1, 5, 6, 4
		//		0  1  2  3  4  5
		
		// 		-2, -3, -1, 5, 6, 4
		//		 0  1   2   3  4  5
		
		
		int n = arr.length;
		
		int val = -(i+1); // -1
		
		i = arr[i] - 1;  // 2
		while(arr[i] > 0) { // i-> 2
			
			int next = arr[i] - 1;  // next-> 2
			
			arr[i] = val;  
			
			val = -(i+1);
			
			i = next;
		}
		
	}
	
	// [Expected Approach 2] Using Modulo - O(n) Time and O(1) Space
	public static void modify2(int[] arr) {
		
		// 		2, 0, 1, 4, 5, 3
		//		0  1  2  3  4  5
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			
			int idx = arr[i]%n;
			
			arr[idx] = arr[idx] + n*i;
			
		}
		
		for(int i=0; i<n; i++) {
			arr[i] = arr[i]/n;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	// [Brute Force Approach] Using an Extra Array - O(n) Time and O(n) Space
	public static void modify(int[] arr) {
		
		int n = arr.length;
		
		int[] ans = new int[n];
		for(int i=0; i<n; i++) {
			ans[arr[i]] = i;
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
