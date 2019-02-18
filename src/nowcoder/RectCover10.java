package nowcoder;

public class RectCover10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RectCover(1));
	}
	public static int RectCover(int target) {
        /*
         * 链接：https://www.nowcoder.com/questionTerminal/72a5a919508a4251859fb2cfb987a0e6
来源：牛客网

		if ( number < 1 ) return 0;
        int g = 1, f = 2;
        while ( --number ) {
            f = f + g;
            g = f - g;
        }
        return g;
         */
		
		if(target == 1) return 1;
		if(target == 2) return 2;
		int left = 1, right = 2;
		int res = left + right;
		for(int i=2; i<target; i++) {
			res = left + right;
			left = right;
			right = res;
		}
		
		return res;
    }
}
