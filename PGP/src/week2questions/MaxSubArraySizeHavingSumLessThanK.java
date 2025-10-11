package week2questions;

public class MaxSubArraySizeHavingSumLessThanK {
	
	// https://www.geeksforgeeks.org/dsa/maximum-subarray-size-subarrays-size-sum-less-k/

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int k = 8;
		
		int ans = getMax(arr,k);
		
		System.out.println(ans);

	}
	
	public static boolean isValid(int[] arr,int st,int end,int mid,int k) {
		
		int i = st;
		int j = st + mid - 1;
		
		if(j > end)
			return false;
		
		int sum = 0;
		
		while(i < j) {
			sum += arr[i++];
		}
		i = st;
		while(j <= end) {
			
			sum += arr[j];
			
			if(sum > k)
				return false;
			
			sum = sum - arr[i];
			j++;
			i++;
		}
		
		if(sum > k)
			return false;
		
		return true;
		
	}
	
	public static int getMax(int[] arr, int k) {
		
		int n = arr.length;
		int st = 1;
		int end = n-1;
		int ans = -1;
		
		for(int it: arr)
			if(it > k)
				return ans;
		
		while(st <= end) {
			
			int mid = st + (end-st)/2;
			
			if(isValid(arr,st,end,mid,k) == true) {
				ans = mid;
				st = mid+1;
			}
			else
			{
				end = mid-1;
			}
			
		}
		
		
		return ans;
	}

}
