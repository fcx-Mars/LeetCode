package nowcoder;

public class JumpFloor8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//f(n) = f(n-1) + f(n-2)
	public int JumpFloor(int target) {
		if(target == 0) return 0;
		if(target == 1) return 1;
		if(target == 2) return 2;
		int a = 1, b = 2;
		int sum = a + b;
		for(int i=3; i<=target; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		
		return sum;
    }
}
