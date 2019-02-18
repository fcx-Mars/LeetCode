package leetcode;

public class sortArrayByParity905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A = {3,1,2,4};
		A = sortArrayByParity(A);
		for(int a : A) {
			System.out.println(a);
		}
	}
	/*
	 * 使用位运算代替求余操作
	 */
	public static int[] sortArrayByParity(int[] A) {
        
		if(A == null || A.length < 2) return A;  //leetcode中删除该行运行时间达到16ms，直接double
		int len = A.length-1;
		int start = 0, end = len;
		while(start < end) {
			if (A[start] % 2 == 0) {
				if(start < len) {
					start++;
				}else {
					break;
				}
				
			}else if (A[end] % 2 == 1) {
				if (end > 0) {
					end--;
				}else {
					break;
				}
				
			}else {
				int temp = A[start];
				A[start++] = A[end];
				A[end--] = temp;
			}
		}
		
		return A;
    }
}
