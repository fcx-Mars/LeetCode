package nowcoder;


public class FindGreatestSumOfSubArray31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6,-3,-2,7,-15,1,2,2};
		System.out.println(FindGreatestSumOfSubArray(array));
	}
	/**
	 * 动态规划写出递归方程和边界条件求解
	 * @param array
	 * @return
	 */
	public static int FindGreatestSumOfSubArray(int[] array) {
        
		if(array.length == 1) return array[0];
		int maxSum = array[0];
		int tempSum = 0;
		boolean flag = false;
		boolean thanZero = false;
		for(int i=0; i<array.length; i++) {
			if(array[i] > 0 && !flag) {
				flag = true;
				thanZero = true;
				tempSum = array[i];
				if(tempSum > maxSum) {
					maxSum = tempSum;
				}
				continue;
			}
			if(flag && tempSum + array[i] > 0) {
				tempSum += array[i];
				if(tempSum > maxSum) {
					maxSum = tempSum;
				}
			}else if(flag && tempSum + array[i] <= 0) {
				tempSum = 0;
				flag = false;
			}
		}
		if (!thanZero) {
			for(int i=1; i<array.length; i++) {
				if (array[i] > maxSum) {
					maxSum = array[i];
				}
			}
		}
		return maxSum;
    }
}
/*
 * 链接：https://www.nowcoder.com/questionTerminal/459bd355da1549fa8a49e350bf3df484
来源：牛客网

		int res = array[0]; //记录当前所有子数组的和的最大值
        int max=array[0];   //包含array[i]的连续数组最大值
        for (int i = 1; i < array.length; i++) {
            max=Math.max(max+array[i], array[i]);
            res=Math.max(max, res);
        }
        return res;
*/
