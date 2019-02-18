package leetcode;

public class removeElement27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {0,1,2,2,3,0,4,2};
		int len = removeElement(nums, 2);
		System.out.println(len);
 	}
	public static int removeElement(int[] nums, int val) {
        
		if(nums == null) return 0;
		int res = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != val) nums[res++] = nums[i];
		}
		
		return res;
    }
}
