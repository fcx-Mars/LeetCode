package leetcode;

public class isPalindrome125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Race a car";
		System.out.println(isPalindrome(string));
	}
	public static boolean isPalindrome(String s) {
        
		if(s == null || s.length() == 1) return true;
		s = s.toLowerCase();
		int res = 0;
		char []nums = new char[s.length()];
		for(int i=0; i<nums.length; i++) {
			if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >='0' && s.charAt(i) <= '9' )) {
				nums[res++] = s.charAt(i);
			}
		}
		for(int i=0; i<res/2; i++) {
			if(nums[i] != nums[res-i-1]) return false;
		}
		
		return true;
    }
}
