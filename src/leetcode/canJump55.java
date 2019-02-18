package leetcode;

public class canJump55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,3,1,1,4};
		System.out.println(canJump(nums));
	}
	public static boolean canJump(int[] nums) {
        
		if(nums == null || nums.length == 1) return true;
		int maxLen = 0;
		for(int i = 0; i < nums.length; i++) {
            if(i > maxLen) return false;
            if(maxLen >= nums.length) return true;
			maxLen = Math.max(maxLen, i+nums[i]);
		}
		
		return true;
    }
}



/*
 * DP Solution
For some reason this seems to beat 93% of solutions despite being O(n^2). I wonder why?

//dp[i] == true -> element with index i is reachable
class Solution {
public:
    bool canJump(vector<int>& nums) {
        if(nums.size()<=1) return true;
        if(nums[0] ==0)return false; 
        vector<bool> dp(nums.size(),false); 
        dp[0] = true;
        int n = nums.size();
        for(int i=1;i<n;i++){
            for(int j = i-1;j>=0;j--){
                if(dp[j] && ((nums[j]+j)>=i)){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n-1];
    }
};
 */

/*
 * Dynamic Programming
Looking from the end and at each point ahead checking the best possible way to reach the end

    bool canJump(vector<int>& nums) {
        int n = nums.size();
        vector<bool> jump(n,false);
        jump[n-1]=true;
        
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<=nums[i] && i+j<n;j++)
            {
                if(jump[i+j]==true) 
                {
                    jump[i]=true; 
                    break;
                }
            }
        }
        
        return jump[0];
    }
 */

