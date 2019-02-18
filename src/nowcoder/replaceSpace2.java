/**
 * 
 */
package nowcoder;

/**
 * @author FCX
 *
 */
public class replaceSpace2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("We Are Happy");
		String res = replaceSpace(str);
		System.out.println(res);
	}
	public static String replaceSpace(StringBuffer str) {
    	/*
		if(str == null) return null;
		int len = str.length();
		for(int i=0; i<len; i++) {
			if(str.charAt(i) == ' ') {
				
				//面试不一定能用replace方法，用c的思路转成数组方式处理
				str.replace(i, i+1, "%20");
				len += 2;
			}
		}
		
		return str.toString();
		*/
		
		int spaceLen = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') spaceLen++;
		}
		int len = str.length()-1;
		int newLen = str.length()+spaceLen*2-1;
		str.setLength(newLen+1);
		for(; len>=0; len--) {
			if(len == newLen) break;
			if (str.charAt(len) == ' ') {
				str.setCharAt(newLen--,'0');
				str.setCharAt(newLen--,'2');
				str.setCharAt(newLen--,'%');
			}else {
				str.setCharAt(newLen--,str.charAt(len));
			}
		}
		return str.toString();
    }
}
