package nowcoder;

public class minNumberInRotateArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {1,1,1,0,1};
		System.out.println(minNumberInRotateArray(array));
	}
	/*此题需要更近一步理解，10111和11101,二分查找适合严格递增进行目标查找，否则需要遍历，牛客网测试用例不全。
	 * 如果碰到mid和left相等，直接left+1就行了
	 */
	public static int minNumberInRotateArray(int [] array) {
	    
		if(array == null || array.length == 0)  return 0;
		int left = 0, right = array.length-1, mid = 0;
		while(left+1 < right) {
			mid = (right - left)/2 + left;
			if(array[mid] > array[0]) {
				left = mid;
			}else if(array[mid] < array[right]){
 				right = mid;
			}else {
				left++;
			}
		}
		
		
		return array[right];
    }
}
/*
 * 链接：https://www.nowcoder.com/questionTerminal/9f3231a991af4f55b95579b44b7a01ba
来源：牛客网

#include <iostream>
#include <vector>
#include <string>
#include <stack>
#include <algorithm>
using namespace std;
 
class Solution {
public:
    int minNumberInRotateArray(vector<int> rotateArray) {
        int size = rotateArray.size();
        if(size == 0){
            return 0;
        }//if
        int left = 0,right = size - 1;
        int mid = 0;
        // rotateArray[left] >= rotateArray[right] 确保旋转
        while(rotateArray[left] >= rotateArray[right]){
            // 分界点
            if(right - left == 1){
                mid = right;
                break;
            }//if
            mid = left + (right - left) / 2;
            // rotateArray[left] rotateArray[right] rotateArray[mid]三者相等
            // 无法确定中间元素是属于前面还是后面的递增子数组
            // 只能顺序查找
            if(rotateArray[left] == rotateArray[right] && rotateArray[left] == rotateArray[mid]){
                return MinOrder(rotateArray,left,right);
            }//if
            // 中间元素位于前面的递增子数组
            // 此时最小元素位于中间元素的后面
            if(rotateArray[mid] >= rotateArray[left]){
                left = mid;
            }//if
            // 中间元素位于后面的递增子数组
            // 此时最小元素位于中间元素的前面
            else{
                right = mid;
            }//else
        }//while
        return rotateArray[mid];
    }
private:
    // 顺序寻找最小值
    int MinOrder(vector<int> &num,int left,int right){
        int result = num[left];
        for(int i = left + 1;i < right;++i){
            if(num[i] < result){
                result = num[i];
            }//if
        }//for
        return result;
    }
};
 
int main(){
    Solution s;
    //vector<int> num = {0,1,2,3,4,5};
    //vector<int> num = {4,5,6,7,1,2,3};
    vector<int> num = {2,2,2,2,1,2};
    int result = s.minNumberInRotateArray(num);
    // 输出
    cout<<result<<endl;
    return 0;
}
*/