package leetcode;

public class jump45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,3,1,1,4};
		System.out.println(jump(nums));
	}
	public static int jump(int[] nums) {
        //step:跳跃步数	curEnd:当前子区间末尾位置	  maxLen:当前子区间所能达到最大位置
		int maxLen = 0, step = 0, curEnd = 0;
		for(int i = 0; i < nums.length-1; i++) {
			maxLen = Math.max(maxLen, i+nums[i]);
			if(i == curEnd) {
				step++;
				curEnd = maxLen;
                if(maxLen >= nums.length-1){
                    return step;
                }
			}
		}
		
		return 0;
    }
}
