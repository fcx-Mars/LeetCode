package nowcoder;



public class reOrderArray13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,3,4,5,6,7,8,9};
		reOrderArray(array);
		for(int a : array) {
			System.out.print(a+" ");
		}
	}
	public static void reOrderArray(int [] array) {
        int[] res = new int[array.length];
        int index = 0;
        for(int a : array) {
        	if((a&1) == 1) {
        		res[index++] = a;
        	}
        }
        for(int a : array) {
        	if((a&1) == 0) {
        		res[index++] = a;
        	}
        }
        //array = res;
        for(int i=0; i<array.length; i++) {
        	array[i] = res[i];
        }
    }
}
