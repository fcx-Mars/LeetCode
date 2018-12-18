package leetcode;

public class findDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,2,2,2,2};
		int result = findDuplicate1(nums);
		System.out.println(result);
	}
	public static int findDuplicate1(int[] nums) {
        int len = nums.length;
        
        for(int i=0; i<len-1; i++) {
        	for(int j=i+1; j<len; j++) {
        		if(nums[i] == nums[j]) {
        			return nums[i];
        		}
        	}
        }
        return -1;
    }
}



/*
 * 
 * class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        int len = nums.length;
        while (fast < len && nums[fast] < len) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                slow = 0;
                while (slow != fast) {
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return slow;
            }
        }
        return -1;
    }
}
*/
