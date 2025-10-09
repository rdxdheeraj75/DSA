package week2questions;

import java.util.Arrays;

public class KthSmallest {
	
	public static void main(String[] args) {
		
		//int[] arr = {12, 3, 5, 7, 19};
		//int k = 2;
		
		int[] arr = {7, 10, 4, 3, 20, 15};
		int k = 3;
		
		int ans = search(arr,k);
		
		System.out.println(ans);
		
	}
	
	public static int search(int[] arr,int k) {
		
		int n = arr.length;
		int mn = Arrays.stream(arr).min().getAsInt();
		int mx = Arrays.stream(arr).max().getAsInt();
		
		int st = mn;
		int end = mx;
		
		while(st <= end) {
			
			int mid = st + (end-st)/2;
			
			int lessCount = 0;
			int equalCount = 0;
			
			for(int i=0; i<n; i++) {
			
				if(arr[i] == mid) 
					equalCount++;
				else if(arr[i] >= st && arr[i] < mid) 
					lessCount++;
			}
			
			if(lessCount < k) {
				
				if(lessCount + equalCount == k) {
					return mid;
				}
				else {
					st = mid+1;
					k -= lessCount;
				}
				
			}
			else {
				end = mid-1;
			}
			
		}
		
		return 0;
	}

}
