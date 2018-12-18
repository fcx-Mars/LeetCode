package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findKthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrix = {{1,3,5},{1,8,9},{10,13,15}};
		int k = 2;
		int result = kthSmallest(matrix,k);
		System.out.println(result);
	}
	public static int kthSmallest(int[][] matrix, int k) {
        int len = matrix[0].length;
        int numbers = len*len;
        int []List = new int[numbers];
        for(int i=0; i<numbers; i++) {
        	List[i] = matrix[i/len][i%len];
        }
        Arrays.sort(List);
        
        return List[k-1];
    }
}


/*
 * class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rowLen = matrix.length, colLen = matrix[0].length;
        int low = matrix[0][0], hi = matrix[rowLen - 1][colLen - 1];
        while (low < hi) {
            int mid = low + (hi - low) / 2;
            int count = countNoBigger(matrix, mid);
            if (count < k) {
            	low = mid + 1;
            }
            else {
            	hi = mid;
            }
        }
        
        return low;
    }
	
	
	public int countNoBigger(int[][] matrix, int target) {
		int count = 0;
		int row = matrix.length - 1, col = 0;
		while (row >= 0 && col < matrix[0].length) {
			int val = matrix[row][col];
			if (val > target) {
				row--;
			}
			else {
				count += row + 1;
				col++;
			}
		}
		return count;
	}
}
 */


