package leetcode;

public class mergeSortedArray88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1 = {2,0};
		int []nums2 = {1};
		merge(nums1, 1, nums2, 1);
		for(int nums : nums1) {
			System.out.println(nums);
		}
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		if (n == 0) {
			return ;
		}
		if (m == 0) {
			while(n > 0) {
				nums1[n-1] = nums2[n-1];
				n--;
			}
			return;
		}
		
        for(int i=m+n-1; i>=0; i--) {
        	if(nums1[m-1] > nums2[n-1]) {
        		nums1[i] = nums1[m-1];
        		m--;
        		if (m == 0) {
					for(i--; i>=0; i--) {
						nums1[i] = nums2[n-1];
						n--;
					}
				}
        	}else {
				nums1[i] = nums2[n-1];
				n--;
				if (n == 0) {
					break;
				}
			}
        }
    }
}


/* leetcode 3ms 代码更加简洁明了， 2ms的方法采用了新数组
 * class Solution {
   public void merge(int[] nums1, int m, int[] nums2, int n) {   
        int length = m+n-1;
        int index1 = m-1;
        int index2 = n-1;
        if(index2 < 0) {
            return;
        }
        for(int i=length; i>=0; i--) {
            if(index1 < 0) {
                nums1[i] = nums2[index2];
                index2 -= 1;
                continue;
            }
            if(index2 < 0) {
                nums1[i] = nums1[index1];
                index1 -= 1;
                continue;
            }
            if(nums1[index1] >= nums2[index2]) {
                nums1[i] = nums1[index1];
                index1 --;
            }else {
                nums1[i] = nums2[index2];
                index2 --;
            }
        }     
    }
}
 */




