package leetcode;

public class plusOne66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []digits = {9,9};
		digits = plusOne(digits);
		for(int dig : digits) {
			System.out.println(dig);
		}
	}
	public static int[] plusOne(int[] digits) {
        
		int len = digits.length - 1;
		int col = 1, temp = 0;
		while(len >= 0) {
			temp = digits[len] + col;
			digits[len] = temp%10;
			col = temp/10;
			if (len == 0 && col == 1) {
				int []res = new int[digits.length+1];
				res[0] = 1;
				return res;
			}
			len--;
		}
		
		
		return digits;
    }
}

/*想复杂了
 * int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
}
 */



