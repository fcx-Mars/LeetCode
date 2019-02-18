package nowcoder;

public class Fibonacci7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 39;
		System.out.println(Fibonacci(n));
	}
	public static int Fibonacci(int n) {
		
		int []fib = new int[50];
		fib[0] = 0; fib[1] = 1;
		for(int i=2; i<=n; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		return fib[n];
    }
}
//更佳的解法思路为使用两个变量进行记录，因此空间复杂度为O(1),而不是O(n)