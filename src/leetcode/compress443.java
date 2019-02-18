package leetcode;

public class compress443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]chars = {'a','a','b','b','c','c'};
		int res = compress(chars);
		for(int i=0; i<res; i++) {
			System.out.print(chars[i] + " ");
		}
	}
	public static int compress(char[] chars) {
        
		if(chars == null || chars.length == 0) return 0;
		if(chars.length == 1) return 1;
		int res = 1;
		for(int i=1; i<chars.length; i++) {
			if(chars[i] == chars[i-1]) {
				if(i == chars.length-1) {
                    chars[res++] = '2';
                    return res;
                }
				for(int j=i+1; j<chars.length; j++) {
					if(chars[j] == chars[i]) {
						if(j == chars.length-1) {
							String temp = String.valueOf(j-i+2);
							for(int index = 0; index < temp.length(); index++)
								chars[res++] = temp.charAt(index);
							return res;
						}
					}else {
						String temp = String.valueOf(j-i+1);
						for(int index = 0; index < temp.length(); index++)
							chars[res++] = temp.charAt(index);
						//chars[res++] = chars[j];
						if(res < chars.length && chars[j] == chars[res-1] ) {
							chars[res++] = chars[j];
							i=j;
						}else {
							i=j-1;
						}
						break;
					}
				}
			}else {
				chars[res++] = chars[i];
			}
		}
		
		return res;
    }
}

/*
 * public int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray()) 
                    chars[indexAns++] = c;
        }
        return indexAns;
    }
 */



