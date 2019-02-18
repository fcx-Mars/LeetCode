package nowcoder;

public class VerifySquenceOfBST24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean VerifySquenceOfBST(int [] sequence) {
        
		if(sequence == null) return false;
		if(sequence.length == 1) return true;
		
		return judge(sequence, 0, sequence.length-1);
    }
	public boolean judge(int[] sequence, int start, int end) {
		if(start >= end) {
			return true;
		}
		int i = start;
		while(sequence[i] < sequence[end]) {
			++i;
		}
		for(int j=i; j<end; j++) {
			if(sequence[j] < sequence[end]) {
				return false;
			}
		}
		
		return judge(sequence, start, i-1)&&judge(sequence, i, end-1);
	}
}
