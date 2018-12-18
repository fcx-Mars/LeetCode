package leetcode;

public class findRotatedMin154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {4,4};
		int min = findMin(nums);
		System.out.println(min);
	}
	public static int findMin(int[] nums) {
        
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int len = nums.length;
		int left=0, right=len-1, mid;
		if (len == 1 || nums[0] < nums[len-1]) {
			return nums[0];
		}
		while(left < right-1) {
			mid = left + (right - left)/2;
			if(nums[mid] > nums[right]) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return nums[left]<nums[left+1] ? nums[left] : nums[left+1];
		
    }
}
