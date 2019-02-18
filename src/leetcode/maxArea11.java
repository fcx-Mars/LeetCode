package leetcode;

public class maxArea11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxArea(int[] height) {
   
//		非常糟糕的解法
//		int res = 0;
//		for(int i=0; i<height.length-1; i++) {
//			for(int j=i+1; j<height.length; j++) {
//				int temp = (j-i)*(height[i]>height[j] ? height[j] : height[i]);
//				if(temp > res) {
//					res = temp;
//				}
//			}
//		}
		int res = 0;
		int left = 0, right = height.length-1;
		
		while(left < right) {
			if(height[left] < height[right]) {
				res = Math.max(height[left]*(right-left), res);
				left++;
			}else {
				res = Math.max(height[right]*(right-left), res);
				right--;
			}
		}
		
		return res;
    }
}
