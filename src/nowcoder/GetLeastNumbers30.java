package nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class GetLeastNumbers30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        
		ArrayList<Integer> res = new ArrayList<>();
		if (input == null || input.length == 0 || input.length < k) {
			return res;
		}
		Arrays.sort(input);
		for(int i=0; i<k; i++) {
			res.add(input[i]);
		}
		return res;
    }
}
