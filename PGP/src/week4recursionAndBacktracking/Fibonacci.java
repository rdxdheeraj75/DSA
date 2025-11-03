package week4recursionAndBacktracking;

public class Fibonacci {
	
	public static int fib(int n) {
		
		if(n == 1 || n == 2)
			return n-1;
		
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 ....
		
		int n = 9;
		
		int res = fib(n);
		
		System.out.println(res);

	}

}

