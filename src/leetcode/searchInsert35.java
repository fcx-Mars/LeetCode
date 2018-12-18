package leetcode;

public class searchInsert35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {4,5,6,7,8,10,15};
		int target = 16;
		int out = searchInsert(nums,target);
		System.out.println(out);
	}
	public static int searchInsert(int[] nums, int target) {
        
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int len = nums.length;
		int left=0, right=len-1, mid;
		while(left < right) {
			mid = left + (right-left)/2;
			if(nums[mid] == target) {
				return mid;
			}else if(nums[left] == target) {
				return left;
			}else if(nums[right] == target) {
				return right;
			}else {
				if(nums[mid] > target) {
					right = mid-1;
				}else {
					left = mid+1;
				}
			}
		}
		
		return nums[left]<target ? left+1 : left;
    }
}
