package nowcoder;

import java.util.HashMap;

public class MoreThanHalfNum29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int MoreThanHalfNum_Solution(int [] array) {
        
		//最差情况O(n2)
//		int count = 0;
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array.length; j++) {
//				if(array[i] == array[j]) {
//					count++;
//				}
//			}
//			if(count > array.length/2) {
//				return array[i];
//			}else {
//				count = 0;
//			}
//		}
//		
//		return 0;
		//基于map的O(n)
		if(array.length == 1) return array[0];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<array.length; i++) {
			if(map.containsKey(array[i])) {
				int count = map.get(array[i]);
				map.put(array[i], ++count);
				if(count > array.length/2)
					return array[i];
			}else {
				map.put(array[i],1);
			}
		}
		return 0;
		//map的遍历
//		Iterator iter = map.entrySet().iterator();
//        while(iter.hasNext()){
//            Map.Entry entry = (Map.Entry)iter.next();
//            Integer key =(Integer)entry.getKey();
//            Integer val = (Integer)entry.getValue();
//            if(val>array.length/2){
//                return key;
//            }
//        }
		
    }
}

/*剑指offer解法
 * 链接：https://www.nowcoder.com/questionTerminal/e8a1b01a2df14cb2b228b30ee6a92163
来源：牛客网

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int length=array.length;
        if(array==null||length<=0){
            return 0;
        }
        
        int result=array[0];
        int times=1;
        for(int i=1;i<length;i++){
            if(times==0){
                result=array[i];
                times=1;
            }else{
                if(array[i]==result){
                    times++;
                }else{
                    times--;
                }
            }
        }
        
        times=0;
        for(int i=0;i<length;i++){
            if(result==array[i]){
                times++;
            }
       }
            
       if(times*2<length){
           result=0;
       }
       return result;
    }
}
 */


