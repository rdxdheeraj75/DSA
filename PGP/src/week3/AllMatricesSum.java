package week3;

public class AllMatricesSum {

	//https://www.geeksforgeeks.org/dsa/sum-of-all-submatrices-of-a-given-matrix/
	public static void main(String[] args) {
		
		//int[][] mat = {{1,1},{1,1}};
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		
		int sum = sumOfAllSubMatrices2(mat);
		System.out.println(sum);

	}
	
	// optimized approach( better version of sub-array sum)
	public static int sumOfAllSubMatrices2(int[][] mat) {
		
		int n = mat.length;
		int res = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int count = (i+1)*(j+1)*(n-i)*(n-j);
				res += count*mat[i][j];
			}
		}
		
		return res;
	}
	
	// brute force approach ( all possibility of top-left and bottom-right corner
	public static int sumOfAllSubMatrices(int[][] mat) {
		
		int n = mat.length;
		int res = 0;
		
		for(int topRow=0; topRow<n; topRow++) {
			for(int topCol=0; topCol<n; topCol++) {
				for(int endRow=topRow; endRow<n; endRow++) {
					for(int endCol=topCol; endCol<n; endCol++) {
						
						int subMatrixSum = 0;
						
						for(int i=topRow; i<=endRow; i++) {
							for(int j=topCol; j<=endCol; j++) {
								subMatrixSum += mat[i][j];
							}
						}
						
						res += subMatrixSum;
						
					}
				}
			}
		}
		
		return res;
	}

}
