package nowcoder;

public class NumberOf111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1(5));
	}
	public static int NumberOf1(int n) {
		int count = 0;
		while(n != 0) {
			if((n&1) == 1) count++;
			n = n>>>1; //当>> 时最高位补符号位，为>>>时补0
		}
		
		return count;
    }
}


/*
 * 
 *链接：https://www.nowcoder.com/questionTerminal/8ee967e43c2c4ec193b040ea7fbb10b8
来源：牛客网

private static int NumberOf1_low(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }
    */
