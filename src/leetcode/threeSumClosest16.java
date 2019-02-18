package leetcode;

import java.util.Arrays;

public class threeSumClosest16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int threeSumClosest(int[] nums, int target) {
        
		int len = nums.length;
		int diff = Integer.MAX_VALUE;
		Arrays.sort(nums);
		int result = 0;
		for(int i = 0; i < len; i++) {
			int left = i+1, right = len-1;
			while(left < right) {
				int tempSum = nums[i] + nums[left] + nums[right];
				if (tempSum == target) {
					return target;
				}
				int tempDiff = Math.abs(tempSum - target);
				if (tempDiff < diff) {
					diff = tempDiff;
					result = tempSum;
				}
				if (tempSum < target) {
					left++;
				}else {
					right--;
				}
			}
		}
		
		
		return result;
    }
}
/* leetcode较好解
 * class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        
        if (len < 3) {
            return 0;
        }
        
        Arrays.sort(nums);
        
        int res = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < len; i++) {
            int j = i+1;
            int k = len-1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
                
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        return res;
    }
}
 */

/*第一版效率低下
	int len = nums.length;
	int diff = 10000000;
	for(int i = 0; i < len; i++) {
		int tempTarget = target - nums[i];
		for(int n = 0; n < len && n != i; n++) {
			for(int m = 0; m < len && m != n && m != i; m++) {
				int temp = tempTarget - nums[n] - nums[m];
				if (Math.abs(temp) < Math.abs(diff)) {
					diff = temp;
					if (diff == 0) {
						return target;
					}
				}
			}
		}
	}
	
	return target - diff;

*/