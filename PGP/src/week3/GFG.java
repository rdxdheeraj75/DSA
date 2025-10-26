package week3;

//Java Code to Rearrange Array Elements
//using Cycle Replacement
import java.util.*;

public class GFG {

	// Rearrange elements in a cycle
	// starting at arr[i]
	static void rearrangeUtil(int[] arr, int i) {

		int n = arr.length;

		// Store the index
		int val = -(i + 1);

		i = arr[i] - 1;

		while (arr[i] > 0) {

			int next = arr[i] - 1;

			// Update current index
			arr[i] = val;

			// Update value for next cycle
			val = -(i + 1);

			i = next;
		}
	}

	// Rearrange arr[] so that arr[j]
	// becomes i if arr[i] is j
	static void rearrange(int[] arr) {

		int n = arr.length;

		// Increment all values
		for (int i = 0; i < n; i++) {
			arr[i]++;
		}

		// Process cycle
		for (int i = 0; i < n; i++) {

			if (arr[i] > 0) {
				rearrangeUtil(arr, i);
			}
		}

		// Restore original range
		for (int i = 0; i < n; i++) {
			arr[i] = (-arr[i]) - 1;
		}
	}

	static void printArray(int[] arr) {

		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 2, 0, 1, 4, 5, 3 };

		rearrange(arr);

		printArray(arr);
	}
}
