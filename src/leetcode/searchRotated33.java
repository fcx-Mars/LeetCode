package leetcode;

public class searchRotated33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {5,1,2,3,4};
		int target = 1;
		int out = search(nums,target);
		System.out.println(out);
	}
	public static int search(int[] nums, int target) {
       // int len = nums.length;
        //if (len == 0) {
			//return -1;
		//}  差异在哪
        if(nums == null || nums.length == 0) {
        	return -1;
        }
        int len = nums.length;
        //num[0]具有特殊性
        int left=0,right=len-1, mid=0;
        /*while(left <= right) {   //10ms
        	mid = left + (right-left)/2;
        	if (nums[mid] == target) {
				return mid;
			}else if (nums[left] == target) {
				return left;
			}else if (nums[right] == target) {
				return right;
			}else if (nums[mid] > target) {
				if (nums[mid] > nums[0]) {
					if (nums[0] > target) {
						left = mid+1;  //情况1
					}else {
						right = mid-1;  //情况2
					}
				}else {  //情况3
					right = mid-1; //当时写错了
				}
			}else {  
				if (nums[mid] > nums[0]) {
					left = mid+1;  //情况4
				}else {  
					if (target > nums[0]) {
						right = mid-1;  //情况5
					}else {
						left = mid+1;  //情况6
					}
				}
			}
        }*/  //5ms
        while(left  < right) {  //这个地方需要注意
        	mid = left + (right-left)/2;
        	if (nums[mid] == target) {
				return mid;
			}else if (nums[left] == target) {
				return left;
			}else if (nums[right] == target) {
				return right;
			}else if (nums[mid] > target) {
				if (nums[mid] > nums[0] && nums[0] > target) {
					left = mid+1;  //情况1
				}else {
						right = mid-1;  //情况2
				}
			}else {  
				if (nums[mid] < nums[0] && target > nums[0]) {
					right = mid-1;  //情况4
				}else {  
						left = mid+1;  //情况6
				}
			}
        }
        
        return -1;
    }
}
