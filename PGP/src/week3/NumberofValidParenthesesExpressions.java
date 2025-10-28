package week3;

public class NumberofValidParenthesesExpressions {

	//https://www.geeksforgeeks.org/dsa/find-number-valid-parentheses-expressions-given-length/
	public static void main(String[] args) {
		
		int n = 6;
		
		// n can't be odd because we have to divide n equally with opening and closing brackets
		
		int res = rec(n-1,1);
		
		System.out.println(res);
	}
	
	//[Naive Approach] Using recursion - O(2^n) Time and O(n) Space
	public static int rec(int n,int sign) {
		
		if(n == 0) {
			if(sign == 0)
				return 1;
			
			return 0;
		}
		
		if(sign < 0)
			return 0;
		
		int case1 = rec(n-1,sign-1);
		int case2 = rec(n-1,sign+1);
		
		return case1 + case2;
	}

}
