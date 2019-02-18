package leetcode;

import java.lang.invoke.ConstantCallSite;

public class removeDuplicates80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {0,0,0,2};
		int res = removeDuplicates(nums);
		System.out.println(res);
		for(int i=0; i<res; i++) {
			System.out.println(nums[i]);
		}
	}
	public static int removeDuplicates(int[] nums) {
        
		if(nums == null || nums.length == 0) return 0;
		if(nums.length < 3) return nums.length;
		int res = 0,  i = 0;
		for(; i<nums.length-2; i++) {
			if(nums[i] == nums[i+1] && nums[i] == nums[i+2]) {
				int j=i+3;
				for(; j<nums.length; j++) {
					if (nums[j] != nums[i]) {
						nums[res++] = nums[i];
						nums[res++] = nums[i];
						i=j-1;
						break;
					}
				}
				if(j == nums.length) {
					nums[res++] = nums[i++];
					nums[res++] = nums[i++];
					return res;
				}
			}else {
				nums[res++] = nums[i];
			}
		}
		while(i < nums.length)
		    nums[res++] = nums[i++];
		
		return res;
    }
}


/*leetcode优秀解，少考虑了此数组为排序数组
 * public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i] = n;
                i++;
            }
        }
        
        return i;
    }
 */


