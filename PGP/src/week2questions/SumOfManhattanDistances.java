package week2questions;

import java.util.Arrays;

public class SumOfManhattanDistances {

	public static void main(String[] args) {
		
		int x[] = { -1, 1, 3, 2 };
        int y[] = { 5, 6, 5, 3 };
        int n = x.length;

        System.out.println(distancesum(x) + distancesum(y));

	}
	
	static int distancesum(int arr[]) {
		
		Arrays.sort(arr);
		int n = arr.length;
		int res = 0;
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			res += arr[i]*i - sum;
			sum += arr[i];
		}
		
		return res;
	}

}
