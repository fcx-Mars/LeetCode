package nowcoder;

import java.util.Stack;

public class IsPopOrder22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean IsPopOrder(int [] pushA,int [] popA) {
	    
		Stack<Integer> s = new Stack<>();
		for(int i=0,j=0; i<pushA.length; i++) {
			s.push(pushA[i]);
			while(!s.isEmpty() && s.peek() == popA[j]) {
				s.pop();
				j++;
			}
		}
		
		return s.isEmpty();
    }
}
