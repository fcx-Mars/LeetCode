package nowcoder;

public class searchTarget1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]nums = {{1,3,5,7},{2,4,6,8},{4,5,7,9}};
		boolean res = Find(4,nums);
		System.out.println(res);
	}
	public static boolean Find(int target, int [][] array) {
        
		if(array == null || array.length == 0 || array[0].length == 0) return false;
		int row = array.length;
		int col = array[0].length;
		int i = 0, j = col-1;
//		for(int i = 0; i < row; i++) {
//			for(int j = col-1; j >= 0; j--) {
//				if (array[i][j] == target)  return true;
//				if (array[i][j] > target) {
//					continue;
//				}else {
//					break;
//				}
//					
//			}
//		}
		while(i<row && j>=0) {
			if(array[i][j] == target) return true;
			if (array[i][j] > target) {
				j--;
			}else {
				i++;
			}
		}
		
		return false;
    }
}
