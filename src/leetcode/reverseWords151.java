package leetcode;

public class reverseWords151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String reverseWords(String s) {
        
		char []str = s.toCharArray();
		int left = 0, right = 0, res = 0;
		boolean flag = false;
		for(int i=str.length-1; i>=0 ; i--){
			if((str[i] >='a' && str[i] <= 'z') || (str[i] >='A' && str[i] <= 'Z') ) {
				 if(flag ) {
					 left = i;
					 continue;
				 }else {
					 right = i;
					 flag = true;
					 continue;
				 }
			}
			if (flag ) {
				for(int j=left+1; j<=right; j++) {
				}
			}
		}
		
		return s;
    }
}
