package leetcode;

public class searchRotatedDouble81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,2,2,2,2,2,2};
		int target = 2;
		boolean out = search(nums,target); 
		System.out.println(out);
	}
	
	//[0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]
	public static boolean search(int[] nums, int target) {
        
		if (nums == null || nums.length == 0) {
			return false;
		}
		int len = nums.length;
		while(nums[len-1] == nums[0]) {
			len--;
			if(len == 0) {
				if(nums[0] == target) {
					return true;
				}else {
					return false;
				}
					
			}
		}
		int left = 0, right = len-1, mid;
		while(left < right) {
			mid = left + (right-left)/2;
			if(nums[mid] == target || nums[left] == target || nums[right] == target) {
				return true;
			}
			if(nums[mid] > target) {
				if(nums[mid] >= nums[0] && nums[0] > target) {
					left = mid + 1;
				}else {
					right = mid - 1;
				}
			}else {
				/*if (nums[mid] >= nums[0]) {
					left = mid + 1;
				}else {
					if (nums[0] > target) {
						left = mid + 1;
					}else {
						right = mid -1;
					}
				}*/
				if (nums[mid] < nums[0] && nums[0] < target) {
					right = mid-1;
				}else {
					left = mid + 1;
				}
			}
		}
		
		
		return false;
    }

}
