package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class findAndReplacePattern890 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abb";
		String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
		List<String> results = findAndReplacePattern(words, pattern);
		for(String result : results) {
			System.out.println(result);
		}
	}
	public static List<String> findAndReplacePattern(String[] words, String pattern) {
		int[] p = F(pattern);
    /*
		List<String> list = new ArrayList<>();
		int[] model = new int[pattern.length()];
		int index = 0;
		model[0] = index;
		for(int i=1; i<pattern.length(); i++) {
			if(pattern.charAt(i) == pattern.charAt(i-1)) {
				model[i] = model[i-1];
			}else {
				model[i] = ++index;
			}
		}
		for(String word : words) {
			int[] temp = new int[word.length()];
			int res = 0;
			temp[0] = res;
			for(int i=1; i<word.length(); i++) {
				if(word.charAt(i) == word.charAt(i-1)) {
					temp[i] = temp[i-1];
				}else {
					temp[i] = ++res;
				}
			}
			int j=0;
			for(; j<model.length; j++) {
				if(temp[j] != model[j]) {
					break;
				}
			}
			if(j == model.length) {
				list.add(word);
			}
		}
		
		return list;
	*/
        List<String> res = new ArrayList<String>();
        for (String w : words)
            if (Arrays.equals(F(w), p)) res.add(w);
        return res;
    }

    public static int[] F(String w) {
        HashMap<Character, Integer> m = new HashMap<>();
        int n = w.length();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            m.putIfAbsent(w.charAt(i), m.size());
            res[i] = m.get(w.charAt(i));
        }
        return res;
    }
}
