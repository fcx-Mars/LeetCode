package leetcode;

public class findMin153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {4,5,6,7,8,9,-1,0,1,2,3};
		int min = findMin(nums);
		System.out.println(min);
	}
	public static int findMin(int[] nums) {
        
		if(nums == null || nums.length == 0) {
			return -1;
		}
		int len = nums.length;
		int left=0, right=len-1, mid;
		while(left < right) {
			mid = left + (right-left)/2;
			if(nums[mid] > nums[left]) {
				left = mid;
			}else {
				right = mid;
			}
		}
		
		return nums[right];
    }

}
