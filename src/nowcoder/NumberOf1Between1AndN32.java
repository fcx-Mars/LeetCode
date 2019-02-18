package nowcoder;

public class NumberOf1Between1AndN32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1Between1AndN_Solution(13));
	}
	public static int NumberOf1Between1AndN_Solution(int n) {
	    int sum = 0;
	    
	    for(int i=1; i<=n; i++) {
	    	int pNum = 0;
	    	int j=i;
	    	while(j/10 != 0) {
	    		if(j%10 == 1) {
	    			pNum++;
	    		}
	    		j /=10;
	    	}
	    	if(j==1) {
	    		pNum++;
	    	}
	    	sum += pNum;
	    }
	    return sum;
    }
}
