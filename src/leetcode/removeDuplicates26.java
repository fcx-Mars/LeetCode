/**
 * 
 */
package leetcode;

/**
 * @author FCX
 *
 */
public class removeDuplicates26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,2,2,2,3,4,5,6,6,7,8,9};
		int res = removeDuplicates(nums);
		System.out.println(res);
	}
	public static int removeDuplicates(int[] nums) {
        
//		if(nums == null) return 0;
//		if(nums.length == 1) return 1;
//		int len = nums.length;
//		int slow = 0, fast = 1;
//		while(fast < len) {
//			if (nums[fast] == nums[slow]) {
//				fast++;
//			}else {
//				nums[++slow] = nums[fast];
//				fast++;
//			}
//		}
//		
//		return slow+1;
		
		if(nums == null || nums.length == 0) return 0;
		int res = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[res]) nums[++res] = nums[i];
		}
		return res+1;
    }
}
