package leetcode;


public class searchRange34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {4,5,6,7,7,8,10,10,15};
		int target = 10;
		int []out = searchRange(nums,target);
		for(int o : out)
			System.out.println(o);
	}
    public static int[] searchRange(int[] nums, int target) {
        int [] defReturn = {-1,-1};
        if(nums == null || nums.length == 0) {
        	return defReturn;
        }
        int len = nums.length;
        int left=0, right=len-1, mid;
        while(left <= right) {
        	mid = left + (right-left)/2;
        	if(nums[mid] == target) {
        		right = mid;
        		/*while(nums[mid-1] == target) {
        			mid--;
        		}*/
        		for(;mid-1>=0;mid--) {
        			if(nums[mid-1] != target) {
        				break;
        			}
        		}
        		defReturn[0] = mid;
        		/*while(nums[right+1] == target) {
        			right++;
        		}*/
        		for(;right+1<=len-1;right++) {
        			if(nums[right+1] != target) {
        				break;
        			}
        		}
        		defReturn[1] = right;
        		return defReturn;
        	}else if(nums[mid] > target) {
        		right = mid-1;
        	}else {
        		left = mid+1;
        	}
        }
    	
    	return defReturn;
    }

}

/*
 * leetcode 3ms
 */

/*
 * class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        if(nums == null || nums.length == 0){
            return result;
        }
        int left = findLeftTarget(nums,target);
        int right = findRightTarget(nums,target);
        
        if(left == -1 || right == -1){
            result[0] = left == -1?right:left;
            result[1] = left == -1? right:left;
        }
        
        result[0] = left;
        result[1] = right;
        return result;
    }
    
    public int findLeftTarget(int[] nums, int target){
        
        int left = 0;
        int right = nums.length - 1;
        while(left < right-1){           
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                right = mid;
            }else if(nums[mid] > target ){
                 right = mid -1;
            }else{
                left = mid +1;
            }
        }
        if(nums[left] == target){
            return left;
        }
        if(nums[right] == target){
            return right;
        }
        return -1;
    }
    
        public int findRightTarget(int[] nums, int target){
        
        int left = 0;
        int right = nums.length - 1;
        while(left < right-1){           
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                left = mid;
            }else if(nums[mid] > target ){
                 right = mid -1;
            }else{
                left = mid +1;
            }
        }
        if(nums[right] == target){
            return right;
        }
        if(nums[left] == target){
            return left;
        }
        return -1;
    }
}
 */


