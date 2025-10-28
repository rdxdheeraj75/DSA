package week3;

import java.util.Arrays;

public class NumberofValidParenthesesExpressions2 {

	//https://www.geeksforgeeks.org/dsa/find-number-valid-parentheses-expressions-given-length/
	public static void main(String[] args) {
		
		int n = 6;
		
		// n can't be odd because we have to divide n equally with opening and closing brackets
		
		int[][] dp = new int[n+1][n];
		
		for(int[] a: dp)
		Arrays.fill(a, -1);
		
		int res = rec(n-1,1,dp);
		
		
		System.out.println(res);
	}
	
	//[Better Approach] Using recursion and DP - O(n^2) Time and O(n^2) Space
	public static int rec(int n,int sign,int[][] dp) {
		
		if(n == 0) {
			if(sign == 0)
				return 1;
			
			return 0;
		}
	
		if(dp[n][sign] != -1)
			return dp[n][sign];
		
		int case1 = 0;
		
		if(sign >= 1)
		case1 = rec(n-1,sign-1,dp);
		int case2 = rec(n-1,sign+1,dp);
		
		return dp[n][sign] = case1 + case2;
	}

}
