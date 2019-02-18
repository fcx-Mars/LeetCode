package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-4 -1 -1 0 1 2
		int []nums = {0,0,0};
		List<List<Integer>> res = threeSum(nums);
		for(List list : res) {
			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> threeSum(int[] nums) {
        
		Arrays.sort(nums);
		int len = nums.length;
		List<List<Integer>> res = new ArrayList<>();
		for(int i=0; i<len-2; i++) {
			if (nums[i] + nums[i+1] + nums[i+2] > 0) {
				break;
			}
			if (i>0 && nums[i] == nums[i-1]) {
				continue;
			}
			int left = i+1, right = len-1;
			while(left < right) {
				if (nums[i] + nums[left] + nums[right] == 0) {
					res.add(Arrays.asList(nums[i],nums[left],nums[right]));
					left++;
					right--;
					while (left<right && nums[left] == nums[left-1])  left++;
					while(left<right && nums[right] == nums[right+1]) right--;
				}else if (nums[i] + nums[left] + nums[right] > 0) {
					right--;
				}else {
					left++;
				}
			}
//			while(i+1<len && nums[i+1] == nums[i]) {
//				i++;
//			}
		}
		
		return res;
    }
}
