package nowcoder;

public class Power12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//快速幂
	public double Power(double base, int exponent) {
        
		double res = 1;
		int n = 0;
		if(exponent > 0) {
			n = exponent;
		}else if(exponent < 0) {
			if(base == 0) throw new RuntimeException();
			n = -exponent;
		}else {
			return 1;
		}
		while(n != 0) {
			if((n&1) == 1)
				res *= base;
			base *= base;
			n = n>>1;
		}
		
		return exponent > 0 ? res : 1/res;
	}
}
